package co.edu.unbosque.model.persistence;

import java.util.ArrayList;

import co.edu.unbosque.model.PrendaDeVestir;

public class PrendaDeVestirDAO implements DAO<PrendaDeVestir> {

	private ArrayList<PrendaDeVestir> listaPrendaDeVestir;
	private final String FILE_NAME = "PrendaDeVestir.csv";
	private final String SERIAL_FILE_NAME = "PrendaDeVestir.bin";

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

	String content = "";

	@Override
	public String showAll() {
		for (PrendaDeVestir prendaDeVestir : listaPrendaDeVestir) {
			content += prendaDeVestir.toString() + "\n";
		}
		return content;
	}

	@Override
	public int count() {
		return listaPrendaDeVestir.size();
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
				PrendaDeVestir temp = new PrendaDeVestir();

				temp.setNombre(columna[0]);
				temp.setPrecio(Float.parseFloat(columna[1]));
				temp.setCantidad(Integer.parseInt(columna[2]));
				temp.setTalla(columna[3]);
				temp.setTipoTela(columna[4]);

				listaPrendaDeVestir.add(temp);
			}
		}
	}

	@Override
	public void escribirEnArchivoDeTexto() {
		StringBuilder sb = new StringBuilder();
		for (PrendaDeVestir prendaDeVestir : listaPrendaDeVestir) {

			sb.append(prendaDeVestir.getNombre() + ";");
			sb.append(prendaDeVestir.getPrecio() + ";");
			sb.append(prendaDeVestir.getCantidad() + ";");
			sb.append(prendaDeVestir.getTalla() + ";");
			sb.append(prendaDeVestir.getTipoTela() + ";");
			sb.append("\n");

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
