package co.edu.unbosque.model.persistence;

import java.util.ArrayList;

import co.edu.unbosque.model.ProductoSostenible;

public class ProductoSostenibleDAO implements DAO<ProductoSostenible> {

	private ArrayList<ProductoSostenible> listaProductoSostenible;
	private final String FILE_NAME = "ProductoSostenible.csv";

	public ProductoSostenibleDAO() {
		listaProductoSostenible = new ArrayList<ProductoSostenible>();
		leerDesdeArchivoDeTexto(FILE_NAME);
	}

	@Override
	public void create(ProductoSostenible newData) {
		listaProductoSostenible.add(newData);
		escribirEnArchivoDeTexto();
	}

	@Override
	public boolean delete(int index) {
		if (index < 0 || index >= listaProductoSostenible.size()) {
			return false;
		} else {
			listaProductoSostenible.remove(index);
			escribirEnArchivoDeTexto();
			return true;
		}
	}

	@Override
	public boolean update(int index, ProductoSostenible newData) {
		if (index < 0 || index >= listaProductoSostenible.size()) {
			return false;
		} else {
			listaProductoSostenible.set(index, newData);
			escribirEnArchivoDeTexto();
			return true;
		}
	}

	String content = "";

	@Override
	public String showAll() {
		for (ProductoSostenible productoSostenible : listaProductoSostenible) {
			content += productoSostenible.toString() + "\n";
		}
		return content;
	}

	@Override
	public int count() {
		return listaProductoSostenible.size();
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
				ProductoSostenible temp = new ProductoSostenible();

				temp.setNombre(columna[0]);
				temp.setPrecio(Float.parseFloat(columna[1]));
				temp.setCantidad(Integer.parseInt(columna[2]));
				temp.setCertificacion(columna[3]);
				temp.setMaterialEcologico(columna[4]);

				listaProductoSostenible.add(temp);

			}
		}

	}

	@Override
	public void escribirEnArchivoDeTexto() {
		StringBuilder sb = new StringBuilder();
		for (ProductoSostenible productoSostenible : listaProductoSostenible) {
			sb.append(productoSostenible.getNombre() + ";");
			sb.append(productoSostenible.getPrecio() + ";");
			sb.append(productoSostenible.getCantidad() + ";");
			sb.append(productoSostenible.getCertificacion() + ";");
			sb.append(productoSostenible.getMaterialEcologico() + ";");
			sb.append("\n");
		}
		FileHandler.escribirEnArchivoDeTexto(FILE_NAME, sb.toString());

	}

}
