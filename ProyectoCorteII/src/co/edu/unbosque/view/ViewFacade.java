package co.edu.unbosque.view;

import java.util.Properties;

public class ViewFacade {
    private VentanaMenu venMenu;
    private VentanaOpcionInicioSesion venInicioSesion;
    private VentanaInicioComprador venInicioComprador;
    private VentanaInicioVendedor venInicioVendedor;
    private VentanaRegistroComprador venRegistroComprador;
    private VentanaRegistroVendedor venRegistroVendedor;
    private VentanaCRUD venCRUD;
    private Properties prop;
    private VentanaComprar venComprar;

    public ViewFacade() {
        prop = new Properties();
        venInicioSesion = new VentanaOpcionInicioSesion();
        venMenu = new VentanaMenu();
        venInicioComprador = new VentanaInicioComprador();
        venInicioVendedor = new VentanaInicioVendedor();
        venRegistroComprador = new VentanaRegistroComprador();
        venRegistroVendedor = new VentanaRegistroVendedor();
        venCRUD = new VentanaCRUD();
        venComprar = new VentanaComprar();
  
    }

    public void cargarIdioma() {
        venMenu.setProp(prop);
        venInicioSesion.setProp(prop);
        venInicioComprador.setProp(prop);
        venInicioVendedor.setProp(prop);
        venRegistroComprador.setProp(prop);
        venRegistroVendedor.setProp(prop);
        venCRUD.setProp(prop);
        venInicioComprador.getPanelCentral().getpInicioSesion().setProp(prop);
        venInicioVendedor.getPanelCentral().getpInicioSesion().setProp(prop);
        venRegistroComprador.getPanelRegistro().setProp(prop);
        venRegistroVendedor.getPanelRegistro().setProp(prop);
        venCRUD.getPanelCRUD().getpCrear().setProp(prop);
        venCRUD.getPanelCRUD().getpActualizar().setProp(prop);
        venCRUD.getPanelCRUD().getpEliminar().setProp(prop);
        venCRUD.getPanelCRUD().getpMostrar().setProp(prop); 
        venComprar.setProp(prop);
        venCRUD.getPanelCRUD().getpMostrar().setProp(prop);
		venComprar.getPanelMostrar().setProp(prop);
		venComprar.getPanelCarrito().setProp(prop);
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


	public Properties getProp() {
		return prop;
	}

	public void setProp(Properties prop) {
		this.prop = prop;
	}


	public VentanaComprar getVenComprar() {
		return venComprar;
	}

	public void setVenComprar(VentanaComprar venComprar) {
		this.venComprar = venComprar;
	}

	
}
