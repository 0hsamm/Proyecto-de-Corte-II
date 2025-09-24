package co.edu.unbosque.model;

import java.io.Serializable;

/**
 * Clase abstracta que representa un producto. Contiene información básica como
 * nombre y precio.
 */
public abstract class Producto implements Serializable {

	private static final long serialVersionUID = 5798130550665023291L;
	private String nombre;
	private float precio;

	/**
	 * Constructor vacío.
	 */
	public Producto() {
	}

	/**
	 * Constructor que inicializa los datos básicos del producto.
	 *
	 * @param nombre nombre del producto
	 * @param precio precio del producto
	 */
	public Producto(String nombre, float precio) {
		super();
		this.nombre = nombre;
		this.precio = precio;
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
		return "Producto [nombre=" + nombre + ", precio=" + precio + "]";
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
