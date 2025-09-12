package co.edu.unbosque.model.persistence;

import java.time.LocalDate;
import java.util.ArrayList;

import co.edu.unbosque.model.Gato;
import co.edu.unbosque.model.Perro;

public class GatoDAO implements DAO  <Gato>{

	private ArrayList<Gato> gatoList;
	private final String FILE_NAME = "gato.csv";

	public GatoDAO() {
		gatoList = new ArrayList<Gato>();
		leerDesdeArchivoDeTexto(FILE_NAME);
	}

	@Override
	public void create(Gato newData) {
		gatoList.add(newData);
		guardarEnArchivo();
	}

	@Override
	public boolean delete(int index) {
		index = index - 1;
		if(index < 0 || index >= gatoList.size()) {
			return false;
		}else {
			gatoList.remove(index);
			guardarEnArchivo();
			return true;
		}
	}

	@Override
	public boolean update(int index, Gato newData) {
		index = index - 1;
		if(index < 0 || index >= gatoList.size()) {
			return false;
		}else {
			gatoList.set(index, newData);
			guardarEnArchivo();
			return true;
		}
	}



	@Override
	public String showAll() {
		if(gatoList.isEmpty()) {
			return "No hay gatos registrados\n";
		}
		String content="";
		int i = 1;
		for (Gato gato : gatoList) {
			content+= "\nGato " + i + ". " + gato.toString();
		}
		/*
		gatoList.forEach((gato)->{
			content+=gato.toString();
		});*/
		return content +"\n";
	}


	@Override
	public int count() {
		return gatoList.size();
	}

	public void deleteAll() {
		gatoList.clear();
		guardarEnArchivo();
	}
	public boolean isEmpty() {
		return gatoList.isEmpty();
	}

	public void guardarEnArchivo() {
		StringBuilder sb = new StringBuilder();
		for (Gato p : gatoList) {
			sb.append(p.getNombre()).append(";")
			.append(p.getRaza()).append(";")
			.append(p.getPeso()).append(";")
			.append(p.getEdad()).append(";")
			.append(p.getSexo()).append(";")
			.append(p.getHabitad()).append(";")
			.append(p.getFechaIngreso()).append(";")
			.append(p.getColorPelaje()).append(";")
			.append(p.getFlexibilidad()).append("\n");
		}
		FileHandler.escribirEnArchivoTexto(FILE_NAME, sb.toString());
	}
	public String leerDesdeArchivoDeTexto(String url) {
		String contenido = FileHandler.leerDesdeArchivoDeTexto(FILE_NAME);
		contenido = FileHandler.leerDesdeArchivoDeTexto("gato.csv");
		if(contenido == ""|| contenido.isBlank()) {

		}else {
			String[] filas = contenido.split("\n");
			for (int i = 0; i < filas.length; i++) {
				String[] columnas = filas[i].split(";");
				Gato temp = new Gato();
				temp.setNombre(columnas[0]);
				temp.setRaza(columnas[1]);
				temp.setPeso(Float.parseFloat(columnas[2]));
				temp.setEdad(Integer.parseInt(columnas[3]));
				temp.setSexo(columnas[4].charAt(0));
				temp.setHabitad(columnas[5]);
				temp.setFechaIngreso(LocalDate.parse(columnas[6]));
				temp.setColorPelaje(columnas[7]);
				temp.setFlexibilidad(columnas[8]);

				gatoList.add(temp);
			}
		}
		return null;
	}
}
