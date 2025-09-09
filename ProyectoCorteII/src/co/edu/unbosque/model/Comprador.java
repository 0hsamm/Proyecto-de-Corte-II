package co.edu.unbosque.model;

public class Comprador extends Persona{
	
	private boolean EsMiembroVIP;
	private int carroCompras;
	private int listacomprasRealizadas;
	
	public Comprador() {
		super();
	}

	public Comprador(boolean esMiembroVIP, int carroCompras, int listacomprasRealizadas) {
		super();
		EsMiembroVIP = esMiembroVIP;
		this.carroCompras = carroCompras;
		this.listacomprasRealizadas = listacomprasRealizadas;
	}

	public Comprador(String correo, String nombre, String telefono, String id, char sexo, boolean esMiembroVIP,
			int carroCompras, int listacomprasRealizadas) {
		super(correo, nombre, telefono, id, sexo);
		EsMiembroVIP = esMiembroVIP;
		this.carroCompras = carroCompras;
		this.listacomprasRealizadas = listacomprasRealizadas;
	}

	public Comprador(String correo, String nombre, String telefono, String id, char sexo) {
		super(correo, nombre, telefono, id, sexo);
		// TODO Auto-generated constructor stub
	}

	public boolean isEsMiembroVIP() {
		return EsMiembroVIP;
	}

	public void setEsMiembroVIP(boolean esMiembroVIP) {
		EsMiembroVIP = esMiembroVIP;
	}

	public int getCarroCompras() {
		return carroCompras;
	}

	public void setCarroCompras(int carroCompras) {
		this.carroCompras = carroCompras;
	}

	public int getListacomprasRealizadas() {
		return listacomprasRealizadas;
	}

	public void setListacomprasRealizadas(int listacomprasRealizadas) {
		this.listacomprasRealizadas = listacomprasRealizadas;
	}

	@Override
	public String toString() {
		return super.toString() + "Comprador [EsMiembroVIP=" + EsMiembroVIP + ", carroCompras=" + carroCompras
				+ ", listacomprasRealizadas=" + listacomprasRealizadas + "]";
	}
	
	

}
