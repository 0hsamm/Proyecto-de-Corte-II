package co.edu.unbosque.view;


import java.util.Properties;
import javax.swing.JComboBox;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;

public class PanelMostrar extends JPanel {
	
	private JComboBox<String> listaCategoria;
	private JTextArea verObjeto;
	private JScrollPane zonaMostrar;
	private Properties prop;
	

	public PanelMostrar() {
		prop = new Properties();
		inicializarComponentes();
		
	}

	public void inicializarComponentes() {
		
		this.setLayout(null);

		listaCategoria = new JComboBox<>();
		listaCategoria.setBounds(10, 10, 250, 30);
		this.add(listaCategoria);
		
		verObjeto = new JTextArea();
		verObjeto.setEditable(false);

		zonaMostrar = new JScrollPane(verObjeto);
		zonaMostrar.setBounds(10, 60, 800, 1000);
		this.add(zonaMostrar);
		
		

	}

	public void aplicarTexto() {


		listaCategoria.addItem(prop.getProperty("mercadolibre.panelmostrar.combobox.seleccionar"));
		listaCategoria.addItem(prop.getProperty("mercadolibre.panelmostrar.combobox.accesoriovehiculo"));
		listaCategoria.addItem(prop.getProperty("mercadolibre.panelmostrar.combobox.electrodomestico"));
		listaCategoria.addItem(prop.getProperty("mercadolibre.panelmostrar.combobox.equipodeportivo"));
		listaCategoria.addItem(prop.getProperty("mercadolibre.panelmostrar.combobox.herramienta"));
		listaCategoria.addItem(prop.getProperty("mercadolibre.panelmostrar.combobox.inmueble"));
		listaCategoria.addItem(prop.getProperty("mercadolibre.panelmostrar.combobox.juguete"));
		listaCategoria.addItem(prop.getProperty("mercadolibre.panelmostrar.combobox.prendavestir"));
		listaCategoria.addItem(prop.getProperty("mercadolibre.panelmostrar.combobox.productofarmaceutico"));
		listaCategoria.addItem(prop.getProperty("mercadolibre.panelmostrar.combobox.productosostenible"));
		listaCategoria.addItem(prop.getProperty("mercadolibre.panelmostrar.combobox.tecnologia"));
		listaCategoria.addItem(prop.getProperty("mercadolibre.panelmostrar.combobox.mostrartodo"));

	}
	

	public Properties getProp() {
		return prop;
	}

	public void setProp(Properties prop) {
		this.prop = prop;
		aplicarTexto();
	}
	

	public JComboBox<String> getListaCategoria() {
		return listaCategoria;
	}

	public void setListaCategoria(JComboBox<String> listaCategorias) {
		this.listaCategoria = listaCategorias;
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


		
}
	

