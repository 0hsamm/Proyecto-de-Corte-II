package co.edu.unbosque.model;

/**
 * Clase para un electrodoméstico.
 * Guarda datos de consumo de energía y capacidad.
 * Extiende de Producto.
 */
public class Electrodomestico extends Producto {

	private static final long serialVersionUID = -4741432362815178050L;
	private String consumoEnergia;
	private String capacidad;

	/**
	 * Constructor vacío.
	 */
	public Electrodomestico() {
		super();
	}

	/**
	 * Constructor que solo recibe consumo y capacidad.
	 *
	 * @param consumoEnergia consumo de energía del electrodoméstico
	 * @param capacidad capacidad del electrodoméstico
	 */
	public Electrodomestico(String consumoEnergia, String capacidad) {
		super();
		this.consumoEnergia = consumoEnergia;
		this.capacidad = capacidad;
	}

	/**
	 * Constructor con todos los datos.
	 *
	 * @param nombre nombre del producto
	 * @param cantidad cuántos hay
	 * @param precio precio del producto
	 * @param consumoEnergia consumo de energía
	 * @param capacidad capacidad
	 */
	public Electrodomestico(String nombre, int cantidad, float precio, String consumoEnergia, String capacidad) {
		super(nombre, cantidad, precio);
		this.consumoEnergia = consumoEnergia;
		this.capacidad = capacidad;
	}

	/**
	 * Constructor sin consumo ni capacidad.
	 *
	 * @param nombre nombre del producto
	 * @param cantidad cuántos hay
	 * @param precio precio del producto
	 */
	public Electrodomestico(String nombre, int cantidad, float precio) {
		super(nombre, cantidad, precio);
	}

	/**
	 * Devuelve el consumo de energía.
	 *
	 * @return consumo de energía
	 */
	public String getConsumoEnergia() {
		return consumoEnergia;
	}

	/**
	 * Cambia el consumo de energía.
	 *
	 * @param consumoEnergia nuevo consumo de energía
	 */
	public void setConsumoEnergia(String consumoEnergia) {
		this.consumoEnergia = consumoEnergia;
	}

	/**
	 * Devuelve la capacidad.
	 *
	 * @return capacidad
	 */
	public String getCapacidad() {
		return capacidad;
	}

	/**
	 * Cambia la capacidad.
	 *
	 * @param capacidad nueva capacidad
	 */
	public void setCapacidad(String capacidad) {
		this.capacidad = capacidad;
	}

	/**
	 * Devuelve un texto con los datos del electrodoméstico.
	 *
	 * @return texto con la info
	 */
	@Override
	public String toString() {
		return "Electrodomestico [consumoEnergia=" + consumoEnergia + ", capacidad=" + capacidad
				+ ", getConsumoEnergia()=" + getConsumoEnergia() + ", getCapacidad()=" + getCapacidad()
				+ ", verificarDisponibilidad()=" + verificarDisponibilidad() + ", getNombre()=" + getNombre()
				+ ", getCantidad()=" + getCantidad() + ", getPrecio()=" + getPrecio() + ", toString()="
				+ super.toString() + ", getClass()=" + getClass() + ", hashCode()=" + hashCode() + "]";
	}
	
	/**
	 * Verifica si el producto está disponible.
	 *
	 * @return true si hay disponible, false si no
	 */
	@Override
	public boolean verificarDisponibilidad() {
		return super.verificarDisponibilidad();
	}

}
