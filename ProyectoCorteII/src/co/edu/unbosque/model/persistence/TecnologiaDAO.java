package co.edu.unbosque.model.persistence;

import java.util.ArrayList;

import co.edu.unbosque.model.Tecnologia;

public class TecnologiaDAO implements DAO<Tecnologia> {

	private ArrayList<Tecnologia> listaTecnologia;
	private final String FILE_NAME = "Tecnologia.csv";
	private final String SERIAL_FILE_NAME = "Tecnologia.bin";

	public TecnologiaDAO() {
		listaTecnologia = new ArrayList<Tecnologia>();
		leerDesdeArchivoDeTexto(FILE_NAME);
		escribirEnArchivoSerializado();
	}

	@Override
	public void create(Tecnologia newData) {
		listaTecnologia.add(newData);
		escribirEnArchivoDeTexto();
		escribirEnArchivoSerializado();
	}

	@Override
	public boolean delete(int index) {
		if (index < 0 || index >= listaTecnologia.size()) {
			return false;
		} else {
			listaTecnologia.remove(index);
			escribirEnArchivoDeTexto();
			escribirEnArchivoSerializado();
			return true;
		}
	}

	@Override
	public boolean update(int index, Tecnologia newData) {
		if (index < 0 || index >= listaTecnologia.size()) {
			return false;
		} else {
			listaTecnologia.set(index, newData);
			escribirEnArchivoDeTexto();
			escribirEnArchivoSerializado();
			return true;
		}
	}

	@Override
	public String showAll() {
		StringBuilder sb = new StringBuilder();

		for (int i = 0; i < listaTecnologia.size(); i++) {
			sb.append(i + 1);
			sb.append(" - ");
			sb.append(listaTecnologia.get(i).toString());
			sb.append("\n");
		}

		return sb.toString();

	}

	@Override
	public int count() {
		return listaTecnologia.size();
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
				Tecnologia temp = new Tecnologia();

				temp.setNombre(columna[0]);
				temp.setPrecio(Float.parseFloat(columna[1]));
				temp.setCantidad(Integer.parseInt(columna[2]));
				temp.setSistemaOperativo(columna[3]);
				temp.setConectividad(columna[4]);

				listaTecnologia.add(temp);
			}
		}
	}

	@Override
	public void escribirEnArchivoDeTexto() {
		StringBuilder sb = new StringBuilder();
		for (Tecnologia tecnologia : listaTecnologia) {
			sb.append(tecnologia.getNombre() + ";");
			sb.append(tecnologia.getPrecio() + ";");
			sb.append(tecnologia.getCantidad() + ";");
			sb.append(tecnologia.getSistemaOperativo() + ";");
			sb.append(tecnologia.getConectividad() + ";");
			sb.append("\n");

		}
		FileHandler.escribirEnArchivoDeTexto(FILE_NAME, sb.toString());

	}

	public void cargarDesdeArchivoSerializado() {
		Object contenido = FileHandler.leerDesdeArchivoSerializado(SERIAL_FILE_NAME);
		if (contenido != null) {
			listaTecnologia = (ArrayList<Tecnologia>) contenido;
		} else {
			listaTecnologia = new ArrayList<>();
		}
	}

	public void escribirEnArchivoSerializado() {
		FileHandler.escribirEnArchivoSerializado(SERIAL_FILE_NAME, listaTecnologia);
	}

	public ArrayList<Tecnologia> getListaTecnologia() {
		return listaTecnologia;
	}

	public void setListaTecnologia(ArrayList<Tecnologia> listaTecnologia) {
		this.listaTecnologia = listaTecnologia;
	}

	public String getFILE_NAME() {
		return FILE_NAME;
	}

	public String getSERIAL_FILE_NAME() {
		return SERIAL_FILE_NAME;
	}

}
