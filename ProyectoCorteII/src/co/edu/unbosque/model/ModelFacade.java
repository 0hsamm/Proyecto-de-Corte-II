package co.edu.unbosque.model;

import co.edu.unbosque.model.persistence.AccesorioVehiculoDAO;
import co.edu.unbosque.model.persistence.CarritoDAO;
import co.edu.unbosque.model.persistence.CompradorDAO;
import co.edu.unbosque.model.persistence.ElectrodomesticoDAO;
import co.edu.unbosque.model.persistence.EquipoDeportivoDAO;
import co.edu.unbosque.model.persistence.HerramientaDAO;
import co.edu.unbosque.model.persistence.InmuebleDAO;
import co.edu.unbosque.model.persistence.JugueteDAO;
import co.edu.unbosque.model.persistence.PrendaDeVestirDAO;
import co.edu.unbosque.model.persistence.ProductoFarmaceuticoDAO;
import co.edu.unbosque.model.persistence.ProductoSostenibleDAO;
import co.edu.unbosque.model.persistence.TecnologiaDAO;
import co.edu.unbosque.model.persistence.VendedorDAO;

/**
 * Clase que centraliza el acceso a los diferentes modelos DAO.
 */
public class ModelFacade {
	
	private CompradorDAO compradorDAO;
	private VendedorDAO vendedorDAO;
	private AccesorioVehiculoDAO accesorioVehiculoDAO;
	private ElectrodomesticoDAO electrodomesticoDAO;
	private EquipoDeportivoDAO equipoDeportivoDAO;
	private HerramientaDAO herramientaDAO;
	private InmuebleDAO inmbuenleDAO;
	private JugueteDAO jugueteDAO;
	private PrendaDeVestirDAO prendaDAO;
	private ProductoFarmaceuticoDAO productoFarmaceuticoDAO;
	private ProductoSostenibleDAO productoSostenibleDAO;
	private TecnologiaDAO tecnologoiaDAO;
	private CarritoDAO carritoDAO;
	
	/**
	 * Constructor que inicializa todos los DAO.
	 */
	public ModelFacade() {
		compradorDAO = new CompradorDAO();
		vendedorDAO = new VendedorDAO();
		accesorioVehiculoDAO = new AccesorioVehiculoDAO();
		electrodomesticoDAO = new ElectrodomesticoDAO();
		equipoDeportivoDAO = new EquipoDeportivoDAO();
		herramientaDAO = new HerramientaDAO();
		inmbuenleDAO = new InmuebleDAO();
		jugueteDAO = new JugueteDAO();
		prendaDAO = new PrendaDeVestirDAO();
		productoFarmaceuticoDAO = new ProductoFarmaceuticoDAO();
		productoSostenibleDAO = new ProductoSostenibleDAO();
		tecnologoiaDAO = new TecnologiaDAO();
		carritoDAO = new CarritoDAO();
	}

	/**
	 * Devuelve el DAO del carrito.
	 * @return carritoDAO
	 */
	public CarritoDAO getCarritoDAO() {
		return carritoDAO;
	}

	/**
	 * Cambia el DAO del carrito.
	 * @param carritoDAO nuevo DAO
	 */
	public void setCarritoDAO(CarritoDAO carritoDAO) {
		this.carritoDAO = carritoDAO;
	}

	/**
	 * Devuelve el DAO de comprador.
	 * @return compradorDAO
	 */
	public CompradorDAO getCompradorDAO() {
		return compradorDAO;
	}

	/**
	 * Cambia el DAO de comprador.
	 * @param compradorDAO nuevo DAO
	 */
	public void setCompradorDAO(CompradorDAO compradorDAO) {
		this.compradorDAO = compradorDAO;
	}

	/**
	 * Devuelve el DAO de vendedor.
	 * @return vendedorDAO
	 */
	public VendedorDAO getVendedorDAO() {
		return vendedorDAO;
	}

	/**
	 * Cambia el DAO de vendedor.
	 * @param vendedorDAO nuevo DAO
	 */
	public void setVendedorDAO(VendedorDAO vendedorDAO) {
		this.vendedorDAO = vendedorDAO;
	}

	/**
	 * Devuelve el DAO de accesorios de vehículo.
	 * @return accesorioVehiculoDAO
	 */
	public AccesorioVehiculoDAO getAccesorioVehiculoDAO() {
		return accesorioVehiculoDAO;
	}

	/**
	 * Cambia el DAO de accesorios de vehículo.
	 * @param accesorioVehiculoDAO nuevo DAO
	 */
	public void setAccesorioVehiculoDAO(AccesorioVehiculoDAO accesorioVehiculoDAO) {
		this.accesorioVehiculoDAO = accesorioVehiculoDAO;
	}

	/**
	 * Devuelve el DAO de electrodomésticos.
	 * @return electrodomesticoDAO
	 */
	public ElectrodomesticoDAO getElectrodomesticoDAO() {
		return electrodomesticoDAO;
	}

	/**
	 * Cambia el DAO de electrodomésticos.
	 * @param electrodomesticoDAO nuevo DAO
	 */
	public void setElectrodomesticoDAO(ElectrodomesticoDAO electrodomesticoDAO) {
		this.electrodomesticoDAO = electrodomesticoDAO;
	}

	/**
	 * Devuelve el DAO de equipos deportivos.
	 * @return equipoDeportivoDAO
	 */
	public EquipoDeportivoDAO getEquipoDeportivoDAO() {
		return equipoDeportivoDAO;
	}

	/**
	 * Cambia el DAO de equipos deportivos.
	 * @param equipoDeportivoDAO nuevo DAO
	 */
	public void setEquipoDeportivoDAO(EquipoDeportivoDAO equipoDeportivoDAO) {
		this.equipoDeportivoDAO = equipoDeportivoDAO;
	}

	/**
	 * Devuelve el DAO de herramientas.
	 * @return herramientaDAO
	 */
	public HerramientaDAO getHerramientaDAO() {
		return herramientaDAO;
	}

	/**
	 * Cambia el DAO de herramientas.
	 * @param herramientaDAO nuevo DAO
	 */
	public void setHerramientaDAO(HerramientaDAO herramientaDAO) {
		this.herramientaDAO = herramientaDAO;
	}

	/**
	 * Devuelve el DAO de inmuebles.
	 * @return inmbuenleDAO
	 */
	public InmuebleDAO getInmbuenleDAO() {
		return inmbuenleDAO;
	}

	/**
	 * Cambia el DAO de inmuebles.
	 * @param inmbuenleDAO nuevo DAO
	 */
	public void setInmbuenleDAO(InmuebleDAO inmbuenleDAO) {
		this.inmbuenleDAO = inmbuenleDAO;
	}

	/**
	 * Devuelve el DAO de juguetes.
	 * @return jugueteDAO
	 */
	public JugueteDAO getJugueteDAO() {
		return jugueteDAO;
	}

	/**
	 * Cambia el DAO de juguetes.
	 * @param jugueteDAO nuevo DAO
	 */
	public void setJugueteDAO(JugueteDAO jugueteDAO) {
		this.jugueteDAO = jugueteDAO;
	}

	/**
	 * Devuelve el DAO de prendas de vestir.
	 * @return prendaDAO
	 */
	public PrendaDeVestirDAO getPrendaDAO() {
		return prendaDAO;
	}

	/**
	 * Cambia el DAO de prendas de vestir.
	 * @param prendaDAO nuevo DAO
	 */
	public void setPrendaDAO(PrendaDeVestirDAO prendaDAO) {
		this.prendaDAO = prendaDAO;
	}

	/**
	 * Devuelve el DAO de productos farmacéuticos.
	 * @return productoFarmaceuticoDAO
	 */
	public ProductoFarmaceuticoDAO getProductoFarmaceuticoDAO() {
		return productoFarmaceuticoDAO;
	}

	/**
	 * Cambia el DAO de productos farmacéuticos.
	 * @param productoFarmaceuticoDAO nuevo DAO
	 */
	public void setProductoFarmaceuticoDAO(ProductoFarmaceuticoDAO productoFarmaceuticoDAO) {
		this.productoFarmaceuticoDAO = productoFarmaceuticoDAO;
	}

	/**
	 * Devuelve el DAO de productos sostenibles.
	 * @return productoSostenibleDAO
	 */
	public ProductoSostenibleDAO getProductoSostenibleDAO() {
		return productoSostenibleDAO;
	}

	/**
	 * Cambia el DAO de productos sostenibles.
	 * @param productoSostenibleDAO nuevo DAO
	 */
	public void setProductoSostenibleDAO(ProductoSostenibleDAO productoSostenibleDAO) {
		this.productoSostenibleDAO = productoSostenibleDAO;
	}

	/**
	 * Devuelve el DAO de tecnología.
	 * @return tecnologoiaDAO
	 */
	public TecnologiaDAO getTecnologoiaDAO() {
		return tecnologoiaDAO;
	}

	/**
	 * Cambia el DAO de tecnología.
	 * @param tecnologoiaDAO nuevo DAO
	 */
	public void setTecnologoiaDAO(TecnologiaDAO tecnologoiaDAO) {
		this.tecnologoiaDAO = tecnologoiaDAO;
	}

}
