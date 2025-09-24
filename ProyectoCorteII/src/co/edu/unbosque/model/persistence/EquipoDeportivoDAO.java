package co.edu.unbosque.model.persistence;

import java.util.ArrayList;

import co.edu.unbosque.model.EquipoDeportivo;

public class EquipoDeportivoDAO implements DAO<EquipoDeportivo> {

	private ArrayList<EquipoDeportivo> listaEquipoDeportivo;
	private final String FILE_NAME = "EquipoDeportivo.csv";
	private final String SERIAL_FILE_NAME = " EquipoDeportivo.bin";

	public EquipoDeportivoDAO() {
		listaEquipoDeportivo = new ArrayList<EquipoDeportivo>();
		leerDesdeArchivoDeTexto(FILE_NAME);
		cargarDesdeArchivoSerializado();
	}

	@Override
	public void create(EquipoDeportivo newData) {
		listaEquipoDeportivo.add(newData);
		escribirEnArchivoDeTexto();
		escribirEnArchivoSerializado();

	}

	@Override
	public boolean delete(int index) {
		if (index < 0 || index >= listaEquipoDeportivo.size()) {
			return false;
		} else {
			listaEquipoDeportivo.remove(index);
			escribirEnArchivoDeTexto();
			escribirEnArchivoSerializado();
			return true;
		}
	}

	@Override
	public boolean update(int index, EquipoDeportivo newData) {
		if (index < 0 || index >= listaEquipoDeportivo.size()) {
			return false;
		} else {
			listaEquipoDeportivo.set(index, newData);
			escribirEnArchivoDeTexto();
			escribirEnArchivoSerializado();
			return true;
		}
	}

	@Override
	public String showAll() {
		StringBuilder sb = new StringBuilder();

		for (int i = 0; i < listaEquipoDeportivo.size(); i++) {
			sb.append(i + 1);
			sb.append(" - ");
			sb.append(listaEquipoDeportivo.get(i).toString());
			sb.append("\n");
		}

		return sb.toString();
	}

	@Override
	public int count() {
		return listaEquipoDeportivo.size();
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
				EquipoDeportivo temp = new EquipoDeportivo();

				temp.setNombre(columna[0]);
				temp.setPrecio(Float.parseFloat(columna[1]));
				temp.setCantidad(Integer.parseInt(columna[2]));
				temp.setDeporte(columna[3]);
				temp.setMaterial(columna[4]);

				listaEquipoDeportivo.add(temp);
			}
		}
	}

	@Override
	public void escribirEnArchivoDeTexto() {
		StringBuilder sb = new StringBuilder();
		for (EquipoDeportivo equipoDeportivo : listaEquipoDeportivo) {
			sb.append(equipoDeportivo.getNombre() + ";");
			sb.append(equipoDeportivo.getPrecio() + ";");
			sb.append(equipoDeportivo.getCantidad() + ";");
			sb.append(equipoDeportivo.getDeporte() + ";");
			sb.append(equipoDeportivo.getMaterial() + ";");
			sb.append("\n");
		}
		FileHandler.escribirEnArchivoDeTexto(FILE_NAME, sb.toString());
	}

	public void cargarDesdeArchivoSerializado() {
		Object contenido = FileHandler.leerDesdeArchivoSerializado(SERIAL_FILE_NAME);
		if (contenido != null) {
			listaEquipoDeportivo = (ArrayList<EquipoDeportivo>) contenido;
		} else {
			listaEquipoDeportivo = new ArrayList<>();
		}
	}

	public void escribirEnArchivoSerializado() {
		FileHandler.escribirEnArchivoSerializado(SERIAL_FILE_NAME, listaEquipoDeportivo);
	}

	public ArrayList<EquipoDeportivo> getListaEquipoDeportivo() {
		return listaEquipoDeportivo;
	}

	public void setListaEquipoDeportivo(ArrayList<EquipoDeportivo> listaEquipoDeportivo) {
		this.listaEquipoDeportivo = listaEquipoDeportivo;
	}

	public String getFILE_NAME() {
		return FILE_NAME;
	}

	public String getSERIAL_FILE_NAME() {
		return SERIAL_FILE_NAME;
	}

}
