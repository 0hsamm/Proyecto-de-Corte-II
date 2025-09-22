package co.edu.unbosque.view;

import java.awt.Color;
import java.awt.Font;
import java.awt.Image;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class VentanaComprar extends JFrame {

	private JLabel fondoComprar;
	private PanelMostrar panelMostrar;
	private PanelCarrito panelCarrito;
	private JButton btnVolver;

	private JButton btnMostrar;
	private JButton btnCarrito;
	private JButton btnComprar;

	public VentanaComprar() {
		inicializarComponentes();
	}

	public void inicializarComponentes() {
		this.setBounds(10, 10, 1280, 755);
		this.setTitle("Funciones Comprar");
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		this.setResizable(false);
		this.setLocationRelativeTo(null);

		ImageIcon fondo = new ImageIcon("src/co/edu/unbosque/view/VentanaComprar.PNG");
		Image escalar = fondo.getImage().getScaledInstance(1280, 720, Image.SCALE_SMOOTH);
		fondoComprar = new JLabel(new ImageIcon(escalar));
		fondoComprar.setBounds(0, 0, 1280, 720);
		this.setContentPane(fondoComprar);
		fondoComprar.setLayout(null);

		JLabel texto0 = new JLabel("Funciones del comprador");
		texto0.setFont(new Font("Arial Rounded MT Bold", Font.BOLD, 60));
		texto0.setBounds(260, 80, 1200, 70);
		fondoComprar.add(texto0);
		
		panelCarrito = new PanelCarrito();
		
		
		panelMostrar = new PanelMostrar();
		panelMostrar.setBounds(450, 200, 800, 500);
		panelMostrar.setOpaque(false);
		fondoComprar.add(panelMostrar);

		btnMostrar = new JButton("Artículos");
		btnMostrar.setFont(new Font("Arial Rounded MT Bold", Font.BOLD, 30));
		btnMostrar.setBounds(80, 235, 300, 50);
		btnMostrar.setBackground(new Color(254, 230, 1));
		btnMostrar.setForeground(Color.WHITE);
		btnMostrar.setFocusPainted(false);
		btnMostrar.setBorderPainted(false);
		this.add(btnMostrar);

		btnCarrito = new JButton("Carrito");
		btnCarrito.setFont(new Font("Arial Rounded MT Bold", Font.BOLD, 30));
		btnCarrito.setBounds(80, 380, 300, 50);
		btnCarrito.setBackground(new Color(254, 230, 1));
		btnCarrito.setForeground(Color.WHITE);
		btnCarrito.setFocusPainted(false);
		btnCarrito.setBorderPainted(false);
		this.add(btnCarrito);

		btnComprar = new JButton("Comprar artículo");
		btnComprar.setFont(new Font("Arial Rounded MT Bold", Font.BOLD, 30));
		btnComprar.setBounds(80, 542, 300, 50);
		btnComprar.setBackground(new Color(254, 230, 1));
		btnComprar.setForeground(Color.WHITE);
		btnComprar.setFocusPainted(false);
		btnComprar.setBorderPainted(false);
		this.add(btnComprar);

		btnVolver = new JButton("Volver");
		btnVolver.setFont(new Font("Arial Rounded MT Bold", Font.BOLD, 30));
		btnVolver.setBounds(18, 643, 200, 50);
		btnVolver.setBackground(new Color(254, 230, 1));
		btnVolver.setForeground(Color.WHITE);
		btnVolver.setFocusPainted(false);
		btnVolver.setBorderPainted(false);
		this.add(btnVolver);
	}

	public JLabel getFondoComprar() {
		return fondoComprar;
	}

	public void setFondoComprar(JLabel fondoComprar) {
		this.fondoComprar = fondoComprar;
	}

	public PanelMostrar getPanelMostrar() {
		return panelMostrar;
	}

	public void setPanelMostrar(PanelMostrar panelMostrar) {
		this.panelMostrar = panelMostrar;
	}

	public JButton getBtnVolver() {
		return btnVolver;
	}

	public void setBtnVolver(JButton btnVolver) {
		this.btnVolver = btnVolver;
	}

	public JButton getBtnMostrar() {
		return btnMostrar;
	}

	public void setBtnMostrar(JButton btnMostrar) {
		this.btnMostrar = btnMostrar;
	}

	public JButton getBtnCarrito() {
		return btnCarrito;
	}

	public void setBtnCarrito(JButton btnCarrito) {
		this.btnCarrito = btnCarrito;
	}

	public JButton getBtnComprar() {
		return btnComprar;
	}

	public void setBtnComprar(JButton btnComprar) {
		this.btnComprar = btnComprar;
	}

}
