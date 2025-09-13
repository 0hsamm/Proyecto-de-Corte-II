package co.edu.unbosque.view;

public class ViewFacade {
	private VentanaOpcionInicioSesion venInicioSesion;
	
	public ViewFacade() {
		venInicioSesion = new VentanaOpcionInicioSesion();
	}

	public VentanaOpcionInicioSesion getVenInicioSesion() {
		return venInicioSesion;
	}

	public void setVenInicioSesion(VentanaOpcionInicioSesion venInicioSesion) {
		this.venInicioSesion = venInicioSesion;
	}
	
	
}
