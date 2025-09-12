package co.edu.unbosque.controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import co.edu.unbosque.view.VentanaComprador;
import co.edu.unbosque.view.VentanaMenu;
import co.edu.unbosque.view.VentanaOpcionInicioSesion;
import co.edu.unbosque.view.VentanaVendedor;
import co.edu.unbosque.view.ViewFacade;

public class Controller implements ActionListener {
	private ViewFacade vf;
	private VentanaMenu vm;
	private VentanaOpcionInicioSesion vops;
	private VentanaComprador vc;
	private VentanaVendedor vv;

	public Controller() {
		vm = new VentanaMenu();
		vf = new ViewFacade();
		vops = new VentanaOpcionInicioSesion();
		vc = new VentanaComprador();
		vv = new VentanaVendedor();
	}

	public void runGUI() {

		vm.setVisible(true);
		vops.setVisible(false);
		vc.setVisible(false);
		vv.setVisible(false);

		asignarListeners();
	}

	public void asignarListeners() {

		vm.getIniciar().addActionListener(this);
		vm.getIniciar().setActionCommand("INICIAR");

		vm.getSalir().addActionListener(this);
		vm.getSalir().setActionCommand("SALIR");

		vops.getEsComprador().addActionListener(this);
		vops.getEsComprador().setActionCommand("ES_COMPRADOR");

		vops.getEsVendedor().addActionListener(this);
		vops.getEsVendedor().setActionCommand("ES_VENDEDOR");

		vops.getVolver().addActionListener(this);
		vops.getVolver().setActionCommand("VOLVER");
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		String comando = e.getActionCommand();

		switch (comando) {
		case "INICIAR":
			vm.setVisible(false);
			vops.setVisible(true);
			break;
		case "SALIR":
			System.exit(0);
			break;
		case "ES_COMPRADOR":
			vops.setVisible(false);
			vc.setVisible(true);
			break;
		case "ES_VENDEDOR":
			vops.setVisible(false);
			vv.setVisible(true);
			break;
		case "VOLVER":
			vops.setVisible(false);
			vm.setVisible(true);
		}

	}
}
