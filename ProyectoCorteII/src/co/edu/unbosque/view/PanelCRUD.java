package co.edu.unbosque.view;

import java.awt.CardLayout;
import java.awt.Color;
import java.awt.Font;

import javax.swing.JButton;
import javax.swing.JPanel;

public class PanelCRUD extends JPanel {
	private JButton btnVolver;

	private JButton btnCrear;
	private JButton btnMostrar;
	private JButton btnActualizar;
	private JButton btnEliminar;
	
	private PanelCrear pCrear;
	private PanelMostrar pMostrar;
	private PanelActualizar pActualizar;
	private PanelEliminar pEliminar;

	
	public PanelCRUD() {
		inicializarComponentes();
	}

	public void inicializarComponentes() {

		
		this.setBounds(0, 0, 1280, 720);
		this.setLayout(null);
		this.setOpaque(false);

		btnCrear = new JButton("Crear artículo");
		btnCrear.setFont(new Font("Arial Rounded MT Bold", Font.BOLD, 30));
		btnCrear.setBounds(80, 30, 300, 50);
		btnCrear.setBackground(new Color(254, 230, 1));
		btnCrear.setForeground(Color.WHITE);
		btnCrear.setFocusPainted(false);
		btnCrear.setBorderPainted(false);
		this.add(btnCrear);

		btnMostrar = new JButton("Mostrar artículos");
		btnMostrar.setFont(new Font("Arial Rounded MT Bold", Font.BOLD, 30));
		btnMostrar.setBounds(80, 130, 300, 50);
		btnMostrar.setBackground(new Color(254, 230, 1));
		btnMostrar.setForeground(Color.WHITE);
		btnMostrar.setFocusPainted(false);
		btnMostrar.setBorderPainted(false);
		this.add(btnMostrar);

		btnActualizar = new JButton("Actualizar artículo");
		btnActualizar.setFont(new Font("Arial Rounded MT Bold", Font.BOLD, 30));
		btnActualizar.setBounds(80, 235, 300, 50);
		btnActualizar.setBackground(new Color(254, 230, 1));
		btnActualizar.setForeground(Color.WHITE);
		btnActualizar.setFocusPainted(false);
		btnActualizar.setBorderPainted(false);
		this.add(btnActualizar);

		btnEliminar = new JButton("Eliminar artículo");
		btnEliminar.setFont(new Font("Arial Rounded MT Bold", Font.BOLD, 30));
		btnEliminar.setBounds(80, 337, 300, 50);
		btnEliminar.setBackground(new Color(254, 230, 1));
		btnEliminar.setForeground(Color.WHITE);
		btnEliminar.setFocusPainted(false);
		btnEliminar.setBorderPainted(false);
		this.add(btnEliminar);

		btnVolver = new JButton("Menu");
		btnVolver.setFont(new Font("Arial Rounded MT Bold", Font.BOLD, 30));
		btnVolver.setBounds(18, 438, 200, 50);
		btnVolver.setBackground(new Color(254, 230, 1));
		btnVolver.setForeground(Color.WHITE);
		btnVolver.setFocusPainted(false);
		btnVolver.setBorderPainted(false);
		this.add(btnVolver);
	}
	
	
	public JButton getBtnVolver() {
		return btnVolver;
	}

	public void setBtnVolver(JButton btnVolver) {
		this.btnVolver = btnVolver;
	}

	public JButton getBtnCrear() {
		return btnCrear;
	}

	public void setBtnCrear(JButton btnCrear) {
		this.btnCrear = btnCrear;
	}

	public JButton getBtnMostrar() {
		return btnMostrar;
	}

	public void setBtnMostrar(JButton btnMostrar) {
		this.btnMostrar = btnMostrar;
	}

	public JButton getBtnActualizar() {
		return btnActualizar;
	}

	public void setBtnActualizar(JButton btnActualizar) {
		this.btnActualizar = btnActualizar;
	}

	public JButton getBtnEliminar() {
		return btnEliminar;
	}

	public void setBtnEliminar(JButton btnEliminar) {
		this.btnEliminar = btnEliminar;
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

}
