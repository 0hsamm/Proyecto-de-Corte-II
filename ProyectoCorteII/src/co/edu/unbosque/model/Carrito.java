package co.edu.unbosque.model;

import java.io.Serializable;
import java.util.ArrayList;

/**
 * Clase que representa un carrito.
 * Guarda una lista de productos y un id para el carrito.
 */
public class Carrito implements Serializable {

	private static final long serialVersionUID = -8595455319236298692L;
	private ArrayList<Producto> listaProductos;
    private int idCarrito;

    /**
     * Constructor vacío.
     */
    public Carrito() {
        
    }

    /**
     * Constructor que solo recibe el id.
     *
     * @param idCarrito número que identifica el carrito
     */
    public Carrito(int idCarrito) {
        this.idCarrito = idCarrito;
        this.listaProductos = new ArrayList<>();
    }

    /**
     * Constructor con la lista de productos y el id.
     * Si la lista es nula, se crea una nueva vacía.
     *
     * @param listaProductos productos que ya tiene el carrito
     * @param idCarrito número que identifica el carrito
     */
    public Carrito(ArrayList<Producto> listaProductos, int idCarrito) {
        if (listaProductos != null) {
            this.listaProductos = listaProductos;
        } else {
            this.listaProductos = new ArrayList<>();
        }
        this.idCarrito = idCarrito;
    }

    /**
     * Devuelve la lista de productos.
     *
     * @return lista de productos
     */
    public ArrayList<Producto> getListaProductos() {
        return listaProductos;
    }

    /**
     * Cambia la lista de productos.
     *
     * @param listaProductos nueva lista de productos
     */
    public void setListaProductos(ArrayList<Producto> listaProductos) {
        this.listaProductos = listaProductos;
    }

    /**
     * Devuelve el id del carrito.
     *
     * @return id del carrito
     */
    public int getIdCarrito() {
        return idCarrito;
    }

    /**
     * Cambia el id del carrito.
     *
     * @param idCarrito nuevo id
     */
    public void setIdCarrito(int idCarrito) {
        this.idCarrito = idCarrito;
    }

    /**
     * Devuelve un texto con el id y la lista de productos.
     *
     * @return texto con datos del carrito
     */
    @Override
    public String toString() {
        return "Carrito [idCarrito=" + idCarrito + ", listaProductos=" + listaProductos + "]";
    }

    /**
     * Agrega un producto a la lista.
     *
     * @param p producto para añadir
     */
    public void añadirProducto(Producto p) {
        listaProductos.add(p);
    }
    
    public float calcularTotal() {
        float total = 0f;
        for (Producto p : listaProductos) {
            total += p.getPrecio();
        }
        return total;
    }
}
