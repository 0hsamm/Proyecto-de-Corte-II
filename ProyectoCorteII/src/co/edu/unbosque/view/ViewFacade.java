package co.edu.unbosque.view;

public class ViewFacade {
	private VentanaInicioDeSesion venInicioSesion;
	
	public ViewFacade() {
		venInicioSesion = new VentanaInicioDeSesion();
	}

	public VentanaInicioDeSesion getVenInicioSesion() {
		return venInicioSesion;
	}

	public void setVenInicioSesion(VentanaInicioDeSesion venInicioSesion) {
		this.venInicioSesion = venInicioSesion;
	}
	
	
}
