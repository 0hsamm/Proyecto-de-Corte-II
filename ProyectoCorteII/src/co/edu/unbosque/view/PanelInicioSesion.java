package co.edu.unbosque.view;

import java.awt.Color;
import java.awt.Font;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

public class PanelInicioSesion extends JPanel {
	private JLabel labelUsuario;
	private JTextField textUsuario;
	private JLabel labelContrasena;
	private JPasswordField textContrasena;
	private JButton btnIniciarSesion;
	private JButton btnRegistro;

	public PanelInicioSesion() {
		inicializarComponentes();
	}

	public void inicializarComponentes() {

		this.setBounds(0, 0, 1280, 720);
		this.setLayout(null);
		this.setOpaque(false);

		labelUsuario = new JLabel("Usuario");
		labelUsuario.setFont(new Font("Arial Rounded MT Bold", Font.BOLD, 30));
		labelUsuario.setBounds(209, 130, 200, 35);
		this.add(labelUsuario);

		textUsuario = new JTextField();
		textUsuario.setFont(new Font("Arial Rounded MT Bold", Font.BOLD, 25));
		textUsuario.setBounds(170, 170, 345, 70);
		textUsuario.setBorder(null);
		this.add(textUsuario);

		labelContrasena = new JLabel("Contraseña");
		labelContrasena.setFont(new Font("Arial Rounded MT Bold", Font.BOLD, 30));
		labelContrasena.setBounds(209, 260, 200, 35);
		this.add(labelContrasena);

		textContrasena = new JPasswordField();
		textContrasena.setFont(new Font("Arial Rounded MT Bold", Font.BOLD, 25));
		textContrasena.setBounds(170, 305,  345, 70);
		textContrasena.setBorder(null);
		this.add(textContrasena);

		btnIniciarSesion = new JButton("Iniciar sesión");
		btnIniciarSesion.setFont(new Font("Arial Rounded MT Bold", Font.BOLD, 25));
		btnIniciarSesion.setBounds(209, 393, 200, 35);
		btnIniciarSesion.setBackground(new Color(41, 47, 117));
		btnIniciarSesion.setForeground(Color.WHITE);
		btnIniciarSesion.setFocusPainted(false);
		btnIniciarSesion.setBorderPainted(false);
		this.add(btnIniciarSesion);

		btnRegistro = new JButton("¿No tienes cuenta? Crea una aquí.");
		btnRegistro.setFont(new Font("Arial Rounded MT Bold", Font.BOLD, 18));
		btnRegistro.setBounds(100, 457, 400, 30);
		btnRegistro.setBackground(new Color(41, 47, 117));
		btnRegistro.setForeground(Color.WHITE);
		btnRegistro.setFocusPainted(false);
		btnRegistro.setBorderPainted(false);
		this.add(btnRegistro);

	}

	public JLabel getLabelUsuario() {
		return labelUsuario;
	}

	public void setLabelUsuario(JLabel labelUsuario) {
		this.labelUsuario = labelUsuario;
	}

	public JTextField getTextUsuario() {
		return textUsuario;
	}

	public void setTextUsuario(JTextField textUsuario) {
		this.textUsuario = textUsuario;
	}

	public JLabel getLabelContrasena() {
		return labelContrasena;
	}

	public void setLabelContrasena(JLabel labelContrasena) {
		this.labelContrasena = labelContrasena;
	}

	public JPasswordField getTextContrasena() {
		return textContrasena;
	}

	public void setTextContrasena(JPasswordField textContrasena) {
		this.textContrasena = textContrasena;
	}

	public JButton getBtnIniciarSesion() {
		return btnIniciarSesion;
	}

	public void setBtnIniciarSesion(JButton btnIniciarSesion) {
		this.btnIniciarSesion = btnIniciarSesion;
	}

	public JButton getBtnRegistro() {
		return btnRegistro;
	}

	public void setBtnRegistro(JButton btnRegistro) {
		this.btnRegistro = btnRegistro;
	}

}
