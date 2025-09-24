package co.edu.unbosque.model;

/**
 * Clase que representa una prenda de vestir como un producto. Contiene
 * información de talla y tipo de tela. Extiende de Producto.
 */
public class PrendaDeVestir extends Producto {

	private static final long serialVersionUID = -8985776979768429125L;
	private String talla;
	private String tipoTela;

	/**
	 * Constructor vacío.
	 */
	public PrendaDeVestir() {
		super();
	}

	/**
	 * Constructor que asigna la talla y el tipo de tela de la prenda.
	 *
	 * @param talla    talla de la prenda
	 * @param tipoTela tipo de tela de la prenda
	 */
	public PrendaDeVestir(String talla, String tipoTela) {
		super();
		this.talla = talla;
		this.tipoTela = tipoTela;
	}

	/**
	 * Constructor que inicializa todos los atributos de la prenda.
	 *
	 * @param nombre   nombre del producto
	 * @param precio   precio del producto
	 * @param talla    talla de la prenda
	 * @param tipoTela tipo de tela de la prenda
	 */
	public PrendaDeVestir(String nombre, float precio, String talla, String tipoTela) {
		super(nombre, precio);
		this.talla = talla;
		this.tipoTela = tipoTela;
	}

	/**
	 * Constructor que solo inicializa los datos básicos del producto.
	 *
	 * @param nombre nombre del producto
	 * @param precio precio del producto
	 */
	public PrendaDeVestir(String nombre, float precio) {
		super(nombre, precio);
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
		return "PrendaDeVestir [talla=" + talla + ", tipoTela=" + tipoTela + ", getNombre()=" + getNombre()
				+ ", getPrecio()=" + getPrecio() + "]";
	}
}
