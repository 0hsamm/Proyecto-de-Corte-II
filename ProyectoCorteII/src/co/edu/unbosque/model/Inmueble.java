package co.edu.unbosque.model;

/**
 * Clase para un inmueble.
 * Guarda el área y la cantidad de cuartos.
 * Extiende de Producto.
 */
public class Inmueble extends Producto {

	private static final long serialVersionUID = 2960156291223943277L;
	private String area;
	private String cantidadCuarto;

	/**
	 * Constructor vacío.
	 */
	public Inmueble() {
		super();
	}

	/**
	 * Constructor que solo recibe área y cantidad de cuartos.
	 *
	 * @param area área del inmueble
	 * @param cantidadCuarto número de cuartos
	 */
	public Inmueble(String area, String cantidadCuarto) {
		super();
		this.area = area;
		this.cantidadCuarto = cantidadCuarto;
	}

	/**
	 * Constructor con todos los datos.
	 *
	 * @param nombre nombre del producto
	 * @param cantidad cantidad disponible
	 * @param precio precio del producto
	 * @param area área del inmueble
	 * @param cantidadCuarto número de cuartos
	 */
	public Inmueble(String nombre, int cantidad, float precio, String area, String cantidadCuarto) {
		super(nombre, cantidad, precio);
		this.area = area;
		this.cantidadCuarto = cantidadCuarto;
	}

	/**
	 * Constructor sin área ni cantidad de cuartos.
	 *
	 * @param nombre nombre del producto
	 * @param cantidad cantidad disponible
	 * @param precio precio del producto
	 */
	public Inmueble(String nombre, int cantidad, float precio) {
		super(nombre, cantidad, precio);
	}

	/**
	 * Devuelve el área del inmueble.
	 *
	 * @return área
	 */
	public String getArea() {
		return area;
	}

	/**
	 * Cambia el área del inmueble.
	 *
	 * @param area nueva área
	 */
	public void setArea(String area) {
		this.area = area;
	}

	/**
	 * Devuelve la cantidad de cuartos.
	 *
	 * @return cantidad de cuartos
	 */
	public String getCantidadCuarto() {
		return cantidadCuarto;
	}

	/**
	 * Cambia la cantidad de cuartos.
	 *
	 * @param cantidadCuarto nuevo número de cuartos
	 */
	public void setCantidadCuarto(String cantidadCuarto) {
		this.cantidadCuarto = cantidadCuarto;
	}

	/**
	 * Texto con los datos del inmueble.
	 *
	 * @return información completa en texto
	 */
	@Override
	public String toString() {
		return "Inmueble [area=" + area + ", numeroHabitaciones=" + cantidadCuarto
				+ ", getArea()=" + getArea() + ", getNumeroHabitaciones()=" + getCantidadCuarto()
				+ ", verificarDisponibilidad()=" + verificarDisponibilidad() + ", getNombre()=" + getNombre()
				+ ", getCantidad()=" + getCantidad() + ", getPrecio()=" + getPrecio() + ", toString()="
				+ super.toString() + ", getClass()=" + getClass() + ", hashCode()=" + hashCode() + "]";
	}
	
	/**
	 * Verifica si el producto está disponible.
	 *
	 * @return true si hay stock, false si no
	 */
	@Override
	public boolean verificarDisponibilidad() {
		return super.verificarDisponibilidad();
	}

}
