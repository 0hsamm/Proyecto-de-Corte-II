package co.edu.unbosque.model.persistence;

import java.util.ArrayList;
import java.util.Properties;

import co.edu.unbosque.model.ProductoFarmaceutico;

public class ProductoFarmaceuticoDAO implements DAO<ProductoFarmaceutico> {

	private ArrayList<ProductoFarmaceutico> listaProductoFarmaceutico;
	private final String FILE_NAME = "ProductoFarmaceutico.csv";
	private final String SERIAL_FILE_NAME = "ProductoFarmaceutico.bin";

	public ProductoFarmaceuticoDAO() {

		listaProductoFarmaceutico = new ArrayList<ProductoFarmaceutico>();
		leerDesdeArchivoDeTexto(FILE_NAME);
		cargarDesdeArchivoSerializado();
	}

	@Override
	public void create(ProductoFarmaceutico newData) {
		listaProductoFarmaceutico.add(newData);
		escribirEnArchivoDeTexto();
		escribirEnArchivoSerializado();
	}

	@Override
	public boolean delete(int index) {
		if (index < 0 || index >= listaProductoFarmaceutico.size()) {
			return false;
		} else {
			listaProductoFarmaceutico.remove(index);
			escribirEnArchivoDeTexto();
			escribirEnArchivoSerializado();
			return true;
		}
	}

	@Override
	public boolean update(int index, ProductoFarmaceutico newData) {
		if (index < 0 || index >= listaProductoFarmaceutico.size()) {
			return false;
		} else {
			listaProductoFarmaceutico.set(index, newData);
			escribirEnArchivoDeTexto();
			escribirEnArchivoSerializado();
			return true;
		}
	}

	String content = "";

	@Override
	public String showAll() {
		for (ProductoFarmaceutico productoFarmaceutico : listaProductoFarmaceutico) {
			content += productoFarmaceutico.toString() + "\n";
		}
		return content;
	}

	@Override
	public int count() {
		return listaProductoFarmaceutico.size();
	}

	@Override
	public void leerDesdeArchivoDeTexto(String url) {
		String contenido;
		contenido = FileHandler.leerDesdeArchivoDeTexto(url);
		if (contenido == "" || contenido.isBlank()) {
			return;
		} else {
			String[] fila = contenido.split("\n");
			for (int i = 0; i < fila.length; i++) {

				String[] columna = fila[i].split(";");
				ProductoFarmaceutico temp = new ProductoFarmaceutico();

				temp.setNombre(columna[0]);
				temp.setPrecio(Float.parseFloat(columna[1]));
				temp.setCantidad(Integer.parseInt(columna[2]));
				temp.setFormaFarmaceutica(columna[3]);
				temp.setConcentracion(columna[4]);

				listaProductoFarmaceutico.add(temp);

			}
		}
	}

	@Override
	public void escribirEnArchivoDeTexto() {
		StringBuilder sb = new StringBuilder();
		for (ProductoFarmaceutico productoFarmaceutico : listaProductoFarmaceutico) {
			sb.append(productoFarmaceutico.getNombre() + ";");
			sb.append(productoFarmaceutico.getPrecio() + ";");
			sb.append(productoFarmaceutico.getCantidad() + ";");
			sb.append(productoFarmaceutico.getFormaFarmaceutica() + ";");
			sb.append(productoFarmaceutico.getConcentracion() + ";");
			sb.append("\n");
		}
		FileHandler.escribirEnArchivoDeTexto(FILE_NAME, sb.toString());
	}

	public void cargarDesdeArchivoSerializado() {
		Object contenido = FileHandler.leerDesdeArchivoSerializado(SERIAL_FILE_NAME);
		if (contenido != null) {
			listaProductoFarmaceutico = (ArrayList<ProductoFarmaceutico>) contenido;
		}
		else {
			listaProductoFarmaceutico = new ArrayList<>();
		}
	}
	
	public void escribirEnArchivoSerializado() {
		FileHandler.escribirEnArchivoSerializado(SERIAL_FILE_NAME, listaProductoFarmaceutico);
	}

	public ArrayList<ProductoFarmaceutico> getListaProductoFarmaceutico() {
		return listaProductoFarmaceutico;
	}

	public void setListaProductoFarmaceutico(ArrayList<ProductoFarmaceutico> listaProductoFarmaceutico) {
		this.listaProductoFarmaceutico = listaProductoFarmaceutico;
	}

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}

	public String getFILE_NAME() {
		return FILE_NAME;
	}

	public String getSERIAL_FILE_NAME() {
		return SERIAL_FILE_NAME;
	}

	
	
	
	
}
