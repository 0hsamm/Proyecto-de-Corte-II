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
 * Representa la ventana principal del menú de la aplicación.
 * Contiene los botones para iniciar sesión, cambiar el lenguaje y salir,
 * además de etiquetas de texto configurables mediante propiedades.
 */
public class VentanaMenu extends JFrame {

	private JLabel fondoMenu;
	private JButton btnSalir;
	private JButton btnIniciar;
	private JButton btnLenguaje;

	private Properties prop;
	private JLabel texto;
	private JLabel texto1;
	private JLabel texto2;
	private JLabel texto3;
	private JLabel texto4;
	private JLabel texto5;
	private JLabel texto6;
	private ImageIcon fondo;
	private Image escalar;
	
	/**
	 * Crea una nueva instancia de la ventana de menú
	 * e inicializa sus componentes.
	 */
	public VentanaMenu() {
		prop = new Properties();
		inicializarComponentes();
	}

	/**
	 * Inicializa los componentes gráficos de la ventana, incluyendo
	 * el fondo, las etiquetas de texto y los botones principales.
	 */
	public void inicializarComponentes() {

		this.setBounds(10, 10, 1300, 755);
		this.setTitle("Menu Principal");
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		this.setLayout(null);
		this.setResizable(false);
		this.setLocationRelativeTo(null);

		fondo = new ImageIcon("src/co/edu/unbosque/view/VentanaMenu.PNG");
		escalar = fondo.getImage().getScaledInstance(1280, 720, Image.SCALE_SMOOTH);
		fondoMenu = new JLabel(new ImageIcon(escalar));
		fondoMenu.setBounds(0, 0, 1280, 720);
		this.add(fondoMenu);

		texto = new JLabel();
		texto.setFont(new Font("Arial Rounded MT Bold", Font.BOLD, 60));
		texto.setBounds(260, 80, 1200, 70);
		fondoMenu.add(texto);

		texto1 = new JLabel();
		texto1.setFont(new Font("SansSerif", Font.BOLD, 60));
		texto1.setBounds(600, 263, 1000, 70);
		fondoMenu.add(texto1);

		texto2 = new JLabel();
		texto2.setFont(new Font("SansSerif", Font.ITALIC, 45));
		texto2.setBounds(600, 320, 1000, 70);
		fondoMenu.add(texto2);

		texto3 = new JLabel();
		texto3.setFont(new Font("SansSerif", Font.ITALIC, 45));
		texto3.setBounds(600, 373, 1000, 70);
		fondoMenu.add(texto3);

		texto4 = new JLabel();
		texto4.setFont(new Font("SansSerif", Font.ITALIC, 45));
		texto4.setBounds(600, 430, 1000, 70);
		fondoMenu.add(texto4);

		texto5 = new JLabel();
		texto5.setFont(new Font("SansSerif", Font.ITALIC, 45));
		texto5.setBounds(600, 483, 1000, 70);
		fondoMenu.add(texto5);

		texto6 = new JLabel();
		texto6.setFont(new Font("SansSerif", Font.ITALIC, 45));
		texto6.setBounds(600, 540, 1000, 70);
		fondoMenu.add(texto6);

		btnIniciar = new JButton();
		btnIniciar.setFont(new Font("Arial Rounded MT Bold", Font.BOLD, 50));
		btnIniciar.setBounds(120, 263, 280, 60);
		btnIniciar.setBackground(new Color(254, 230, 1));
		btnIniciar.setForeground(Color.WHITE);
		btnIniciar.setFocusPainted(false);
		btnIniciar.setBorderPainted(false);
		fondoMenu.add(btnIniciar);

		btnLenguaje = new JButton();
		btnLenguaje.setFont(new Font("Arial Rounded MT Bold", Font.BOLD, 50));
		btnLenguaje.setBounds(120, 263, 280, 60);
		btnLenguaje.setBackground(new Color(254, 230, 1));
		btnLenguaje.setForeground(Color.WHITE);
		btnLenguaje.setFocusPainted(false);
		btnLenguaje.setBorderPainted(false);
		fondoMenu.add(btnLenguaje);

		btnSalir = new JButton();
		btnSalir.setFont(new Font("Arial Rounded MT Bold", Font.BOLD, 40));
		btnSalir.setBounds(100, 580, 150, 50);
		btnSalir.setBackground(new Color(254, 230, 1));
		btnSalir.setForeground(Color.WHITE);
		btnSalir.setFocusPainted(false);
		btnSalir.setBorderPainted(false);
		fondoMenu.add(btnSalir);
	}
	
	/**
	 * Aplica los textos a los componentes de la ventana utilizando
	 * los valores definidos en el archivo de propiedades.
	 */
	public void aplicarTexto() {
		texto.setText(prop.getProperty("mercadolibre.ventanamenu.texto0"));
		texto1.setText(prop.getProperty("mercadolibre.ventanamenu.texto1"));
		texto2.setText(prop.getProperty("mercadolibre.ventanamenu.texto2"));
		texto3.setText(prop.getProperty("mercadolibre.ventanamenu.texto3"));
		texto4.setText(prop.getProperty("mercadolibre.ventanamenu.texto4"));
		texto5.setText(prop.getProperty("mercadolibre.ventanamenu.texto5"));
		texto6.setText(prop.getProperty("mercadolibre.ventanamenu.texto6"));
		btnIniciar.setText(prop.getProperty("mercadolibre.ventanamenu.btniniciar"));
		btnLenguaje.setText(prop.getProperty("mercadolibre.ventanamenu.btniniciar"));
		btnSalir.setText(prop.getProperty("mercadolibre.ventanamenu.btnsalir"));
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

	public JButton getBtnLenguaje() {
		return btnLenguaje;
	}

	public void setBtnLenguaje(JButton btnLenguaje) {
		this.btnLenguaje = btnLenguaje;
	}

	public Properties getProp() {
		return prop;
	}

	public void setProp(Properties prop) {
		this.prop = prop;
		aplicarTexto();
	}

	public JLabel getTexto() {
		return texto;
	}

	public void setTexto(JLabel texto) {
		this.texto = texto;
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

	public JLabel getTexto3() {
		return texto3;
	}

	public void setTexto3(JLabel texto3) {
		this.texto3 = texto3;
	}

	public JLabel getTexto4() {
		return texto4;
	}

	public void setTexto4(JLabel texto4) {
		this.texto4 = texto4;
	}

	public JLabel getTexto5() {
		return texto5;
	}

	public void setTexto5(JLabel texto5) {
		this.texto5 = texto5;
	}

	public JLabel getTexto6() {
		return texto6;
	}

	public void setTexto6(JLabel texto6) {
		this.texto6 = texto6;
	}

}
