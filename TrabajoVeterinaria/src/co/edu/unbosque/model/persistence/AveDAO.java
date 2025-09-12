package co.edu.unbosque.model.persistence;

import java.time.LocalDate;
import java.util.ArrayList;

import co.edu.unbosque.model.Ave;
import co.edu.unbosque.model.Gato;
import co.edu.unbosque.model.Perro;

public class AveDAO implements DAO <Ave>{
	
	private ArrayList<Ave> aveList;
	private final String FILE_NAME = "ave.csv";

	public AveDAO() {
		aveList = new ArrayList<Ave>();
		leerDesdeArchivoDeTexto(FILE_NAME);
	}
	
	@Override
	public void create(Ave newData) {
		aveList.add(newData);
		guardarEnArchivo();
		
	}

	@Override
	public boolean delete(int index) {
		index = index - 1;
		if(index < 0 || index >= aveList.size()) {
			return false;
		}else {
			aveList.remove(index);
			guardarEnArchivo();
			return true;
		}
	}

	@Override
	public boolean update(int index, Ave newData) {
		index = index - 1;
		if(index < 0 || index >= aveList.size()) {
			return false;
		}else {
			aveList.set(index, newData);
			guardarEnArchivo();
			return true;
		}
	}

	
	
	@Override
	public String showAll() {
		if(aveList.isEmpty()) {
			return "No hay aves registradas\n";
		}
		
		String content ="";
		int i = 1;
		for (Ave ave : aveList) {
			content+= "\nAve " + i + ". " + ave.toString();
		}
		/*funcion lambda
		aveList.forEach((ave)->{
			content+=ave.toString();
		});*/
		return content + "\n";
	}

	@Override
	public int count() {
		return aveList.size();
	}

	public void deleteAll() {
		aveList.clear();
		guardarEnArchivo();
	}
	public boolean isEmpty() {
		return aveList.isEmpty();
	}
	
	public void guardarEnArchivo() {
		StringBuilder sb = new StringBuilder();
		for (Ave p : aveList) {
			sb.append(p.getNombre()).append(";")
			.append(p.getRaza()).append(";")
			.append(p.getPeso()).append(";")
			.append(p.getEdad()).append(";")
			.append(p.getSexo()).append(";")
			.append(p.getHabitad()).append(";")
			.append(p.getFechaIngreso()).append(";")
			.append(p.getTamanoPico()).append(";")
			.append(p.getTamanoPluma()).append("\n");
		}
		FileHandler.escribirEnArchivoTexto(FILE_NAME, sb.toString());
	}
	public String leerDesdeArchivoDeTexto(String url) {
		String contenido;
		contenido = FileHandler.leerDesdeArchivoDeTexto("ave.csv");
		if(contenido == ""|| contenido.isBlank()) {
			
		}else {
		String[] filas = contenido.split("\n");
		for (int i = 0; i < filas.length; i++) {
			String[] columnas = filas[i].split(";");
			Ave temp = new Ave();
			temp.setNombre(columnas[0]);
			temp.setRaza(columnas[1]);
			temp.setPeso(Float.parseFloat(columnas[2]));
			temp.setEdad(Integer.parseInt(columnas[3]));
			temp.setSexo(columnas[4].charAt(0));
			temp.setHabitad(columnas[5]);
			temp.setFechaIngreso(LocalDate.parse(columnas[6]));
			temp.setTamanoPico(columnas[7]);
			temp.setTamanoPluma(columnas[8]);
			
			aveList.add(temp);
		}
		}
		return null;
	}
}
