package co.edu.unbosque.view;

import java.util.Properties;
import java.awt.CardLayout;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;

/**
 * Panel que permite al comprador visualizar productos según categorías,
 * crear un carrito de compras e ingresar productos a dicho carrito
 * mediante su índice.
 */
public class PanelMostrarComprador extends JPanel {
    private JComboBox<String> listaCategorias;
    private JTextArea verObjeto;
    private JScrollPane zonaMostrar;
    private Properties prop;
    private CardLayout cardLayout;
    private JLabel lblIndice;
    private JTextField txtIndice;
    private JButton btnAgregarCarrito;
    private JLabel lblCarrito;
    private JTextField txtCarrito;
    private JButton btnCrearCarrito;

    /**
     * Constructor por defecto. Inicializa las propiedades y los componentes gráficos.
     */
    public PanelMostrarComprador() {
        prop = new Properties();
        inicializarComponentes();
    }

    /**
     * Inicializa y organiza los componentes del panel en su respectiva posición.
     */
    public void inicializarComponentes() {
        cardLayout = new CardLayout();
        this.setLayout(null);

        listaCategorias = new JComboBox<>();
        listaCategorias.setBounds(20, 20, 300, 30);
        this.add(listaCategorias);

        verObjeto = new JTextArea();
        verObjeto.setEditable(false);

        zonaMostrar = new JScrollPane(verObjeto);
        zonaMostrar.setBounds(20, 60, 820, 300);
        this.add(zonaMostrar);

        lblCarrito = new JLabel();
        lblCarrito.setBounds(20, 380, 100, 30);
        this.add(lblCarrito);

        txtCarrito = new JTextField();
        txtCarrito.setBounds(130, 380, 100, 30);
        this.add(txtCarrito);

        btnCrearCarrito = new JButton();
        btnCrearCarrito.setBounds(250, 380, 150, 30);
        this.add(btnCrearCarrito);

        lblIndice = new JLabel();
        lblIndice.setBounds(20, 430, 140, 30);
        this.add(lblIndice);

        txtIndice = new JTextField();
        txtIndice.setBounds(170, 430, 100, 30);
        this.add(txtIndice);

        btnAgregarCarrito = new JButton();
        btnAgregarCarrito.setBounds(300, 430, 200, 30);
        this.add(btnAgregarCarrito);
    }

    /**
     * Aplica los textos a los componentes según los valores definidos en el archivo de propiedades.
     */
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
        lblCarrito.setText(prop.getProperty("mercadolibre.panelmostrar.lblcarrito"));
        btnCrearCarrito.setText(prop.getProperty("mercadolibre.panelmostrar.btncrearcarrito"));
        lblIndice.setText(prop.getProperty("mercadolibre.panelmostrar.lblindice"));
        btnAgregarCarrito.setText(prop.getProperty("mercadolibre.panelmostrar.btnagregarcarrito"));
        
    }

    public JButton getBtnCrearCarrito() {
        return btnCrearCarrito;
    }

    public CardLayout getCardLayout() {
        return cardLayout;
    }

    public JLabel getLblCarrito() {
        return lblCarrito;
    }

    public JTextField getTxtCarrito() {
        return txtCarrito;
    }

    public JLabel getLblIndice() {
        return lblIndice;
    }

    public JTextField getTxtIndice() {
        return txtIndice;
    }

    public JButton getBtnAgregarCarrito() {
        return btnAgregarCarrito;
    }

    public JComboBox<String> getListaCategorias() {
        return listaCategorias;
    }

    public JTextArea getVerObjeto() {
        return verObjeto;
    }

    public JScrollPane getZonaMostrar() {
        return zonaMostrar;
    }

    public Properties getProp() {
        return prop;
    }

    public void setProp(Properties prop) {
        this.prop = prop;
        aplicarTexto();
    }

    /**
     * Muestra un panel específico dentro del CardLayout.
     * @param nombrePanel nombre del panel a mostrar
     */
    public void mostrarPanel(String nombrePanel) {
        cardLayout.show(this, nombrePanel);
    }
}
