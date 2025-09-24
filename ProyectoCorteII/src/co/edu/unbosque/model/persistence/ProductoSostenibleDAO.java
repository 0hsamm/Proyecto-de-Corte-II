package co.edu.unbosque.model.persistence;

import java.util.ArrayList;
import co.edu.unbosque.model.ProductoSostenible;

/**
 * DAO para manejar los datos de los productos sostenibles. Permite crear,
 * eliminar, actualizar, mostrar, contar y guardar información en archivos de
 * texto o binarios.
 */
public class ProductoSostenibleDAO implements DAO<ProductoSostenible> {

	private ArrayList<ProductoSostenible> listaProductoSostenible;
	private final String FILE_NAME = "ProductoSostenible.csv";
	private final String SERIAL_FILE_NAME = "ProductoSostenible.bin";
	private String content = "";

	/**
	 * Constructor que inicializa la lista y carga los datos desde los archivos de
	 * texto y binario si existen.
	 */
	public ProductoSostenibleDAO() {
		listaProductoSostenible = new ArrayList<>();
		leerDesdeArchivoDeTexto(FILE_NAME);
		cargarDesdeArchivoSerializado();
	}

	@Override
	public void create(ProductoSostenible newData) {
		listaProductoSostenible.add(newData);
		escribirEnArchivoDeTexto();
		escribirEnArchivoSerializado();
	}

	@Override
	public boolean delete(int index) {
		if (index < 0 || index >= listaProductoSostenible.size()) {
			return false;
		}
		listaProductoSostenible.remove(index);
		escribirEnArchivoDeTexto();
		escribirEnArchivoSerializado();
		return true;
	}

	@Override
	public boolean update(int index, ProductoSostenible newData) {
		if (index < 0 || index >= listaProductoSostenible.size()) {
			return false;
		}
		listaProductoSostenible.set(index, newData);
		escribirEnArchivoDeTexto();
		escribirEnArchivoSerializado();
		return true;
	}

	/**
	 * Muestra todos los productos sostenibles con índice y toString().
	 */
	@Override
	public String showAll() {
		StringBuilder sb = new StringBuilder();
		for (int i = 0; i < listaProductoSostenible.size(); i++) {
			sb.append(i + 1).append(" - ").append(listaProductoSostenible.get(i).toString()).append("\n");
		}
		return sb.toString();
	}

	@Override
	public int count() {
		return listaProductoSostenible.size();
	}

	@Override
	public void leerDesdeArchivoDeTexto(String url) {
		String contenido = FileHandler.leerDesdeArchivoDeTexto(url);
		if (contenido == null || contenido.isBlank()) {
			return;
		}
		String[] fila = contenido.split("\n");
		for (String f : fila) {
			String[] columna = f.split(";");
			ProductoSostenible temp = new ProductoSostenible();
			temp.setNombre(columna[0]);
			temp.setPrecio(Float.parseFloat(columna[1]));
			temp.setCertificacion(columna[2]);
			temp.setMaterialEcologico(columna[3]);
			listaProductoSostenible.add(temp);
		}
	}

	@Override
	public void escribirEnArchivoDeTexto() {
		StringBuilder sb = new StringBuilder();
		for (ProductoSostenible productoSostenible : listaProductoSostenible) {
			sb.append(productoSostenible.getNombre()).append(";").append(productoSostenible.getPrecio()).append(";")
					.append(productoSostenible.getCertificacion())
					.append(";").append(productoSostenible.getMaterialEcologico()).append(";\n");
		}
		FileHandler.escribirEnArchivoDeTexto(FILE_NAME, sb.toString());
	}

	public void cargarDesdeArchivoSerializado() {
		Object contenido = FileHandler.leerDesdeArchivoSerializado(SERIAL_FILE_NAME);
		if (contenido != null) {
			listaProductoSostenible = (ArrayList<ProductoSostenible>) contenido;
		} else {
			listaProductoSostenible = new ArrayList<>();
		}
	}

	public void escribirEnArchivoSerializado() {
		FileHandler.escribirEnArchivoSerializado(SERIAL_FILE_NAME, listaProductoSostenible);
	}

	public ArrayList<ProductoSostenible> getListaProductoSostenible() {
		return listaProductoSostenible;
	}

	public void setListaProductoSostenible(ArrayList<ProductoSostenible> listaProductoSostenible) {
		this.listaProductoSostenible = listaProductoSostenible;
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
