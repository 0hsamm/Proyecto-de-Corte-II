package co.edu.unbosque.model.persistence;

import java.util.ArrayList;
import co.edu.unbosque.model.Carrito;
import co.edu.unbosque.model.Producto;

/**
 * Clase que maneja la lista de carritos de compras.
 * Permite agregar, eliminar, actualizar y mostrar carritos,
 * así como añadir productos a carritos específicos.
 */
public class CarritoDAO implements DAO<Carrito> {

    private ArrayList<Carrito> listaCarritos;
    private final String FILE_NAME = "Carrito.csv";
    private final String SERIAL_FILE_NAME = "Carrito.bin";
    private String content = "";

    /**
     * Constructor que inicializa la lista de carritos vacía.
     */
    public CarritoDAO() {
        listaCarritos = new ArrayList<>();
    }

    /**
     * Agrega un nuevo carrito a la lista.
     *
     * @param newData objeto de tipo Carrito
     */
    @Override
    public void create(Carrito newData) {
        listaCarritos.add(newData);
    }

    /**
     * Elimina un carrito de la lista según el índice.
     *
     * @param index posición del carrito en la lista
     * @return true si se eliminó, false si no
     */
    @Override
    public boolean delete(int index) {
        if (index < 0 || index >= listaCarritos.size()) {
            return false;
        } else {
            listaCarritos.remove(index);
            return true;
        }
    }

    /**
     * Actualiza un carrito en la lista.
     *
     * @param index   posición del carrito en la lista
     * @param newData carrito con los nuevos datos
     * @return true si se actualizó, false si no
     */
    @Override
    public boolean update(int index, Carrito newData) {
        if (index < 0 || index >= listaCarritos.size()) {
            return false;
        } else {
            listaCarritos.set(index, newData);
            return true;
        }
    }

    /**
     * Muestra todos los carritos en forma de texto.
     *
     * @return cadena con la información de cada carrito
     */
    @Override
    public String showAll() {
        content = "";
        for (Carrito carrito : listaCarritos) {
            content += carrito.toString() + "\n";
        }
        return content;
    }

    /**
     * Devuelve el número de carritos en la lista.
     *
     * @return cantidad de carritos
     */
    @Override
    public int count() {
        return listaCarritos.size();
    }

    /**
     * Método vacío porque no se está leyendo desde archivo de texto.
     *
     * @param url ruta o nombre del archivo
     */
    @Override
    public void leerDesdeArchivoDeTexto(String url) {
    }

    /**
     * Método vacío porque no se está escribiendo en archivo de texto.
     */
    @Override
    public void escribirEnArchivoDeTexto() {
    }

    /**
     * Guarda los carritos en un archivo serializado.
     */
    public void escribirEnArchivoSerializado() {
        FileHandler.escribirEnArchivoSerializado(SERIAL_FILE_NAME, listaCarritos);
    }

    /**
     * Añade un producto a un carrito específico.
     *
     * @param indexCarrito índice del carrito en la lista
     * @param p            producto que se quiere añadir
     * @return true si se agregó el producto, false si no
     */
    public boolean añadirProductoAlCarrito(int indexCarrito, Producto p) {
        if (indexCarrito < 0 || indexCarrito >= listaCarritos.size()) {
            return false;
        } else {
            listaCarritos.get(indexCarrito).añadirProducto(p);
            return true;
        }
    }

    public ArrayList<Carrito> getListaCarritos() {
        return listaCarritos;
    }

    public void setListaCarritos(ArrayList<Carrito> listaCarritos) {
        this.listaCarritos = listaCarritos;
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
