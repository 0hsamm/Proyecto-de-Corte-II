package co.edu.unbosque.view;

import java.awt.Color;
import java.awt.Font;
import java.awt.Image;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class VentanaRegistroComprador extends JFrame {
	private JLabel fondoComprador;
	private PanelRegistro panelRegistro;
	private JButton btnVolver;
	private JButton btnMenu;

	public VentanaRegistroComprador() {
		inicializarComponentes();
	}

	public void inicializarComponentes() {
		this.setBounds(10, 10, 1280, 755);
		this.setTitle("Registro Comprador");
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		this.setResizable(false);
		this.setLocationRelativeTo(null);

		ImageIcon fondo = new ImageIcon("src/co/edu/unbosque/view/VentanaRegistro.PNG");
		Image escalar = fondo.getImage().getScaledInstance(1280, 720, Image.SCALE_SMOOTH);
		fondoComprador = new JLabel(new ImageIcon(escalar));
		fondoComprador.setBounds(0, 0, 1280, 720);
		this.setContentPane(fondoComprador);
		fondoComprador.setLayout(null);
		
		JLabel texto0 = new JLabel("Registro del comprador");
		texto0.setFont(new Font("Arial Rounded MT Bold", Font.BOLD, 60));
		texto0.setBounds(260, 80, 1200, 70);
		fondoComprador.add(texto0);
		
		JLabel texto = new JLabel("Registrate");
		texto.setFont(new Font("Arial Rounded MT Bold", Font.BOLD, 60));
		texto.setBounds(40, 270, 1200, 70);
		fondoComprador.add(texto);
		
		JLabel texto2 = new JLabel("Aquí!");
		texto2.setFont(new Font("Arial Rounded MT Bold", Font.BOLD, 60));
		texto2.setBounds(40, 370, 1200, 70);
		fondoComprador.add(texto2);

		panelRegistro = new PanelRegistro();
		panelRegistro.setBounds(600, 200, 620, 500);
		panelRegistro.setOpaque(false);
		fondoComprador.add(panelRegistro);

		btnVolver = new JButton("Volver");
		btnVolver.setFont(new Font("Arial Rounded MT Bold", Font.BOLD, 30));
		btnVolver.setBounds(30, 620, 170, 50);
		btnVolver.setBackground(new Color(254, 230, 1));
		btnVolver.setForeground(Color.WHITE);
		btnVolver.setFocusPainted(false);
		btnVolver.setBorderPainted(false);
		fondoComprador.add(btnVolver);

		btnMenu = new JButton("Menú");
		btnMenu.setFont(new Font("Arial Rounded MT Bold", Font.BOLD, 30));
		btnMenu.setBounds(300, 620, 170, 50);
		btnMenu.setBackground(new Color(254, 230, 1));
		btnMenu.setForeground(Color.WHITE);
		btnMenu.setFocusPainted(false);
		btnMenu.setBorderPainted(false);
		fondoComprador.add(btnMenu);
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

}
