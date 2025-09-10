package co.edu.unbosque.model;

public class Electrodomestico extends Producto {

	private String consumoEnergia;
	private String capacidad;

	public Electrodomestico() {
		super();
	}

	public Electrodomestico(String consumoEnergia, String capacidad) {
		super();
		this.consumoEnergia = consumoEnergia;
		this.capacidad = capacidad;
	}

	public Electrodomestico(String nombre, int cantidad, float precio, String consumoEnergia, String capacidad) {
		super(nombre, cantidad, precio);
		this.consumoEnergia = consumoEnergia;
		this.capacidad = capacidad;
	}

	public Electrodomestico(String nombre, int cantidad, float precio) {
		super(nombre, cantidad, precio);
		// TODO Auto-generated constructor stub
	}

	public String getConsumoEnergia() {
		return consumoEnergia;
	}

	public void setConsumoEnergia(String consumoEnergia) {
		this.consumoEnergia = consumoEnergia;
	}

	public String getCapacidad() {
		return capacidad;
	}

	public void setCapacidad(String capacidad) {
		this.capacidad = capacidad;
	}

	@Override
	public String toString() {
		return "Electrodomestico [consumoEnergia=" + consumoEnergia + ", capacidad=" + capacidad
				+ ", getConsumoEnergia()=" + getConsumoEnergia() + ", getCapacidad()=" + getCapacidad()
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
