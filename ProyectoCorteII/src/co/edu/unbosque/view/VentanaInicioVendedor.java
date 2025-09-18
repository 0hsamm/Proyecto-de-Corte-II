package co.edu.unbosque.view;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Font;
import java.awt.Image;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class VentanaInicioVendedor extends JFrame {
	private JLabel fondoVendedor;
	private PanelCentralVendedor panelCentral;
	private JButton btnVolver;
	
	public VentanaInicioVendedor() {
		inicializarComponentes();
	}
	
	public void inicializarComponentes() {
		this.setBounds(10, 10, 1280, 755);
		this.setTitle("Inicio de sesion vendedor");
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		this.setResizable(false);
		this.setLocationRelativeTo(null);
		
		ImageIcon fondo = new ImageIcon("src/co/edu/unbosque/view/InicioSesion.PNG");
		Image escalar = fondo.getImage().getScaledInstance(1280, 720, Image.SCALE_SMOOTH);
		fondoVendedor = new JLabel(new ImageIcon(escalar));
		fondoVendedor.setBounds(0, 0, 1280, 720);
		this.setContentPane(fondoVendedor);
		fondoVendedor.setLayout(null);
		
		JLabel texto0 = new JLabel("Inicio de sesión del vendedor");
		texto0.setFont(new Font("Arial Rounded MT Bold", Font.BOLD, 60));
		texto0.setBounds(260, 80, 1200, 70);
		fondoVendedor.add(texto0);
		
		JLabel texto1 = new JLabel("Inicia sesión");
		texto1.setFont(new Font("Arial Rounded MT Bold", Font.BOLD, 60));
		texto1.setBounds(40, 270, 1200, 70);
		fondoVendedor.add(texto1);
		
		JLabel texto2 = new JLabel("Aquí!");
		texto2.setFont(new Font("Arial Rounded MT Bold", Font.BOLD, 60));
		texto2.setBounds(40, 370, 1200, 70);
		fondoVendedor.add(texto2);
		
		panelCentral = new PanelCentralVendedor();
		panelCentral.setBounds(600, 200, 620, 500);
		panelCentral.setOpaque(false);
		fondoVendedor.add(panelCentral);
		
		btnVolver = new JButton("Volver");
		btnVolver.setFont(new Font("Arial Rounded MT Bold", Font.BOLD, 30));
		btnVolver.setBounds(20, 620, 200, 50);
		btnVolver.setBackground(new Color(254, 230, 1));
		btnVolver.setForeground(Color.WHITE);
		btnVolver.setFocusPainted(false);
		btnVolver.setBorderPainted(false);
		fondoVendedor.add(btnVolver);
		
	}

	public JLabel getFondoVendedor() {
		return fondoVendedor;
	}

	public void setFondoVendedor(JLabel fondoVendedor) {
		this.fondoVendedor = fondoVendedor;
	}

	public PanelCentralVendedor getPanelCentral() {
		return panelCentral;
	}

	public void setPanelCentral(PanelCentralVendedor panelCentral) {
		this.panelCentral = panelCentral;
	}

	public JButton getBtnVolver() {
		return btnVolver;
	}

	public void setBtnVolver(JButton btnVolver) {
		this.btnVolver = btnVolver;
	}

	
	
}
