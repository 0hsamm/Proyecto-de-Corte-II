package co.edu.unbosque.model;

/**
 * Clase para un electrodoméstico. Guarda datos de consumo de energía y
 * capacidad. Extiende de Producto.
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
	 * @param capacidad      capacidad del electrodoméstico
	 */
	public Electrodomestico(String consumoEnergia, String capacidad) {
		super();
		this.consumoEnergia = consumoEnergia;
		this.capacidad = capacidad;
	}

	/**
	 * Constructor con todos los datos.
	 *
	 * @param nombre         nombre del producto
	 * @param precio         precio del producto
	 * @param consumoEnergia consumo de energía
	 * @param capacidad      capacidad
	 */
	public Electrodomestico(String nombre, float precio, String consumoEnergia, String capacidad) {
		super(nombre, precio);
		this.consumoEnergia = consumoEnergia;
		this.capacidad = capacidad;
	}

	/**
	 * Constructor sin consumo ni capacidad.
	 *
	 * @param nombre nombre del producto
	 * @param precio precio del producto
	 */
	public Electrodomestico(String nombre, float precio) {
		super(nombre, precio);
	}

	public String getConsumoEnergia() {
		return consumoEnergia;
	}

	public void setConsumoEnergia(String consumoEnergia) {
		this.consumoEnergia = consumoEnergia;
	}

	public String getCapacidad() {
		return capacidad;
	}

	public void setCapacidad(String capacidad) {
		this.capacidad = capacidad;
	}

	@Override
	public String toString() {
		return "Electrodomestico [consumoEnergia=" + consumoEnergia + ", capacidad=" + capacidad + ", getNombre()="
				+ getNombre() + ", getPrecio()=" + getPrecio() + "]";
	}
}
