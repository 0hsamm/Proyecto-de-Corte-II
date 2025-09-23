package co.edu.unbosque.model.persistence;

import java.util.ArrayList;
import co.edu.unbosque.model.Electrodomestico;

/**
 * DAO para manejar los datos de los electrodomésticos.
 * Permite crear, eliminar, actualizar, mostrar,
 * contar y guardar información en archivos de texto o binarios.
 */
public class ElectrodomesticoDAO implements DAO<Electrodomestico> {

    private ArrayList<Electrodomestico> listaElectrodomestico;
    private final String FILE_NAME = "Electrodomesticos.csv";
    private final String SERIAL_FILE_NAME = "Electrodomesticos.bin";
    private String content = "";

    /**
     * Constructor que inicializa la lista y carga los datos
     * desde los archivos de texto y binario si existen.
     */
    public ElectrodomesticoDAO() {
        listaElectrodomestico = new ArrayList<Electrodomestico>();
        leerDesdeArchivoDeTexto(FILE_NAME);
        cargarDesdeArchivoSerializado();
    }

    /**
     * Agrega un nuevo electrodoméstico a la lista y actualiza los archivos.
     *
     * @param newData objeto de tipo Electrodomestico
     */
    @Override
    public void create(Electrodomestico newData) {
        listaElectrodomestico.add(newData);
        escribirEnArchivoDeTexto();
        escribirEnArchivoSerializado();
    }

    /**
     * Elimina un electrodoméstico por su posición.
     *
     * @param index posición del electrodoméstico
     * @return true si se eliminó, false si no
     */
    @Override
    public boolean delete(int index) {
        if (index < 0 || index >= listaElectrodomestico.size()) {
            return false;
        } else {
            listaElectrodomestico.remove(index);
            escribirEnArchivoDeTexto();
            escribirEnArchivoSerializado();
            return true;
        }
    }

    /**
     * Actualiza un electrodoméstico en la posición indicada.
     *
     * @param index   posición del electrodoméstico
     * @param newData objeto con los nuevos datos
     * @return true si se actualizó, false si no
     */
    @Override
    public boolean update(int index, Electrodomestico newData) {
        if (index < 0 || index >= listaElectrodomestico.size()) {
            return false;
        } else {
            listaElectrodomestico.set(index, newData);
            escribirEnArchivoDeTexto();
            escribirEnArchivoSerializado();
            return true;
        }
    }

    /**
     * Muestra todos los electrodomésticos en formato de texto.
     *
     * @return cadena con la información de todos los electrodomésticos
     */
    @Override
    public String showAll() {
        content = "";
        for (Electrodomestico electrodomestico : listaElectrodomestico) {
            content += electrodomestico.toString() + "\n";
        }
        return content;
    }

    /**
     * Devuelve la cantidad de electrodomésticos en la lista.
     *
     * @return número de electrodomésticos
     */
    @Override
    public int count() {
        return listaElectrodomestico.size();
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
                Electrodomestico temp = new Electrodomestico();
                temp.setNombre(columna[0]);
                temp.setPrecio(Float.parseFloat(columna[1]));
                temp.setCantidad(Integer.parseInt(columna[2]));
                temp.setConsumoEnergia(columna[3]);
                temp.setCapacidad(columna[4]);
                listaElectrodomestico.add(temp);
            }
        }
    }

    /**
     * Escribe los datos en un archivo CSV.
     */
    @Override
    public void escribirEnArchivoDeTexto() {
        StringBuilder sb = new StringBuilder();
        for (Electrodomestico electrodomestico : listaElectrodomestico) {
            sb.append(electrodomestico.getNombre()).append(";");
            sb.append(electrodomestico.getPrecio()).append(";");
            sb.append(electrodomestico.getCantidad()).append(";");
            sb.append(electrodomestico.getConsumoEnergia()).append(";");
            sb.append(electrodomestico.getCapacidad()).append(";");
            sb.append("\n");
        }
        FileHandler.escribirEnArchivoDeTexto(FILE_NAME, sb.toString());
    }

    /**
     * Carga los datos desde un archivo binario.
     */
    public void cargarDesdeArchivoSerializado() {
        Object contenido = FileHandler.leerDesdeArchivoSerializado(SERIAL_FILE_NAME);
        if (contenido != null) {
            listaElectrodomestico = (ArrayList<Electrodomestico>) contenido;
        } else {
            listaElectrodomestico = new ArrayList<>();
        }
    }

    /**
     * Guarda los datos en un archivo binario.
     */
    public void escribirEnArchivoSerializado() {
        FileHandler.escribirEnArchivoSerializado(SERIAL_FILE_NAME, listaElectrodomestico);
    }

    public ArrayList<Electrodomestico> getListaElectrodomestico() {
        return listaElectrodomestico;
    }

    public void setListaElectrodomestico(ArrayList<Electrodomestico> listaElectrodomestico) {
        this.listaElectrodomestico = listaElectrodomestico;
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
