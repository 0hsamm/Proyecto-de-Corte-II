package co.edu.unbosque.model;

/**
 * Clase que representa un producto sostenible.
 * Contiene información sobre el material ecológico y la certificación.
 * Extiende de Producto.
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
     * @param cantidad          cantidad disponible
     * @param precio            precio del producto
     * @param materialEcologico material ecológico del producto
     * @param certificacion     certificación de sostenibilidad
     */
    public ProductoSostenible(String nombre, int cantidad, float precio, String materialEcologico, String certificacion) {
        super(nombre, cantidad, precio);
        this.materialEcologico = materialEcologico;
        this.certificacion = certificacion;
    }

    /**
     * Constructor que solo inicializa los datos básicos del producto.
     *
     * @param nombre   nombre del producto
     * @param cantidad cantidad disponible
     * @param precio   precio del producto
     */
    public ProductoSostenible(String nombre, int cantidad, float precio) {
        super(nombre, cantidad, precio);
    }

    /**
     * Devuelve el material ecológico del producto.
     *
     * @return material ecológico
     */
    public String getMaterialEcologico() {
        return materialEcologico;
    }

    /**
     * Cambia el material ecológico del producto.
     *
     * @param materialEcologico nuevo material ecológico
     */
    public void setMaterialEcologico(String materialEcologico) {
        this.materialEcologico = materialEcologico;
    }

    /**
     * Devuelve la certificación del producto.
     *
     * @return certificación
     */
    public String getCertificacion() {
        return certificacion;
    }

    /**
     * Cambia la certificación del producto.
     *
     * @param certificacion nueva certificación
     */
    public void setCertificacion(String certificacion) {
        this.certificacion = certificacion;
    }

    /**
     * Devuelve un texto con los datos completos del producto sostenible.
     *
     * @return información completa en texto
     */
    @Override
    public String toString() {
        return "ProductoSostenible [materialEcologico=" + materialEcologico + ", certificacion=" + certificacion
                + ", getMaterialEcologico()=" + getMaterialEcologico() + ", getCertificacion()=" + getCertificacion()
                + ", verificarDisponibilidad()=" + verificarDisponibilidad() + ", getNombre()=" + getNombre()
                + ", getCantidad()=" + getCantidad() + ", getPrecio()=" + getPrecio() + ", toString()="
                + super.toString() + ", getClass()=" + getClass() + ", hashCode()=" + hashCode() + "]";
    }

    /**
     * Verifica si el producto está disponible.
     *
     * @return true si hay existencias, false en caso contrario
     */
    @Override
    public boolean verificarDisponibilidad() {
        return super.verificarDisponibilidad();
    }
}
