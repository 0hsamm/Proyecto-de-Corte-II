package co.edu.unbosque.model.persistence;

import java.util.ArrayList;
import co.edu.unbosque.model.ProductoFarmaceutico;

/**
 * DAO para manejar los datos de los productos farmacéuticos.
 * Permite crear, eliminar, actualizar, mostrar,
 * contar y guardar información en archivos de texto o binarios.
 */
public class ProductoFarmaceuticoDAO implements DAO<ProductoFarmaceutico> {

    private ArrayList<ProductoFarmaceutico> listaProductoFarmaceutico;
    private final String FILE_NAME = "ProductoFarmaceutico.csv";
    private final String SERIAL_FILE_NAME = "ProductoFarmaceutico.bin";
    private String content = "";

    /**
     * Constructor que inicializa la lista y carga los datos
     * desde los archivos de texto y binario si existen.
     */
    public ProductoFarmaceuticoDAO() {
        listaProductoFarmaceutico = new ArrayList<ProductoFarmaceutico>();
        leerDesdeArchivoDeTexto(FILE_NAME);
        cargarDesdeArchivoSerializado();
    }

    /**
     * Agrega un nuevo producto a la lista y actualiza los archivos.
     *
     * @param newData objeto de tipo ProductoFarmaceutico
     */
    @Override
    public void create(ProductoFarmaceutico newData) {
        listaProductoFarmaceutico.add(newData);
        escribirEnArchivoDeTexto();
        escribirEnArchivoSerializado();
    }

    /**
     * Elimina un producto por su posición.
     *
     * @param index posición del producto
     * @return true si se eliminó, false si no
     */
    @Override
    public boolean delete(int index) {
        if (index < 0 || index >= listaProductoFarmaceutico.size()) {
            return false;
        } else {
            listaProductoFarmaceutico.remove(index);
            escribirEnArchivoDeTexto();
            escribirEnArchivoSerializado();
            return true;
        }
    }

    /**
     * Actualiza un producto en la posición indicada.
     *
     * @param index   posición del producto
     * @param newData objeto con los nuevos datos
     * @return true si se actualizó, false si no
     */
    @Override
    public boolean update(int index, ProductoFarmaceutico newData) {
        if (index < 0 || index >= listaProductoFarmaceutico.size()) {
            return false;
        } else {
            listaProductoFarmaceutico.set(index, newData);
            escribirEnArchivoDeTexto();
            escribirEnArchivoSerializado();
            return true;
        }
    }

    /**
     * Muestra todos los productos en formato de texto.
     *
     * @return cadena con la información de todos los productos
     */
    @Override
    public String showAll() {
        content = "";
        for (ProductoFarmaceutico productoFarmaceutico : listaProductoFarmaceutico) {
            content += productoFarmaceutico.toString() + "\n";
        }
        return content;
    }

    /**
     * Devuelve la cantidad de productos en la lista.
     *
     * @return número de productos
     */
    @Override
    public int count() {
        return listaProductoFarmaceutico.size();
    }

    /**
     * Lee los productos desde un archivo CSV y los agrega a la lista.
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
                ProductoFarmaceutico temp = new ProductoFarmaceutico();
                temp.setNombre(columna[0]);
                temp.setPrecio(Float.parseFloat(columna[1]));
                temp.setCantidad(Integer.parseInt(columna[2]));
                temp.setFormaFarmaceutica(columna[3]);
                temp.setConcentracion(columna[4]);
                listaProductoFarmaceutico.add(temp);
            }
        }
    }

    /**
     * Escribe los datos en un archivo CSV.
     */
    @Override
    public void escribirEnArchivoDeTexto() {
        StringBuilder sb = new StringBuilder();
        for (ProductoFarmaceutico productoFarmaceutico : listaProductoFarmaceutico) {
            sb.append(productoFarmaceutico.getNombre()).append(";");
            sb.append(productoFarmaceutico.getPrecio()).append(";");
            sb.append(productoFarmaceutico.getCantidad()).append(";");
            sb.append(productoFarmaceutico.getFormaFarmaceutica()).append(";");
            sb.append(productoFarmaceutico.getConcentracion()).append(";\n");
        }
        FileHandler.escribirEnArchivoDeTexto(FILE_NAME, sb.toString());
    }

    /**
     * Carga los datos desde un archivo binario.
     */
    public void cargarDesdeArchivoSerializado() {
        Object contenido = FileHandler.leerDesdeArchivoSerializado(SERIAL_FILE_NAME);
        if (contenido != null) {
            listaProductoFarmaceutico = (ArrayList<ProductoFarmaceutico>) contenido;
        } else {
            listaProductoFarmaceutico = new ArrayList<>();
        }
    }

    /**
     * Guarda los datos en un archivo binario.
     */
    public void escribirEnArchivoSerializado() {
        FileHandler.escribirEnArchivoSerializado(SERIAL_FILE_NAME, listaProductoFarmaceutico);
    }

    public ArrayList<ProductoFarmaceutico> getListaProductoFarmaceutico() {
        return listaProductoFarmaceutico;
    }

    public void setListaProductoFarmaceutico(ArrayList<ProductoFarmaceutico> listaProductoFarmaceutico) {
        this.listaProductoFarmaceutico = listaProductoFarmaceutico;
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
