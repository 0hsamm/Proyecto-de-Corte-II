package co.edu.unbosque.model;

public class Juguete extends Producto {

	private String edadRecomendada;
	private String material;

	public Juguete() {
		super();
	}

	public Juguete(String edadRecomendada, String material) {
		super();
		this.edadRecomendada = edadRecomendada;
		this.material = material;
	}

	public Juguete(String nombre, int cantidad, float precio, String edadRecomendada, String material) {
		super(nombre, cantidad, precio);
		this.edadRecomendada = edadRecomendada;
		this.material = material;
	}

	public Juguete(String nombre, int cantidad, float precio) {
		super(nombre, cantidad, precio);
		// TODO Auto-generated constructor stub
	}

	public String getEdadRecomendada() {
		return edadRecomendada;
	}

	public void setEdadRecomendada(String edadRecomendada) {
		this.edadRecomendada = edadRecomendada;
	}

	public String getMaterial() {
		return material;
	}

	public void setMaterial(String material) {
		this.material = material;
	}

	@Override
	public String toString() {
		return "Juguete [edadRecomendada=" + edadRecomendada + ", material=" + material
				+ ", getEdadRecomendada()=" + getEdadRecomendada() + ", getMaterial()=" + getMaterial()
				+ ", verificarDisponibilidad()=" + verificarDisponibilidad() + ", getNombre()=" + getNombre()
				+ ", getCantidad()=" + getCantidad() + ", getPrecio()=" + getPrecio() + ", toString()="
				+ super.toString() + ", getClass()=" + getClass() + ", hashCode()=" + hashCode() + "]";
	}
	
	@Override
	public boolean verificarDisponibilidad() {
		return super.verificarDisponibilidad();
	}

}
