package co.edu.unbosque.model;

/**
 * Clase para una herramienta. Guarda el tipo de alimentación y el material.
 * Extiende de Producto.
 */
public class Herramienta extends Producto {

	private static final long serialVersionUID = 8699761417900242837L;
	private String tipoAlimentacion;
	private String material;

	/**
	 * Constructor vacío.
	 */
	public Herramienta() {
		super();
	}

	/**
	 * Constructor que solo recibe tipo de alimentación y material.
	 *
	 * @param tipoAlimentacion tipo de alimentación de la herramienta
	 * @param material         material de la herramienta
	 */
	public Herramienta(String tipoAlimentacion, String material) {
		super();
		this.tipoAlimentacion = tipoAlimentacion;
		this.material = material;
	}

	/**
	 * Constructor con todos los datos.
	 *
	 * @param nombre           nombre del producto
	 * @param precio           precio del producto
	 * @param tipoAlimentacion tipo de alimentación de la herramienta
	 * @param material         material de la herramienta
	 */
	public Herramienta(String nombre, float precio, String tipoAlimentacion, String material) {
		super(nombre, precio);
		this.tipoAlimentacion = tipoAlimentacion;
		this.material = material;
	}

	/**
	 * Constructor sin tipo de alimentación ni material.
	 *
	 * @param nombre nombre del producto
	 * @param precio precio del producto
	 */
	public Herramienta(String nombre, float precio) {
		super(nombre, precio);
	}

	public String getTipoAlimentacion() {
		return tipoAlimentacion;
	}

	public void setTipoAlimentacion(String tipoAlimentacion) {
		this.tipoAlimentacion = tipoAlimentacion;
	}

	public String getMaterial() {
		return material;
	}

	public void setMaterial(String material) {
		this.material = material;
	}

	@Override
	public String toString() {
		return "Herramienta [tipoAlimentacion=" + tipoAlimentacion + ", material=" + material + ", getNombre()="
				+ getNombre() + ", getPrecio()=" + getPrecio() + "]";
	}
}
