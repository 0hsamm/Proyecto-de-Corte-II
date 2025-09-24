package co.edu.unbosque.view;

import java.awt.CardLayout;
import javax.swing.JPanel;

/**
 * Panel principal que gestiona las operaciones CRUD.
 * Utiliza un CardLayout para alternar entre los paneles de
 * creación, visualización, actualización y eliminación de productos.
 */
public class PanelCRUD extends JPanel {

    private PanelCrear pCrear;
    private PanelMostrar pMostrar;
    private PanelActualizar pActualizar;
    private PanelEliminar pEliminar;

    private CardLayout cardLayout;

    /**
     * Constructor que inicializa los componentes y organiza los paneles.
     */
    public PanelCRUD() {
        inicializarComponentes();
    }

    /**
     * Inicializa y agrega los paneles de creación, actualización,
     * visualización y eliminación al CardLayout.
     */
    public void inicializarComponentes() {
        cardLayout = new CardLayout();

        this.setLayout(cardLayout);
        this.setOpaque(false);

        pCrear = new PanelCrear();
        pMostrar = new PanelMostrar();
        pActualizar = new PanelActualizar();
        pEliminar = new PanelEliminar();

        this.add(pCrear, "panelCrear");
        this.add(pEliminar, "panelEliminar");
        this.add(pActualizar, "panelActualizar");
        this.add(pMostrar, "panelMostrar");
    }

    public PanelCrear getpCrear() {
        return pCrear;
    }

    public void setpCrear(PanelCrear pCrear) {
        this.pCrear = pCrear;
    }

    public PanelMostrar getpMostrar() {
        return pMostrar;
    }

    public void setpMostrar(PanelMostrar pMostrar) {
        this.pMostrar = pMostrar;
    }

    public PanelActualizar getpActualizar() {
        return pActualizar;
    }

    public void setpActualizar(PanelActualizar pActualizar) {
        this.pActualizar = pActualizar;
    }

    public PanelEliminar getpEliminar() {
        return pEliminar;
    }

    public void setpEliminar(PanelEliminar pEliminar) {
        this.pEliminar = pEliminar;
    }

    /**
     * Muestra el panel correspondiente al nombre recibido.
     *
     * @param nombrePanel nombre del panel a mostrar
     */
    public void mostrarPanel(String nombrePanel) {
        cardLayout.show(this, nombrePanel);
    }
}
