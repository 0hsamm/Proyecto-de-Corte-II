package co.edu.unbosque.view;

import java.awt.Color;
import java.awt.Font;
import java.awt.Image;
import java.util.Properties;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class VentanaCRUD extends JFrame {
	private JLabel fondoCRUD;
	private PanelCRUD panelCRUD;
	private JButton btnVolver;

	private JButton btnCrear;
	private JButton btnMostrar;
	private JButton btnActualizar;
	private JButton btnEliminar;
	private JLabel texto0;
	private Properties prop;
	private ImageIcon fondo;
	private Image escalar;
	

	public VentanaCRUD() {
		prop = new Properties();
		inicializarComponentes();
	}

	public void inicializarComponentes() {
		this.setBounds(10, 10, 1280, 755);
		this.setTitle("Funciones Artículos");
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		this.setResizable(false);
		this.setLocationRelativeTo(null);

		fondo = new ImageIcon("src/co/edu/unbosque/view/VentanaCRUD.PNG");
		escalar = fondo.getImage().getScaledInstance(1280, 720, Image.SCALE_SMOOTH);
		fondoCRUD = new JLabel(new ImageIcon(escalar));
		fondoCRUD.setBounds(0, 0, 1280, 720);
		this.setContentPane(fondoCRUD);
		fondoCRUD.setLayout(null);

		texto0 = new JLabel();
		texto0.setFont(new Font("Arial Rounded MT Bold", Font.BOLD, 60));
		texto0.setBounds(260, 80, 1200, 70);
		fondoCRUD.add(texto0);

		panelCRUD = new PanelCRUD();
		panelCRUD.setBounds(450, 200, 800, 500);
		panelCRUD.setOpaque(false);
		fondoCRUD.add(panelCRUD);

		btnCrear = new JButton();
		btnCrear.setFont(new Font("Arial Rounded MT Bold", Font.BOLD, 30));
		btnCrear.setBounds(80, 235, 300, 50);
		btnCrear.setBackground(new Color(254, 230, 1));
		btnCrear.setForeground(Color.WHITE);
		btnCrear.setFocusPainted(false);
		btnCrear.setBorderPainted(false);
		this.add(btnCrear);

		btnMostrar = new JButton();
		btnMostrar.setFont(new Font("Arial Rounded MT Bold", Font.BOLD, 30));
		btnMostrar.setBounds(80, 335, 300, 50);
		btnMostrar.setBackground(new Color(254, 230, 1));
		btnMostrar.setForeground(Color.WHITE);
		btnMostrar.setFocusPainted(false);
		btnMostrar.setBorderPainted(false);
		this.add(btnMostrar);

		btnActualizar = new JButton();
		btnActualizar.setFont(new Font("Arial Rounded MT Bold", Font.BOLD, 30));
		btnActualizar.setBounds(80, 440, 300, 50);
		btnActualizar.setBackground(new Color(254, 230, 1));
		btnActualizar.setForeground(Color.WHITE);
		btnActualizar.setFocusPainted(false);
		btnActualizar.setBorderPainted(false);
		this.add(btnActualizar);

		btnEliminar = new JButton();
		btnEliminar.setFont(new Font("Arial Rounded MT Bold", Font.BOLD, 30));
		btnEliminar.setBounds(80, 542, 300, 50);
		btnEliminar.setBackground(new Color(254, 230, 1));
		btnEliminar.setForeground(Color.WHITE);
		btnEliminar.setFocusPainted(false);
		btnEliminar.setBorderPainted(false);
		this.add(btnEliminar);

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
		texto0.setText(prop.getProperty("mercadolibre.ventanacrud.texto0"));
		btnCrear.setText(prop.getProperty("mercadolibre.ventanacrud.btncrear"));
		btnMostrar.setText(prop.getProperty("mercadolibre.ventanacrud.btnmostrar"));
		btnActualizar.setText(prop.getProperty("mercadolibre.ventanacrud.btnactualizar"));
		btnEliminar.setText(prop.getProperty("mercadolibre.ventanacrud.btneliminar"));
		btnVolver.setText(prop.getProperty("mercadolibre.ventanacrud.btnvolver"));

	}
	
	public JLabel getFondoCRUD() {
		return fondoCRUD;
	}

	public void setFondoCRUD(JLabel fondoCRUD) {
		this.fondoCRUD = fondoCRUD;
	}

	public PanelCRUD getPanelCRUD() {
		return panelCRUD;
	}

	public void setPanelCRUD(PanelCRUD panelCRUD) {
		this.panelCRUD = panelCRUD;
	}

	public JButton getBtnVolver() {
		return btnVolver;
	}

	public void setBtnVolver(JButton btnVolver) {
		this.btnVolver = btnVolver;
	}

	public JButton getBtnCrear() {
		return btnCrear;
	}

	public void setBtnCrear(JButton btnCrear) {
		this.btnCrear = btnCrear;
	}

	public JButton getBtnMostrar() {
		return btnMostrar;
	}

	public void setBtnMostrar(JButton btnMostrar) {
		this.btnMostrar = btnMostrar;
	}

	public JButton getBtnActualizar() {
		return btnActualizar;
	}

	public void setBtnActualizar(JButton btnActualizar) {
		this.btnActualizar = btnActualizar;
	}

	public JButton getBtnEliminar() {
		return btnEliminar;
	}

	public void setBtnEliminar(JButton btnEliminar) {
		this.btnEliminar = btnEliminar;
	}

	public JLabel getTexto0() {
		return texto0;
	}

	public void setTexto0(JLabel texto0) {
		this.texto0 = texto0;
	}

	public Properties getProp() {
		return prop;
	}

	public void setProp(Properties prop) {
		this.prop = prop;
		aplicarTexto();
	}

}
