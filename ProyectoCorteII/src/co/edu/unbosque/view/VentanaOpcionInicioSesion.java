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
	private JButton esComprador;
	private JButton esVendedor;
	private JButton volver;
	
	public VentanaOpcionInicioSesion() {
		inicializarComponentes();
	}
	
	public void inicializarComponentes() {
		
		this.setBounds(10, 10, 1280, 720);
		this.setTitle("OpcionInicioSesion");
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		this.setLayout(null);
		this.setResizable(false);
		this.setLocationRelativeTo(null);
		
		ImageIcon fondo = new ImageIcon("src/co/edu/unbosque/view/OpcionInicioSesion.PNG");
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
		
		esComprador = new JButton("Comprador");
		esComprador.setFont(new Font("Arial Rounded MT Bold", Font.BOLD, 50));
		esComprador.setBounds(95, 420, 400, 40);
		esComprador.setBackground(new Color(254, 230, 1));
		esComprador.setForeground(Color.WHITE);
		esComprador.setFocusPainted(false);
		esComprador.setBorderPainted(false);
		fondoCV.add(esComprador);
		
		esVendedor = new JButton("Vendedor");
		esVendedor.setFont(new Font("Arial Rounded MT Bold", Font.BOLD, 50));
		esVendedor.setBounds(800, 420, 400, 40);
		esVendedor.setBackground(new Color(254, 230, 1));
		esVendedor.setForeground(Color.WHITE);
		esVendedor.setFocusPainted(false);
		esVendedor.setBorderPainted(false);
		fondoCV.add(esVendedor);
		
		volver = new JButton("Volver");
		volver.setFont(new Font("Arial Rounded MT Bold", Font.BOLD, 40));
		volver.setBounds(27, 620, 200, 50);
		volver.setBackground(new Color(254, 230, 1));
		volver.setForeground(Color.WHITE);
		volver.setFocusPainted(false);
		volver.setBorderPainted(false);
		fondoCV.add(volver);
		
		
	}

	public JLabel getFondoCV() {
		return fondoCV;
	}

	public void setFondoCV(JLabel fondoCV) {
		this.fondoCV = fondoCV;
	}

	public JButton getEsComprador() {
		return esComprador;
	}

	public void setEsComprador(JButton esComprador) {
		this.esComprador = esComprador;
	}

	public JButton getEsVendedor() {
		return esVendedor;
	}

	public void setEsVendedor(JButton esVendedor) {
		this.esVendedor = esVendedor;
	}

	public JButton getVolver() {
		return volver;
	}

	public void setVolver(JButton volver) {
		this.volver = volver;
	}
	
	
}

