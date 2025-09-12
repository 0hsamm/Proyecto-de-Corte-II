package co.edu.unbosque.controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import co.edu.unbosque.view.VentanaMenu;
import co.edu.unbosque.view.ViewFacade;

public class Controller implements ActionListener {
	private ViewFacade vf;
	private VentanaMenu vm;

	public Controller() {
		vm = new VentanaMenu();
		vf = new ViewFacade();
	}

	public void runGUI() {
		// vf.getVenInicioSesion().setVisible(true);

		vm.setVisible(true);
		
		asignarListeners();
	}

	public void asignarListeners() {
		vm.getSalir().addActionListener(this);
		vm.getSalir().setActionCommand("SALIR");
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		String comando = e.getActionCommand();

		switch (comando) {
		case "SALIR":
			System.exit(0);
			break;
		}

	}
}
