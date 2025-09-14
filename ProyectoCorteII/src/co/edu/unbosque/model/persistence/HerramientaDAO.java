package co.edu.unbosque.model.persistence;

import java.util.ArrayList;

import co.edu.unbosque.model.Herramienta;

public class HerramientaDAO implements DAO<Herramienta> {

	private ArrayList<Herramienta> listaHerramienta;
	private final String FILE_NAME = "Herramienta.csv";
	private final String SERIAL_FILE_NAME = "Herramienta.bin";

	public HerramientaDAO() {

		listaHerramienta = new ArrayList<Herramienta>();
		leerDesdeArchivoDeTexto(FILE_NAME);
		cargarDesdeArchivoSerializado();
	}

	@Override
	public void create(Herramienta newData) {
		listaHerramienta.add(newData);
		escribirEnArchivoDeTexto();
		escribirEnArchivoSerializado();
	}

	@Override
	public boolean delete(int index) {
		if (index < 0 || index >= listaHerramienta.size()) {
			return false;
		} else {
			listaHerramienta.remove(index);
			escribirEnArchivoDeTexto();
			escribirEnArchivoSerializado();
			return true;
		}
	}

	@Override
	public boolean update(int index, Herramienta newData) {
		if (index < 0 || index >= listaHerramienta.size()) {
			return false;
		} else {
			listaHerramienta.set(index, newData);
			escribirEnArchivoDeTexto();
			escribirEnArchivoSerializado();
			return true;
		}
	}

	String content = "";

	@Override
	public String showAll() {
		for (Herramienta herramienta : listaHerramienta) {
			content += herramienta.toString() + "\n";
		}
		return content;
	}

	@Override
	public int count() {
		return listaHerramienta.size();
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
				Herramienta temp = new Herramienta();

				temp.setNombre(columna[0]);
				temp.setPrecio(Float.parseFloat(columna[1]));
				temp.setCantidad(Integer.parseInt(columna[2]));
				temp.setTipoAlimentacion(columna[3]);
				temp.setMaterial(columna[4]);

				listaHerramienta.add(temp);
			}
		}
	}

	@Override
	public void escribirEnArchivoDeTexto() {
		StringBuilder sb = new StringBuilder();
		for (Herramienta herramienta : listaHerramienta) {
			sb.append(herramienta.getNombre() + ";");
			sb.append(herramienta.getPrecio() + ";");
			sb.append(herramienta.getCantidad() + ";");
			sb.append(herramienta.getTipoAlimentacion() + ";");
			sb.append(herramienta.getMaterial() + ";");
			sb.append("\n");

		}
		FileHandler.escribirEnArchivoDeTexto(FILE_NAME, sb.toString());
	}

	public void cargarDesdeArchivoSerializado() {
		Object contenido = FileHandler.leerDesdeArchivoSerializado(SERIAL_FILE_NAME);
		if (contenido != null) {
			listaHerramienta = (ArrayList<Herramienta>) contenido;
		}
		else {
			listaHerramienta = new ArrayList<>();
		}
	}
	
	public void escribirEnArchivoSerializado() {
		FileHandler.escribirEnArchivoSerializado(SERIAL_FILE_NAME, listaHerramienta);
	}
	
}
