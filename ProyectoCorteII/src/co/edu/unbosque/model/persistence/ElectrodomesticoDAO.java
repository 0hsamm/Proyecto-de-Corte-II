package co.edu.unbosque.model.persistence;

import java.util.ArrayList;

import co.edu.unbosque.model.Electrodomestico;

public class ElectrodomesticoDAO implements DAO<Electrodomestico> {

	private ArrayList<Electrodomestico> listaElectrodomestico;
	private final String FILE_NAME = "Electrodomesticos.csv";
	private final String SERIAL_FILE_NAME = "Electrodomesticos.bin";

	public ElectrodomesticoDAO() {

		listaElectrodomestico = new ArrayList<Electrodomestico>();
		leerDesdeArchivoDeTexto(FILE_NAME);
		cargarDesdeArchivoSerializado();
	}

	@Override
	public void create(Electrodomestico newData) {
		listaElectrodomestico.add(newData);
		escribirEnArchivoDeTexto();escribirEnArchivoSerializado();
	}

	@Override
	public boolean delete(int index) {
		if (index < 0 || index >= listaElectrodomestico.size()) {
			return false;
		} else {
			listaElectrodomestico.remove(index);
			escribirEnArchivoDeTexto();
			cargarDesdeArchivoSerializado();
			return true;
		}
	}

	@Override
	public boolean update(int index, Electrodomestico newData) {
		if (index < 0 || index >= listaElectrodomestico.size()) {
			return false;
		} else {
			listaElectrodomestico.set(index, newData);
			escribirEnArchivoDeTexto();
			escribirEnArchivoSerializado();
			return true;
		}
	}

	String content = "";

	@Override
	public String showAll() {
		for (Electrodomestico electrodomestico : listaElectrodomestico) {
			content += electrodomestico.toString() + "\n";
		}
		return content;

	}

	@Override
	public int count() {
		return listaElectrodomestico.size();
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
				Electrodomestico temp = new Electrodomestico();

				temp.setNombre(columna[0]);
				temp.setPrecio(Float.parseFloat(columna[1]));
				temp.setCantidad(Integer.parseInt(columna[2]));
				temp.setConsumoEnergia(columna[3]);
				temp.setCapacidad(columna[4]);

				listaElectrodomestico.add(temp);
			}
		}
	}

	@Override
	public void escribirEnArchivoDeTexto() {
		StringBuilder sb = new StringBuilder();
		for (Electrodomestico electrodomestico : listaElectrodomestico) {
			sb.append(electrodomestico.getNombre() + ";");
			sb.append(electrodomestico.getPrecio() + ";");
			sb.append(electrodomestico.getCantidad() + ";");
			sb.append(electrodomestico.getConsumoEnergia() + ";");
			sb.append(electrodomestico.getCapacidad() + ";");
			sb.append("\n");
		}
		FileHandler.escribirEnArchivoDeTexto(FILE_NAME, sb.toString());
	}


	public void cargarDesdeArchivoSerializado() {
		Object contenido = FileHandler.leerDesdeArchivoSerializado(SERIAL_FILE_NAME);
		if (contenido != null) {
			listaElectrodomestico = (ArrayList<Electrodomestico>) contenido;
		}
		else {
			listaElectrodomestico = new ArrayList<>();
		}
	}

	public void escribirEnArchivoSerializado() {
		FileHandler.escribirEnArchivoSerializado(SERIAL_FILE_NAME, listaElectrodomestico);
	}

	public ArrayList<Electrodomestico> getListaElectrodomestico() {
		return listaElectrodomestico;
	}

	public void setListaElectrodomestico(ArrayList<Electrodomestico> listaElectrodomestico) {
		this.listaElectrodomestico = listaElectrodomestico;
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
