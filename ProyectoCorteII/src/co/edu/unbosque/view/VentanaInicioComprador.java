package co.edu.unbosque.view;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Font;
import java.awt.Image;
import java.util.Properties;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class VentanaInicioComprador extends JFrame {
	private JLabel fondoComprador;
	private PanelCentralComprador panelCentral;
	private JButton btnVolver;
	private Properties prop;
	private JLabel texto0;
	private JLabel texto1;
	private JLabel texto2;
	private ImageIcon fondo;
	private Image escalar;

	public VentanaInicioComprador() {
		prop = new Properties();
		inicializarComponentes();
	}

	public void inicializarComponentes() {
		this.setBounds(10, 10, 1280, 755);
		this.setTitle("Inicio de sesion comprador");
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		this.setResizable(false);
		this.setLocationRelativeTo(null);

		fondo = new ImageIcon("src/co/edu/unbosque/view/InicioSesion.PNG");
		escalar = fondo.getImage().getScaledInstance(1280, 720, Image.SCALE_SMOOTH);
		fondoComprador = new JLabel(new ImageIcon(escalar));
		fondoComprador.setBounds(0, 0, 1280, 720);
		this.setContentPane(fondoComprador);
		fondoComprador.setLayout(null);

		texto0 = new JLabel("");
		texto0.setFont(new Font("Arial Rounded MT Bold", Font.BOLD, 60));
		texto0.setBounds(260, 80, 1200, 70);
		fondoComprador.add(texto0);

		texto1 = new JLabel("");
		texto1.setFont(new Font("Arial Rounded MT Bold", Font.BOLD, 60));
		texto1.setBounds(40, 270, 1200, 70);
		fondoComprador.add(texto1);

		texto2 = new JLabel("");
		texto2.setFont(new Font("Arial Rounded MT Bold", Font.BOLD, 60));
		texto2.setBounds(40, 370, 1200, 70);
		fondoComprador.add(texto2);

		panelCentral = new PanelCentralComprador();
		panelCentral.setBounds(600, 200, 620, 500);
		panelCentral.setOpaque(false);
		fondoComprador.add(panelCentral);

		btnVolver = new JButton("");
		btnVolver.setFont(new Font("Arial Rounded MT Bold", Font.BOLD, 30));
		btnVolver.setBounds(20, 620, 200, 50);
		btnVolver.setBackground(new Color(254, 230, 1));
		btnVolver.setForeground(Color.WHITE);
		btnVolver.setFocusPainted(false);
		btnVolver.setBorderPainted(false);
		fondoComprador.add(btnVolver);


	}

	public void aplicarTexto() {
		texto0.setText(prop.getProperty("mercadolibre.ventanainiciocomprador.texto0"));
		texto1.setText(prop.getProperty("mercadolibre.ventanainiciocomprador.texto1"));
		texto2.setText(prop.getProperty("mercadolibre.ventanainiciocomprador.texto2"));
		btnVolver.setText(prop.getProperty("mercadolibre.ventanainiciocomprador.btnvolver"));

	}

	public JLabel getFondoComprador() {
		return fondoComprador;
	}

	public void setFondoComprador(JLabel fondoComprador) {
		this.fondoComprador = fondoComprador;
	}

	public PanelCentralComprador getPanelCentral() {
		return panelCentral;
	}

	public void setPanelCentral(PanelCentralComprador panelCentral) {
		this.panelCentral = panelCentral;
	}

	public JButton getBtnVolver() {
		return btnVolver;
	}

	public void setBtnVolver(JButton btnVolver) {
		this.btnVolver = btnVolver;
	}

	public Properties getProp() {
		return prop;
	}

	public void setProp(Properties prop) {
		this.prop = prop;
		aplicarTexto();
	}

	public JLabel getTexto0() {
		return texto0;
	}

	public void setTexto0(JLabel texto0) {
		this.texto0 = texto0;
	}

	public JLabel getTexto1() {
		return texto1;
	}

	public void setTexto1(JLabel texto1) {
		this.texto1 = texto1;
	}

	public JLabel getTexto2() {
		return texto2;
	}

	public void setTexto2(JLabel texto2) {
		this.texto2 = texto2;
	}

}
