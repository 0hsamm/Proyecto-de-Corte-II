package co.edu.unbosque.model;

import java.io.Serializable;

public abstract class Producto implements Serializable {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 5798130550665023291L;
	private String nombre;
	private int cantidad;
	private float precio;
	
	
	public Producto() {
		// TODO Auto-generated constructor stub
	}

	public Producto(String nombre, int cantidad, float precio) {
		super();
		this.nombre = nombre;
		this.cantidad = cantidad;
		this.precio = precio;
	}
	
	public boolean verificarDisponibilidad() {
		if (cantidad <0) {
			return false;
		} else
		return true;		
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getCantidad() {
		return cantidad;
	}

	public void setCantidad(int cantidad) {
		this.cantidad = cantidad;
	}

	public float getPrecio() {
		return precio;
	}

	public void setPrecio(float precio) {
		this.precio = precio;
	}

	@Override
	public String toString() {
		return "Producto [nombre=" + nombre + ", cantidad=" + cantidad + ", precio=" + precio + ", estaDisponible="
				 + "]";
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	

}
