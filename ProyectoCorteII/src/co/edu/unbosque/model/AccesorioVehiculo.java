package co.edu.unbosque.model;

public class AccesorioVehiculo extends Producto {

	private String material;
	private String compatibilidad;

	public AccesorioVehiculo() {
		super();
	}

	public AccesorioVehiculo(String material, String compatibilidad) {
		super();
		this.material = material;
		this.compatibilidad = compatibilidad;
	}

	public AccesorioVehiculo(String nombre, int cantidad, float precio, String material, String compatibilidad) {
		super(nombre, cantidad, precio);
		this.material = material;
		this.compatibilidad = compatibilidad;
	}

	public AccesorioVehiculo(String nombre, int cantidad, float precio) {
		super(nombre, cantidad, precio);
		// TODO Auto-generated constructor stub
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
		return "AccesorioVehiculo [material=" + material + ", compatibilidad=" + compatibilidad
				+ ", getMaterial()=" + getMaterial() + ", getCompatibilidad()=" + getCompatibilidad()
				+ ", verificarDisponibilidad()=" + verificarDisponibilidad() + ", getNombre()=" + getNombre()
				+ ", getCantidad()=" + getCantidad() + ", getPrecio()=" + getPrecio() + ", toString()="
				+ super.toString() + ", getClass()=" + getClass() + ", hashCode()=" + hashCode() + "]";
	}
	
	@Override
	public boolean verificarDisponibilidad() {
		return super.verificarDisponibilidad();
	}

}