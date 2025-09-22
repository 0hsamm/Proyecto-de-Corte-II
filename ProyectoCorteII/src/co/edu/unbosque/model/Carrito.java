package co.edu.unbosque.model;

import java.io.Serializable;
import java.util.ArrayList;

public class Carrito implements Serializable{
	
	private ArrayList<Producto> listaProductos;
	private String idCarrito;
	
	public Carrito() {
	}

	public Carrito(ArrayList<Producto> listaProductos, String idCarrito) {
		super();
		this.listaProductos = listaProductos;
		this.idCarrito = idCarrito;
	}

	public ArrayList<Producto> getListaProductos() {
		return listaProductos;
	}

	public void setListaProductos(ArrayList<Producto> listaProductos) {
		this.listaProductos = listaProductos;
	}

	public String getIdCarrito() {
		return idCarrito;
	}

	public void setIdCarrito(String idCarrito) {
		this.idCarrito = idCarrito;
	}

	@Override
	public String toString() {
		return "Carrito [listaProductos=" + listaProductos + ", idCarrito=" + idCarrito + "]";
	}
	
	public void añadirProducto(Producto p) {
		listaProductos.add(p);
	}
	
	
	
	

}
