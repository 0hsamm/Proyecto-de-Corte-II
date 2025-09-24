package co.edu.unbosque.model;

/**
 * Clase para accesorios de vehículo. Guarda cosas como el material y con qué es
 * compatible. Extiende de Producto.
 */
public class AccesorioVehiculo extends Producto {

	private static final long serialVersionUID = -6254695010364569926L;
	private String material;
	private String compatibilidad;

	/**
	 * Constructor vacío.
	 */
	public AccesorioVehiculo() {
		super();
	}

	/**
	 * Constructor que solo recibe material y compatibilidad.
	 *
	 * @param material       material del accesorio
	 * @param compatibilidad con qué vehículo sirve
	 */
	public AccesorioVehiculo(String material, String compatibilidad) {
		super();
		this.material = material;
		this.compatibilidad = compatibilidad;
	}

	/**
	 * Constructor con todos los datos.
	 *
	 * @param nombre         nombre del producto
	 * @param precio         precio del accesorio
	 * @param material       material del accesorio
	 * @param compatibilidad con qué vehículo sirve
	 */
	public AccesorioVehiculo(String nombre, float precio, String material, String compatibilidad) {
		super(nombre, precio);
		this.material = material;
		this.compatibilidad = compatibilidad;
	}

	/**
	 * Constructor sin material ni compatibilidad.
	 *
	 * @param nombre nombre del producto
	 * @param precio precio del accesorio
	 */
	public AccesorioVehiculo(String nombre, float precio) {
		super(nombre, precio);
	}

	public String getMaterial() {
		return material;
	}

	public void setMaterial(String material) {
		this.material = material;
	}

	public String getCompatibilidad() {
		return compatibilidad;
	}

	public void setCompatibilidad(String compatibilidad) {
		this.compatibilidad = compatibilidad;
	}

	@Override
	public String toString() {
		return "AccesorioVehiculo [material=" + material + ", compatibilidad=" + compatibilidad + ", getNombre()="
				+ getNombre() + ", getPrecio()=" + getPrecio() + "]";
	}
}
