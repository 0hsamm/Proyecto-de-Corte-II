package co.edu.unbosque.model;

/**
 * Clase para un juguete. Guarda la edad recomendada y el material. Extiende de
 * Producto.
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
	 * @param material        material del juguete
	 */
	public Juguete(String edadRecomendada, String material) {
		super();
		this.edadRecomendada = edadRecomendada;
		this.material = material;
	}

	/**
	 * Constructor con todos los datos.
	 *
	 * @param nombre          nombre del producto
	 * @param precio          precio del producto
	 * @param edadRecomendada edad recomendada para el juguete
	 * @param material        material del juguete
	 */
	public Juguete(String nombre, float precio, String edadRecomendada, String material) {
		super(nombre, precio);
		this.edadRecomendada = edadRecomendada;
		this.material = material;
	}

	/**
	 * Constructor sin edad recomendada ni material.
	 *
	 * @param nombre nombre del producto
	 * @param precio precio del producto
	 */
	public Juguete(String nombre, float precio) {
		super(nombre, precio);
	}

	public String getEdadRecomendada() {
		return edadRecomendada;
	}

	public void setEdadRecomendada(String edadRecomendada) {
		this.edadRecomendada = edadRecomendada;
	}

	public String getMaterial() {
		return material;
	}

	public void setMaterial(String material) {
		this.material = material;
	}

	@Override
	public String toString() {
		return "Juguete [edadRecomendada=" + edadRecomendada + ", material=" + material + ", getNombre()=" + getNombre()
				+ ", getPrecio()=" + getPrecio() + "]";
	}
}
