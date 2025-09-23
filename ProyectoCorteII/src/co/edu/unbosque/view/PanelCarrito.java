package co.edu.unbosque.view;

import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;

public class PanelCarrito extends JPanel {

    private JButton btnMostrarCarritos;
    private JTextArea textCarritos;
    private JScrollPane scrollCarritos;

    public PanelCarrito() {
        inicializarComponentes();
    }

    private void inicializarComponentes() {
        this.setLayout(null);

        btnMostrarCarritos = new JButton("Mostrar Carritos");
        btnMostrarCarritos.setBounds(10, 10, 200, 30);
        this.add(btnMostrarCarritos);

        textCarritos = new JTextArea();
        textCarritos.setEditable(false);

        scrollCarritos = new JScrollPane(textCarritos);
        scrollCarritos.setBounds(10, 50, 500, 300);
        this.add(scrollCarritos);
    }

    public JButton getBtnMostrarCarritos() {
        return btnMostrarCarritos;
    }

    public JTextArea getTextCarritos() {
        return textCarritos;
    }

	public JScrollPane getScrollCarritos() {
		return scrollCarritos;
	}

	public void setScrollCarritos(JScrollPane scrollCarritos) {
		this.scrollCarritos = scrollCarritos;
	}

	public void setBtnMostrarCarritos(JButton btnMostrarCarritos) {
		this.btnMostrarCarritos = btnMostrarCarritos;
	}

	public void setTextCarritos(JTextArea textCarritos) {
		this.textCarritos = textCarritos;
	}
    
}
