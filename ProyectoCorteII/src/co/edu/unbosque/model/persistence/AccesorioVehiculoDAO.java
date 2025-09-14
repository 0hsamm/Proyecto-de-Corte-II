package co.edu.unbosque.model.persistence;

import java.util.ArrayList;

import co.edu.unbosque.model.AccesorioVehiculo;

public class AccesorioVehiculoDAO implements DAO<AccesorioVehiculo> {

	private ArrayList<AccesorioVehiculo> listaAccesorioVehiculo;
	private final String FILE_NAME = "AccesorioVehiculo.csv";
	private final String SERIAL_FILE_NAME = "AccesorioVehiculo.bin";

	public AccesorioVehiculoDAO() {
		listaAccesorioVehiculo = new ArrayList<AccesorioVehiculo>();
		leerDesdeArchivoDeTexto(FILE_NAME);
		cargarDesdeArchivoSerializado();
		

	}

	@Override
	public void create(AccesorioVehiculo newData) {
		listaAccesorioVehiculo.add(newData);
		escribirEnArchivoDeTexto();
		escribirEnArchivoSerializado();
	}

	@Override
	public boolean delete(int index) {
		if (index < 0 || index >= listaAccesorioVehiculo.size()) {
			return false;
		} else {
			listaAccesorioVehiculo.remove(index);
			escribirEnArchivoDeTexto();
			escribirEnArchivoSerializado();
			return true;
		}
	}

	@Override
	public boolean update(int index, AccesorioVehiculo newData) {
		if (index < 0 || index >= listaAccesorioVehiculo.size()) {
			return false;
		} else {
			listaAccesorioVehiculo.set(index, newData);
			escribirEnArchivoDeTexto();
			escribirEnArchivoSerializado();
			return true;
		}
	}

	String content = "";

	@Override
	public String showAll() {
		content = "";
		for (AccesorioVehiculo accesorioVehiculo : listaAccesorioVehiculo) {
			content += accesorioVehiculo.toString() + "\n";
		}
		return content;
	}

	@Override
	public int count() {
		return listaAccesorioVehiculo.size();
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

	@Override
	public void escribirEnArchivoDeTexto() {
		StringBuilder sb = new StringBuilder();
		for (AccesorioVehiculo accesorioVehiculo : listaAccesorioVehiculo) {
			sb.append(accesorioVehiculo.getNombre() + ";");
			sb.append(accesorioVehiculo.getPrecio() + ";");
			sb.append(accesorioVehiculo.getCantidad() + ";");
			sb.append(accesorioVehiculo.getMaterial() + ";");
			sb.append(accesorioVehiculo.getCompatibilidad() + ";");
			sb.append("\n");
		}
		FileHandler.escribirEnArchivoDeTexto(FILE_NAME, sb.toString());
	}
	public void cargarDesdeArchivoSerializado() {
		Object contenido = FileHandler.leerDesdeArchivoSerializado(SERIAL_FILE_NAME);
		if (contenido != null) {
			listaAccesorioVehiculo = (ArrayList<AccesorioVehiculo>) contenido;
		}
		else {
			listaAccesorioVehiculo = new ArrayList<>();
		}
	}
	
	public void escribirEnArchivoSerializado() {
		FileHandler.escribirEnArchivoSerializado(SERIAL_FILE_NAME, listaAccesorioVehiculo);
	}

	
	
}
