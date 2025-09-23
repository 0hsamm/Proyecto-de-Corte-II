package co.edu.unbosque.model.persistence;

import java.util.ArrayList;
import co.edu.unbosque.model.EquipoDeportivo;

/**
 * DAO para manejar los datos de los equipos deportivos.
 * Permite crear, eliminar, actualizar, mostrar,
 * contar y guardar información en archivos de texto o binarios.
 */
public class EquipoDeportivoDAO implements DAO<EquipoDeportivo> {

    private ArrayList<EquipoDeportivo> listaEquipoDeportivo;
    private final String FILE_NAME = "EquipoDeportivo.csv";
    private final String SERIAL_FILE_NAME = "EquipoDeportivo.bin";
    private String content = "";

    /**
     * Constructor que inicializa la lista y carga los datos
     * desde los archivos de texto y binario si existen.
     */
    public EquipoDeportivoDAO() {
        listaEquipoDeportivo = new ArrayList<EquipoDeportivo>();
        leerDesdeArchivoDeTexto(FILE_NAME);
        cargarDesdeArchivoSerializado();
    }

    /**
     * Agrega un nuevo equipo deportivo a la lista y actualiza los archivos.
     *
     * @param newData objeto de tipo EquipoDeportivo
     */
    @Override
    public void create(EquipoDeportivo newData) {
        listaEquipoDeportivo.add(newData);
        escribirEnArchivoDeTexto();
        escribirEnArchivoSerializado();
    }

    /**
     * Elimina un equipo deportivo por su posición.
     *
     * @param index posición del equipo
     * @return true si se eliminó, false si no
     */
    @Override
    public boolean delete(int index) {
        if (index < 0 || index >= listaEquipoDeportivo.size()) {
            return false;
        } else {
            listaEquipoDeportivo.remove(index);
            escribirEnArchivoDeTexto();
            escribirEnArchivoSerializado();
            return true;
        }
    }

    /**
     * Actualiza un equipo deportivo en la posición indicada.
     *
     * @param index   posición del equipo
     * @param newData objeto con los nuevos datos
     * @return true si se actualizó, false si no
     */
    @Override
    public boolean update(int index, EquipoDeportivo newData) {
        if (index < 0 || index >= listaEquipoDeportivo.size()) {
            return false;
        } else {
            listaEquipoDeportivo.set(index, newData);
            escribirEnArchivoDeTexto();
            escribirEnArchivoSerializado();
            return true;
        }
    }

    /**
     * Muestra todos los equipos deportivos en formato de texto.
     *
     * @return cadena con la información de todos los equipos
     */
    @Override
    public String showAll() {
        content = "";
        for (EquipoDeportivo equipoDeportivo : listaEquipoDeportivo) {
            content += equipoDeportivo.toString() + "\n";
        }
        return content;
    }

    /**
     * Devuelve la cantidad de equipos deportivos en la lista.
     *
     * @return número de equipos deportivos
     */
    @Override
    public int count() {
        return listaEquipoDeportivo.size();
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
                EquipoDeportivo temp = new EquipoDeportivo();
                temp.setNombre(columna[0]);
                temp.setPrecio(Float.parseFloat(columna[1]));
                temp.setCantidad(Integer.parseInt(columna[2]));
                temp.setDeporte(columna[3]);
                temp.setMaterial(columna[4]);
                listaEquipoDeportivo.add(temp);
            }
        }
    }

    /**
     * Escribe los datos en un archivo CSV.
     */
    @Override
    public void escribirEnArchivoDeTexto() {
        StringBuilder sb = new StringBuilder();
        for (EquipoDeportivo equipoDeportivo : listaEquipoDeportivo) {
            sb.append(equipoDeportivo.getNombre()).append(";");
            sb.append(equipoDeportivo.getPrecio()).append(";");
            sb.append(equipoDeportivo.getCantidad()).append(";");
            sb.append(equipoDeportivo.getDeporte()).append(";");
            sb.append(equipoDeportivo.getMaterial()).append(";");
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
            listaEquipoDeportivo = (ArrayList<EquipoDeportivo>) contenido;
        } else {
            listaEquipoDeportivo = new ArrayList<>();
        }
    }

    /**
     * Guarda los datos en un archivo binario.
     */
    public void escribirEnArchivoSerializado() {
        FileHandler.escribirEnArchivoSerializado(SERIAL_FILE_NAME, listaEquipoDeportivo);
    }

    public ArrayList<EquipoDeportivo> getListaEquipoDeportivo() {
        return listaEquipoDeportivo;
    }

    public void setListaEquipoDeportivo(ArrayList<EquipoDeportivo> listaEquipoDeportivo) {
        this.listaEquipoDeportivo = listaEquipoDeportivo;
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
