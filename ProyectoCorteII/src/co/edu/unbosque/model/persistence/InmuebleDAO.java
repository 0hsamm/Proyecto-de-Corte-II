package co.edu.unbosque.model.persistence;

import java.util.ArrayList;
import co.edu.unbosque.model.Inmueble;

/**
 * DAO para manejar los datos de los inmuebles.
 * Permite crear, eliminar, actualizar, mostrar,
 * contar y guardar información en archivos de texto o binarios.
 */
public class InmuebleDAO implements DAO<Inmueble> {

    private ArrayList<Inmueble> listaInmueble;
    private final String FILE_NAME = "Inmueble.csv";
    private final String SERIAL_FILE_NAME = "Inmueble.bin";
    private String content = "";

    /**
     * Constructor que inicializa la lista y carga los datos
     * desde los archivos de texto y binario si existen.
     */
    public InmuebleDAO() {
        listaInmueble = new ArrayList<Inmueble>();
        leerDesdeArchivoDeTexto(FILE_NAME);
        cargarDesdeArchivoSerializado();
    }

    /**
     * Agrega un nuevo inmueble a la lista y actualiza los archivos.
     *
     * @param newData objeto de tipo Inmueble
     */
    @Override
    public void create(Inmueble newData) {
        listaInmueble.add(newData);
        escribirEnArchivoDeTexto();
        escribirEnArchivoSerializado();
    }

    /**
     * Elimina un inmueble por su posición.
     *
     * @param index posición del inmueble
     * @return true si se eliminó, false si no
     */
    @Override
    public boolean delete(int index) {
        if (index < 0 || index >= listaInmueble.size()) {
            return false;
        } else {
            listaInmueble.remove(index);
            escribirEnArchivoDeTexto();
            escribirEnArchivoSerializado();
            return true;
        }
    }

    /**
     * Actualiza un inmueble en la posición indicada.
     *
     * @param index   posición del inmueble
     * @param newData objeto con los nuevos datos
     * @return true si se actualizó, false si no
     */
    @Override
    public boolean update(int index, Inmueble newData) {
        if (index < 0 || index >= listaInmueble.size()) {
            return false;
        } else {
            listaInmueble.set(index, newData);
            escribirEnArchivoDeTexto();
            escribirEnArchivoSerializado();
            return true;
        }
    }

    /**
     * Muestra todos los inmuebles en formato de texto.
     *
     * @return cadena con la información de todos los inmuebles
     */
    @Override
    public String showAll() {
        content = "";
        for (Inmueble inmueble : listaInmueble) {
            content += inmueble.toString() + "\n";
        }
        return content;
    }

    /**
     * Devuelve la cantidad de inmuebles en la lista.
     *
     * @return número de inmuebles
     */
    @Override
    public int count() {
        return listaInmueble.size();
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
                Inmueble temp = new Inmueble();
                temp.setNombre(columna[0]);
                temp.setPrecio(Float.parseFloat(columna[1]));
                temp.setCantidad(Integer.parseInt(columna[2]));
                temp.setArea(columna[3]);
                temp.setCantidadCuarto(columna[4]);
                listaInmueble.add(temp);
            }
        }
    }

    /**
     * Escribe los datos en un archivo CSV.
     */
    @Override
    public void escribirEnArchivoDeTexto() {
        StringBuilder sb = new StringBuilder();
        for (Inmueble inmueble : listaInmueble) {
            sb.append(inmueble.getNombre()).append(";");
            sb.append(inmueble.getPrecio()).append(";");
            sb.append(inmueble.getCantidad()).append(";");
            sb.append(inmueble.getArea()).append(";");
            sb.append(inmueble.getCantidadCuarto()).append(";\n");
        }
        FileHandler.escribirEnArchivoDeTexto(FILE_NAME, sb.toString());
    }

    /**
     * Carga los datos desde un archivo binario.
     */
    public void cargarDesdeArchivoSerializado() {
        Object contenido = FileHandler.leerDesdeArchivoSerializado(SERIAL_FILE_NAME);
        if (contenido != null) {
            listaInmueble = (ArrayList<Inmueble>) contenido;
        } else {
            listaInmueble = new ArrayList<>();
        }
    }

    /**
     * Guarda los datos en un archivo binario.
     */
    public void escribirEnArchivoSerializado() {
        FileHandler.escribirEnArchivoSerializado(SERIAL_FILE_NAME, listaInmueble);
    }

    public ArrayList<Inmueble> getListaInmueble() {
        return listaInmueble;
    }

    public void setListaInmueble(ArrayList<Inmueble> listaInmueble) {
        this.listaInmueble = listaInmueble;
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

