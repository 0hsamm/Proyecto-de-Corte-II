package co.edu.unbosque.view;

import java.awt.Color;
import java.awt.Font;
import java.awt.Image;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class VentanaMenu extends JFrame {
	
	private JLabel fondoMenu;
	private JButton salir;
	private JButton iniciar;
	
	public VentanaMenu() {
		inicializarComponentes();
	}
	
	public void inicializarComponentes() {
		
		this.setBounds(10, 10, 1280, 720);
		this.setTitle("Menu Principal");
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		this.setLayout(null);
		this.setResizable(false);
		this.setLocationRelativeTo(null);
		
		ImageIcon fondo = new ImageIcon("src/co/edu/unbosque/view/FondoMenu.PNG");
		Image escalar = fondo.getImage().getScaledInstance(1280, 720, Image.SCALE_SMOOTH);
		fondoMenu = new JLabel(new ImageIcon(escalar));
		fondoMenu.setBounds(0, 0, 1280, 720);
		this.add(fondoMenu);
		
		JLabel texto = new JLabel("Bienvenid@ a Mercado Libre!");
		texto.setFont(new Font("Arial Rounded MT Bold", Font.BOLD, 60));
		texto.setBounds(260, 80, 1200, 70);
		fondoMenu.add(texto);
		
		iniciar = new JButton("Iniciar");
		iniciar.setFont(new Font("Arial Rounded MT Bold", Font.BOLD, 50));
		iniciar.setBounds(170, 263, 200, 60);
		iniciar.setBackground(new Color(254, 230, 1));
		iniciar.setForeground(Color.WHITE);
		iniciar.setFocusPainted(false);
		iniciar.setBorderPainted(false);
		fondoMenu.add(iniciar);
		
		salir = new JButton("Salir");
		salir.setFont(new Font("Arial Rounded MT Bold", Font.BOLD, 40));
		salir.setBounds(100, 600, 150, 50);
		salir.setBackground(new Color(254, 230, 1));
		salir.setForeground(Color.WHITE);
		salir.setFocusPainted(false);
		salir.setBorderPainted(false);
		fondoMenu.add(salir);
	}

	public JLabel getFondoMenu() {
		return fondoMenu;
	}

	public void setFondoMenu(JLabel fondoMenu) {
		this.fondoMenu = fondoMenu;
	}

	public JButton getSalir() {
		return salir;
	}

	public void setSalir(JButton salir) {
		this.salir = salir;
	}

	public JButton getIniciar() {
		return iniciar;
	}

	public void setIniciar(JButton iniciar) {
		this.iniciar = iniciar;
	}

	
	
	
	
	
	

}
