package co.edu.unbosque.view;


import java.util.Properties;
import java.awt.CardLayout;
import java.awt.event.ActionListener;


import javax.swing.JComboBox;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;

public class PanelMostrarComprador extends JPanel {
	private JComboBox<String> listaCategorias;
	private JTextArea verObjeto;
	private JScrollPane zonaMostrar;
	private Properties prop;
	private CardLayout cardLayout;

	public PanelMostrarComprador() {
		prop = new Properties();
		inicializarComponentes();
	}

	public void inicializarComponentes() {
		cardLayout = new CardLayout();
		this.setLayout(null);

		listaCategorias = new JComboBox<>();
		
		listaCategorias.setBounds(10, 10, 250, 30);

		this.add(listaCategorias);

		verObjeto = new JTextArea();
		verObjeto.setEditable(false);

		zonaMostrar = new JScrollPane(verObjeto);
		zonaMostrar.setBounds(10, 60, 800, 1000);
		this.add(zonaMostrar);

	}
	public void aplicarTexto() {
		listaCategorias.addItem(prop.getProperty("mercadolibre.panelmostrar.combobox.seleccionar"));
		listaCategorias.addItem(prop.getProperty("mercadolibre.panelmostrar.combobox.accesoriovehiculo"));
		listaCategorias.addItem(prop.getProperty("mercadolibre.panelmostrar.combobox.electrodomestico"));
		listaCategorias.addItem(prop.getProperty("mercadolibre.panelmostrar.combobox.equipodeportivo"));
		listaCategorias.addItem(prop.getProperty("mercadolibre.panelmostrar.combobox.herramienta"));
		listaCategorias.addItem(prop.getProperty("mercadolibre.panelmostrar.combobox.inmueble"));
		listaCategorias.addItem(prop.getProperty("mercadolibre.panelmostrar.combobox.juguete"));
		listaCategorias.addItem(prop.getProperty("mercadolibre.panelmostrar.combobox.prendavestir"));
		listaCategorias.addItem(prop.getProperty("mercadolibre.panelmostrar.combobox.productofarmaceutico"));
		listaCategorias.addItem(prop.getProperty("mercadolibre.panelmostrar.combobox.productosostenible"));
		listaCategorias.addItem(prop.getProperty("mercadolibre.panelmostrar.combobox.tecnologia"));
		listaCategorias.addItem(prop.getProperty("mercadolibre.panelmostrar.combobox.mostrartodo"));
	}

	public JComboBox<String> getListaCategorias() {
		return listaCategorias;
	}

	public void setListaCategorias(JComboBox<String> listaCategorias) {
		this.listaCategorias = listaCategorias;
	}

	public JTextArea getVerObjeto() {
		return verObjeto;
	}

	public void setVerObjeto(JTextArea verObjeto) {
		this.verObjeto = verObjeto;
	}

	public JScrollPane getZonaMostrar() {
		return zonaMostrar;
	}

	public void setZonaMostrar(JScrollPane zonaMostrar) {
		this.zonaMostrar = zonaMostrar;
	}


	public Properties getProp() {
		return prop;
	}

	public void setProp(Properties prop) {
		this.prop = prop;
		aplicarTexto();
		
}
	public void mostrarPanel(String nombrePanel) {
		
		cardLayout.show(this, nombrePanel);
	}
	
	
	
	


}

