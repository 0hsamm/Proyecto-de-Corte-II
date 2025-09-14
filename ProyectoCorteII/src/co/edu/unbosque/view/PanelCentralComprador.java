package co.edu.unbosque.view;

import java.awt.CardLayout;
import java.awt.Color;

import javax.swing.JPanel;

public class PanelCentralComprador extends JPanel {
	private PanelInicioSesion pInicioSesion;
	private CardLayout cardLayout;

	public PanelCentralComprador() {
		inicializarComponentes();
		mostrarPanel("panelInicioSesion");
	}

	public void inicializarComponentes() {
		cardLayout = new CardLayout();
		this.setLayout(cardLayout);

		pInicioSesion = new PanelInicioSesion();

		this.add(pInicioSesion, "panelInicioSesion");
	}

	public PanelInicioSesion getpInicioSesion() {
		return pInicioSesion;
	}

	public void setpInicioSesion(PanelInicioSesion pInicioSesion) {
		this.pInicioSesion = pInicioSesion;
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
