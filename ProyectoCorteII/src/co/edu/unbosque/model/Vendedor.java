package co.edu.unbosque.model;

public class Vendedor extends Persona {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 4613984844442717843L;
	private int cantidadObjetosVendidos;
	private int objetosEnVenta;
	private float puntuacionDeVenta;
	
	public Vendedor() {
		super();
	}

	public Vendedor(int cantidadObjetosVendidos, int objetosEnVenta, float puntuacionDeVenta) {
		super();
		this.cantidadObjetosVendidos = cantidadObjetosVendidos;
		this.objetosEnVenta = objetosEnVenta;
		this.puntuacionDeVenta = puntuacionDeVenta;
	}

	

	public Vendedor(String correo, String nombre, String telefono, String id, String contrasena,
			int cantidadObjetosVendidos, int objetosEnVenta, float puntuacionDeVenta) {
		super(correo, nombre, telefono, id, contrasena);
		this.cantidadObjetosVendidos = cantidadObjetosVendidos;
		this.objetosEnVenta = objetosEnVenta;
		this.puntuacionDeVenta = puntuacionDeVenta;
	}
	
	
	
	public Vendedor(String correo, String nombre, String telefono, String id, String contrasena) {
		super(correo, nombre, telefono, id, contrasena);
		// TODO Auto-generated constructor stub
	}

	public int getCantidadObjetosVendidos() {
		return cantidadObjetosVendidos;
	}

	public void setCantidadObjetosVendidos(int cantidadObjetosVendidos) {
		this.cantidadObjetosVendidos = cantidadObjetosVendidos;
	}

	public int getObjetosEnVenta() {
		return objetosEnVenta;
	}

	public void setObjetosEnVenta(int objetosEnVenta) {
		this.objetosEnVenta = objetosEnVenta;
	}

	public float getPuntuacionDeVenta() {
		return puntuacionDeVenta;
	}

	public void setPuntuacionDeVenta(float puntuacionDeVenta) {
		this.puntuacionDeVenta = puntuacionDeVenta;
	}

	@Override
	public String toString() {
		return "Vendedor [cantidadObjetosVendidos=" + cantidadObjetosVendidos + ", objetosEnVenta=" + objetosEnVenta
				+ ", puntuacionDeVenta=" + puntuacionDeVenta + "]";
	}
	
	

}
