package co.edu.unbosque.model;

import java.io.Serializable;

/**
 * Clase abstracta que representa un producto.
 * Contiene información básica como nombre, cantidad y precio.
 */
public abstract class Producto implements Serializable {

    private static final long serialVersionUID = 5798130550665023291L;
    private String nombre;
    private int cantidad;
    private float precio;

    /**
     * Constructor vacío.
     */
    public Producto() {
    }

    /**
     * Constructor que inicializa los datos básicos del producto.
     *
     * @param nombre   nombre del producto
     * @param cantidad cantidad disponible
     * @param precio   precio del producto
     */
    public Producto(String nombre, int cantidad, float precio) {
        super();
        this.nombre = nombre;
        this.cantidad = cantidad;
        this.precio = precio;
    }

    /**
     * Verifica si el producto está disponible.
     *
     * @return true si la cantidad es mayor o igual a 0, false si no
     */
    public boolean verificarDisponibilidad() {
        return cantidad >= 0;
    }

    /**
     * Devuelve el nombre del producto.
     *
     * @return nombre
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * Cambia el nombre del producto.
     *
     * @param nombre nuevo nombre
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * Devuelve la cantidad disponible del producto.
     *
     * @return cantidad
     */
    public int getCantidad() {
        return cantidad;
    }

    /**
     * Cambia la cantidad del producto.
     *
     * @param cantidad nueva cantidad
     */
    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    /**
     * Devuelve el precio del producto.
     *
     * @return precio
     */
    public float getPrecio() {
        return precio;
    }

    /**
     * Cambia el precio del producto.
     *
     * @param precio nuevo precio
     */
    public void setPrecio(float precio) {
        this.precio = precio;
    }

    /**
     * Devuelve un texto con la información del producto.
     *
     * @return texto con los datos del producto
     */
    @Override
    public String toString() {
        return "Producto [nombre=" + nombre + ", cantidad=" + cantidad + ", precio=" + precio + "]";
    }

    /**
     * Devuelve el valor del serialVersionUID.
     *
     * @return serialVersionUID
     */
    public static long getSerialversionuid() {
        return serialVersionUID;
    }
}
