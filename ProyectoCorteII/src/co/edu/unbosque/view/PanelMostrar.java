package co.edu.unbosque.view;

import java.awt.event.ActionListener;

import javax.swing.JComboBox;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;

public class PanelMostrar extends JPanel {
	private JComboBox<String> listaCategorias;
	private JTextArea verObjeto;
	private JScrollPane zonaMostrar;

	public PanelMostrar() {
		inicializarComponentes();
	}

	public void inicializarComponentes() {
		this.setLayout(null);

		listaCategorias = new JComboBox<>();
		listaCategorias.addItem("-Seleccione-");
		listaCategorias.addItem("Accesorio para vehiculo");
		listaCategorias.addItem("Electrodomestico");
		listaCategorias.addItem("Equipo deportivo");
		listaCategorias.addItem("Herramientas");
		listaCategorias.addItem("Inmuebles");
		listaCategorias.addItem("Juguetes");
		listaCategorias.addItem("Prenda de vestir");
		listaCategorias.addItem("Producto farmaceutico");
		listaCategorias.addItem("Producto sostenible");
		listaCategorias.addItem("Tecnologia");
		listaCategorias.addItem("Mostrar todo");
		listaCategorias.setBounds(10, 10, 250, 30);

		this.add(listaCategorias);

		verObjeto = new JTextArea();
		verObjeto.setEditable(false);

		zonaMostrar = new JScrollPane(verObjeto);
		zonaMostrar.setBounds(10, 60, 800, 1000);
		this.add(zonaMostrar);

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

}

