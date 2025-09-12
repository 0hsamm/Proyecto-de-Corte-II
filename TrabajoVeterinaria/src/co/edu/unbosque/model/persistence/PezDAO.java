package co.edu.unbosque.model.persistence;

import java.time.LocalDate;
import java.util.ArrayList;

import co.edu.unbosque.model.Ave;
import co.edu.unbosque.model.Pez;


public class PezDAO implements DAO <Pez>{
	
	private ArrayList<Pez> pezList;
	private final String FILE_NAME = "pez.csv";
	
	public PezDAO() {
		pezList = new ArrayList<Pez>();
		leerDesdeArchivoDeTexto(FILE_NAME);
				
	}
	
	@Override
	public void create(Pez newData) {
		pezList.add(newData);
		guardarEnArchivo();
		
		
	}

	@Override
	public boolean delete(int index) {
		index = index - 1;
		if(index < 0 || index >= pezList.size()) {
			return false;
		}else {
			pezList.remove(index);
			guardarEnArchivo();
			return true;
		}
	}

	@Override
	public boolean update(int index, Pez newData) {
		index = index - 1;
		if(index < 0 || index >= pezList.size()) {
			return false;
		}else {
			pezList.set(index, newData);
			guardarEnArchivo();
			return true;
		}
		
	}

	
	
	@Override
	public String showAll() {
		if(pezList.isEmpty()) {
			return "No hay peces registrados\n";
		}
		String content="";
		int i = 1;
		for (Pez pez : pezList) {
			content+= "\nPez " + i + ". " + pez.toString();
		}
		/*funcion lambda
		pezList.forEach((pez)->{
			content+=pez.toString();
		});*/
		return content + "\n";
	}

	@Override
	public int count() {
		return pezList.size();
	}
	
	public void deleteAll() {
		pezList.clear();
		guardarEnArchivo();
	}
	public boolean isEmpty() {
		return pezList.isEmpty();
	}
	
	public void guardarEnArchivo() {
		StringBuilder sb = new StringBuilder();
		for (Pez p : pezList) {
			sb.append(p.getNombre()).append(";")
			.append(p.getRaza()).append(";")
			.append(p.getPeso()).append(";")
			.append(p.getEdad()).append(";")
			.append(p.getSexo()).append(";")
			.append(p.getHabitad()).append(";")
			.append(p.getFechaIngreso()).append(";")
			.append(p.getTamanoAleta()).append(";")
			.append(p.getProfundidadNado()).append("\n");
		}
		FileHandler.escribirEnArchivoTexto(FILE_NAME, sb.toString());
	}
	public String leerDesdeArchivoDeTexto(String url) {
		String contenido;
		contenido = FileHandler.leerDesdeArchivoDeTexto("pez.csv");
		if(contenido == ""|| contenido.isBlank()) {
			
		}else {
		String[] filas = contenido.split("\n");
		for (int i = 0; i < filas.length; i++) {
			String[] columnas = filas[i].split(";");
			Pez temp = new Pez();
			temp.setNombre(columnas[0]);
			temp.setRaza(columnas[1]);
			temp.setPeso(Float.parseFloat(columnas[2]));
			temp.setEdad(Integer.parseInt(columnas[3]));
			temp.setSexo(columnas[4].charAt(0));
			temp.setHabitad(columnas[5]);
			temp.setFechaIngreso(LocalDate.parse(columnas[6]));
			temp.setTamanoAleta(columnas[7]);
			temp.setProfundidadNado(columnas[8]);
			
			pezList.add(temp);
		}
		}
		return null;
	}
}
