package co.edu.unbosque.view;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Properties;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

import co.edu.unbosque.util.exception.InvalidEmailException;
import co.edu.unbosque.util.exception.InvalidIDException;
import co.edu.unbosque.util.exception.InvalidPasswordException;
import co.edu.unbosque.util.exception.InvalidPhoneException;
import co.edu.unbosque.util.exception.LanzadorDeExcepcion;

public class PanelRegistro extends JPanel {

	private JLabel lblValidarUsuario;
	private JLabel lblValidarTelefono;
	private JLabel lblValidarContrasena;
	private JLabel lblValidarCorreo;
	private JLabel lblValidarID;
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
	private String correo;
	private String iD;
	private String contrasena;
	private String telefono;
	private String usuario;
	private Properties prop;

	public PanelRegistro() {
		prop = new Properties();
		inicializarComponentes();
		inicializarEventos();

	}

	public void inicializarComponentes() {
		this.setBounds(0, 0, 1280, 720);
		this.setLayout(null);
		this.setOpaque(false);

		labelCorreo = new JLabel();
		labelCorreo.setFont(new Font("Arial Rounded MT Bold", Font.BOLD, 20));
		labelCorreo.setBounds(26, 78, 200, 40);
		this.add(labelCorreo);

		textCorreo = new JTextField();
		textCorreo.setFont(new Font("Arial Rounded MT Bold", Font.BOLD, 20));
		textCorreo.setBounds(196, 78, 260, 40);
		textCorreo.setBorder(null);
		this.add(textCorreo);

		lblValidarCorreo = new JLabel();
		lblValidarCorreo.setForeground(Color.red);
		lblValidarCorreo.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 18));
		lblValidarCorreo.setBounds(196, 123, 260, 25);
		this.add(lblValidarCorreo);

		labelUsuario = new JLabel();
		labelUsuario.setFont(new Font("Arial Rounded MT Bold", Font.BOLD, 20));
		labelUsuario.setBounds(26, 149, 200, 40);
		this.add(labelUsuario);

		textUsuario = new JTextField();
		textUsuario.setFont(new Font("Arial Rounded MT Bold", Font.BOLD, 20));
		textUsuario.setBounds(196, 149, 260, 40);
		textUsuario.setBorder(null);
		this.add(textUsuario);

		lblValidarUsuario = new JLabel();
		lblValidarUsuario.setForeground(Color.red);
		lblValidarUsuario.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 18));
		lblValidarUsuario.setBounds(196, 191, 300, 25);
		this.add(lblValidarUsuario);


		labelTelefono = new JLabel();
		labelTelefono.setFont(new Font("Arial Rounded MT Bold", Font.BOLD, 20));
		labelTelefono.setBounds(26, 220, 200, 40);
		this.add(labelTelefono);

		textTelefono = new JTextField();
		textTelefono.setFont(new Font("Arial Rounded MT Bold", Font.BOLD, 20));
		textTelefono.setBounds(196, 220, 260, 40);
		textTelefono.setBorder(null);
		this.add(textTelefono);

		lblValidarTelefono = new JLabel();
		lblValidarTelefono.setForeground(Color.red);
		lblValidarTelefono.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 18));
		lblValidarTelefono.setBounds(196, 262, 300, 25);
		this.add(lblValidarTelefono);


		labelID = new JLabel();
		labelID.setFont(new Font("Arial Rounded MT Bold", Font.BOLD, 20));
		labelID.setBounds(26, 289, 200, 40);
		this.add(labelID);

		textID = new JTextField();
		textID.setFont(new Font("Arial Rounded MT Bold", Font.BOLD, 20));
		textID.setBounds(196, 289, 260, 40);
		textID.setBorder(null);
		this.add(textID);

		lblValidarID = new JLabel();
		lblValidarID.setForeground(Color.red);
		lblValidarID.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 18));
		lblValidarID.setBounds(196, 330, 300, 25);
		this.add(lblValidarID);

		labelContrasena = new JLabel();
		labelContrasena.setFont(new Font("Arial Rounded MT Bold", Font.BOLD, 20));
		labelContrasena.setBounds(26, 357, 200, 40);
		this.add(labelContrasena);

		textContrasena = new JTextField();
		textContrasena.setFont(new Font("Arial Rounded MT Bold", Font.BOLD, 20));
		textContrasena.setBounds(196, 357, 260, 40);
		textContrasena.setBorder(null);
		this.add(textContrasena);

		lblValidarContrasena = new JLabel();
		lblValidarContrasena.setForeground(Color.red);
		lblValidarContrasena.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 18));
		lblValidarContrasena.setBounds(196, 402, 300, 25);
		this.add(lblValidarContrasena);

		btnCrear = new JButton();
		btnCrear.setFont(new Font("Arial Rounded MT Bold", Font.BOLD, 30));
		btnCrear.setBounds(153, 458, 350, 32);
		btnCrear.setBackground(new Color(41, 47, 117));
		btnCrear.setForeground(Color.WHITE);
		btnCrear.setFocusPainted(false);
		btnCrear.setBorder(null);
		this.add(btnCrear);

	

		
	}
	
	

	public void inicializarEventos() {
		lblValidarCorreo.setText("");
		lblValidarContrasena.setText("");
		lblValidarID.setText("");
		lblValidarTelefono.setText("");
		lblValidarUsuario.setText("");

		btnCrear.addActionListener(e -> {
			correo = textCorreo.getText().trim();
			iD = textID.getText().trim();
			contrasena = textContrasena.getText().trim();
			telefono = textTelefono.getText().trim();
			usuario = textUsuario.getText().trim();


			// --- Validación correo ---
			if (correo.isEmpty()) {
				lblValidarCorreo.setText(prop.getProperty("mercadolibre.panelregistro.textovacio"));

			} else {
				try {
					LanzadorDeExcepcion.verificarEmail(correo);
					lblValidarCorreo.setText(""); 
				} catch (InvalidEmailException e1) {
					lblValidarCorreo.setText(e1.getMessage());

				}
			}

			// --- Validación ID ---
			if (iD.isEmpty()) {
				lblValidarID.setText(prop.getProperty("mercadolibre.panelregistro.textovacio"));

			} else {
				try {
					LanzadorDeExcepcion.verificarID(iD);
					lblValidarID.setText("");
				} catch (InvalidIDException e1) {
					lblValidarID.setText(e1.getMessage());

				}
			}

			// --- Validación contraseña ---
			if (contrasena.isEmpty()) {
				lblValidarContrasena.setText(prop.getProperty("mercadolibre.panelregistro.textovacio"));

			} else {
				try {
					LanzadorDeExcepcion.verificarTamanoContrasena(contrasena);
					lblValidarContrasena.setText("");
				} catch (InvalidPasswordException e1) {
					lblValidarContrasena.setText(e1.getMessage());

				}
			}
			//--- Validación teléfono ---
			if(telefono.isEmpty()) {
				lblValidarTelefono.setText(prop.getProperty("mercadolibre.panelregistro.textovacio"));
			}else {
				try {
					LanzadorDeExcepcion.verificarTelefono(telefono);
					lblValidarTelefono.setText("");
				} catch (InvalidPhoneException e1) {
					lblValidarTelefono.setText(e1.getMessage());
				}
			}

			// --- Validación usuario ---
			if(usuario.isEmpty()) {
				lblValidarUsuario.setText(prop.getProperty("mercadolibre.panelregistro.textovacio"));
			}else {
				lblValidarUsuario.setText("");
			}
			
		});
	}

	public void aplicarTexto() {
		labelCorreo.setText(prop.getProperty("mercadolibre.panelregistro.labelcorreo"));
		labelUsuario.setText(prop.getProperty("mercadolibre.panelregistro.labelusuario"));
		labelTelefono.setText(prop.getProperty("mercadolibre.panelregistro.labeltelefono"));
		labelID.setText(prop.getProperty("mercadolibre.panelregistro.labelid"));
		labelContrasena.setText(prop.getProperty("mercadolibre.panelregistro.labelcontrasena"));
		btnCrear.setText(prop.getProperty("mercadolibre.panelregistro.btncrear"));

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

	public JLabel getLblValidarContrasena() {
		return lblValidarContrasena;
	}

	public void setLblValidarContrasena(JLabel lblValidarContrasena) {
		this.lblValidarContrasena = lblValidarContrasena;
	}

	public JLabel getLblValidarCorreo() {
		return lblValidarCorreo;
	}

	public void setLblValidarCorreo(JLabel lblValidarCorreo) {
		this.lblValidarCorreo = lblValidarCorreo;
	}

	public JLabel getLblValidarID() {
		return lblValidarID;
	}

	public void setLblValidarID(JLabel lblValidarID) {
		this.lblValidarID = lblValidarID;
	}

	public String getCorreo() {
		return correo;
	}

	public void setCorreo(String correo) {
		this.correo = correo;
	}

	public String getiD() {
		return iD;
	}

	public void setiD(String iD) {
		this.iD = iD;
	}

	public String getContrasena() {
		return contrasena;
	}

	public void setContrasena(String contrasena) {
		this.contrasena = contrasena;
	}

	public JLabel getLblValidarUsuario() {
		return lblValidarUsuario;
	}

	public void setLblValidarUsuario(JLabel lblValidarUsuario) {
		this.lblValidarUsuario = lblValidarUsuario;
	}

	public JLabel getLblValidarTelefono() {
		return lblValidarTelefono;
	}

	public void setLblValidarTelefono(JLabel lblValidarTelefono) {
		this.lblValidarTelefono = lblValidarTelefono;
	}

	public String getTelefono() {
		return telefono;
	}

	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}

	public String getUsuario() {
		return usuario;
	}

	public void setUsuario(String usuario) {
		this.usuario = usuario;
	}

	public Properties getProp() {
		return prop;
	}

	public void setProp(Properties prop) {
		this.prop = prop;
		aplicarTexto();
	}

}
