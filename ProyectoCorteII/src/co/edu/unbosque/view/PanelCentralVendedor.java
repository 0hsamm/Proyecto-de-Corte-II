package co.edu.unbosque.view;

import java.awt.CardLayout;
import java.awt.Color;

import javax.swing.JPanel;

/**
 * Panel central del vendedor que maneja diferentes subpaneles. Utiliza un
 * CardLayout para mostrar el panel de inicio de sesión o registro según la
 * interacción del usuario.
 */
public class PanelCentralVendedor extends JPanel {
	private PanelInicioSesion pInicioSesion;
	private PanelRegistro pRegistro;
	private CardLayout cardLayout;

	/**
	 * Constructor que inicializa los componentes y muestra el panel de inicio de
	 * sesión.
	 */
	public PanelCentralVendedor() {
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

	/**
	 * Muestra el panel correspondiente según el nombre proporcionado.
	 * 
	 * @param nombrePanel nombre del panel a mostrar
	 */
	public void mostrarPanel(String nombrePanel) {
		cardLayout.show(this, nombrePanel);
	}

}
