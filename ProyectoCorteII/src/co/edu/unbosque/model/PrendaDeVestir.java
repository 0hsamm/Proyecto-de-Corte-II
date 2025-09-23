package co.edu.unbosque.model;

/**
 * Clase que representa una prenda de vestir como un producto.
 * Contiene información de talla y tipo de tela.
 * Extiende de Producto.
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
     * @param cantidad cantidad disponible
     * @param precio   precio del producto
     * @param talla    talla de la prenda
     * @param tipoTela tipo de tela de la prenda
     */
    public PrendaDeVestir(String nombre, int cantidad, float precio, String talla, String tipoTela) {
        super(nombre, cantidad, precio);
        this.talla = talla;
        this.tipoTela = tipoTela;
    }

    /**
     * Constructor que solo inicializa los datos básicos del producto.
     *
     * @param nombre   nombre del producto
     * @param cantidad cantidad disponible
     * @param precio   precio del producto
     */
    public PrendaDeVestir(String nombre, int cantidad, float precio) {
        super(nombre, cantidad, precio);
    }

    /**
     * Devuelve la talla de la prenda.
     *
     * @return talla de la prenda
     */
    public String getTalla() {
        return talla;
    }

    /**
     * Cambia la talla de la prenda.
     *
     * @param talla nueva talla
     */
    public void setTalla(String talla) {
        this.talla = talla;
    }

    /**
     * Devuelve el tipo de tela de la prenda.
     *
     * @return tipo de tela
     */
    public String getTipoTela() {
        return tipoTela;
    }

    /**
     * Cambia el tipo de tela de la prenda.
     *
     * @param tipoTela nuevo tipo de tela
     */
    public void setTipoTela(String tipoTela) {
        this.tipoTela = tipoTela;
    }

    /**
     * Devuelve un texto con los datos completos de la prenda.
     *
     * @return información completa en texto
     */
    @Override
    public String toString() {
        return "PrendaDeVestir [talla=" + talla + ", tipoTela=" + tipoTela
                + ", getTalla()=" + getTalla() + ", getTipoTela()=" + getTipoTela()
                + ", verificarDisponibilidad()=" + verificarDisponibilidad() + ", getNombre()=" + getNombre()
                + ", getCantidad()=" + getCantidad() + ", getPrecio()=" + getPrecio() + ", toString()="
                + super.toString() + ", getClass()=" + getClass() + ", hashCode()=" + hashCode() + "]";
    }

    /**
     * Verifica si la prenda está disponible.
     *
     * @return true si hay existencias, false en caso contrario
     */
    @Override
    public boolean verificarDisponibilidad() {
        return super.verificarDisponibilidad();
    }
}
