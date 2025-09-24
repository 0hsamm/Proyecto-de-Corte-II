package co.edu.unbosque.model;

/**
 * Clase que representa un producto farmacéutico. Incluye información sobre la
 * forma farmacéutica y la concentración. Extiende de Producto.
 */
public class ProductoFarmaceutico extends Producto {

	private static final long serialVersionUID = -5158760585695289489L;
	private String formaFarmaceutica;
	private String concentracion;

	/**
	 * Constructor vacío.
	 */
	public ProductoFarmaceutico() {
		super();
	}

	/**
	 * Constructor que asigna la forma farmacéutica y la concentración del producto.
	 *
	 * @param formaFarmaceutica forma farmacéutica del producto
	 * @param concentracion     concentración del ingrediente activo
	 */
	public ProductoFarmaceutico(String formaFarmaceutica, String concentracion) {
		super();
		this.formaFarmaceutica = formaFarmaceutica;
		this.concentracion = concentracion;
	}

	/**
	 * Constructor que inicializa todos los atributos del producto farmacéutico.
	 *
	 * @param nombre            nombre del producto
	 * @param precio            precio del producto
	 * @param formaFarmaceutica forma farmacéutica del producto
	 * @param concentracion     concentración del ingrediente activo
	 */
	public ProductoFarmaceutico(String nombre, float precio, String formaFarmaceutica, String concentracion) {
		super(nombre, precio);
		this.formaFarmaceutica = formaFarmaceutica;
		this.concentracion = concentracion;
	}

	/**
	 * Constructor que solo inicializa los datos básicos del producto.
	 *
	 * @param nombre nombre del producto
	 * @param precio precio del producto
	 */
	public ProductoFarmaceutico(String nombre, float precio) {
		super(nombre, precio);
	}

	public String getFormaFarmaceutica() {
		return formaFarmaceutica;
	}

	public void setFormaFarmaceutica(String formaFarmaceutica) {
		this.formaFarmaceutica = formaFarmaceutica;
	}

	public String getConcentracion() {
		return concentracion;
	}

	public void setConcentracion(String concentracion) {
		this.concentracion = concentracion;
	}

	@Override
	public String toString() {
		return "ProductoFarmaceutico [formaFarmaceutica=" + formaFarmaceutica + ", concentracion=" + concentracion
				+ ", getNombre()=" + getNombre() + ", getPrecio()=" + getPrecio() + "]";
	}
}
