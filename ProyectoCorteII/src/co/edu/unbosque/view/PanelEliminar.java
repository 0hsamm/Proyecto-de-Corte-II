package co.edu.unbosque.view;

import java.awt.Color;
import java.awt.Font;
import java.util.Properties;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

/**
 * Panel para eliminar productos.
 * Permite seleccionar la categoría del producto, ingresar su índice
 * y confirmar la eliminación mediante un botón.
 */
public class PanelEliminar extends JPanel {

    private JComboBox<String> listaCategoria;
    private JLabel labelEliminar;
    private JLabel labelIndice;
    private JTextField campoIndice;
    private JButton btnEliminar;
    private Properties prop;

    /**
     * Constructor que inicializa los componentes y aplica los textos
     * desde el archivo de propiedades.
     */
    public PanelEliminar() {
        prop = new Properties();
        inicializarComponentes();
        aplicarTexto();
    }

    /**
     * Inicializa y configura los elementos gráficos del panel.
     */
    public void inicializarComponentes() {
        this.setLayout(null);

        labelEliminar = new JLabel();
        labelEliminar.setFont(new Font("Arial Rounded MT Bold", Font.BOLD, 30));
        labelEliminar.setBounds(30, 5, 340, 25);
        this.add(labelEliminar);

        listaCategoria = new JComboBox<>();
        listaCategoria.setBounds(10, 40, 250, 30);
        this.add(listaCategoria);

        labelIndice = new JLabel();
        labelIndice.setFont(new Font("Arial Rounded MT Bold", Font.BOLD, 20));
        labelIndice.setBounds(10, 80, 550, 30);
        this.add(labelIndice);

        campoIndice = new JTextField();
        campoIndice.setBounds(560, 80, 250, 30);
        this.add(campoIndice);

        btnEliminar = new JButton();
        btnEliminar.setFont(new Font("Arial Rounded MT Bold", Font.BOLD, 30));
        btnEliminar.setBounds(230, 350, 300, 50);
        btnEliminar.setBackground(new Color(254, 230, 1));
        btnEliminar.setForeground(Color.WHITE);
        btnEliminar.setFocusPainted(false);
        btnEliminar.setBorderPainted(false);
        this.add(btnEliminar);
    }

    /**
     * Aplica los textos a los componentes usando las propiedades cargadas.
     */
    public void aplicarTexto() {
        listaCategoria.removeAllItems();

        labelEliminar.setText(prop.getProperty("mercadolibre.paneleliminar.labeleliminar"));
        listaCategoria.addItem(prop.getProperty("mercadolibre.paneleliminar.combobox.seleccionar"));
        listaCategoria.addItem(prop.getProperty("mercadolibre.paneleliminar.combobox.accesoriovehiculo"));
        listaCategoria.addItem(prop.getProperty("mercadolibre.paneleliminar.combobox.electrodomestico"));
        listaCategoria.addItem(prop.getProperty("mercadolibre.paneleliminar.combobox.equipodeportivo"));
        listaCategoria.addItem(prop.getProperty("mercadolibre.paneleliminar.combobox.herramienta"));
        listaCategoria.addItem(prop.getProperty("mercadolibre.paneleliminar.combobox.inmueble"));
        listaCategoria.addItem(prop.getProperty("mercadolibre.paneleliminar.combobox.juguete"));
        listaCategoria.addItem(prop.getProperty("mercadolibre.paneleliminar.combobox.prendavestir"));
        listaCategoria.addItem(prop.getProperty("mercadolibre.paneleliminar.combobox.productofarmaceutico"));
        listaCategoria.addItem(prop.getProperty("mercadolibre.paneleliminar.combobox.productosostenible"));
        listaCategoria.addItem(prop.getProperty("mercadolibre.paneleliminar.combobox.tecnologia"));
        labelIndice.setText(prop.getProperty("mercadolibre.paneleliminar.labelindice"));
        btnEliminar.setText(prop.getProperty("mercadolibre.paneleliminar.btneliminar"));
    }

    public JComboBox<String> getListaCategoria() {
        return listaCategoria;
    }

    public void setListaCategoria(JComboBox<String> listaCategorias) {
        this.listaCategoria = listaCategorias;
    }

    public JLabel getLabelEliminar() {
        return labelEliminar;
    }

    public void setLabelEliminar(JLabel labelEliminar) {
        this.labelEliminar = labelEliminar;
    }

    public JLabel getLabelIndice() {
        return labelIndice;
    }

    public void setLabelIndice(JLabel labelIndice) {
        this.labelIndice = labelIndice;
    }

    public JTextField getCampoIndice() {
        return campoIndice;
    }

    public void setCampoIndice(JTextField campoIndice) {
        this.campoIndice = campoIndice;
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

    /**
     * Establece las propiedades y actualiza los textos en el panel.
     *
     * @param prop archivo de propiedades a aplicar
     */
    public void setProp(Properties prop) {
        this.prop = prop;
        aplicarTexto();
    }
}
