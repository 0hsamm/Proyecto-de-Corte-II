package co.edu.unbosque.view;

import java.util.Properties;
import javax.swing.JComboBox;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;

/**
 * Panel para mostrar productos.
 * Permite seleccionar una categoría y visualizar los objetos
 * en un área de texto desplazable.
 */
public class PanelMostrar extends JPanel {

    private JComboBox<String> listaCategoria;
    private JTextArea verObjeto;
    private JScrollPane zonaMostrar;
    private Properties prop;

    /**
     * Constructor que inicializa los componentes del panel.
     */
    public PanelMostrar() {
        prop = new Properties();
        inicializarComponentes();
    }

    /**
     * Inicializa y configura los elementos gráficos del panel.
     */
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

    /**
     * Aplica los textos a los componentes usando las propiedades cargadas.
     */
    public void aplicarTexto() {
        listaCategoria.removeAllItems();

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

    /**
     * Establece las propiedades y actualiza los textos en el panel.
     *
     * @param prop archivo de propiedades a aplicar
     */
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
