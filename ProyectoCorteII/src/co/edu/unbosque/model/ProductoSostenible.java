package co.edu.unbosque.model;

public class ProductoSostenible extends Producto {

	/**
	 * 
	 */
	private static final long serialVersionUID = 7674771899829339560L;
	private String materialEcologico;
	private String certificacion;

	public ProductoSostenible() {
		super();
	}

	public ProductoSostenible(String materialEcologico, String certificacion) {
		super();
		this.materialEcologico = materialEcologico;
		this.certificacion = certificacion;
	}

	public ProductoSostenible(String nombre, int cantidad, float precio, String materialEcologico, String certificacion) {
		super(nombre, cantidad, precio);
		this.materialEcologico = materialEcologico;
		this.certificacion = certificacion;
	}

	public ProductoSostenible(String nombre, int cantidad, float precio) {
		super(nombre, cantidad, precio);
		// TODO Auto-generated constructor stub
	}

	public String getMaterialEcologico() {
		return materialEcologico;
	}

	public void setMaterialEcologico(String materialEcologico) {
		this.materialEcologico = materialEcologico;
	}

	public String getCertificacion() {
		return certificacion;
	}

	public void setCertificacion(String certificacion) {
		this.certificacion = certificacion;
	}

	@Override
	public String toString() {
		return "ProductoSostenible [materialEcologico=" + materialEcologico + ", certificacion=" + certificacion
				+ ", getMaterialEcologico()=" + getMaterialEcologico() + ", getCertificacion()=" + getCertificacion()
				+ ", verificarDisponibilidad()=" + verificarDisponibilidad() + ", getNombre()=" + getNombre()
				+ ", getCantidad()=" + getCantidad() + ", getPrecio()=" + getPrecio() + ", toString()="
				+ super.toString() + ", getClass()=" + getClass() + ", hashCode()=" + hashCode() + "]";
	}
	
	@Override
	public boolean verificarDisponibilidad() {
		return super.verificarDisponibilidad();
	}

}

