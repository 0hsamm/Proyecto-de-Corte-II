package co.edu.unbosque.model.persistence;

import java.util.ArrayList;
import co.edu.unbosque.model.PrendaDeVestir;

/**
 * DAO para manejar los datos de las prendas de vestir. Permite crear, eliminar,
 * actualizar, mostrar, contar y guardar información en archivos de texto o
 * binarios.
 */
public class PrendaDeVestirDAO implements DAO<PrendaDeVestir> {

	private ArrayList<PrendaDeVestir> listaPrendaDeVestir;
	private final String FILE_NAME = "PrendaDeVestir.csv";
	private final String SERIAL_FILE_NAME = "PrendaDeVestir.bin";
	private String content = "";

	public PrendaDeVestirDAO() {
		listaPrendaDeVestir = new ArrayList<PrendaDeVestir>();
		leerDesdeArchivoDeTexto(FILE_NAME);
		cargarDesdeArchivoSerializado();
	}

	@Override
	public void create(PrendaDeVestir newData) {
		listaPrendaDeVestir.add(newData);
		escribirEnArchivoDeTexto();
		escribirEnArchivoSerializado();
	}

	@Override
	public boolean delete(int index) {
		if (index < 0 || index >= listaPrendaDeVestir.size()) {
			return false;
		} else {
			listaPrendaDeVestir.remove(index);
			escribirEnArchivoDeTexto();
			escribirEnArchivoSerializado();
			return true;
		}
	}

	@Override
	public boolean update(int index, PrendaDeVestir newData) {
		if (index < 0 || index >= listaPrendaDeVestir.size()) {
			return false;
		} else {
			listaPrendaDeVestir.set(index, newData);
			escribirEnArchivoDeTexto();
			escribirEnArchivoSerializado();
			return true;
		}
	}

	/**
	 * Muestra todas las prendas en formato de texto con índice.
	 */
	@Override
	public String showAll() {
		StringBuilder sb = new StringBuilder();
		for (int i = 0; i < listaPrendaDeVestir.size(); i++) {
			sb.append(i + 1).append(" - ").append(listaPrendaDeVestir.get(i).toString()).append("\n");
		}
		return sb.toString();
	}

	@Override
	public int count() {
		return listaPrendaDeVestir.size();
	}

	@Override
	public void leerDesdeArchivoDeTexto(String url) {
		String contenido = FileHandler.leerDesdeArchivoDeTexto(url);
		if (contenido == null || contenido.isBlank()) {
			return;
		} else {
			String[] fila = contenido.split("\n");
			for (String f : fila) {
				String[] columna = f.split(";");
				PrendaDeVestir temp = new PrendaDeVestir();
				temp.setNombre(columna[0]);
				temp.setPrecio(Float.parseFloat(columna[1]));
				temp.setTalla(columna[2]);
				temp.setTipoTela(columna[3]);
				listaPrendaDeVestir.add(temp);
			}
		}
	}

	@Override
	public void escribirEnArchivoDeTexto() {
		StringBuilder sb = new StringBuilder();
		for (PrendaDeVestir prenda : listaPrendaDeVestir) {
			sb.append(prenda.getNombre()).append(";");
			sb.append(prenda.getPrecio()).append(";");
			sb.append(prenda.getTalla()).append(";");
			sb.append(prenda.getTipoTela()).append(";\n");
		}
		FileHandler.escribirEnArchivoDeTexto(FILE_NAME, sb.toString());
	}

	public void cargarDesdeArchivoSerializado() {
		Object contenido = FileHandler.leerDesdeArchivoSerializado(SERIAL_FILE_NAME);
		if (contenido != null) {
			listaPrendaDeVestir = (ArrayList<PrendaDeVestir>) contenido;
		} else {
			listaPrendaDeVestir = new ArrayList<>();
		}
	}

	public void escribirEnArchivoSerializado() {
		FileHandler.escribirEnArchivoSerializado(SERIAL_FILE_NAME, listaPrendaDeVestir);
	}

	public ArrayList<PrendaDeVestir> getListaPrendaDeVestir() {
		return listaPrendaDeVestir;
	}

	public void setListaPrendaDeVestir(ArrayList<PrendaDeVestir> listaPrendaDeVestir) {
		this.listaPrendaDeVestir = listaPrendaDeVestir;
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
