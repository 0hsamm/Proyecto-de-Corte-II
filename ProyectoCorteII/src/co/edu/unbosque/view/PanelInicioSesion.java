package co.edu.unbosque.view;

import java.awt.Color;
import java.awt.Font;
import java.awt.TextField;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class PanelInicioSesion extends JPanel{
	private JLabel labelUsuario;
	private TextField textUsuario;
	private JLabel labelContrasena;
	private TextField textContrasena;
	private JButton btnIniciarSesion;
	private JButton btnRegistro;
	private JButton btnVolver;
	
	public PanelInicioSesion() {
		inicializarComponentes();
	}
	
	public void inicializarComponentes() {
		this.setLayout(null);
	
        labelUsuario = new JLabel("Usuario:");
        labelUsuario.setFont(new Font("Arial Rounded MT Bold", Font.BOLD, 30));
        labelUsuario.setBounds(540, 200, 140, 30);
        this.add(labelUsuario);

        
        textUsuario = new TextField();
        textUsuario.setBounds(540, 240, 200, 30);
        this.add(textUsuario);

        labelContrasena = new JLabel("Contraseña:");
        labelContrasena.setFont(new Font("Arial Rounded MT Bold", Font.BOLD, 30));
        labelContrasena.setBounds(540, 300, 200, 30);
        this.add(labelContrasena);

        textContrasena = new TextField();
        textContrasena.setBounds(540, 340, 200, 30);
        this.add(textContrasena);
		
		btnIniciarSesion = new JButton("Iniciar sesion");
		btnIniciarSesion.setFont(new Font("Arial Rounded MT Bold", Font.BOLD, 30));
		btnIniciarSesion.setBounds(490, 400, 300, 30);
		btnIniciarSesion.setBackground(new Color(254, 230, 1));
		btnIniciarSesion.setForeground(Color.WHITE);
		btnIniciarSesion.setFocusPainted(false);
		btnIniciarSesion.setBorderPainted(false);
		this.add(btnIniciarSesion);
		
		btnRegistro = new JButton("¿No tienes cuenta? Crea una aqui.");
		btnRegistro.setFont(new Font("Arial Rounded MT Bold", Font.BOLD, 20));
		btnRegistro.setBounds(440, 450, 400, 20);
		btnRegistro.setBackground(Color.white);
		btnRegistro.setForeground(Color.CYAN);
		btnRegistro.setFocusPainted(false);
		btnRegistro.setBorderPainted(false);
		this.add(btnRegistro);
		
		btnVolver = new JButton("Volver");
		btnVolver.setFont(new Font("Arial Rounded MT Bold", Font.BOLD, 40));
		btnVolver.setBounds(27, 620, 200, 50);
		btnVolver.setBackground(new Color(254, 230, 1));
		btnVolver.setForeground(Color.WHITE);
		btnVolver.setFocusPainted(false);
		btnVolver.setBorderPainted(false);
		this.add(btnVolver);
		

	}

	public JLabel getLabelUsuario() {
		return labelUsuario;
	}

	public void setLabelUsuario(JLabel labelUsuario) {
		this.labelUsuario = labelUsuario;
	}

	public TextField getTextUsuario() {
		return textUsuario;
	}

	public void setTextUsuario(TextField textUsuario) {
		this.textUsuario = textUsuario;
	}

	public JLabel getLabelContrasena() {
		return labelContrasena;
	}

	public void setLabelContrasena(JLabel labelContrasena) {
		this.labelContrasena = labelContrasena;
	}

	public TextField getTextContrasena() {
		return textContrasena;
	}

	public void setTextContrasena(TextField textContrasena) {
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

	public JButton getBtnVolver() {
		return btnVolver;
	}

	public void setBtnVolver(JButton btnVolver) {
		this.btnVolver = btnVolver;
	}
	
	
}
