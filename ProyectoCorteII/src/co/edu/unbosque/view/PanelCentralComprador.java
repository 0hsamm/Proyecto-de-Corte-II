package co.edu.unbosque.view;

import java.awt.CardLayout;
import java.awt.Color;

import javax.swing.JPanel;

/**
 * Panel central del comprador que maneja diferentes subpaneles. Utiliza un
 * CardLayout para mostrar distintos paneles según la interacción del usuario.
 */
public class PanelCentralComprador extends JPanel {
	private PanelInicioSesion pInicioSesion;
	private CardLayout cardLayout;

	/**
	 * Constructor que inicializa los componentes y muestra el panel de inicio de
	 * sesión.
	 */
	public PanelCentralComprador() {
		inicializarComponentes();
		mostrarPanel("panelInicioSesion");
	}

	/**
	 * Inicializa los subpaneles y configura el CardLayout.
	 */
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

	/**
	 * Muestra el panel correspondiente según el nombre proporcionado.
	 * 
	 * @param nombrePanel nombre del panel a mostrar
	 */
	public void mostrarPanel(String nombrePanel) {
		cardLayout.show(this, nombrePanel);
	}

}
