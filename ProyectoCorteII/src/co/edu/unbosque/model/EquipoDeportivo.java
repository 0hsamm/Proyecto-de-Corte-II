package co.edu.unbosque.model;

/**
 * Clase para un equipo deportivo. Guarda el deporte y el material del producto.
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
	 * @param deporte  deporte relacionado
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
	 * @param nombre   nombre del producto
	 * @param precio   precio del producto
	 * @param deporte  deporte relacionado
	 * @param material material del equipo
	 */
	public EquipoDeportivo(String nombre, float precio, String deporte, String material) {
		super(nombre, precio);
		this.deporte = deporte;
		this.material = material;
	}

	/**
	 * Constructor sin deporte ni material.
	 *
	 * @param nombre nombre del producto
	 * @param precio precio del producto
	 */
	public EquipoDeportivo(String nombre, float precio) {
		super(nombre, precio);
	}

	public String getDeporte() {
		return deporte;
	}

	public void setDeporte(String deporte) {
		this.deporte = deporte;
	}

	public String getMaterial() {
		return material;
	}

	public void setMaterial(String material) {
		this.material = material;
	}

	@Override
	public String toString() {
		return "EquipoDeportivo [deporte=" + deporte + ", material=" + material + ", getNombre()=" + getNombre()
				+ ", getPrecio()=" + getPrecio() + "]";
	}
}
