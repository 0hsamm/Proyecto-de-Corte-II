package co.edu.unbosque.model.persistence;

import java.time.LocalDate;
import java.util.ArrayList;

import co.edu.unbosque.model.Ave;
import co.edu.unbosque.model.Reptil;

public class ReptilDAO implements DAO <Reptil>{

	private ArrayList<Reptil> reptilList;
	private final String FILE_NAME = "reptil.csv";
	
	
	public ReptilDAO() {
		reptilList = new ArrayList<Reptil>();
		leerDesdeArchivoDeTexto(FILE_NAME);
	}
	
	@Override
	public void create(Reptil newData) {
		reptilList.add(newData);
		guardarEnArchivo();
		
	}

	@Override
	public boolean delete(int index) {
		index = index - 1;
		if(index < 0 || index >= reptilList.size()) {
			return false;
		}else {
			reptilList.remove(index);
			guardarEnArchivo();
			return true;
		}
	}

	@Override
	public boolean update(int index, Reptil newData) {
		index = index - 1;
		if(index < 0 || index >= reptilList.size()) {
			return false;
		}else {
			reptilList.set(index, newData);
			guardarEnArchivo();
			return true;
		}
	}

	
	
	@Override
	public String showAll() {
		if(reptilList.isEmpty()) {
			return "No hay reptiles registrados\n";
		}
		String content="";
		int i = 1;
		for (Reptil reptil : reptilList) {
			content+= "\nReptil " + i + ". " + reptil.toString();
		}
		/*funcion lambda
		reptilList.forEach((reptil)->{
			content+=reptil.toString();
		});*/
		return content + "\n";
	}

	@Override
	public int count() {
		return reptilList.size();
	}

	public void deleteAll() {
		reptilList.clear();
		guardarEnArchivo();
	}
	public boolean isEmpty() {
		return reptilList.isEmpty();
	}
	
	public void guardarEnArchivo() {
		StringBuilder sb = new StringBuilder();
		for (Reptil p : reptilList) {
			sb.append(p.getNombre()).append(";")
			.append(p.getRaza()).append(";")
			.append(p.getPeso()).append(";")
			.append(p.getEdad()).append(";")
			.append(p.getSexo()).append(";")
			.append(p.getHabitad()).append(";")
			.append(p.getFechaIngreso()).append(";")
			.append(p.getMudaPiel()).append(";")
			.append(p.getTemperaturaCorporal()).append("\n");
		}
		FileHandler.escribirEnArchivoTexto(FILE_NAME, sb.toString());
	}
	public String leerDesdeArchivoDeTexto(String url) {
		String contenido;
		contenido = FileHandler.leerDesdeArchivoDeTexto("reptil.csv");
		if(contenido == ""|| contenido.isBlank()) {
			
		}else {
		String[] filas = contenido.split("\n");
		for (int i = 0; i < filas.length; i++) {
			String[] columnas = filas[i].split(";");
			Reptil temp = new Reptil();
			temp.setNombre(columnas[0]);
			temp.setRaza(columnas[1]);
			temp.setPeso(Float.parseFloat(columnas[2]));
			temp.setEdad(Integer.parseInt(columnas[3]));
			temp.setSexo(columnas[4].charAt(0));
			temp.setHabitad(columnas[5]);
			temp.setFechaIngreso(LocalDate.parse(columnas[6]));
			temp.setMudaPiel(columnas[7]);
			temp.setTemperaturaCorporal(Integer.parseInt(columnas[8]));
			
			
			reptilList.add(temp);
		}
		}
		return null;
	}
}
