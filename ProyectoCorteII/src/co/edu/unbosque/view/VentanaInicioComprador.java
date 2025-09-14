package co.edu.unbosque.view;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Font;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class VentanaInicioComprador extends JFrame {
	private JLabel fondoComprador;
	private PanelCentralComprador panelCentral;
	
	public VentanaInicioComprador() {
		inicializarComponentes();
	}
	
	public void inicializarComponentes() {
		this.setBounds(10, 10, 1280, 720);
		this.setTitle("Inicio de sesion comprador");
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		this.setLayout(new BorderLayout());
		this.setResizable(false);
		this.setLocationRelativeTo(null);
		
		

		
		panelCentral = new PanelCentralComprador();
		this.add(panelCentral, BorderLayout.CENTER);
	}

	public JLabel getFondoComprador() {
		return fondoComprador;
	}

	public void setFondoComprador(JLabel fondoComprador) {
		this.fondoComprador = fondoComprador;
	}


	public PanelCentralComprador getPanelCentral() {
		return panelCentral;
	}

	public void setPanelCentral(PanelCentralComprador panelCentral) {
		this.panelCentral = panelCentral;
	}
	
}
	

