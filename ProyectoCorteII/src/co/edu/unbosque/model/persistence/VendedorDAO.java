package co.edu.unbosque.model.persistence;

import java.util.ArrayList;

import co.edu.unbosque.model.Vendedor;

public class VendedorDAO implements DAO<Vendedor> {
	
	private ArrayList<Vendedor> listaVendedores;
	private final String FILE_NAME = "Vendedor.csv";
	
	public VendedorDAO() {
		listaVendedores = new ArrayList<Vendedor>();
		
	}

	@Override
	public void create(Vendedor newData) {
		listaVendedores.add(newData);
		
	}

	@Override
	public boolean delete(int index) {
		if(index == 0 || index >= listaVendedores.size()) {
			return false;
		} else {
			listaVendedores.remove(index);
			return true;
		}
	}

	@Override
	public boolean update(int index, Vendedor newData) {
		if(index == 0 || index >= listaVendedores.size()) {
			return false;
		} else {
			listaVendedores.set(index, newData);
			return true;
		}
	}
	
	String content = "";
	
	@Override
	public String showAll() {
		content = "";
		for (Vendedor vendedor : listaVendedores) {
			content += vendedor.toString() + "\n";
		}
			return content;
	}

	@Override
	public int count() {
		return listaVendedores.size();
	}

	@Override
	public void leerDesdeArchivoDeTexto(String url) {
		String contenido;
		contenido = FileHandler.leerDesdeArchivoDeTexto(url);
		if(contenido == "" || contenido.isBlank()) {
			return;
		}else {
			String [] fila = contenido.split("\n");
			for (int i = 0; i < fila.length; i++) {
				String[] columna = contenido.split(";");
				
				Vendedor temp = new Vendedor();
				
				temp.setCorreo(columna[0]);
				temp.setNombre(columna[1]);
				temp.setTelefono(columna[2]);
				temp.setId(columna[3]);
				temp.setSexo(columna[4].charAt(0));
				temp.setCantidadObjetosVendidos(Integer.parseInt(columna[5]));
				temp.setObjetosEnVenta(Integer.parseInt(columna[6]));
				temp.setPuntuacionDeVenta(Float.parseFloat(columna[7]));
				
				listaVendedores.add(temp);
				
			}
		}
		
	}

	@Override
	public void escribirEnArchivoDeTexto() {
		StringBuilder sb = new StringBuilder();
		for (Vendedor vendedor : listaVendedores) {
			sb.append(vendedor.getCorreo());
			sb.append(vendedor.getNombre());
		}
		
		FileHandler.escribirEnArchivoDeTexto(FILE_NAME, sb.toString());
		
	}
	
	

}
