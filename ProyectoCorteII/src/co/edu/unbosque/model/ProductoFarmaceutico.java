package co.edu.unbosque.model;

public class ProductoFarmaceutico extends Producto {

	/**
	 * 
	 */
	private static final long serialVersionUID = -5158760585695289489L;
	private String formaFarmaceutica;
	private String concentracion;

	public ProductoFarmaceutico() {
		super();
	}

	public ProductoFarmaceutico(String formaFarmaceutica, String concentracion) {
		super();
		this.formaFarmaceutica = formaFarmaceutica;
		this.concentracion = concentracion;
	}

	public ProductoFarmaceutico(String nombre, int cantidad, float precio, String formaFarmaceutica, String concentracion) {
		super(nombre, cantidad, precio);
		this.formaFarmaceutica = formaFarmaceutica;
		this.concentracion = concentracion;
	}

	public ProductoFarmaceutico(String nombre, int cantidad, float precio) {
		super(nombre, cantidad, precio);
		// TODO Auto-generated constructor stub
	}

	public String getFormaFarmaceutica() {
		return formaFarmaceutica;
	}

	public void setFormaFarmaceutica(String formaFarmaceutica) {
		this.formaFarmaceutica = formaFarmaceutica;
	}

	public String getConcentracion() {
		return concentracion;
	}

	public void setConcentracion(String concentracion) {
		this.concentracion = concentracion;
	}

	@Override
	public String toString() {
		return "ProductoFarmaceutico [formaFarmaceutica=" + formaFarmaceutica + ", concentracion=" + concentracion
				+ ", getFormaFarmaceutica()=" + getFormaFarmaceutica() + ", getConcentracion()=" + getConcentracion()
				+ ", verificarDisponibilidad()=" + verificarDisponibilidad() + ", getNombre()=" + getNombre()
				+ ", getCantidad()=" + getCantidad() + ", getPrecio()=" + getPrecio() + ", toString()="
				+ super.toString() + ", getClass()=" + getClass() + ", hashCode()=" + hashCode() + "]";
	}
	
	@Override
	public boolean verificarDisponibilidad() {
		return super.verificarDisponibilidad();
	}

}