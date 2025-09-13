package co.edu.unbosque.view;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Font;

import javax.swing.JButton;
import javax.swing.JFrame;

public class VentanaInicioVendedor extends JFrame {
	private PanelCentralVendedor panelCentral;
	
	public VentanaInicioVendedor() {
		inicializarComponentes();
	}
	
	public void inicializarComponentes() {
		this.setBounds(10, 10, 1280, 720);
		this.setTitle("Inicio de sesion vendedor");
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		this.setLayout(new BorderLayout());
		this.setResizable(false);
		this.setLocationRelativeTo(null);
		
		panelCentral = new PanelCentralVendedor();
		this.add(panelCentral, BorderLayout.CENTER);
	}

	public PanelCentralVendedor getPanelCentral() {
		return panelCentral;
	}

	public void setPanelCentral(PanelCentralVendedor panelCentral) {
		this.panelCentral = panelCentral;
	}
	
}
