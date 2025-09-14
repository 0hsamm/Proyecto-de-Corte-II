package co.edu.unbosque.view;

import java.awt.Color;
import java.awt.Font;
import java.awt.Image;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class VentanaOpcionInicioSesion extends JFrame{
	
	private JLabel fondoCV;
	private JButton btnEsComprador;
	private JButton btnEsVendedor;
	private JButton btnVolver;
	
	public VentanaOpcionInicioSesion() {
		inicializarComponentes();
	}
	
	public void inicializarComponentes() {
		
		this.setBounds(10, 10, 1280, 755);
		this.setTitle("OpcionInicioSesion");
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		this.setLayout(null);
		this.setResizable(false);
		this.setLocationRelativeTo(null);
		
		ImageIcon fondo = new ImageIcon("src/co/edu/unbosque/view/VentanaCV.PNG");
		Image escalar = fondo.getImage().getScaledInstance(1280, 720, Image.SCALE_SMOOTH);
		fondoCV = new JLabel(new ImageIcon(escalar));
		fondoCV.setBounds(0, 0, 1280, 720);
		this.add(fondoCV);
		
		JLabel texto = new JLabel("Inicio de sesión");
		texto.setFont(new Font("Arial Rounded MT Bold", Font.BOLD, 70));
		texto.setBounds(260, 80, 1200, 70);
		fondoCV.add(texto);
		
		JLabel texto2 = new JLabel("Es usted comprador o vendedor?");
		texto2.setFont(new Font("Arial Rounded MT Bold", Font.BOLD, 40));
		texto2.setBounds(320, 250, 1200, 70);
		fondoCV.add(texto2);
		
		btnEsComprador = new JButton("Comprador");
		btnEsComprador.setFont(new Font("Arial Rounded MT Bold", Font.BOLD, 60));
		btnEsComprador.setBounds(95, 420, 400, 60);
		btnEsComprador.setBackground(new Color(254, 230, 1));
		btnEsComprador.setForeground(Color.WHITE);
		btnEsComprador.setFocusPainted(false);
		btnEsComprador.setBorderPainted(false);
		fondoCV.add(btnEsComprador);
		
		btnEsVendedor = new JButton("Vendedor");
		btnEsVendedor.setFont(new Font("Arial Rounded MT Bold", Font.BOLD, 60));
		btnEsVendedor.setBounds(790, 420, 400, 60);
		btnEsVendedor.setBackground(new Color(254, 230, 1));
		btnEsVendedor.setForeground(Color.WHITE);
		btnEsVendedor.setFocusPainted(false);
		btnEsVendedor.setBorderPainted(false);
		fondoCV.add(btnEsVendedor);
		
		btnVolver = new JButton("Volver");
		btnVolver.setFont(new Font("Arial Rounded MT Bold", Font.BOLD, 40));
		btnVolver.setBounds(27, 620, 200, 50);
		btnVolver.setBackground(new Color(254, 230, 1));
		btnVolver.setForeground(Color.WHITE);
		btnVolver.setFocusPainted(false);
		btnVolver.setBorderPainted(false);
		fondoCV.add(btnVolver);
		
		
	}

	public JLabel getFondoCV() {
		return fondoCV;
	}

	public void setFondoCV(JLabel fondoCV) {
		this.fondoCV = fondoCV;
	}

	public JButton getBtnEsComprador() {
		return btnEsComprador;
	}

	public void setBtnEsComprador(JButton btnEsComprador) {
		this.btnEsComprador = btnEsComprador;
	}

	public JButton getBtnEsVendedor() {
		return btnEsVendedor;
	}

	public void setBtnEsVendedor(JButton btnEsVendedor) {
		this.btnEsVendedor = btnEsVendedor;
	}

	public JButton getBtnVolver() {
		return btnVolver;
	}

	public void setBtnVolver(JButton btnVolver) {
		this.btnVolver = btnVolver;
	}


	
	
}

