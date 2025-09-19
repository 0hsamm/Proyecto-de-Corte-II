package co.edu.unbosque.model.persistence;

import java.util.ArrayList;

import co.edu.unbosque.model.Comprador;

public class CompradorDAO implements DAO<Comprador> {

	private ArrayList<Comprador> listaCompradores;
	private final String FILE_NAME = "Comprador.csv";
	private final String SERIAL_FILE_NAME = "Comprador.bin";

	public CompradorDAO() {
		listaCompradores = new ArrayList<Comprador>();
		leerDesdeArchivoDeTexto(FILE_NAME);
		cargarDesdeArchivoSerializado();
		

	}

	@Override
	public void create(Comprador newData) {
		listaCompradores.add(newData);
		escribirEnArchivoDeTexto();
		escribirEnArchivoSerializado();

	}

	@Override
	public boolean delete(int index) {
		if (index < 0 || index >= listaCompradores.size()) {
			return false;
		} else {
			listaCompradores.remove(index);
			escribirEnArchivoDeTexto();
			escribirEnArchivoSerializado();
			return true;
		}
	}

	@Override
	public boolean update(int index, Comprador newData) {
		if (index < 0 || index >= listaCompradores.size()) {
			return false;
		} else {
			listaCompradores.set(index, newData);
			escribirEnArchivoDeTexto();
			escribirEnArchivoSerializado();
			return true;
		}
	}

	String content = "";

	@Override
	public String showAll() {
		content = "";
		for (Comprador comprador : listaCompradores) {
			content += comprador.toString() + "\n";
		}
		return content;

	}

	@Override
	public int count() {
		return listaCompradores.size();
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
				Comprador temp = new Comprador();

				temp.setCorreo(columna[0]);
				temp.setNombre(columna[1]);
				temp.setTelefono(columna[2]);
				temp.setId(columna[3]);
				temp.setSexo(columna[4].charAt(0));
				temp.setEsMiembroVIP(Boolean.valueOf(columna[5]));
				temp.setCarroCompras(Integer.parseInt(columna[6]));
				temp.setListacomprasRealizadas(Integer.parseInt(columna[7]));

				listaCompradores.add(temp);

			}
		}

	}

	@Override
	public void escribirEnArchivoDeTexto() {
		StringBuilder sb = new StringBuilder();
		for (Comprador comprador : listaCompradores) {
			sb.append(comprador.getCorreo() + ";");
			sb.append(comprador.getNombre() + ";");
			sb.append(comprador.getTelefono() + ";");
			sb.append(comprador.getId() + ";");
			sb.append(comprador.getSexo() + ";");
			sb.append(comprador.isEsMiembroVIP() + ";");
			sb.append(comprador.getCarroCompras() + ";");
			sb.append(comprador.getListacomprasRealizadas() + ";");
			sb.append("\n");
		}
		FileHandler.escribirEnArchivoDeTexto(FILE_NAME, sb.toString());
	}
	public void cargarDesdeArchivoSerializado() {
		Object contenido = FileHandler.leerDesdeArchivoSerializado(SERIAL_FILE_NAME);
		if (contenido != null) {
			listaCompradores = (ArrayList<Comprador>) contenido;
		}
		else {
			listaCompradores = new ArrayList<>();
		}
	}
	
	public void escribirEnArchivoSerializado() {
		FileHandler.escribirEnArchivoSerializado(SERIAL_FILE_NAME, listaCompradores);
	}

	public ArrayList<Comprador> getListaCompradores() {
		return listaCompradores;
	}

	public void setListaCompradores(ArrayList<Comprador> listaCompradores) {
		this.listaCompradores = listaCompradores;
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
