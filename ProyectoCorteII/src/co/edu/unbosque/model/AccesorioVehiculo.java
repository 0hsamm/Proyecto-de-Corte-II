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
	 * @param material material del accesorio
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
	 * @param nombre nombre del producto
	 * @param cantidad cuántos hay
	 * @param precio precio del accesorio
	 * @param material material del accesorio
	 * @param compatibilidad con qué vehículo sirve
	 */
	public AccesorioVehiculo(String nombre, int cantidad, float precio, String material, String compatibilidad) {
		super(nombre, cantidad, precio);
		this.material = material;
		this.compatibilidad = compatibilidad;
	}

	/**
	 * Constructor sin material ni compatibilidad.
	 *
	 * @param nombre nombre del producto
	 * @param cantidad cuántos hay
	 * @param precio precio del accesorio
	 */
	public AccesorioVehiculo(String nombre, int cantidad, float precio) {
		super(nombre, cantidad, precio);
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
	 * Devuelve la compatibilidad.
	 *
	 * @return compatibilidad
	 */
	public String getCompatibilidad() {
		return compatibilidad;
	}

	/**
	 * Cambia la compatibilidad.
	 *
	 * @param compatibilidad nueva compatibilidad
	 */
	public void setCompatibilidad(String compatibilidad) {
		this.compatibilidad = compatibilidad;
	}

	/**
	 * Devuelve una cadena con los datos del accesorio.
	 *
	 * @return texto con la info
	 */
	@Override
	public String toString() {
		return "AccesorioVehiculo [material=" + material + ", compatibilidad=" + compatibilidad + ", getMaterial()="
				+ getMaterial() + ", getCompatibilidad()=" + getCompatibilidad() + ", verificarDisponibilidad()="
				+ verificarDisponibilidad() + ", getNombre()=" + getNombre() + ", getCantidad()=" + getCantidad()
				+ ", getPrecio()=" + getPrecio() + ", toString()=" + super.toString() + ", getClass()=" + getClass()
				+ ", hashCode()=" + hashCode() + "]";
	}

	/**
	 * Verifica si hay disponibilidad.
	 *
	 * @return true si hay, false si no
	 */
	@Override
	public boolean verificarDisponibilidad() {
		return super.verificarDisponibilidad();
	}

}
