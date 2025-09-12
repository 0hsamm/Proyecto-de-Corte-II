package co.edu.unbosque.model.persistence;

import java.time.LocalDate;
import java.util.ArrayList;

import co.edu.unbosque.model.Perro;

public class PerroDAO implements DAO<Perro> {

	private ArrayList<Perro> perroList;
	private final String FILE_NAME = "perro.csv";

	public PerroDAO() {
		perroList = new ArrayList<>();
		leerDesdeArchivoDeTexto(FILE_NAME);
	}

	@Override
	public void create(Perro newData) {
		perroList.add(newData);
		guardarEnArchivo(); 
	}

	@Override
	public boolean delete(int index) {
		index = index - 1;
		if (index < 0 || index >= perroList.size()) {
			return false;
		} else {
			perroList.remove(index);
			guardarEnArchivo(); 
			return true;
		}
	}

	@Override
	public boolean update(int index, Perro newData) {
		index = index - 1;
		if (index < 0 || index >= perroList.size()) {
			return false;
		} else {
			perroList.set(index, newData);
			guardarEnArchivo(); 
			return true;
		}
	}

	@Override
	public String showAll() {
		if (perroList.isEmpty()) {
			return "No hay perros registrados\n";
		}

		String content = "";
		int i = 1;
		for (Perro perro : perroList) {
			content += "\nPerro " + i + ". " + perro.toString();
			i++;
		}
		return content + "\n";
	}

	@Override
	public int count() {
		return perroList.size();
	}

	public void deleteAll() {
		perroList.clear();
		guardarEnArchivo(); 
	}

	public boolean isEmpty() {
		return perroList.isEmpty();
	}


	public void guardarEnArchivo() {
		StringBuilder sb = new StringBuilder();
		for (Perro p : perroList) {
			sb.append(p.getNombre()).append(";")
			.append(p.getRaza()).append(";")
			.append(p.getPeso()).append(";")
			.append(p.getEdad()).append(";")
			.append(p.getSexo()).append(";")
			.append(p.getHabitad()).append(";")
			.append(p.getFechaIngreso()).append(";")
			.append(p.getColorPelaje()).append(";")
			.append(p.getFormaHocico()).append("\n");
		}
		FileHandler.escribirEnArchivoTexto(FILE_NAME, sb.toString());
	}


	public String leerDesdeArchivoDeTexto(String url) {
		String contenido = FileHandler.leerDesdeArchivoDeTexto("perro.csv");
		if (contenido == ""|| contenido.isBlank()) {

		}else {
			String[] filas = contenido.split("\n");
			for (int i = 0; i < filas.length; i++) {
				String[] columnas = filas[i].split(";");   
				Perro temp = new Perro();
				temp.setNombre(columnas[0]);
				temp.setRaza(columnas[1]);
				temp.setPeso(Float.parseFloat(columnas[2]));
				temp.setEdad(Integer.parseInt(columnas[3]));
				temp.setSexo(columnas[4].charAt(0));
				temp.setHabitad(columnas[5]);
				temp.setFechaIngreso(LocalDate.parse(columnas[6]));
				temp.setColorPelaje(columnas[7]);
				temp.setFormaHocico(columnas[8]);
				perroList.add(temp);

			}
		}
		return null;
	}
}
