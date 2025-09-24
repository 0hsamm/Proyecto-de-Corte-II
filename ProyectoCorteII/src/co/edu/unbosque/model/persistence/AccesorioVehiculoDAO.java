package co.edu.unbosque.model.persistence;

import java.util.ArrayList;
import co.edu.unbosque.model.AccesorioVehiculo;

/**
 * Clase que maneja la lista de accesorios de vehículo. Permite crear, eliminar,
 * actualizar y mostrar los datos, así como guardarlos en archivos de texto y
 * archivos serializados.
 */
public class AccesorioVehiculoDAO implements DAO<AccesorioVehiculo> {

	private ArrayList<AccesorioVehiculo> listaAccesorioVehiculo;
	private final String FILE_NAME = "AccesorioVehiculo.csv";
	private final String SERIAL_FILE_NAME = "AccesorioVehiculo.bin";
	private String content = "";

	/**
	 * Constructor que inicializa la lista y carga datos desde archivos si existen.
	 */
	public AccesorioVehiculoDAO() {
		listaAccesorioVehiculo = new ArrayList<>();
		leerDesdeArchivoDeTexto(FILE_NAME);
		cargarDesdeArchivoSerializado();
	}

	/**
	 * Agrega un accesorio nuevo a la lista y guarda los datos.
	 *
	 * @param newData objeto de tipo AccesorioVehiculo
	 */
	@Override
	public void create(AccesorioVehiculo newData) {
		listaAccesorioVehiculo.add(newData);
		escribirEnArchivoDeTexto();
		escribirEnArchivoSerializado();
	}

	/**
	 * Borra un accesorio de la lista según el índice.
	 *
	 * @param index posición en la lista
	 * @return true si se borró, false si no
	 */
	@Override
	public boolean delete(int index) {
		if (index < 0 || index >= listaAccesorioVehiculo.size()) {
			return false;
		}
		listaAccesorioVehiculo.remove(index);
		escribirEnArchivoDeTexto();
		escribirEnArchivoSerializado();
		return true;
	}

	/**
	 * Actualiza un accesorio en la lista.
	 *
	 * @param index   posición en la lista
	 * @param newData objeto nuevo con los datos
	 * @return true si se actualizó, false si no
	 */
	@Override
	public boolean update(int index, AccesorioVehiculo newData) {
		if (index < 0 || index >= listaAccesorioVehiculo.size()) {
			return false;
		}
		listaAccesorioVehiculo.set(index, newData);
		escribirEnArchivoDeTexto();
		escribirEnArchivoSerializado();
		return true;
	}

	/**
	 * Muestra todos los accesorios en forma de texto.
	 *
	 * @return cadena con la información de cada accesorio
	 */
	@Override
	public String showAll() {
		StringBuilder sb = new StringBuilder();
		for (int i = 0; i < listaAccesorioVehiculo.size(); i++) {
			sb.append(i + 1).append(" - ").append(listaAccesorioVehiculo.get(i).toString()).append("\n");
		}
		return sb.toString();
	}

	/**
	 * Devuelve la cantidad de accesorios en la lista.
	 *
	 * @return cantidad de accesorios
	 */
	@Override
	public int count() {
		return listaAccesorioVehiculo.size();
	}

	/**
	 * Lee los datos desde un archivo de texto y los agrega a la lista.
	 *
	 * @param url nombre del archivo
	 */
	@Override
	public void leerDesdeArchivoDeTexto(String url) {
		String contenido = FileHandler.leerDesdeArchivoDeTexto(url);
		if (contenido == null || contenido.isBlank()) {
			return;
		}
		String[] fila = contenido.split("\n");
		for (String line : fila) {
			String[] columna = line.split(";");
			if (columna.length >= 5) {
				AccesorioVehiculo temp = new AccesorioVehiculo();
				temp.setNombre(columna[0]);
				temp.setPrecio(Float.parseFloat(columna[1]));
				temp.setCantidad(Integer.parseInt(columna[2]));
				temp.setMaterial(columna[3]);
				temp.setCompatibilidad(columna[4]);
				listaAccesorioVehiculo.add(temp);
			}
		}
	}

	/**
	 * Escribe los datos de la lista en el archivo de texto.
	 */
	@Override
	public void escribirEnArchivoDeTexto() {
		StringBuilder sb = new StringBuilder();
		for (AccesorioVehiculo accesorioVehiculo : listaAccesorioVehiculo) {
			sb.append(accesorioVehiculo.getNombre()).append(";").append(accesorioVehiculo.getPrecio()).append(";")
					.append(accesorioVehiculo.getCantidad()).append(";").append(accesorioVehiculo.getMaterial())
					.append(";").append(accesorioVehiculo.getCompatibilidad()).append(";").append("\n");
		}
		FileHandler.escribirEnArchivoDeTexto(FILE_NAME, sb.toString());
	}

	/**
	 * Carga los datos desde el archivo serializado.
	 */
	public void cargarDesdeArchivoSerializado() {
		Object contenido = FileHandler.leerDesdeArchivoSerializado(SERIAL_FILE_NAME);
		if (contenido != null) {
			listaAccesorioVehiculo = (ArrayList<AccesorioVehiculo>) contenido;
		} else {
			listaAccesorioVehiculo = new ArrayList<>();
		}
	}

	/**
	 * Guarda los datos en el archivo serializado.
	 */
	public void escribirEnArchivoSerializado() {
		FileHandler.escribirEnArchivoSerializado(SERIAL_FILE_NAME, listaAccesorioVehiculo);
	}

	public ArrayList<AccesorioVehiculo> getListaAccesorioVehiculo() {
		return listaAccesorioVehiculo;
	}

	public void setListaAccesorioVehiculo(ArrayList<AccesorioVehiculo> listaAccesorioVehiculo) {
		this.listaAccesorioVehiculo = listaAccesorioVehiculo;
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
