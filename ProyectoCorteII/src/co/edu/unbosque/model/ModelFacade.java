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

	public CarritoDAO getCarritoDAO() {
		return carritoDAO;
	}

	public void setCarritoDAO(CarritoDAO carritoDAO) {
		this.carritoDAO = carritoDAO;
	}

	public CompradorDAO getCompradorDAO() {
		return compradorDAO;
	}

	public void setCompradorDAO(CompradorDAO compradorDAO) {
		this.compradorDAO = compradorDAO;
	}

	public VendedorDAO getVendedorDAO() {
		return vendedorDAO;
	}

	public void setVendedorDAO(VendedorDAO vendedorDAO) {
		this.vendedorDAO = vendedorDAO;
	}

	public AccesorioVehiculoDAO getAccesorioVehiculoDAO() {
		return accesorioVehiculoDAO;
	}

	public void setAccesorioVehiculoDAO(AccesorioVehiculoDAO accesorioVehiculoDAO) {
		this.accesorioVehiculoDAO = accesorioVehiculoDAO;
	}

	public ElectrodomesticoDAO getElectrodomesticoDAO() {
		return electrodomesticoDAO;
	}

	public void setElectrodomesticoDAO(ElectrodomesticoDAO electrodomesticoDAO) {
		this.electrodomesticoDAO = electrodomesticoDAO;
	}

	public EquipoDeportivoDAO getEquipoDeportivoDAO() {
		return equipoDeportivoDAO;
	}

	public void setEquipoDeportivoDAO(EquipoDeportivoDAO equipoDeportivoDAO) {
		this.equipoDeportivoDAO = equipoDeportivoDAO;
	}

	public HerramientaDAO getHerramientaDAO() {
		return herramientaDAO;
	}

	public void setHerramientaDAO(HerramientaDAO herramientaDAO) {
		this.herramientaDAO = herramientaDAO;
	}

	public InmuebleDAO getInmbuenleDAO() {
		return inmbuenleDAO;
	}

	public void setInmbuenleDAO(InmuebleDAO inmbuenleDAO) {
		this.inmbuenleDAO = inmbuenleDAO;
	}

	public JugueteDAO getJugueteDAO() {
		return jugueteDAO;
	}

	public void setJugueteDAO(JugueteDAO jugueteDAO) {
		this.jugueteDAO = jugueteDAO;
	}

	public PrendaDeVestirDAO getPrendaDAO() {
		return prendaDAO;
	}

	public void setPrendaDAO(PrendaDeVestirDAO prendaDAO) {
		this.prendaDAO = prendaDAO;
	}

	public ProductoFarmaceuticoDAO getProductoFarmaceuticoDAO() {
		return productoFarmaceuticoDAO;
	}

	public void setProductoFarmaceuticoDAO(ProductoFarmaceuticoDAO productoFarmaceuticoDAO) {
		this.productoFarmaceuticoDAO = productoFarmaceuticoDAO;
	}

	public ProductoSostenibleDAO getProductoSostenibleDAO() {
		return productoSostenibleDAO;
	}

	public void setProductoSostenibleDAO(ProductoSostenibleDAO productoSostenibleDAO) {
		this.productoSostenibleDAO = productoSostenibleDAO;
	}

	public TecnologiaDAO getTecnologoiaDAO() {
		return tecnologoiaDAO;
	}

	public void setTecnologoiaDAO(TecnologiaDAO tecnologoiaDAO) {
		this.tecnologoiaDAO = tecnologoiaDAO;
	}
	
	

}
