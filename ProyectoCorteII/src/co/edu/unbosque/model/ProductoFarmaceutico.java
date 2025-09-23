package co.edu.unbosque.model;

/**
 * Clase que representa un producto farmacéutico.
 * Incluye información sobre la forma farmacéutica y la concentración.
 * Extiende de Producto.
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
     * @param concentracion concentración del ingrediente activo
     */
    public ProductoFarmaceutico(String formaFarmaceutica, String concentracion) {
        super();
        this.formaFarmaceutica = formaFarmaceutica;
        this.concentracion = concentracion;
    }

    /**
     * Constructor que inicializa todos los atributos del producto farmacéutico.
     *
     * @param nombre nombre del producto
     * @param cantidad antidad disponible
     * @param precio precio del producto
     * @param formaFarmaceutica forma farmacéutica del producto
     * @param concentracion concentración del ingrediente activo
     */
    public ProductoFarmaceutico(String nombre, int cantidad, float precio, String formaFarmaceutica, String concentracion) {
        super(nombre, cantidad, precio);
        this.formaFarmaceutica = formaFarmaceutica;
        this.concentracion = concentracion;
    }

    /**
     * Constructor que solo inicializa los datos básicos del producto.
     *
     * @param nombre nombre del producto
     * @param cantidad cantidad disponible
     * @param precio precio del producto
     */
    public ProductoFarmaceutico(String nombre, int cantidad, float precio) {
        super(nombre, cantidad, precio);
    }

    /**
     * Devuelve la forma farmacéutica del producto.
     *
     * @return forma farmacéutica
     */
    public String getFormaFarmaceutica() {
        return formaFarmaceutica;
    }

    /**
     * Cambia la forma farmacéutica del producto.
     *
     * @param formaFarmaceutica nueva forma farmacéutica
     */
    public void setFormaFarmaceutica(String formaFarmaceutica) {
        this.formaFarmaceutica = formaFarmaceutica;
    }

    /**
     * Devuelve la concentración del producto.
     *
     * @return concentración
     */
    public String getConcentracion() {
        return concentracion;
    }

    /**
     * Cambia la concentración del producto.
     *
     * @param concentracion nueva concentración
     */
    public void setConcentracion(String concentracion) {
        this.concentracion = concentracion;
    }

    /**
     * Devuelve un texto con los datos completos del producto farmacéutico.
     *
     * @return información completa en texto
     */
    @Override
    public String toString() {
        return "ProductoFarmaceutico [formaFarmaceutica=" + formaFarmaceutica + ", concentracion=" + concentracion
                + ", getFormaFarmaceutica()=" + getFormaFarmaceutica() + ", getConcentracion()=" + getConcentracion()
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
