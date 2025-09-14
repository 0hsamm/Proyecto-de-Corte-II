package co.edu.unbosque.view;

import java.awt.Color;
import java.awt.Font;
import java.awt.Image;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class VentanaCRUD extends JFrame{
	private JLabel fondoCRUD;
	private PanelCRUD panelCRUD;
	
	
	public VentanaCRUD() {
		inicializarComponentes();
	}
	
	public void inicializarComponentes() {
		this.setBounds(10, 10, 1280, 755);
		this.setTitle("Funciones Artículos");
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		this.setResizable(false);
		this.setLocationRelativeTo(null);

		ImageIcon fondo = new ImageIcon("src/co/edu/unbosque/view/VentanaCRUD.PNG");
		Image escalar = fondo.getImage().getScaledInstance(1280, 720, Image.SCALE_SMOOTH);
		fondoCRUD = new JLabel(new ImageIcon(escalar));
		fondoCRUD.setBounds(0, 0, 1280, 720);
		this.setContentPane(fondoCRUD);
		fondoCRUD.setLayout(null);
		
		JLabel texto0 = new JLabel("Funciones del vendedor");
		texto0.setFont(new Font("Arial Rounded MT Bold", Font.BOLD, 60));
		texto0.setBounds(260, 80, 1200, 70);
		fondoCRUD.add(texto0);
		
		panelCRUD = new PanelCRUD();
		panelCRUD.setBounds(0, 200, 755, 993);
		panelCRUD.setOpaque(false);
		fondoCRUD.add(panelCRUD);


	}

	public JLabel getFondoCRUD() {
		return fondoCRUD;
	}

	public void setFondoCRUD(JLabel fondoCRUD) {
		this.fondoCRUD = fondoCRUD;
	}

	public PanelCRUD getPanelCRUD() {
		return panelCRUD;
	}

	public void setPanelCRUD(PanelCRUD panelCRUD) {
		this.panelCRUD = panelCRUD;
	}
	
	

}
