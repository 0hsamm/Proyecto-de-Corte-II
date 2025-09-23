package co.edu.unbosque.model;

/**
 * Clase para una herramienta.
 * Guarda el tipo de alimentación y el material.
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
	 * @param material material de la herramienta
	 */
	public Herramienta(String tipoAlimentacion, String material) {
		super();
		this.tipoAlimentacion = tipoAlimentacion;
		this.material = material;
	}

	/**
	 * Constructor con todos los datos.
	 *
	 * @param nombre nombre del producto
	 * @param cantidad cantidad disponible
	 * @param precio precio del producto
	 * @param tipoAlimentacion tipo de alimentación de la herramienta
	 * @param material material de la herramienta
	 */
	public Herramienta(String nombre, int cantidad, float precio, String tipoAlimentacion, String material) {
		super(nombre, cantidad, precio);
		this.tipoAlimentacion = tipoAlimentacion;
		this.material = material;
	}

	/**
	 * Constructor sin tipo de alimentación ni material.
	 *
	 * @param nombre nombre del producto
	 * @param cantidad cantidad disponible
	 * @param precio precio del producto
	 */
	public Herramienta(String nombre, int cantidad, float precio) {
		super(nombre, cantidad, precio);
	}

	/**
	 * Devuelve el tipo de alimentación.
	 *
	 * @return tipo de alimentación
	 */
	public String getTipoAlimentacion() {
		return tipoAlimentacion;
	}

	/**
	 * Cambia el tipo de alimentación.
	 *
	 * @param tipoAlimentacion nuevo tipo de alimentación
	 */
	public void setTipoAlimentacion(String tipoAlimentacion) {
		this.tipoAlimentacion = tipoAlimentacion;
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
	 * Texto con los datos de la herramienta.
	 *
	 * @return información completa en texto
	 */
	@Override
	public String toString() {
		return "Herramienta [tipoAlimentacion=" + tipoAlimentacion + ", material=" + material
				+ ", getTipoAlimentacion()=" + getTipoAlimentacion() + ", getMaterial()=" + getMaterial()
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
