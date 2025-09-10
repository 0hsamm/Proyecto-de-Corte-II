package co.edu.unbosque.model;

public class Inmueble extends Producto {

	private String area;
	private String cantidadCuarto;

	public Inmueble() {
		super();
	}

	public Inmueble(String area, String cantidadCuarto) {
		super();
		this.area = area;
		this.cantidadCuarto = cantidadCuarto;
	}

	public Inmueble(String nombre, int cantidad, float precio, String area, String cantidadCuarto) {
		super(nombre, cantidad, precio);
		this.area = area;
		this.cantidadCuarto = cantidadCuarto;
	}

	public Inmueble(String nombre, int cantidad, float precio) {
		super(nombre, cantidad, precio);
		// TODO Auto-generated constructor stub
	}

	public String getArea() {
		return area;
	}

	public void setArea(String area) {
		this.area = area;
	}

	public String getCantidadCuarto() {
		return cantidadCuarto;
	}

	public void setCantidadCuarto(String cantidadCuarto) {
		this.cantidadCuarto = cantidadCuarto;
	}

	@Override
	public String toString() {
		return "Inmueble [area=" + area + ", numeroHabitaciones=" + cantidadCuarto
				+ ", getArea()=" + getArea() + ", getNumeroHabitaciones()=" + getCantidadCuarto()
				+ ", verificarDisponibilidad()=" + verificarDisponibilidad() + ", getNombre()=" + getNombre()
				+ ", getCantidad()=" + getCantidad() + ", getPrecio()=" + getPrecio() + ", toString()="
				+ super.toString() + ", getClass()=" + getClass() + ", hashCode()=" + hashCode() + "]";
	}
	
	@Override
	public boolean verificarDisponibilidad() {
		return super.verificarDisponibilidad();
	}

}
