package co.edu.unbosque.model;

public class Herramienta extends Producto {

	/**
	 * 
	 */
	private static final long serialVersionUID = 8699761417900242837L;
	private String tipoAlimentacion;
	private String material;

	public Herramienta() {
		super();
	}

	public Herramienta(String tipoAlimentacion, String material) {
		super();
		this.tipoAlimentacion = tipoAlimentacion;
		this.material = material;
	}

	public Herramienta(String nombre, int cantidad, float precio, String tipoAlimentacion, String material) {
		super(nombre, cantidad, precio);
		this.tipoAlimentacion = tipoAlimentacion;
		this.material = material;
	}

	public Herramienta(String nombre, int cantidad, float precio) {
		super(nombre, cantidad, precio);
		// TODO Auto-generated constructor stub
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
		return "Herramienta [tipoAlimentacion=" + tipoAlimentacion + ", material=" + material
				+ ", getTipoAlimentacion()=" + getTipoAlimentacion() + ", getMaterial()=" + getMaterial()
				+ ", verificarDisponibilidad()=" + verificarDisponibilidad() + ", getNombre()=" + getNombre()
				+ ", getCantidad()=" + getCantidad() + ", getPrecio()=" + getPrecio() + ", toString()="
				+ super.toString() + ", getClass()=" + getClass() + ", hashCode()=" + hashCode() + "]";
	}
	
	@Override
	public boolean verificarDisponibilidad() {
		return super.verificarDisponibilidad();
	}

}
