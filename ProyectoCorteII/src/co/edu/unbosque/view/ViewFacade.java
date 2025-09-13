package co.edu.unbosque.view;

public class ViewFacade {
	private VentanaMenu venMenu;
	private VentanaOpcionInicioSesion venInicioSesion;
	private VentanaInicioComprador venInicioComprador;
	private VentanaInicioVendedor venInicioVendedor;
	
	public ViewFacade() {
		venInicioSesion = new VentanaOpcionInicioSesion();
		venMenu = new VentanaMenu();
		venInicioComprador = new VentanaInicioComprador();
		venInicioVendedor = new VentanaInicioVendedor();
	}

	public VentanaOpcionInicioSesion getVenInicioSesion() {
		return venInicioSesion;
	}

	public void setVenInicioSesion(VentanaOpcionInicioSesion venInicioSesion) {
		this.venInicioSesion = venInicioSesion;
	}

	public VentanaMenu getVenMenu() {
		return venMenu;
	}

	public void setVenMenu(VentanaMenu venMenu) {
		this.venMenu = venMenu;
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
	
	
}
