package co.edu.unbosque.model.persistence;

import java.util.ArrayList;

import co.edu.unbosque.model.Juguete;

public class JugueteDAO implements DAO<Juguete> {

	private ArrayList<Juguete> listaJuguete;
	private final String FILE_NAME = "Juguete.csv";
	private final String SERIAL_FILE_NAME = "Juguete.bin";

	public JugueteDAO() {
		listaJuguete = new ArrayList<Juguete>();
		leerDesdeArchivoDeTexto(FILE_NAME);
	}

	@Override
	public void create(Juguete newData) {
		listaJuguete.add(newData);
		escribirEnArchivoDeTexto();
	}

	@Override
	public boolean delete(int index) {
		if (index < 0 || index >= listaJuguete.size()) {
			return false;
		} else {
			listaJuguete.remove(index);
			escribirEnArchivoDeTexto();
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
			return true;
		}
	}

	String content = "";

	@Override
	public String showAll() {
		for (Juguete juguete : listaJuguete) {
			content += juguete.toString() + "\n";
		}
		return content;

	}

	@Override
	public int count() {
		return listaJuguete.size();
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
			sb.append(juguete.getNombre() + ";");
			sb.append(juguete.getPrecio() + ";");
			sb.append(juguete.getCantidad() + ";");
			sb.append(juguete.getEdadRecomendada() + ";");
			sb.append(juguete.getMaterial() + ";");
			sb.append("\n");
		}
		FileHandler.escribirEnArchivoDeTexto(FILE_NAME, sb.toString());

	}

	public void cargarDesdeArchivoSerializado() {
		Object contenido = FileHandler.leerDesdeArchivoSerializado(SERIAL_FILE_NAME);
		if (contenido != null) {
			listaJuguete = (ArrayList<Juguete>) contenido;
		}
		else {
			listaJuguete = new ArrayList<>();
		}
	}
	
	public void escribirEnArchivoSerializado() {
		FileHandler.escribirEnArchivoSerializado(SERIAL_FILE_NAME, listaJuguete);
	}
	
}
