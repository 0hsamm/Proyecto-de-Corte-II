package co.edu.unbosque.model;

import java.io.Serializable;
import java.util.ArrayList;

public class Carrito implements Serializable {

    private ArrayList<Producto> listaProductos;
    private int idCarrito;
    public Carrito() {
		// TODO Auto-generated constructor stub
	}
    
    public Carrito(int idCarrito) {
        this.idCarrito = idCarrito;
        this.listaProductos = new ArrayList<>();
    }

    public Carrito(ArrayList<Producto> listaProductos, int idCarrito) {
    	if (listaProductos != null) {
    	    this.listaProductos = listaProductos;
    	} else {
    	    this.listaProductos = new ArrayList<>();
    	}
        this.idCarrito = idCarrito;
    }

    public ArrayList<Producto> getListaProductos() {
        return listaProductos;
    }

    public void setListaProductos(ArrayList<Producto> listaProductos) {
        this.listaProductos = listaProductos;
    }

    public int getIdCarrito() {
        return idCarrito;
    }

    public void setIdCarrito(int idCarrito) {
        this.idCarrito = idCarrito;
    }

    @Override
    public String toString() {
        return "Carrito [idCarrito=" + idCarrito + ", listaProductos=" + listaProductos + "]";
    }

    public void añadirProducto(Producto p) {
        listaProductos.add(p);
    }
}
