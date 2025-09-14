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
	private JButton btnSalir;
	private JButton btnIniciar;
	
	public VentanaMenu() {
		inicializarComponentes();
	}
	
	public void inicializarComponentes() {
		
		this.setBounds(10, 10, 1280, 755);
		this.setTitle("Menu Principal");
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		this.setLayout(null);
		this.setResizable(false);
		this.setLocationRelativeTo(null);
		
		ImageIcon fondo = new ImageIcon("src/co/edu/unbosque/view/VentanaMenu.PNG");
		Image escalar = fondo.getImage().getScaledInstance(1280, 720, Image.SCALE_SMOOTH);
		fondoMenu = new JLabel(new ImageIcon(escalar));
		fondoMenu.setBounds(0, 0, 1280, 720);
		this.add(fondoMenu);
		
		JLabel texto = new JLabel("Bienvenid@ a Mercado Libre!");
		texto.setFont(new Font("Arial Rounded MT Bold", Font.BOLD, 60));
		texto.setBounds(260, 80, 1200, 70);
		fondoMenu.add(texto);
		
		JLabel texto2 = new JLabel("Mercado Libre,");
		texto2.setFont(new Font("SansSerif", Font.BOLD, 60));
		texto2.setBounds(600, 263, 1000, 70);
		fondoMenu.add(texto2);
		
		JLabel texto3 = new JLabel("el lugar donde");
		texto3.setFont(new Font("SansSerif", Font.ITALIC, 45));
		texto3.setBounds(600, 320, 1000, 70);
		fondoMenu.add(texto3);
		
		JLabel texto6 = new JLabel("comprar y vender");
		texto6.setFont(new Font("SansSerif", Font.ITALIC, 45));
		texto6.setBounds(600, 373, 1000, 70);
		fondoMenu.add(texto6);
		
		JLabel texto4 = new JLabel("se convierte en una");
		texto4.setFont(new Font("SansSerif", Font.ITALIC, 45));
		texto4.setBounds(600, 430, 1000, 70);
		fondoMenu.add(texto4);
		
		JLabel texto7 = new JLabel("experiencia");
		texto7.setFont(new Font("SansSerif", Font.ITALIC, 45));
		texto7.setBounds(600, 483, 1000, 70);
		fondoMenu.add(texto7);
		
		JLabel texto5 = new JLabel("fácil, rápida y segura!");
		texto5.setFont(new Font("SansSerif", Font.ITALIC, 45));
		texto5.setBounds(600, 540, 1000, 70);
		fondoMenu.add(texto5);
		
		
		btnIniciar = new JButton("Iniciar");
		btnIniciar.setFont(new Font("Arial Rounded MT Bold", Font.BOLD, 50));
		btnIniciar.setBounds(120, 263, 280, 60);
		btnIniciar.setBackground(new Color(254, 230, 1));
		btnIniciar.setForeground(Color.WHITE);
		btnIniciar.setFocusPainted(false);
		btnIniciar.setBorderPainted(false);
		fondoMenu.add(btnIniciar);
		
		btnSalir = new JButton("Salir");
		btnSalir.setFont(new Font("Arial Rounded MT Bold", Font.BOLD, 40));
		btnSalir.setBounds(100, 580, 150, 50);
		btnSalir.setBackground(new Color(254, 230, 1));
		btnSalir.setForeground(Color.WHITE);
		btnSalir.setFocusPainted(false);
		btnSalir.setBorderPainted(false);
		fondoMenu.add(btnSalir);
	}

	public JLabel getFondoMenu() {
		return fondoMenu;
	}

	public void setFondoMenu(JLabel fondoMenu) {
		this.fondoMenu = fondoMenu;
	}

	public JButton getBtnSalir() {
		return btnSalir;
	}

	public void setBtnSalir(JButton btnSalir) {
		this.btnSalir = btnSalir;
	}

	public JButton getBtnIniciar() {
		return btnIniciar;
	}

	public void setBtnIniciar(JButton btnIniciar) {
		this.btnIniciar = btnIniciar;
	}

	
	
	
	

}
