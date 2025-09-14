package co.edu.unbosque.view;

import java.awt.Color;
import java.awt.Font;
import java.awt.Image;
import java.awt.TextField;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JComponent;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;


import co.edu.unbosque.util.exception.InvalidEmailException;
import co.edu.unbosque.util.exception.LanzadorDeExcepcion;

public class PanelRegistro extends JPanel{

	private JLabel lblValidarEmail;

	private JLabel labelCorreo;
	private JTextField textCorreo;
	

	private JLabel labelUsuario;
	private JTextField textUsuario;
	
	private JLabel labelTelefono;
	private JTextField textTelefono;
	
	private JLabel labelID;
	private JTextField textID;
	
	private JLabel labelContrasena;
	private JTextField textContrasena;
	
	private JButton btnCrear;
	



	public PanelRegistro() {
		inicializarComponentes();
		inicializarEventos();
		
	}

	public void inicializarComponentes() {
		this.setBounds(0, 0, 1280, 720);
		this.setLayout(null);
		this.setOpaque(false);


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

		labelCorreo = new JLabel("Correo");
		labelCorreo.setFont(new Font("Arial Rounded MT Bold", Font.BOLD, 20));
		labelCorreo.setBounds(35, 78, 200, 40);
		this.add(labelCorreo);


		textCorreo = new JTextField();
		textCorreo.setFont(new Font("Arial Rounded MT Bold", Font.BOLD, 20));
		textCorreo.setBounds(196, 78, 260, 40);
		textCorreo.setBorder(null);
		this.add(textCorreo);

		labelUsuario = new JLabel("Usuario");
		labelUsuario.setFont(new Font("Arial Rounded MT Bold", Font.BOLD, 20));
		labelUsuario.setBounds(35, 149, 200, 40);
		this.add(labelUsuario);

		textUsuario = new JTextField();
		textUsuario.setFont(new Font("Arial Rounded MT Bold", Font.BOLD, 20));
		textUsuario.setBounds(196, 149, 260, 40);
		textUsuario.setBorder(null);
		this.add(textUsuario);
		
		labelTelefono = new JLabel("Telefono");
		labelTelefono.setFont(new Font("Arial Rounded MT Bold", Font.BOLD, 20));
		labelTelefono.setBounds(35, 220, 200, 40);
		this.add(labelTelefono);
		
		textTelefono = new JTextField();
		textTelefono.setFont(new Font("Arial Rounded MT Bold", Font.BOLD, 20));
		textTelefono.setBounds(196, 220, 260, 40);
		textTelefono.setBorder(null);
		this.add(textTelefono);
		
		labelID = new JLabel("ID");
		labelID.setFont(new Font("Arial Rounded MT Bold", Font.BOLD, 20));
		labelID.setBounds(35, 289, 200, 40);
		this.add(labelID);
		
		textID = new JTextField();
		textID.setFont(new Font("Arial Rounded MT Bold", Font.BOLD, 20));
		textID.setBounds(196, 289, 260, 40);
		textID.setBorder(null);
		this.add(textID);

		labelContrasena = new JLabel("Contraseña");
		labelContrasena.setFont(new Font("Arial Rounded MT Bold", Font.BOLD, 20));
		labelContrasena.setBounds(35, 357, 200, 40);
		this.add(labelContrasena);

		textContrasena = new JTextField();
		textContrasena.setFont(new Font("Arial Rounded MT Bold", Font.BOLD, 20));
		textContrasena.setBounds(196, 357, 260, 40);
		textContrasena.setBorder(null);
		this.add(textContrasena);

		btnCrear = new JButton("Crear");
		btnCrear.setFont(new Font("Arial Rounded MT Bold", Font.BOLD, 30));
		btnCrear.setBounds(153, 458, 350, 32);
		btnCrear.setBackground(new Color(41, 47, 117));
		btnCrear.setForeground(Color.WHITE);
		btnCrear.setFocusPainted(false);
		btnCrear.setBorder(null);
		this.add(btnCrear);

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

	public JTextField getTextCorreo() {
		return textCorreo;
	}

	public void setTextCorreo(JTextField textCorreo) {
		this.textCorreo = textCorreo;
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

	public JLabel getLabelTelefono() {
		return labelTelefono;
	}

	public void setLabelTelefono(JLabel labelTelefono) {
		this.labelTelefono = labelTelefono;
	}

	public JTextField getTextTelefono() {
		return textTelefono;
	}

	public void setTextTelefono(JTextField textTelefono) {
		this.textTelefono = textTelefono;
	}

	public JLabel getLabelID() {
		return labelID;
	}

	public void setLabelID(JLabel labelID) {
		this.labelID = labelID;
	}

	public JTextField getTextID() {
		return textID;
	}

	public void setTextID(JTextField textID) {
		this.textID = textID;
	}

	public JLabel getLabelContrasena() {
		return labelContrasena;
	}

	public void setLabelContrasena(JLabel labelContrasena) {
		this.labelContrasena = labelContrasena;
	}

	public JTextField getTextContrasena() {
		return textContrasena;
	}

	public void setTextContrasena(JTextField textContrasena) {
		this.textContrasena = textContrasena;
	}

	public JButton getBtnCrear() {
		return btnCrear;
	}

	public void setBtnCrear(JButton btnCrear) {
		this.btnCrear = btnCrear;
	}


}
