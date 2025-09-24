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
 * Ventana destinada al registro de un vendedor en la aplicación.
 * Contiene un formulario de registro y botones de navegación,
 * con textos configurables mediante un archivo de propiedades.
 */
public class VentanaRegistroVendedor extends JFrame {
	
	private JLabel fondoVendedor;
	private PanelRegistro panelRegistro;
	private JButton btnVolver;
	private JButton btnMenu;
	private JLabel texto0;
	private JLabel texto1;
	private JLabel texto2;
	private Properties prop;
	private ImageIcon fondo;
	private Image escalar;
	
	/**
	 * Construye la ventana de registro del vendedor e inicializa
	 * los componentes gráficos de la interfaz.
	 */
	public VentanaRegistroVendedor() {
		prop = new Properties();
		inicializarComponentes();
	}

	/**
	 * Inicializa y configura los elementos gráficos de la ventana,
	 * incluyendo el fondo, etiquetas, formulario de registro y botones.
	 */
	public void inicializarComponentes() {
		this.setBounds(10, 10, 1280, 755);
		this.setTitle("Registro Vendedor");
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		this.setResizable(false);
		this.setLocationRelativeTo(null);

		fondo = new ImageIcon("src/co/edu/unbosque/view/VentanaRegistro.PNG");
		escalar = fondo.getImage().getScaledInstance(1280, 720, Image.SCALE_SMOOTH);
		fondoVendedor = new JLabel(new ImageIcon(escalar));
		fondoVendedor.setBounds(0, 0, 1280, 720);
		this.setContentPane(fondoVendedor);
		fondoVendedor.setLayout(null);

		texto0 = new JLabel();
		texto0.setFont(new Font("Arial Rounded MT Bold", Font.BOLD, 60));
		texto0.setBounds(260, 80, 1200, 70);
		fondoVendedor.add(texto0);

		texto1 = new JLabel();
		texto1.setFont(new Font("Arial Rounded MT Bold", Font.BOLD, 60));
		texto1.setBounds(40, 270, 1200, 70);
		fondoVendedor.add(texto1);

		texto2 = new JLabel();
		texto2.setFont(new Font("Arial Rounded MT Bold", Font.BOLD, 60));
		texto2.setBounds(40, 370, 1200, 70);
		fondoVendedor.add(texto2);

		panelRegistro = new PanelRegistro();
		panelRegistro.setBounds(600, 200, 620, 500);
		panelRegistro.setOpaque(false);
		fondoVendedor.add(panelRegistro);

		btnVolver = new JButton();
		btnVolver.setFont(new Font("Arial Rounded MT Bold", Font.BOLD, 30));
		btnVolver.setBounds(30, 620, 170, 50);
		btnVolver.setBackground(new Color(254, 230, 1));
		btnVolver.setForeground(Color.WHITE);
		btnVolver.setFocusPainted(false);
		btnVolver.setBorderPainted(false);
		fondoVendedor.add(btnVolver);

		btnMenu = new JButton();
		btnMenu.setFont(new Font("Arial Rounded MT Bold", Font.BOLD, 30));
		btnMenu.setBounds(300, 620, 170, 50);
		btnMenu.setBackground(new Color(254, 230, 1));
		btnMenu.setForeground(Color.WHITE);
		btnMenu.setFocusPainted(false);
		btnMenu.setBorderPainted(false);
		fondoVendedor.add(btnMenu);
	}

	/**
	 * Aplica los textos a los componentes de la interfaz
	 * obteniéndolos desde el archivo de propiedades cargado.
	 */
	public void aplicarTexto() {
		texto0.setText(prop.getProperty("mercadolibre.ventanaregistrovendedor.texto0"));
		texto1.setText(prop.getProperty("mercadolibre.ventanaregistrovendedor.texto1"));
		texto2.setText(prop.getProperty("mercadolibre.ventanaregistrovendedor.texto2"));
		btnVolver.setText(prop.getProperty("mercadolibre.ventanaregistrovendedor.btnvolver"));
		btnMenu.setText(prop.getProperty("mercadolibre.ventanaregistrovendedor.btnmenu"));
	}
	
	public JLabel getFondoVendedor() {
		return fondoVendedor;
	}

	public void setFondoVendedor(JLabel fondoVendedor) {
		this.fondoVendedor = fondoVendedor;
	}

	public PanelRegistro getPanelRegistro() {
		return panelRegistro;
	}

	public void setPanelRegistro(PanelRegistro panelRegistro) {
		this.panelRegistro = panelRegistro;
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

	public Properties getProp() {
		return prop;
	}

	public void setProp(Properties prop) {
		this.prop = prop;
		aplicarTexto();
	}
}

