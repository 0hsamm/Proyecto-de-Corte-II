package co.edu.unbosque.view;

public class ViewFacade {
	private VentanaMenu venMenu;
	private VentanaOpcionInicioSesion venInicioSesion;
	private VentanaInicioComprador venInicioComprador;
	private VentanaInicioVendedor venInicioVendedor;
	private VentanaRegistroComprador venRegistroComprador;
	private VentanaRegistroVendedor venRegistroVendedor;
	private VentanaCRUD venCRUD;
	
	public ViewFacade() {
		venInicioSesion = new VentanaOpcionInicioSesion();
		venMenu = new VentanaMenu();
		venInicioComprador = new VentanaInicioComprador();
		venInicioVendedor = new VentanaInicioVendedor();
		venRegistroComprador = new VentanaRegistroComprador();
		venRegistroVendedor = new VentanaRegistroVendedor();
		venCRUD = new VentanaCRUD();
		
	}

	public VentanaMenu getVenMenu() {
		return venMenu;
	}

	public void setVenMenu(VentanaMenu venMenu) {
		this.venMenu = venMenu;
	}

	public VentanaOpcionInicioSesion getVenInicioSesion() {
		return venInicioSesion;
	}

	public void setVenInicioSesion(VentanaOpcionInicioSesion venInicioSesion) {
		this.venInicioSesion = venInicioSesion;
	}

	public VentanaInicioComprador getVenInicioComprador() {
		return venInicioComprador;
	}

	public void setVenInicioComprador(VentanaInicioComprador venInicioComprador) {
		this.venInicioComprador = venInicioComprador;
	}

	public VentanaInicioVendedor getVenInicioVendedor() {
		return venInicioVendedor;
	}

	public void setVenInicioVendedor(VentanaInicioVendedor venInicioVendedor) {
		this.venInicioVendedor = venInicioVendedor;
	}

	public VentanaRegistroComprador getVenRegistroComprador() {
		return venRegistroComprador;
	}

	public void setVenRegistroComprador(VentanaRegistroComprador venRegistroComprador) {
		this.venRegistroComprador = venRegistroComprador;
	}

	public VentanaRegistroVendedor getVenRegistroVendedor() {
		return venRegistroVendedor;
	}

	public void setVenRegistroVendedor(VentanaRegistroVendedor venRegistroVendedor) {
		this.venRegistroVendedor = venRegistroVendedor;
	}

	public VentanaCRUD getVenCRUD() {
		return venCRUD;
	}

	public void setVenCRUD(VentanaCRUD venCRUD) {
		this.venCRUD = venCRUD;
	}
	
	
}
