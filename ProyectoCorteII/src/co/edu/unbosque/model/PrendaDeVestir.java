package co.edu.unbosque.model;

public class PrendaDeVestir extends Producto {

	/**
	 * 
	 */
	private static final long serialVersionUID = -8985776979768429125L;
	private String talla;
	private String tipoTela;

	public PrendaDeVestir() {
		super();
	}

	public PrendaDeVestir(String talla, String tipoTela) {
		super();
		this.talla = talla;
		this.tipoTela = tipoTela;
	}

	public PrendaDeVestir(String nombre, int cantidad, float precio, String talla, String tipoTela) {
		super(nombre, cantidad, precio);
		this.talla = talla;
		this.tipoTela = tipoTela;
	}

	public PrendaDeVestir(String nombre, int cantidad, float precio) {
		super(nombre, cantidad, precio);
		// TODO Auto-generated constructor stub
	}

	public String getTalla() {
		return talla;
	}

	public void setTalla(String talla) {
		this.talla = talla;
	}

	public String getTipoTela() {
		return tipoTela;
	}

	public void setTipoTela(String tipoTela) {
		this.tipoTela = tipoTela;
	}

	@Override
	public String toString() {
		return "PrendaDeVestir [talla=" + talla + ", tipoTela=" + tipoTela
				+ ", getTalla()=" + getTalla() + ", getTipoTela()=" + getTipoTela()
				+ ", verificarDisponibilidad()=" + verificarDisponibilidad() + ", getNombre()=" + getNombre()
				+ ", getCantidad()=" + getCantidad() + ", getPrecio()=" + getPrecio() + ", toString()="
				+ super.toString() + ", getClass()=" + getClass() + ", hashCode()=" + hashCode() + "]";
	}
	
	@Override
	public boolean verificarDisponibilidad() {
		return super.verificarDisponibilidad();
	}

}
