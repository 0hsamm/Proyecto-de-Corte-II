package co.edu.unbosque.model;

/**
 * Clase para un inmueble. Guarda el área y la cantidad de cuartos. Extiende de
 * Producto.
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
	 * @param area           área del inmueble
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
	 * @param nombre         nombre del producto
	 * @param precio         precio del producto
	 * @param area           área del inmueble
	 * @param cantidadCuarto número de cuartos
	 */
	public Inmueble(String nombre, float precio, String area, String cantidadCuarto) {
		super(nombre, precio);
		this.area = area;
		this.cantidadCuarto = cantidadCuarto;
	}

	/**
	 * Constructor sin área ni cantidad de cuartos.
	 *
	 * @param nombre nombre del producto
	 * @param precio precio del producto
	 */
	public Inmueble(String nombre, float precio) {
		super(nombre, precio);
	}

	public String getArea() {
		return area;
	}

	public void setArea(String area) {
		this.area = area;
	}

	public String getCantidadCuarto() {
		return cantidadCuarto;
	}

	public void setCantidadCuarto(String cantidadCuarto) {
		this.cantidadCuarto = cantidadCuarto;
	}

	@Override
	public String toString() {
		return "Inmueble [area=" + area + ", cantidadCuarto=" + cantidadCuarto + ", getNombre()=" + getNombre()
				+ ", getPrecio()=" + getPrecio() + "]";
	}
}
