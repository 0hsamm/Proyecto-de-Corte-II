package co.edu.unbosque.model.persistence;

import java.util.ArrayList;

import co.edu.unbosque.model.PrendaDeVestir;

public class PrendaDeVestirDAO implements DAO<PrendaDeVestir> {

	private ArrayList<PrendaDeVestir> listaPrendaDeVestir;
	private final String FILE_NAME = "PrendaDeVestir.csv";

	public PrendaDeVestirDAO() {
		listaPrendaDeVestir = new ArrayList<PrendaDeVestir>();
		leerDesdeArchivoDeTexto(FILE_NAME);
	}

	@Override
	public void create(PrendaDeVestir newData) {
		listaPrendaDeVestir.add(newData);
		escribirEnArchivoDeTexto();

	}

	@Override
	public boolean delete(int index) {
		if (index < 0 || index >= listaPrendaDeVestir.size()) {
			return false;
		} else {
			listaPrendaDeVestir.remove(index);
			escribirEnArchivoDeTexto();
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

}
