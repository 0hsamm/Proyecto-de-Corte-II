package co.edu.unbosque.view;

import java.awt.CardLayout;
import java.awt.Color;

import javax.swing.JPanel;

public class PanelCentralVendedor extends JPanel{
	private PanelInicioSesion pInicioSesion;
	private PanelRegistro pRegistro;
	private CardLayout cardLayout;
	
	public PanelCentralVendedor() {
		inicializarComponentes();
		mostrarPanel("panelInicioSesion");
	}
	
	public void inicializarComponentes() {
		cardLayout = new CardLayout();
		this.setLayout(cardLayout);
		
		pInicioSesion = new PanelInicioSesion();
		pRegistro = new PanelRegistro();
		
		this.add(pInicioSesion, "panelInicioSesion");
		this.add(pRegistro, "panelRegistro");
	}

	public PanelInicioSesion getpInicioSesion() {
		return pInicioSesion;
	}

	public void setpInicioSesion(PanelInicioSesion pInicioSesion) {
		this.pInicioSesion = pInicioSesion;
	}

	public PanelRegistro getpRegistro() {
		return pRegistro;
	}

	public void setpRegistro(PanelRegistro pRegistro) {
		this.pRegistro = pRegistro;
	}

	public CardLayout getCardLayout() {
		return cardLayout;
	}

	public void setCardLayout(CardLayout cardLayout) {
		this.cardLayout = cardLayout;
	}
	
	public void mostrarPanel(String nombrePanel) {
		cardLayout.show(this, nombrePanel);
	}
}
