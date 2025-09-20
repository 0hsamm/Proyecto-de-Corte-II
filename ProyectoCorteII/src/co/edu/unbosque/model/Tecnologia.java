package co.edu.unbosque.model;

public class Tecnologia extends Producto {

	/**
	 * 
	 */
	private static final long serialVersionUID = 2821120056105930729L;
	private String sistemaOperativo;
	private String conectividad;

	public Tecnologia() {
		super();
	}

	public Tecnologia(String sistemaOperativo, String conectividad) {
		super();
		this.sistemaOperativo = sistemaOperativo;
		this.conectividad = conectividad;
	}

	public Tecnologia(String nombre, int cantidad, float precio, String sistemaOperativo, String conectividad) {
		super(nombre, cantidad, precio);
		this.sistemaOperativo = sistemaOperativo;
		this.conectividad = conectividad;
	}

	public Tecnologia(String nombre, int cantidad, float precio) {
		super(nombre, cantidad, precio);
		// TODO Auto-generated constructor stub
	}

	public String getSistemaOperativo() {
		return sistemaOperativo;
	}

	public void setSistemaOperativo(String sistemaOperativo) {
		this.sistemaOperativo = sistemaOperativo;
	}

	public String getConectividad() {
		return conectividad;
	}

	public void setConectividad(String conectividad) {
		this.conectividad = conectividad;
	}

	@Override
	public String toString() {
		return "Tecnologia [sistemaOperativo=" + sistemaOperativo + ", conectividad=" + conectividad
				+ ", getSistemaOperativo()=" + getSistemaOperativo() + ", getConectividad()=" + getConectividad()
				+ ", verificarDisponibilidad()=" + verificarDisponibilidad() + ", getNombre()=" + getNombre()
				+ ", getCantidad()=" + getCantidad() + ", getPrecio()=" + getPrecio() + ", toString()="
				+ super.toString() + ", getClass()=" + getClass() + ", hashCode()=" + hashCode() + "]";
	}
	
	@Override
	public boolean verificarDisponibilidad() {
		// TODO Auto-generated method stub
		return super.verificarDisponibilidad();
	}

}
