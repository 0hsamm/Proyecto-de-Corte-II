package co.edu.unbosque.model;

/**
 * Clase que representa un producto de tecnología. Contiene información sobre el
 * sistema operativo y la conectividad. Extiende de Producto.
 */
public class Tecnologia extends Producto {

	private static final long serialVersionUID = 2821120056105930729L;
	private String sistemaOperativo;
	private String conectividad;

	/**
	 * Constructor vacío.
	 */
	public Tecnologia() {
		super();
	}

	/**
	 * Constructor que asigna el sistema operativo y la conectividad.
	 *
	 * @param sistemaOperativo sistema operativo del producto
	 * @param conectividad     tipo de conectividad (por ejemplo WiFi o Bluetooth)
	 */
	public Tecnologia(String sistemaOperativo, String conectividad) {
		super();
		this.sistemaOperativo = sistemaOperativo;
		this.conectividad = conectividad;
	}

	/**
	 * Constructor que inicializa todos los atributos del producto de tecnología.
	 *
	 * @param nombre           nombre del producto
	 * @param precio           precio del producto
	 * @param sistemaOperativo sistema operativo del producto
	 * @param conectividad     tipo de conectividad
	 */
	public Tecnologia(String nombre, float precio, String sistemaOperativo, String conectividad) {
		super(nombre, precio);
		this.sistemaOperativo = sistemaOperativo;
		this.conectividad = conectividad;
	}

	/**
	 * Constructor que solo inicializa los datos básicos del producto.
	 *
	 * @param nombre nombre del producto
	 * @param precio precio del producto
	 */
	public Tecnologia(String nombre, float precio) {
		super(nombre, precio);
	}

	public String getSistemaOperativo() {
		return sistemaOperativo;
	}

	public void setSistemaOperativo(String sistemaOperativo) {
		this.sistemaOperativo = sistemaOperativo;
	}

	public String getConectividad() {
		return conectividad;
	}

	public void setConectividad(String conectividad) {
		this.conectividad = conectividad;
	}

	@Override
	public String toString() {
		return "Tecnologia [sistemaOperativo=" + sistemaOperativo + ", conectividad=" + conectividad + ", getNombre()="
				+ getNombre() + ", getPrecio()=" + getPrecio() + "]";
	}
}
