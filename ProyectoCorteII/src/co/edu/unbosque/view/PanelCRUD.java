package co.edu.unbosque.view;

import java.awt.CardLayout;
import java.awt.Color;
import java.awt.Font;

import javax.swing.JButton;
import javax.swing.JPanel;

public class PanelCRUD extends JPanel {

	
	private PanelCrear pCrear;
	private PanelMostrar pMostrar;
	private PanelActualizar pActualizar;
	private PanelEliminar pEliminar;

	private CardLayout cardLayout;
	
	public PanelCRUD() {
		inicializarComponentes();
	
	}

	public void inicializarComponentes() {
		cardLayout = new CardLayout();
		
		this.setLayout(cardLayout);
		this.setOpaque(false);

		pCrear = new PanelCrear();
		pMostrar = new PanelMostrar();
		pActualizar = new PanelActualizar();
		pEliminar = new PanelEliminar();
		
		this.add(pCrear, "panelCrear");
		this.add(pEliminar, "panelEliminar");
		this.add(pActualizar, "panelActualizar");
		this.add(pMostrar, "panelMostrar");
	}
	
	public PanelCrear getpCrear() {
		return pCrear;
	}

	public void setpCrear(PanelCrear pCrear) {
		this.pCrear = pCrear;
	}

	public PanelMostrar getpMostrar() {
		return pMostrar;
	}

	public void setpMostrar(PanelMostrar pMostrar) {
		this.pMostrar = pMostrar;
	}

	public PanelActualizar getpActualizar() {
		return pActualizar;
	}

	public void setpActualizar(PanelActualizar pActualizar) {
		this.pActualizar = pActualizar;
	}

	public PanelEliminar getpEliminar() {
		return pEliminar;
	}

	public void setpEliminar(PanelEliminar pEliminar) {
		this.pEliminar = pEliminar;
	}
	
	public void mostrarPanel(String nombrePanel) {
		cardLayout.show(this, nombrePanel);
	}
	
}
