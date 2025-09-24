package co.edu.unbosque.model.persistence;

import java.util.ArrayList;
import co.edu.unbosque.model.Juguete;

/**
 * DAO para manejar los datos de los juguetes. Permite crear, eliminar,
 * actualizar, mostrar, contar y guardar información en archivos de texto o
 * binarios.
 */
public class JugueteDAO implements DAO<Juguete> {

	private ArrayList<Juguete> listaJuguete;
	private final String FILE_NAME = "Juguete.csv";
	private final String SERIAL_FILE_NAME = "Juguete.bin";
	private String content = "";

	/**
	 * Constructor que inicializa la lista y carga los datos desde los archivos de
	 * texto y binario si existen.
	 */
	public JugueteDAO() {
		listaJuguete = new ArrayList<Juguete>();
		leerDesdeArchivoDeTexto(FILE_NAME);
		cargarDesdeArchivoSerializado();
	}

	@Override
	public void create(Juguete newData) {
		listaJuguete.add(newData);
		escribirEnArchivoDeTexto();
		escribirEnArchivoSerializado();
	}

	@Override
	public boolean delete(int index) {
		if (index < 0 || index >= listaJuguete.size()) {
			return false;
		} else {
			listaJuguete.remove(index);
			escribirEnArchivoDeTexto();
			escribirEnArchivoSerializado();
			return true;
		}
	}

	@Override
	public boolean update(int index, Juguete newData) {
		if (index < 0 || index >= listaJuguete.size()) {
			return false;
		} else {
			listaJuguete.set(index, newData);
			escribirEnArchivoDeTexto();
			escribirEnArchivoSerializado();
			return true;
		}
	}

	/**
	 * Muestra todos los juguetes en formato de texto con índices.
	 */
	@Override
	public String showAll() {
		StringBuilder sb = new StringBuilder();
		for (int i = 0; i < listaJuguete.size(); i++) {
			sb.append(i + 1).append(" - ").append(listaJuguete.get(i).toString()).append("\n");
		}
		return sb.toString();
	}

	@Override
	public int count() {
		return listaJuguete.size();
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
				Juguete temp = new Juguete();
				temp.setNombre(columna[0]);
				temp.setPrecio(Float.parseFloat(columna[1]));
				temp.setCantidad(Integer.parseInt(columna[2]));
				temp.setEdadRecomendada(columna[3]);
				temp.setMaterial(columna[4]);
				listaJuguete.add(temp);
			}
		}
	}

	@Override
	public void escribirEnArchivoDeTexto() {
		StringBuilder sb = new StringBuilder();
		for (Juguete juguete : listaJuguete) {
			sb.append(juguete.getNombre()).append(";");
			sb.append(juguete.getPrecio()).append(";");
			sb.append(juguete.getCantidad()).append(";");
			sb.append(juguete.getEdadRecomendada()).append(";");
			sb.append(juguete.getMaterial()).append(";\n");
		}
		FileHandler.escribirEnArchivoDeTexto(FILE_NAME, sb.toString());
	}

	public void cargarDesdeArchivoSerializado() {
		Object contenido = FileHandler.leerDesdeArchivoSerializado(SERIAL_FILE_NAME);
		if (contenido != null) {
			listaJuguete = (ArrayList<Juguete>) contenido;
		} else {
			listaJuguete = new ArrayList<>();
		}
	}

	public void escribirEnArchivoSerializado() {
		FileHandler.escribirEnArchivoSerializado(SERIAL_FILE_NAME, listaJuguete);
	}

	public ArrayList<Juguete> getListaJuguete() {
		return listaJuguete;
	}

	public void setListaJuguete(ArrayList<Juguete> listaJuguete) {
		this.listaJuguete = listaJuguete;
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
