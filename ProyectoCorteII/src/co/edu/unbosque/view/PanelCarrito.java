package co.edu.unbosque.view;

import java.util.Properties;

import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;

/**
 * Panel que muestra el carrito de compras. Contiene un botón para mostrar el
 * contenido y un área de texto con scroll.
 */
public class PanelCarrito extends JPanel {

	private JButton btnMostrarCarrito;
	private JTextArea textCarrito;
	private JScrollPane scrollCarrito;
	private Properties prop;

	/**
	 * Constructor que inicializa los componentes del panel.
	 */
	public PanelCarrito() {
		prop = new Properties();
		inicializarComponentes();
	}

	/**
	 * Inicializa los elementos gráficos del panel.
	 */
	private void inicializarComponentes() {
		this.setLayout(null);

		btnMostrarCarrito = new JButton();
		btnMostrarCarrito.setBounds(10, 10, 200, 30);
		this.add(btnMostrarCarrito);

		textCarrito = new JTextArea();
		textCarrito.setEditable(false);

		scrollCarrito = new JScrollPane(textCarrito);
		scrollCarrito.setBounds(10, 50, 500, 300);
		this.add(scrollCarrito);
	}

	/**
	 * Aplica los textos desde las propiedades al panel.
	 */
	public void aplicarTexto() {
		btnMostrarCarrito.setText(prop.getProperty("mercadolibre.panelcarrito.btnmostrarcarrito"));
	}

	public JButton getBtnMostrarCarritos() {
		return btnMostrarCarrito;
	}

	public JTextArea getTextCarritos() {
		return textCarrito;
	}

	public JScrollPane getScrollCarritos() {
		return scrollCarrito;
	}

	public void setScrollCarritos(JScrollPane scrollCarritos) {
		this.scrollCarrito = scrollCarritos;
	}

	public void setBtnMostrarCarritos(JButton btnMostrarCarritos) {
		this.btnMostrarCarrito = btnMostrarCarritos;
	}

	public void setTextCarritos(JTextArea textCarritos) {
		this.textCarrito = textCarritos;
	}

	public Properties getProp() {
		return prop;
	}

	public void setProp(Properties prop) {
		this.prop = prop;
		aplicarTexto();
	}

}
