package co.edu.unbosque.controller;

import co.edu.unbosque.view.ViewFacade;

public class Controller {
	private ViewFacade vf;
	
	
	public Controller() {
		// TODO Auto-generated constructor stub
	}
	
	
	public void runGUI() {
		vf = new ViewFacade();
		vf.getVenInicioSesion().setVisible(true);
	}
	
}
