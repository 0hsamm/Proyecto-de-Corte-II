package co.edu.unbosque.view;

import java.awt.Color;
import java.awt.Font;
import java.awt.Image;
import java.util.Properties;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

/**
 * Ventana que permite al usuario elegir si desea iniciar sesión como comprador
 * o como vendedor. Incluye botones de selección y un botón para volver al menú
 * anterior, con textos configurables mediante propiedades.
 */
public class VentanaOpcionInicioSesion extends JFrame{
	
	private JLabel fondoCV;
	private JButton btnEsComprador;
	private JButton btnEsVendedor;
	private JButton btnVolver;
	private Properties prop;
	private JLabel texto0;
	private JLabel texto1;
	private ImageIcon fondo;
	private Image escalar;
	
	/**
	 * Construye una nueva ventana de opción de inicio de sesión e inicializa
	 * sus componentes gráficos.
	 */
	public VentanaOpcionInicioSesion() {
		prop = new Properties();
		inicializarComponentes();
	}
	
	/**
	 * Inicializa los componentes de la interfaz gráfica, incluyendo el fondo,
	 * las etiquetas y los botones de interacción.
	 */
	public void inicializarComponentes() {
		
		this.setBounds(10, 10, 1280, 755);
		this.setTitle("OpcionInicioSesion");
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		this.setLayout(null);
		this.setResizable(false);
		this.setLocationRelativeTo(null);
		
		fondo = new ImageIcon("src/co/edu/unbosque/view/VentanaCV.PNG");
		escalar = fondo.getImage().getScaledInstance(1280, 720, Image.SCALE_SMOOTH);
		fondoCV = new JLabel(new ImageIcon(escalar));
		fondoCV.setBounds(0, 0, 1280, 720);
		this.add(fondoCV);
		
		texto0 = new JLabel();
		texto0.setFont(new Font("Arial Rounded MT Bold", Font.BOLD, 70));
		texto0.setBounds(260, 80, 1200, 70);
		fondoCV.add(texto0);
		
		texto1 = new JLabel();
		texto1.setFont(new Font("Arial Rounded MT Bold", Font.BOLD, 40));
		texto1.setBounds(320, 250, 1200, 70);
		fondoCV.add(texto1);
		
		btnEsComprador = new JButton();
		btnEsComprador.setFont(new Font("Arial Rounded MT Bold", Font.BOLD, 60));
		btnEsComprador.setBounds(95, 420, 400, 60);
		btnEsComprador.setBackground(new Color(254, 230, 1));
		btnEsComprador.setForeground(Color.WHITE);
		btnEsComprador.setFocusPainted(false);
		btnEsComprador.setBorderPainted(false);
		fondoCV.add(btnEsComprador);
		
		btnEsVendedor = new JButton();
		btnEsVendedor.setFont(new Font("Arial Rounded MT Bold", Font.BOLD, 60));
		btnEsVendedor.setBounds(790, 420, 400, 60);
		btnEsVendedor.setBackground(new Color(254, 230, 1));
		btnEsVendedor.setForeground(Color.WHITE);
		btnEsVendedor.setFocusPainted(false);
		btnEsVendedor.setBorderPainted(false);
		fondoCV.add(btnEsVendedor);
		
		btnVolver = new JButton();
		btnVolver.setFont(new Font("Arial Rounded MT Bold", Font.BOLD, 40));
		btnVolver.setBounds(27, 620, 200, 50);
		btnVolver.setBackground(new Color(254, 230, 1));
		btnVolver.setForeground(Color.WHITE);
		btnVolver.setFocusPainted(false);
		btnVolver.setBorderPainted(false);
		fondoCV.add(btnVolver);
	}

	/**
	 * Aplica los textos a las etiquetas y botones de la ventana utilizando los
	 * valores cargados desde el archivo de propiedades.
	 */
	public void aplicarTexto() {
		texto0.setText(prop.getProperty("mercadolibre.ventanainiciosesion.texto0"));
		texto1.setText(prop.getProperty("mercadolibre.ventanainiciosesion.texto1"));
		btnEsComprador.setText(prop.getProperty("mercadolibre.ventanainiciosesion.btnescomprador"));
		btnEsVendedor.setText(prop.getProperty("mercadolibre.ventanainiciosesion.btnesvendedor"));
		btnVolver.setText(prop.getProperty("mercadolibre.ventanainiciosesion.btnvolver"));
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
}
