package co.edu.unbosque.view;

import java.awt.Color;
import java.awt.Font;
import java.awt.Image;
import java.util.Properties;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class VentanaComprar extends JFrame {

	private JLabel fondoComprar;
	private PanelMostrarComprador panelMostrar;
	private PanelCarrito panelCarrito;
	private JButton btnVolver;

	private JButton btnMostrar;
	private JButton btnCarrito;

	private Properties prop;
	
	private ImageIcon fondo;
	private Image escalar;
	private JLabel texto0;
	
	public VentanaComprar() {
		prop = new Properties();
		inicializarComponentes();
		aplicarTexto();
	}

	public void inicializarComponentes() {
		this.setBounds(10, 10, 1280, 755);
		this.setTitle("Funciones Comprar");
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		this.setResizable(false);
		this.setLocationRelativeTo(null);

		fondo = new ImageIcon("src/co/edu/unbosque/view/VentanaComprar.JPEG");
		escalar = fondo.getImage().getScaledInstance(1280, 720, Image.SCALE_SMOOTH);
		fondoComprar = new JLabel(new ImageIcon(escalar));
		fondoComprar.setBounds(0, 0, 1280, 720);
		this.setContentPane(fondoComprar);
		fondoComprar.setLayout(null);
		
		texto0 = new JLabel();
		texto0.setFont(new Font("Arial Rounded MT Bold", Font.BOLD, 60));
		texto0.setBounds(260, 80, 1200, 70);
		fondoComprar.add(texto0);
		
		panelCarrito = new PanelCarrito();
		panelCarrito.setBounds(450, 200, 800, 500);
		panelCarrito.setOpaque(false);
		panelCarrito.setVisible(false); 
		fondoComprar.add(panelCarrito);
		
		panelMostrar = new PanelMostrarComprador();
		panelMostrar.setBounds(450, 200, 800, 500);
		panelMostrar.setOpaque(false);
		panelMostrar.setVisible(false);
		fondoComprar.add(panelMostrar);

		btnMostrar = new JButton();
		btnMostrar.setFont(new Font("Arial Rounded MT Bold", Font.BOLD, 30));
		btnMostrar.setBounds(80, 235, 300, 50);
		btnMostrar.setBackground(new Color(254, 230, 1));
		btnMostrar.setForeground(Color.WHITE);
		btnMostrar.setFocusPainted(false);
		btnMostrar.setBorderPainted(false);
		this.add(btnMostrar);

		btnCarrito = new JButton();
		btnCarrito.setFont(new Font("Arial Rounded MT Bold", Font.BOLD, 30));
		btnCarrito.setBounds(80, 380, 300, 50);
		btnCarrito.setBackground(new Color(254, 230, 1));
		btnCarrito.setForeground(Color.WHITE);
		btnCarrito.setFocusPainted(false);
		btnCarrito.setBorderPainted(false);
		this.add(btnCarrito);


		btnVolver = new JButton();
		btnVolver.setFont(new Font("Arial Rounded MT Bold", Font.BOLD, 30));
		btnVolver.setBounds(18, 643, 200, 50);
		btnVolver.setBackground(new Color(254, 230, 1));
		btnVolver.setForeground(Color.WHITE);
		btnVolver.setFocusPainted(false);
		btnVolver.setBorderPainted(false);
		this.add(btnVolver);
	}
	
	public void aplicarTexto() {
		texto0.setText(prop.getProperty("mercadolibre.ventanacomprar.texto0"));
		btnMostrar.setText(prop.getProperty("mercadolibre.ventanacomprar.btnmostrar"));
		btnCarrito.setText(prop.getProperty("mercadolibre.ventanacomprar.btncarrito"));
		btnVolver.setText(prop.getProperty("mercadolibre.ventanacomprar.btnvolver"));
		
	}

	public JLabel getFondoComprar() {
		return fondoComprar;
	}

	public void setFondoComprar(JLabel fondoComprar) {
		this.fondoComprar = fondoComprar;
	}

	

	public PanelMostrarComprador getPanelMostrar() {
		return panelMostrar;
	}

	public void setPanelMostrar(PanelMostrarComprador panelMostrar) {
		this.panelMostrar = panelMostrar;
	}

	public PanelCarrito getPanelCarrito() {
		return panelCarrito;
	}

	public void setPanelCarrito(PanelCarrito panelCarrito) {
		this.panelCarrito = panelCarrito;
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



	public Properties getProp() {
		return prop;
	}

	public void setProp(Properties prop) {
		this.prop = prop;
		aplicarTexto();
		
		
		    
		
	}

	public ImageIcon getFondo() {
		return fondo;
	}

	public void setFondo(ImageIcon fondo) {
		this.fondo = fondo;
	}

	public Image getEscalar() {
		return escalar;
	}

	public void setEscalar(Image escalar) {
		this.escalar = escalar;
	}

	public JLabel getTexto0() {
		return texto0;
	}

	public void setTexto0(JLabel texto0) {
		this.texto0 = texto0;
	}

}
