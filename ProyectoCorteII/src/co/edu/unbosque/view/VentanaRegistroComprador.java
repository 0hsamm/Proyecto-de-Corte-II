package co.edu.unbosque.view;

import java.awt.Color;
import java.awt.Font;
import java.awt.Image;
import java.util.Properties;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class VentanaRegistroComprador extends JFrame {
	private JLabel fondoComprador;
	private PanelRegistro panelRegistro;
	private JButton btnVolver;
	private JButton btnMenu;
	private JLabel texto0;
	private JLabel texto;
	private JLabel texto2;
	private Properties prop;
	private ImageIcon fondo;
	private Image escalar;

	public VentanaRegistroComprador() {
		prop = new Properties();
		inicializarComponentes();
	}

	public void inicializarComponentes() {
		this.setBounds(10, 10, 1280, 755);
		this.setTitle("Registro Comprador");
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		this.setResizable(false);
		this.setLocationRelativeTo(null);

		fondo = new ImageIcon("src/co/edu/unbosque/view/VentanaRegistro.PNG");
		escalar = fondo.getImage().getScaledInstance(1280, 720, Image.SCALE_SMOOTH);
		fondoComprador = new JLabel(new ImageIcon(escalar));
		fondoComprador.setBounds(0, 0, 1280, 720);
		this.setContentPane(fondoComprador);
		fondoComprador.setLayout(null);

		texto0 = new JLabel();
		texto0.setFont(new Font("Arial Rounded MT Bold", Font.BOLD, 60));
		texto0.setBounds(260, 80, 1200, 70);
		fondoComprador.add(texto0);

		texto = new JLabel();
		texto.setFont(new Font("Arial Rounded MT Bold", Font.BOLD, 60));
		texto.setBounds(40, 270, 1200, 70);
		fondoComprador.add(texto);

		texto2 = new JLabel();
		texto2.setFont(new Font("Arial Rounded MT Bold", Font.BOLD, 60));
		texto2.setBounds(40, 370, 1200, 70);
		fondoComprador.add(texto2);

		panelRegistro = new PanelRegistro();
		panelRegistro.setBounds(600, 200, 620, 500);
		panelRegistro.setOpaque(false);
		fondoComprador.add(panelRegistro);

		btnVolver = new JButton();
		btnVolver.setFont(new Font("Arial Rounded MT Bold", Font.BOLD, 30));
		btnVolver.setBounds(30, 620, 170, 50);
		btnVolver.setBackground(new Color(254, 230, 1));
		btnVolver.setForeground(Color.WHITE);
		btnVolver.setFocusPainted(false);
		btnVolver.setBorderPainted(false);
		fondoComprador.add(btnVolver);

		btnMenu = new JButton();
		btnMenu.setFont(new Font("Arial Rounded MT Bold", Font.BOLD, 30));
		btnMenu.setBounds(300, 620, 170, 50);
		btnMenu.setBackground(new Color(254, 230, 1));
		btnMenu.setForeground(Color.WHITE);
		btnMenu.setFocusPainted(false);
		btnMenu.setBorderPainted(false);
		fondoComprador.add(btnMenu);
	}

	public void aplicarTexto(){
		texto0.setText(prop.getProperty("mercadolibre.ventanaregistrocomprador.texto0"));
		texto.setText(prop.getProperty("mercadolibre.ventanaregistrocomprador.texto"));
		texto2.setText(prop.getProperty("mercadolibre.ventanaregistrocomprador.texto2"));
		btnVolver.setText(prop.getProperty("mercadolibre.ventanaregistrocomprador.btnvolver"));
		btnMenu.setText(prop.getProperty("mercadolibre.ventanaregistrocomprador.btnmenu"));

	}
	
	public JLabel getFondoComprador() {
		return fondoComprador;
	}

	public void setFondoComprador(JLabel fondoComprador) {
		this.fondoComprador = fondoComprador;
	}

	public JButton getBtnVolver() {
		return btnVolver;
	}

	public void setBtnVolver(JButton btnVolver) {
		this.btnVolver = btnVolver;
	}

	public JButton getBtnMenu() {
		return btnMenu;
	}

	public void setBtnMenu(JButton btnMenu) {
		this.btnMenu = btnMenu;
	}

	public PanelRegistro getPanelRegistro() {
		return panelRegistro;
	}

	public void setPanelRegistro(PanelRegistro panelRegistro) {
		this.panelRegistro = panelRegistro;
	}

	public JLabel getTexto0() {
		return texto0;
	}

	public void setTexto0(JLabel texto0) {
		this.texto0 = texto0;
	}

	public JLabel getTexto() {
		return texto;
	}

	public void setTexto(JLabel texto) {
		this.texto = texto;
	}

	public JLabel getTexto2() {
		return texto2;
	}

	public void setTexto2(JLabel texto2) {
		this.texto2 = texto2;
	}

	public Properties getProp() {
		return prop;
	}

	public void setProp(Properties prop) {
		this.prop = prop;
		aplicarTexto();
	}

}
