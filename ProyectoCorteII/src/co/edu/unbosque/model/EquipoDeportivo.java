package co.edu.unbosque.model;

/**
 * Clase para un equipo deportivo.
 * Guarda el deporte y el material del producto.
 * Extiende de Producto.
 */
public class EquipoDeportivo extends Producto {

	private static final long serialVersionUID = -2018166870589387532L;
	private String deporte;
	private String material;

	/**
	 * Constructor vacío.
	 */
	public EquipoDeportivo() {
		super();
	}

	/**
	 * Constructor que solo recibe deporte y material.
	 *
	 * @param deporte deporte relacionado
	 * @param material material del equipo
	 */
	public EquipoDeportivo(String deporte, String material) {
		super();
		this.deporte = deporte;
		this.material = material;
	}

	/**
	 * Constructor con todos los datos.
	 *
	 * @param nombre nombre del producto
	 * @param cantidad cantidad disponible
	 * @param precio precio del producto
	 * @param deporte deporte relacionado
	 * @param material material del equipo
	 */
	public EquipoDeportivo(String nombre, int cantidad, float precio, String deporte, String material) {
		super(nombre, cantidad, precio);
		this.deporte = deporte;
		this.material = material;
	}

	/**
	 * Constructor sin deporte ni material.
	 *
	 * @param nombre nombre del producto
	 * @param cantidad cantidad disponible
	 * @param precio precio del producto
	 */
	public EquipoDeportivo(String nombre, int cantidad, float precio) {
		super(nombre, cantidad, precio);
	}

	/**
	 * Devuelve el deporte.
	 *
	 * @return deporte
	 */
	public String getDeporte() {
		return deporte;
	}

	/**
	 * Cambia el deporte.
	 *
	 * @param deporte nuevo deporte
	 */
	public void setDeporte(String deporte) {
		this.deporte = deporte;
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
	 * Texto con los datos del equipo deportivo.
	 *
	 * @return información completa en texto
	 */
	@Override
	public String toString() {
		return "EquipoDeportivo [deporte=" + deporte + ", material=" + material
				+ ", getDeporte()=" + getDeporte() + ", getMaterial()=" + getMaterial()
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
