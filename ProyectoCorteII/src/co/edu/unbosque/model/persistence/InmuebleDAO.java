package co.edu.unbosque.model.persistence;

import java.util.ArrayList;

import co.edu.unbosque.model.Inmueble;

public class InmuebleDAO implements DAO<Inmueble> {

	private ArrayList<Inmueble> listaInmueble;
	private final String FILE_NAME = "Inmueble.csv";
	private final String SERIAL_FILE_NAME = "Inmueble.bin";

	public InmuebleDAO() {
		listaInmueble = new ArrayList<Inmueble>();
		leerDesdeArchivoDeTexto(FILE_NAME);
		escribirEnArchivoSerializado();

	}

	@Override
	public void create(Inmueble newData) {
		listaInmueble.add(newData);
		escribirEnArchivoDeTexto();
		escribirEnArchivoSerializado();
	}

	@Override
	public boolean delete(int index) {
		if (index < 0 || index >= listaInmueble.size()) {
			return false;
		} else {
			listaInmueble.remove(index);
			escribirEnArchivoDeTexto();
			escribirEnArchivoSerializado();
			return true;
		}
	}

	@Override
	public boolean update(int index, Inmueble newData) {
		if (index < 0 || index >= listaInmueble.size()) {
			return false;
		} else {
			listaInmueble.set(index, newData);
			escribirEnArchivoDeTexto();
			escribirEnArchivoSerializado();
			return true;
		}
	}

	@Override
	public String showAll() {
		StringBuilder sb = new StringBuilder();

		for (int i = 0; i < listaInmueble.size(); i++) {
			sb.append(i + 1);
			sb.append(" - ");
			sb.append(listaInmueble.get(i).toString());
			sb.append("\n");
		}

		return sb.toString();
	}

	@Override
	public int count() {
		return listaInmueble.size();
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
				Inmueble temp = new Inmueble();

				temp.setNombre(columna[0]);
				temp.setPrecio(Float.parseFloat(columna[1]));
				temp.setCantidad(Integer.parseInt(columna[2]));
				temp.setArea(columna[3]);
				temp.setCantidadCuarto(columna[4]);

				listaInmueble.add(temp);

			}
		}
	}

	@Override
	public void escribirEnArchivoDeTexto() {
		StringBuilder sb = new StringBuilder();
		for (Inmueble inmueble : listaInmueble) {
			sb.append(inmueble.getNombre() + ";");
			sb.append(inmueble.getPrecio() + ";");
			sb.append(inmueble.getCantidad() + ";");
			sb.append(inmueble.getArea() + ";");
			sb.append(inmueble.getCantidadCuarto() + ";");
			sb.append("\n");

		}
		FileHandler.escribirEnArchivoDeTexto(FILE_NAME, sb.toString());

	}

	public void cargarDesdeArchivoSerializado() {
		Object contenido = FileHandler.leerDesdeArchivoSerializado(SERIAL_FILE_NAME);
		if (contenido != null) {
			listaInmueble = (ArrayList<Inmueble>) contenido;
		} else {
			listaInmueble = new ArrayList<>();
		}
	}

	public void escribirEnArchivoSerializado() {
		FileHandler.escribirEnArchivoSerializado(SERIAL_FILE_NAME, listaInmueble);
	}

	public ArrayList<Inmueble> getListaInmueble() {
		return listaInmueble;
	}

	public void setListaInmueble(ArrayList<Inmueble> listaInmueble) {
		this.listaInmueble = listaInmueble;
	}

	public String getFILE_NAME() {
		return FILE_NAME;
	}

	public String getSERIAL_FILE_NAME() {
		return SERIAL_FILE_NAME;
	}

}
