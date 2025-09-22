package co.edu.unbosque.model.persistence;

import java.util.ArrayList;

import co.edu.unbosque.model.Carrito;
import co.edu.unbosque.model.Comprador;
import co.edu.unbosque.model.Producto;

public class CarritoDAO implements DAO<Carrito> {

	private ArrayList<Carrito> listaCarritos;
	private final String FILE_NAME = "Carrito.csv";
	private final String SERIAL_FILE_NAME = "Carrito.bin";

	public CarritoDAO() {
		listaCarritos = new ArrayList<>();
	}

	@Override
	public void create(Carrito newData) {
		listaCarritos.add(newData);
	//	escribirEnArchivoDeTexto();
	//	escribirEnArchivoSerializado();

	}

	@Override
	public boolean delete(int index) {
		if (index < 0 || index >= listaCarritos.size()) {
			return false;
		} else {
			listaCarritos.remove(index);
		//	escribirEnArchivoDeTexto();
		//	escribirEnArchivoSerializado();
			return true;
		}
	}

	@Override
	public boolean update(int index, Carrito newData) {
		if (index < 0 || index >= listaCarritos.size()) {
			return false;
		} else {
			listaCarritos.set(index, newData);
		//	escribirEnArchivoDeTexto();
		//	escribirEnArchivoSerializado();
			return true;
		}
	}

	String content = "";

	@Override
	public String showAll() {
		content = "";
		for (Carrito carrito : listaCarritos) {
			content += carrito.toString() + "\n";
		}
		return content;
	}

	@Override
	public int count() {

		return listaCarritos.size();
	}

	@Override
	public void leerDesdeArchivoDeTexto(String url) {
	
		
	}

	@Override
	public void escribirEnArchivoDeTexto() {
		

	}
	public void escribirEnArchivoSerializado() {
		FileHandler.escribirEnArchivoSerializado(SERIAL_FILE_NAME, listaCarritos);
	}

}
