package co.edu.unbosque.model.persistence;

import java.util.ArrayList;

import co.edu.unbosque.model.Vendedor;

public class VendedorDAO implements DAO<Vendedor> {

	private ArrayList<Vendedor> listaVendedores;
	private final String FILE_NAME = "Vendedor.csv";
	private final String SERIAL_FILE_NAME = "Vendedor.bin";

	public VendedorDAO() {
		listaVendedores = new ArrayList<Vendedor>();
		leerDesdeArchivoDeTexto(FILE_NAME);
		cargarDesdeArchivoSerializado();
	}

	@Override
	public void create(Vendedor newData) {
		listaVendedores.add(newData);
		escribirEnArchivoDeTexto();
		escribirEnArchivoSerializado();

	}

	@Override
	public boolean delete(int index) {
		if (index == 0 || index >= listaVendedores.size()) {
			return false;
		} else {
			listaVendedores.remove(index);
			escribirEnArchivoDeTexto();
			escribirEnArchivoSerializado();
			return true;
		}
	}

	@Override
	public boolean update(int index, Vendedor newData) {
		if (index == 0 || index >= listaVendedores.size()) {
			return false;
		} else {
			listaVendedores.set(index, newData);
			escribirEnArchivoDeTexto();
			escribirEnArchivoSerializado();
			return true;
		}
	}

	@Override
	public String showAll() {
		StringBuilder sb = new StringBuilder();

		for (int i = 0; i < listaVendedores.size(); i++) {
			sb.append(i + 1);
			sb.append(" - ");
			sb.append(listaVendedores.get(i).toString());
			sb.append("\n");
		}

		return sb.toString();
	}

	@Override
	public int count() {
		return listaVendedores.size();
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
				String[] columna = contenido.split(";");

				Vendedor temp = new Vendedor();

				temp.setCorreo(columna[0]);
				temp.setNombre(columna[1]);
				temp.setTelefono(columna[2]);
				temp.setId(columna[3]);
				temp.setCantidadObjetosVendidos(Integer.parseInt(columna[4]));
				temp.setObjetosEnVenta(Integer.parseInt(columna[5]));
				temp.setPuntuacionDeVenta(Float.parseFloat(columna[6]));

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
			sb.append("\n");
		}

		FileHandler.escribirEnArchivoDeTexto(FILE_NAME, sb.toString());

	}

	public void cargarDesdeArchivoSerializado() {
		Object contenido = FileHandler.leerDesdeArchivoSerializado(SERIAL_FILE_NAME);
		if (contenido != null) {
			listaVendedores = (ArrayList<Vendedor>) contenido;
		} else {
			listaVendedores = new ArrayList<>();
		}
	}

	public void escribirEnArchivoSerializado() {
		FileHandler.escribirEnArchivoSerializado(SERIAL_FILE_NAME, listaVendedores);
	}

	public ArrayList<Vendedor> getListaVendedores() {
		return listaVendedores;
	}

	public void setListaVendedores(ArrayList<Vendedor> listaVendedores) {
		this.listaVendedores = listaVendedores;
	}

	public String getFILE_NAME() {
		return FILE_NAME;
	}

	public String getSERIAL_FILE_NAME() {
		return SERIAL_FILE_NAME;
	}

}
