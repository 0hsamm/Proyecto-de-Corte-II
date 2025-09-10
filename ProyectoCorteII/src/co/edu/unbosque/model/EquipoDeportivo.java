package co.edu.unbosque.model;

public class EquipoDeportivo extends Producto {

	private String deporte;
	private String material;

	public EquipoDeportivo() {
		super();
	}

	public EquipoDeportivo(String deporte, String material) {
		super();
		this.deporte = deporte;
		this.material = material;
	}

	public EquipoDeportivo(String nombre, int cantidad, float precio, String deporte, String material) {
		super(nombre, cantidad, precio);
		this.deporte = deporte;
		this.material = material;
	}

	public EquipoDeportivo(String nombre, int cantidad, float precio) {
		super(nombre, cantidad, precio);
		// TODO Auto-generated constructor stub
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
		return "EquipoDeportivo [deporte=" + deporte + ", material=" + material
				+ ", getDeporte()=" + getDeporte() + ", getMaterial()=" + getMaterial()
				+ ", verificarDisponibilidad()=" + verificarDisponibilidad() + ", getNombre()=" + getNombre()
				+ ", getCantidad()=" + getCantidad() + ", getPrecio()=" + getPrecio() + ", toString()="
				+ super.toString() + ", getClass()=" + getClass() + ", hashCode()=" + hashCode() + "]";
	}
	
	@Override
	public boolean verificarDisponibilidad() {
		return super.verificarDisponibilidad();
	}

}