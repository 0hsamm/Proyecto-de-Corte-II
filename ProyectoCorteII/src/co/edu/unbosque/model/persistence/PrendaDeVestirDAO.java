package co.edu.unbosque.model.persistence;

import java.util.ArrayList;
import co.edu.unbosque.model.PrendaDeVestir;

/**
 * DAO para manejar los datos de las prendas de vestir.
 * Permite crear, eliminar, actualizar, mostrar,
 * contar y guardar información en archivos de texto o binarios.
 */
public class PrendaDeVestirDAO implements DAO<PrendaDeVestir> {

    private ArrayList<PrendaDeVestir> listaPrendaDeVestir;
    private final String FILE_NAME = "PrendaDeVestir.csv";
    private final String SERIAL_FILE_NAME = "PrendaDeVestir.bin";
    private String content = "";

    /**
     * Constructor que inicializa la lista y carga los datos
     * desde los archivos de texto y binario si existen.
     */
    public PrendaDeVestirDAO() {
        listaPrendaDeVestir = new ArrayList<PrendaDeVestir>();
        leerDesdeArchivoDeTexto(FILE_NAME);
        cargarDesdeArchivoSerializado();
    }

    /**
     * Agrega una nueva prenda a la lista y actualiza los archivos.
     *
     * @param newData objeto de tipo PrendaDeVestir
     */
    @Override
    public void create(PrendaDeVestir newData) {
        listaPrendaDeVestir.add(newData);
        escribirEnArchivoDeTexto();
        escribirEnArchivoSerializado();
    }

    /**
     * Elimina una prenda por su posición.
     *
     * @param index posición de la prenda
     * @return true si se eliminó, false si no
     */
    @Override
    public boolean delete(int index) {
        if (index < 0 || index >= listaPrendaDeVestir.size()) {
            return false;
        } else {
            listaPrendaDeVestir.remove(index);
            escribirEnArchivoDeTexto();
            escribirEnArchivoSerializado();
            return true;
        }
    }

    /**
     * Actualiza una prenda en la posición indicada.
     *
     * @param index   posición de la prenda
     * @param newData objeto con los nuevos datos
     * @return true si se actualizó, false si no
     */
    @Override
    public boolean update(int index, PrendaDeVestir newData) {
        if (index < 0 || index >= listaPrendaDeVestir.size()) {
            return false;
        } else {
            listaPrendaDeVestir.set(index, newData);
            escribirEnArchivoDeTexto();
            escribirEnArchivoSerializado();
            return true;
        }
    }

    /**
     * Muestra todas las prendas en formato de texto.
     *
     * @return cadena con la información de todas las prendas
     */
    @Override
    public String showAll() {
        content = "";
        for (PrendaDeVestir prenda : listaPrendaDeVestir) {
            content += prenda.toString() + "\n";
        }
        return content;
    }

    /**
     * Devuelve la cantidad de prendas en la lista.
     *
     * @return número de prendas
     */
    @Override
    public int count() {
        return listaPrendaDeVestir.size();
    }

    /**
     * Lee los datos desde un archivo CSV y los agrega a la lista.
     *
     * @param url nombre o ruta del archivo
     */
    @Override
    public void leerDesdeArchivoDeTexto(String url) {
        String contenido = FileHandler.leerDesdeArchivoDeTexto(url);
        if (contenido == null || contenido.isBlank()) {
            return;
        } else {
            String[] fila = contenido.split("\n");
            for (String f : fila) {
                String[] columna = f.split(";");
                PrendaDeVestir temp = new PrendaDeVestir();
                temp.setNombre(columna[0]);
                temp.setPrecio(Float.parseFloat(columna[1]));
                temp.setCantidad(Integer.parseInt(columna[2]));
                temp.setTalla(columna[3]);
                temp.setTipoTela(columna[4]);
                listaPrendaDeVestir.add(temp);
            }
        }
    }

    /**
     * Escribe los datos en un archivo CSV.
     */
    @Override
    public void escribirEnArchivoDeTexto() {
        StringBuilder sb = new StringBuilder();
        for (PrendaDeVestir prenda : listaPrendaDeVestir) {
            sb.append(prenda.getNombre()).append(";");
            sb.append(prenda.getPrecio()).append(";");
            sb.append(prenda.getCantidad()).append(";");
            sb.append(prenda.getTalla()).append(";");
            sb.append(prenda.getTipoTela()).append(";\n");
        }
        FileHandler.escribirEnArchivoDeTexto(FILE_NAME, sb.toString());
    }

    /**
     * Carga los datos desde un archivo binario.
     */
    public void cargarDesdeArchivoSerializado() {
        Object contenido = FileHandler.leerDesdeArchivoSerializado(SERIAL_FILE_NAME);
        if (contenido != null) {
            listaPrendaDeVestir = (ArrayList<PrendaDeVestir>) contenido;
        } else {
            listaPrendaDeVestir = new ArrayList<>();
        }
    }

    /**
     * Guarda los datos en un archivo binario.
     */
    public void escribirEnArchivoSerializado() {
        FileHandler.escribirEnArchivoSerializado(SERIAL_FILE_NAME, listaPrendaDeVestir);
    }

    public ArrayList<PrendaDeVestir> getListaPrendaDeVestir() {
        return listaPrendaDeVestir;
    }

    public void setListaPrendaDeVestir(ArrayList<PrendaDeVestir> listaPrendaDeVestir) {
        this.listaPrendaDeVestir = listaPrendaDeVestir;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public String getFILE_NAME() {
        return FILE_NAME;
    }

    public String getSERIAL_FILE_NAME() {
        return SERIAL_FILE_NAME;
    }
}
