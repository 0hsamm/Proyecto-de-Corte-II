package co.edu.unbosque.model;

/**
 * Clase para un juguete.
 * Guarda la edad recomendada y el material.
 * Extiende de Producto.
 */
public class Juguete extends Producto {

	private static final long serialVersionUID = -2248867723242722229L;
	private String edadRecomendada;
	private String material;

	/**
	 * Constructor vacío.
	 */
	public Juguete() {
		super();
	}

	/**
	 * Constructor que solo recibe edad recomendada y material.
	 *
	 * @param edadRecomendada edad recomendada para el juguete
	 * @param material material del juguete
	 */
	public Juguete(String edadRecomendada, String material) {
		super();
		this.edadRecomendada = edadRecomendada;
		this.material = material;
	}

	/**
	 * Constructor con todos los datos.
	 *
	 * @param nombre nombre del producto
	 * @param cantidad cantidad disponible
	 * @param precio precio del producto
	 * @param edadRecomendada edad recomendada para el juguete
	 * @param material material del juguete
	 */
	public Juguete(String nombre, int cantidad, float precio, String edadRecomendada, String material) {
		super(nombre, cantidad, precio);
		this.edadRecomendada = edadRecomendada;
		this.material = material;
	}

	/**
	 * Constructor sin edad recomendada ni material.
	 *
	 * @param nombre nombre del producto
	 * @param cantidad cantidad disponible
	 * @param precio precio del producto
	 */
	public Juguete(String nombre, int cantidad, float precio) {
		super(nombre, cantidad, precio);
	}

	/**
	 * Devuelve la edad recomendada.
	 *
	 * @return edad recomendada
	 */
	public String getEdadRecomendada() {
		return edadRecomendada;
	}

	/**
	 * Cambia la edad recomendada.
	 *
	 * @param edadRecomendada nueva edad recomendada
	 */
	public void setEdadRecomendada(String edadRecomendada) {
		this.edadRecomendada = edadRecomendada;
	}

	/**
	 * Devuelve el material.
	 *
	 * @return material
	 */
	public String getMaterial() {
		return material;
	}

	/**
	 * Cambia el material.
	 *
	 * @param material nuevo material
	 */
	public void setMaterial(String material) {
		this.material = material;
	}

	/**
	 * Texto con los datos del juguete.
	 *
	 * @return información completa en texto
	 */
	@Override
	public String toString() {
		return "Juguete [edadRecomendada=" + edadRecomendada + ", material=" + material
				+ ", getEdadRecomendada()=" + getEdadRecomendada() + ", getMaterial()=" + getMaterial()
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
