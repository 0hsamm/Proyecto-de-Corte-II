package co.edu.unbosque.controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import co.edu.unbosque.view.VentanaInicioComprador;
import co.edu.unbosque.view.VentanaMenu;
import co.edu.unbosque.view.VentanaOpcionInicioSesion;
import co.edu.unbosque.view.VentanaInicioVendedor;
import co.edu.unbosque.view.ViewFacade;

public class Controller implements ActionListener {
	private ViewFacade vf;

	public Controller() {
		vf = new ViewFacade();
	}

	public void runGUI() {
		vf.getVenMenu().setVisible(true);
		asignarListeners();

	}

	public void asignarListeners() {

		vf.getVenMenu().getBtnIniciar().addActionListener(this);
		vf.getVenMenu().getBtnIniciar().setActionCommand("INICIAR");

		vf.getVenMenu().getBtnSalir().addActionListener(this);
		vf.getVenMenu().getBtnSalir().setActionCommand("SALIR");

		vf.getVenInicioSesion().getBtnEsComprador().addActionListener(this);
		vf.getVenInicioSesion().getBtnEsComprador().setActionCommand("ES_COMPRADOR");

		vf.getVenInicioSesion().getBtnEsVendedor().addActionListener(this);
		vf.getVenInicioSesion().getBtnEsVendedor().setActionCommand("ES_VENDEDOR");

		vf.getVenInicioSesion().getBtnVolver().addActionListener(this);
		vf.getVenInicioSesion().getBtnVolver().setActionCommand("VOLVER_OPCIONES");
		
		vf.getVenInicioComprador().getPanelCentral().getpInicioSesion().getBtnVolver().addActionListener(this);
		vf.getVenInicioComprador().getPanelCentral().getpInicioSesion().getBtnVolver().setActionCommand("VOLVER_INICIO_COMPRADOR");
		
		vf.getVenInicioVendedor().getPanelCentral().getpInicioSesion().getBtnVolver().addActionListener(this);
		vf.getVenInicioVendedor().getPanelCentral().getpInicioSesion().getBtnVolver().setActionCommand("VOLVER_INICIO_VENDEDOR");
		
		vf.getVenInicioComprador().getPanelCentral().getpInicioSesion().getBtnRegistro().addActionListener(this);
		vf.getVenInicioComprador().getPanelCentral().getpInicioSesion().getBtnRegistro().setActionCommand("REGISTRO_COMPRADOR");
		
		vf.getVenInicioVendedor().getPanelCentral().getpInicioSesion().getBtnRegistro().addActionListener(this);
		vf.getVenInicioVendedor().getPanelCentral().getpInicioSesion().getBtnRegistro().setActionCommand("REGISTRO_VENDEDOR");
		
		vf.getVenInicioComprador().getPanelCentral().getpRegistro().getBtnVolver().addActionListener(this);
		vf.getVenInicioComprador().getPanelCentral().getpRegistro().getBtnVolver().setActionCommand("VOLVER_INICIO_SESION_COMPRADOR");
		
		vf.getVenInicioVendedor().getPanelCentral().getpRegistro().getBtnVolver().addActionListener(this);
		vf.getVenInicioVendedor().getPanelCentral().getpRegistro().getBtnVolver().setActionCommand("VOLVER_INICIO_SESION_VENDEDOR");
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		switch (e.getActionCommand()) {
		case "INICIAR": {
			vf.getVenMenu().setVisible(false);
			vf.getVenInicioSesion().setVisible(true);
			break;
		}
		case "SALIR": {
			vf.getVenMenu().dispose();
			break;
		}
		case "ES_COMPRADOR": {
			vf.getVenInicioSesion().setVisible(false);
			vf.getVenInicioComprador().setVisible(true);
			break;
		}
		case "ES_VENDEDOR": {
			vf.getVenInicioSesion().setVisible(false);
			vf.getVenInicioVendedor().setVisible(true);
			break;
		}
		case "VOLVER_OPCIONES": {
			vf.getVenInicioSesion().setVisible(false);
			vf.getVenMenu().setVisible(true);
			break;
		}
		case "VOLVER_INICIO_COMPRADOR":{
			vf.getVenInicioComprador().setVisible(false);
			vf.getVenInicioSesion().setVisible(true);
			break;
		}
		case "VOLVER_INICIO_VENDEDOR":{
			vf.getVenInicioVendedor().setVisible(false);
			vf.getVenInicioSesion().setVisible(true);
			break;
		}
		case "REGISTRO_COMPRADOR":{
			vf.getVenInicioComprador().getPanelCentral().mostrarPanel("panelRegistro");
			break;
		}
		case "REGISTRO_VENDEDOR":{
			vf.getVenInicioVendedor().getPanelCentral().mostrarPanel("panelRegistro");
			break;
		}
		case "VOLVER_INICIO_SESION_COMPRADOR":{
			vf.getVenInicioComprador().getPanelCentral().mostrarPanel("panelInicioSesion");
			break;
		}
		case "VOLVER_INICIO_SESION_VENDEDOR":{
			vf.getVenInicioVendedor().getPanelCentral().mostrarPanel("panelInicioSesion");
			break;
		}
		}

	}
}
