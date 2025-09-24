package co.edu.unbosque.model.persistence;

import java.util.ArrayList;
import co.edu.unbosque.model.Herramienta;

/**
 * Clase que maneja la lista de herramientas. Permite agregar, eliminar,
 * actualizar y mostrar herramientas, además de guardar los datos en archivos de
 * texto y binarios.
 */
public class HerramientaDAO implements DAO<Herramienta> {

	private ArrayList<Herramienta> listaHerramienta;
	private final String FILE_NAME = "Herramienta.csv";
	private final String SERIAL_FILE_NAME = "Herramienta.bin";
	private String content = "";

	/**
	 * Constructor que inicializa la lista de herramientas. También carga los datos
	 * desde los archivos de texto y binario.
	 */
	public HerramientaDAO() {
		listaHerramienta = new ArrayList<>();
		leerDesdeArchivoDeTexto(FILE_NAME);
		cargarDesdeArchivoSerializado();
	}

	@Override
	public void create(Herramienta newData) {
		listaHerramienta.add(newData);
		escribirEnArchivoDeTexto();
		escribirEnArchivoSerializado();
	}

	@Override
	public boolean delete(int index) {
		if (index < 0 || index >= listaHerramienta.size()) {
			return false;
		}
		listaHerramienta.remove(index);
		escribirEnArchivoDeTexto();
		escribirEnArchivoSerializado();
		return true;
	}

	@Override
	public boolean update(int index, Herramienta newData) {
		if (index < 0 || index >= listaHerramienta.size()) {
			return false;
		}
		listaHerramienta.set(index, newData);
		escribirEnArchivoDeTexto();
		escribirEnArchivoSerializado();
		return true;
	}

	/**
	 * Muestra todas las herramientas en formato enumerado.
	 */
	@Override
	public String showAll() {
		StringBuilder sb = new StringBuilder();
		for (int i = 0; i < listaHerramienta.size(); i++) {
			sb.append(i + 1).append(" - ").append(listaHerramienta.get(i).toString()).append("\n");
		}
		return sb.toString();
	}

	@Override
	public int count() {
		return listaHerramienta.size();
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
			if (columna.length >= 5) {
				Herramienta temp = new Herramienta();
				temp.setNombre(columna[0]);
				temp.setPrecio(Float.parseFloat(columna[1]));
				temp.setTipoAlimentacion(columna[2]);
				temp.setMaterial(columna[3]);
				listaHerramienta.add(temp);
			}
		}
	}

	@Override
	public void escribirEnArchivoDeTexto() {
		StringBuilder sb = new StringBuilder();
		for (Herramienta herramienta : listaHerramienta) {
			sb.append(herramienta.getNombre()).append(";").append(herramienta.getPrecio()).append(";")
					.append(herramienta.getTipoAlimentacion()).append(";").append(herramienta.getMaterial())
					.append(";\n");
		}
		FileHandler.escribirEnArchivoDeTexto(FILE_NAME, sb.toString());
	}

	public void cargarDesdeArchivoSerializado() {
		Object contenido = FileHandler.leerDesdeArchivoSerializado(SERIAL_FILE_NAME);
		if (contenido != null) {
			listaHerramienta = (ArrayList<Herramienta>) contenido;
		} else {
			listaHerramienta = new ArrayList<>();
		}
	}

	public void escribirEnArchivoSerializado() {
		FileHandler.escribirEnArchivoSerializado(SERIAL_FILE_NAME, listaHerramienta);
	}

	// Getters y setters
	public ArrayList<Herramienta> getListaHerramienta() {
		return listaHerramienta;
	}

	public void setListaHerramienta(ArrayList<Herramienta> listaHerramienta) {
		this.listaHerramienta = listaHerramienta;
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
