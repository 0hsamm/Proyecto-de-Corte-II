package co.edu.unbosque.view;

import java.awt.Color;
import java.awt.Font;
import java.awt.TextField;
import java.util.Properties;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class PanelEliminar extends JPanel {
	private JComboBox<String> listaCategorias;
	private JLabel labelEliminar;
	private JLabel labelNombre;
	private TextField textoNombre;
	private JButton btnEliminar;
	private Properties prop;
	
	public PanelEliminar() {
		prop = new Properties();
		inicializarComponentes();
	}
	
	public void inicializarComponentes() {
		this.setLayout(null);
		
		labelEliminar = new JLabel();
		labelEliminar.setFont(new Font("Arial Rounded MT Bold", Font.BOLD, 30));
		labelEliminar.setBounds(30, 5, 340, 25);
		this.add(labelEliminar);
		
		listaCategorias = new JComboBox<>();
		
		listaCategorias.setBounds(10, 40, 250, 30);
		this.add(listaCategorias);
		
		labelNombre = new JLabel();
		labelNombre.setFont(new Font("Arial Rounded MT Bold", Font.BOLD, 20));
		labelNombre.setBounds(10, 80, 550, 30);
		this.add(labelNombre);
		
		textoNombre = new TextField();
		textoNombre.setBounds(560, 80, 250, 30);
		this.add(textoNombre);
		
		btnEliminar = new JButton();
		btnEliminar.setFont(new Font("Arial Rounded MT Bold", Font.BOLD, 30));
		btnEliminar.setBounds(230, 350, 300, 50);
		btnEliminar.setBackground(new Color(254, 230, 1));
		btnEliminar.setForeground(Color.WHITE);
		btnEliminar.setFocusPainted(false);
		btnEliminar.setBorderPainted(false);
		this.add(btnEliminar);
	}
	
	public void aplicarTexto() {
		labelEliminar.setText(prop.getProperty("mercadolibre.paneleliminar.labeleliminar"));
		listaCategorias.addItem(prop.getProperty("mercadolibre.paneleliminar.combobox.seleccionar"));
		listaCategorias.addItem(prop.getProperty("mercadolibre.paneleliminar.combobox.accesoriovehiculo"));
		listaCategorias.addItem(prop.getProperty("mercadolibre.paneleliminar.combobox.electrodomestico"));
		listaCategorias.addItem(prop.getProperty("mercadolibre.paneleliminar.combobox.equipodeportivo"));
		listaCategorias.addItem(prop.getProperty("mercadolibre.paneleliminar.combobox.herramienta"));
		listaCategorias.addItem(prop.getProperty("mercadolibre.paneleliminar.combobox.inmueble"));
		listaCategorias.addItem(prop.getProperty("mercadolibre.paneleliminar.combobox.juguete"));
		listaCategorias.addItem(prop.getProperty("mercadolibre.paneleliminar.combobox.prendavestir"));
		listaCategorias.addItem(prop.getProperty("mercadolibre.paneleliminar.combobox.productofarmaceutico"));
		listaCategorias.addItem(prop.getProperty("mercadolibre.paneleliminar.combobox.productosostenible"));
		listaCategorias.addItem(prop.getProperty("mercadolibre.paneleliminar.combobox.tecnologia"));
		labelNombre.setText(prop.getProperty("mercadolibre.paneleliminar.labelnombre"));
		btnEliminar.setText(prop.getProperty("mercadolibre.paneleliminar.btneliminar"));

	}

	public JComboBox<String> getListaCategorias() {
		return listaCategorias;
	}

	public void setListaCategorias(JComboBox<String> listaCategorias) {
		this.listaCategorias = listaCategorias;
	}

	public JLabel getLabelEliminar() {
		return labelEliminar;
	}

	public void setLabelEliminar(JLabel labelEliminar) {
		this.labelEliminar = labelEliminar;
	}

	public JLabel getLabelNombre() {
		return labelNombre;
	}

	public void setLabelNombre(JLabel labelNombre) {
		this.labelNombre = labelNombre;
	}

	public TextField getTextoNombre() {
		return textoNombre;
	}

	public void setTextoNombre(TextField textoNombre) {
		this.textoNombre = textoNombre;
	}

	public JButton getBtnEliminar() {
		return btnEliminar;
	}

	public void setBtnEliminar(JButton btnEliminar) {
		this.btnEliminar = btnEliminar;
	}

	public Properties getProp() {
		return prop;
	}

	public void setProp(Properties prop) {
		this.prop = prop;
		aplicarTexto();
	}
	
}
