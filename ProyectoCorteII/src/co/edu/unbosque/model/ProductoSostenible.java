package co.edu.unbosque.model;

/**
 * Clase que representa un producto sostenible. Contiene información sobre el
 * material ecológico y la certificación. Extiende de Producto.
 */
public class ProductoSostenible extends Producto {

	private static final long serialVersionUID = 7674771899829339560L;
	private String materialEcologico;
	private String certificacion;

	/**
	 * Constructor vacío.
	 */
	public ProductoSostenible() {
		super();
	}

	/**
	 * Constructor que asigna el material ecológico y la certificación.
	 *
	 * @param materialEcologico material ecológico del producto
	 * @param certificacion     certificación de sostenibilidad
	 */
	public ProductoSostenible(String materialEcologico, String certificacion) {
		super();
		this.materialEcologico = materialEcologico;
		this.certificacion = certificacion;
	}

	/**
	 * Constructor que inicializa todos los atributos del producto sostenible.
	 *
	 * @param nombre            nombre del producto
	 * @param precio            precio del producto
	 * @param materialEcologico material ecológico del producto
	 * @param certificacion     certificación de sostenibilidad
	 */
	public ProductoSostenible(String nombre, float precio, String materialEcologico, String certificacion) {
		super(nombre, precio);
		this.materialEcologico = materialEcologico;
		this.certificacion = certificacion;
	}

	/**
	 * Constructor que solo inicializa los datos básicos del producto.
	 *
	 * @param nombre nombre del producto
	 * @param precio precio del producto
	 */
	public ProductoSostenible(String nombre, float precio) {
		super(nombre, precio);
	}

	public String getMaterialEcologico() {
		return materialEcologico;
	}

	public void setMaterialEcologico(String materialEcologico) {
		this.materialEcologico = materialEcologico;
	}

	public String getCertificacion() {
		return certificacion;
	}

	public void setCertificacion(String certificacion) {
		this.certificacion = certificacion;
	}

	@Override
	public String toString() {
		return "ProductoSostenible [materialEcologico=" + materialEcologico + ", certificacion=" + certificacion
				+ ", getNombre()=" + getNombre() + ", getPrecio()=" + getPrecio() + "]";
	}
}
