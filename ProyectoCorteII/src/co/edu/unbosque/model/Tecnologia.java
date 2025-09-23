package co.edu.unbosque.model;

/**
 * Clase que representa un producto de tecnología.
 * Contiene información sobre el sistema operativo y la conectividad.
 * Extiende de Producto.
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
     * @param cantidad         cantidad disponible
     * @param precio           precio del producto
     * @param sistemaOperativo sistema operativo del producto
     * @param conectividad     tipo de conectividad
     */
    public Tecnologia(String nombre, int cantidad, float precio, String sistemaOperativo, String conectividad) {
        super(nombre, cantidad, precio);
        this.sistemaOperativo = sistemaOperativo;
        this.conectividad = conectividad;
    }

    /**
     * Constructor que solo inicializa los datos básicos del producto.
     *
     * @param nombre   nombre del producto
     * @param cantidad cantidad disponible
     * @param precio   precio del producto
     */
    public Tecnologia(String nombre, int cantidad, float precio) {
        super(nombre, cantidad, precio);
    }

    /**
     * Devuelve el sistema operativo del producto.
     *
     * @return sistema operativo
     */
    public String getSistemaOperativo() {
        return sistemaOperativo;
    }

    /**
     * Cambia el sistema operativo del producto.
     *
     * @param sistemaOperativo nuevo sistema operativo
     */
    public void setSistemaOperativo(String sistemaOperativo) {
        this.sistemaOperativo = sistemaOperativo;
    }

    /**
     * Devuelve la conectividad del producto.
     *
     * @return conectividad
     */
    public String getConectividad() {
        return conectividad;
    }

    /**
     * Cambia la conectividad del producto.
     *
     * @param conectividad nueva conectividad
     */
    public void setConectividad(String conectividad) {
        this.conectividad = conectividad;
    }

    /**
     * Devuelve un texto con los datos completos del producto de tecnología.
     *
     * @return información completa en texto
     */
    @Override
    public String toString() {
        return "Tecnologia [sistemaOperativo=" + sistemaOperativo + ", conectividad=" + conectividad
                + ", getSistemaOperativo()=" + getSistemaOperativo() + ", getConectividad()=" + getConectividad()
                + ", verificarDisponibilidad()=" + verificarDisponibilidad() + ", getNombre()=" + getNombre()
                + ", getCantidad()=" + getCantidad() + ", getPrecio()=" + getPrecio() + ", toString()="
                + super.toString() + ", getClass()=" + getClass() + ", hashCode()=" + hashCode() + "]";
    }

    /**
     * Verifica si el producto de tecnología está disponible.
     *
     * @return true si hay existencias, false en caso contrario
     */
    @Override
    public boolean verificarDisponibilidad() {
        return super.verificarDisponibilidad();
    }
}
