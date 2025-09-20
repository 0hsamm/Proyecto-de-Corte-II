package co.edu.unbosque.view;

import java.awt.Color;
import java.awt.Font;
import java.awt.TextField;

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
	
	public PanelEliminar() {
		inicializarComponentes();
	}
	
	public void inicializarComponentes() {
		this.setLayout(null);
		
		labelEliminar = new JLabel("Eliminar");
		labelEliminar.setFont(new Font("Arial Rounded MT Bold", Font.BOLD, 30));
		labelEliminar.setBounds(30, 5, 340, 25);
		this.add(labelEliminar);
		
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
		listaCategorias.setBounds(10, 40, 250, 30);
		this.add(listaCategorias);
		
		labelNombre = new JLabel("Ingrese el nombre de la publicacion a eliminar: ");
		labelNombre.setFont(new Font("Arial Rounded MT Bold", Font.BOLD, 20));
		labelNombre.setBounds(10, 80, 550, 30);
		this.add(labelNombre);
		
		textoNombre = new TextField();
		textoNombre.setBounds(560, 80, 250, 30);
		this.add(textoNombre);
		
		btnEliminar = new JButton("Eliminar");
		btnEliminar.setFont(new Font("Arial Rounded MT Bold", Font.BOLD, 30));
		btnEliminar.setBounds(230, 350, 300, 50);
		btnEliminar.setBackground(new Color(254, 230, 1));
		btnEliminar.setForeground(Color.WHITE);
		btnEliminar.setFocusPainted(false);
		btnEliminar.setBorderPainted(false);
		this.add(btnEliminar);
	}
	
}
