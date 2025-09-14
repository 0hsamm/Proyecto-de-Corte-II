package co.edu.unbosque.view;

import java.awt.Color;
import java.awt.Font;
import java.awt.TextField;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;

import co.edu.unbosque.util.exception.InvalidEmailException;
import co.edu.unbosque.util.exception.LanzadorDeExcepcion;

public class PanelRegistro extends JPanel{

	private JLabel lblValidarEmail;
	private JLabel labelCorreo;
	private TextField textCorreo;
	private JLabel labelUsuario;
	private TextField textUsuario;
	private JLabel labelContrasena;
	private TextField textContrasena;
	private JButton btnIniciarSesion;
	private JButton btnVolver;
	
	
	
	public PanelRegistro() {
		inicializarComponentes();
		inicializarEventos();
		
	}
	
	
	
	public void inicializarComponentes() {
		this.setLayout(null);
		
		
		
        labelCorreo = new JLabel("Correo:");
        labelCorreo.setFont(new Font("Arial Rounded MT Bold", Font.BOLD, 30));
        labelCorreo.setBounds(540, 100, 140, 30);
        this.add(labelCorreo);

        textCorreo = new TextField();
        textCorreo.setBounds(540, 140, 200, 30);
        this.add(textCorreo);
        
        lblValidarEmail = new JLabel("");
        lblValidarEmail.setForeground(Color.red);
        lblValidarEmail.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 18));
        lblValidarEmail.setBounds(540, 170, 400, 30);
        this.add(lblValidarEmail);
		
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
		
		btnIniciarSesion = new JButton("Crear nuevo usuario");
		btnIniciarSesion.setFont(new Font("Arial Rounded MT Bold", Font.BOLD, 30));
		btnIniciarSesion.setBounds(465, 400, 350, 30);
		btnIniciarSesion.setBackground(new Color(254, 230, 1));
		btnIniciarSesion.setForeground(Color.WHITE);
		btnIniciarSesion.setFocusPainted(false);
		btnIniciarSesion.setBorderPainted(false);
		this.add(btnIniciarSesion);
		
		btnVolver = new JButton("Volver a inicio de sesion");
		btnVolver.setFont(new Font("Arial Rounded MT Bold", Font.BOLD, 30));
		btnVolver.setBounds(27, 620, 450, 50);
		btnVolver.setBackground(new Color(254, 230, 1));
		btnVolver.setForeground(Color.WHITE);
		btnVolver.setFocusPainted(false);
		btnVolver.setBorderPainted(false);
		this.add(btnVolver);
	}
	
	public void inicializarEventos() {
		 lblValidarEmail.setText("");
		btnIniciarSesion.addActionListener(e -> {
		    String correo = textCorreo.getText().trim();

		    if (correo.isEmpty()) {
		        lblValidarEmail.setText("");
		        return;
		    }

		    try {
		        LanzadorDeExcepcion.verificarEmail(correo);
		        
		    } catch (InvalidEmailException e1) {
		        lblValidarEmail.setText(e1.getMessage());
		    }
		});

	}

	public JLabel getLabelCorreo() {
		return labelCorreo;
	}

	public void setLabelCorreo(JLabel labelCorreo) {
		this.labelCorreo = labelCorreo;
	}

	public TextField getTextCorreo() {
		return textCorreo;
	}

	public void setTextCorreo(TextField textCorreo) {
		this.textCorreo = textCorreo;
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

	public JButton getBtnVolver() {
		return btnVolver;
	}

	public void setBtnVolver(JButton btnVolver) {
		this.btnVolver = btnVolver;
	}
	
}
