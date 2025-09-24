package co.edu.unbosque.view;

import java.util.Properties;
import javax.swing.*;
import java.awt.*;

public class PanelCarrito extends JPanel {

    private JButton btnMostrarCarrito;
    private JButton btnCalcularTotal;
    private JButton btnComprar;
    private JTextArea textCarrito;
    private JScrollPane scrollCarrito;
    private JTextField txtTotal;
    private JTextField txtCarritoId;
    private Properties prop;

    public PanelCarrito() {
        prop = new Properties();
        inicializarComponentes();
    }

    private void inicializarComponentes() {
        this.setLayout(null);

        btnMostrarCarrito = new JButton("Mostrar Carrito");
        btnMostrarCarrito.setBounds(20, 20, 180, 30);
        this.add(btnMostrarCarrito);

        scrollCarrito = new JScrollPane();
        scrollCarrito.setBounds(20, 70, 500, 250);
        this.add(scrollCarrito);

        textCarrito = new JTextArea();
        textCarrito.setEditable(false);
        textCarrito.setFont(new Font("Monospaced", Font.PLAIN, 14));
        scrollCarrito.setViewportView(textCarrito);

        JLabel lblCarritoId = new JLabel("ID Carrito:");
        lblCarritoId.setBounds(20, 340, 80, 30);
        this.add(lblCarritoId);

        txtCarritoId = new JTextField();
        txtCarritoId.setBounds(100, 340, 100, 30);
        this.add(txtCarritoId);

        btnCalcularTotal = new JButton("Calcular Total");
        btnCalcularTotal.setBounds(220, 340, 150, 30);
        this.add(btnCalcularTotal);

        txtTotal = new JTextField();
        txtTotal.setBounds(20, 390, 180, 30);
        txtTotal.setEditable(false);
        this.add(txtTotal);

        btnComprar = new JButton("Comprar");
        btnComprar.setBounds(220, 390, 150, 30);
        this.add(btnComprar);
    }

    public void aplicarTexto() {
        btnMostrarCarrito.setText(prop.getProperty("mercadolibre.panelcarrito.btnmostrarcarrito", "Mostrar Carrito"));
        btnCalcularTotal.setText(prop.getProperty("mercadolibre.panelcarrito.btncalculartotal", "Calcular Total"));
        btnComprar.setText(prop.getProperty("mercadolibre.panelcarrito.btncomprar", "Comprar"));
    }

    public JButton getBtnMostrarCarritos() {
        return btnMostrarCarrito;
    }

    public JButton getBtnCalcularTotal() {
        return btnCalcularTotal;
    }

    public JButton getBtnComprar() {
        return btnComprar;
    }

    public JTextArea getTextCarritos() {
        return textCarrito;
    }

    public JScrollPane getScrollCarritos() {
        return scrollCarrito;
    }

    public JTextField getTxtTotal() {
        return txtTotal;
    }

    public JTextField getTxtCarritoId() {
        return txtCarritoId;
    }

    public Properties getProp() {
        return prop;
    }

    public void setProp(Properties prop) {
        this.prop = prop;
        aplicarTexto();
    }
}
