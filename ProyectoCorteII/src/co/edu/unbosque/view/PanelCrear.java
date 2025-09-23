package co.edu.unbosque.view;

import java.awt.Color;
import java.awt.Font;
import java.awt.TextField;
import java.util.Properties;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class PanelCrear extends JPanel {
	private Properties prop;

	private JComboBox<String> listaCategoria;
	private JLabel labelNombre;
	private TextField textNombre;
	private JLabel labelCantidad;
	private TextField textCantidad;
	private JLabel labelPrecio;
	private TextField textPrecio;
	private JLabel labelCategoria;

	// Accesorio para vehiculo
	private JLabel labelMaterialAccesorio;
	private TextField textMaterialAccesorio;
	private JLabel labelCompatibilidad;
	private TextField textCompatibilidad;

	// Electrodomestico
	private JLabel labelConsumo;
	private TextField textConsumo;
	private JLabel labelCapacidad;
	private TextField textCapacidad;

	// Equipo deportivo
	private JLabel labelDeporte;
	private TextField textDeporte;
	private JLabel labelMaterialDeporte;
	private TextField textMaterialDeporte;

	// Herramienta
	private JLabel labelAlimentacion;
	private TextField textAlimentacion;
	private JLabel labelMaterialHerramienta;
	private TextField textMaterialHerramienta;

	// Inmueble
	private JLabel labelArea;
	private TextField textArea;
	private JLabel labelCantidadCuarto;
	private TextField textCantidadCuarto;

	// juguete
	private JLabel labelEdad;
	private TextField textEdad;
	private JLabel labelMaterialJuguete;
	private TextField textMaterialJuguete;

	// Prenda de vestir
	private JLabel labelTalla;
	private TextField textTalla;
	private JLabel labelTipoTela;
	private TextField textTipoTela;

	// Producto farmaceutico
	private JLabel labelFormaFarmaceutica;
	private TextField textFormaFarmaceutica;
	private JLabel labelConcentracion;
	private TextField textConcentracion;

	// Producto sostenible
	private JLabel labelMaterialEcologico;
	private TextField textMaterialEcologico;
	private JLabel labelCertificacion;
	private TextField textCertificacion;

	// tecnologia
	private JLabel labelSO;
	private TextField textSO;
	private JLabel labelConectividad;
	private TextField textConectividad;

	private JLabel labelCrear;
	private JButton btnCrear;

	public PanelCrear() {
		prop = new Properties();
		inicializarComponentes();
		ocultarOpcionesEspecificas();
	}

	public void inicializarComponentes() {

		this.setLayout(null);

		labelCrear = new JLabel();
		labelCrear.setFont(new Font("Arial Rounded MT Bold", Font.BOLD, 30));
		labelCrear.setBounds(30, 5, 340, 25);
		this.add(labelCrear);


		labelNombre = new JLabel();
		labelNombre.setFont(new Font("Arial Rounded MT Bold", Font.BOLD, 20));
		labelNombre.setBounds(30, 35, 425, 25);
		this.add(labelNombre);

		textNombre = new TextField();
		textNombre.setBounds(460, 35, 200, 25);
		this.add(textNombre);


		labelCantidad = new JLabel();
		labelCantidad.setFont(new Font("Arial Rounded MT Bold", Font.BOLD, 20));
		labelCantidad.setBounds(30, 65, 380, 25);
		this.add(labelCantidad);

		textCantidad = new TextField();
		textCantidad.setBounds(460, 65, 200, 25);
		this.add(textCantidad);


		labelPrecio = new JLabel();
		labelPrecio.setFont(new Font("Arial Rounded MT Bold", Font.BOLD, 20));
		labelPrecio.setBounds(30, 95, 380, 25);
		this.add(labelPrecio);

		textPrecio = new TextField();
		textPrecio.setBounds(460, 95, 200, 25);
		this.add(textPrecio);


		labelCategoria = new JLabel();
		labelCategoria.setFont(new Font("Arial Rounded MT Bold", Font.BOLD, 20));
		labelCategoria.setBounds(30, 125, 380, 25);
		this.add(labelCategoria);

		listaCategoria = new JComboBox<>();	
		listaCategoria.setBounds(460, 125, 250, 30);
		this.add(listaCategoria);


		//Accesorio para vehiculo
		labelMaterialAccesorio = new JLabel();	
		labelMaterialAccesorio.setFont(new Font("Arial Rounded MT Bold", Font.BOLD, 20));
		labelMaterialAccesorio.setBounds(30, 200, 380, 25);
		this.add(labelMaterialAccesorio);

		textMaterialAccesorio = new TextField();
		textMaterialAccesorio.setBounds(450, 200, 200, 25);
		this.add(textMaterialAccesorio);


		labelCompatibilidad = new JLabel();
		labelCompatibilidad.setFont(new Font("Arial Rounded MT Bold", Font.BOLD, 20));
		labelCompatibilidad.setBounds(30, 230, 420, 25);
		this.add(labelCompatibilidad);

		textCompatibilidad = new TextField();
		textCompatibilidad.setBounds(450, 230, 200, 25);
		this.add(textCompatibilidad);


		//Electrodomestico
		labelConsumo = new JLabel();
		labelConsumo.setFont(new Font("Arial Rounded MT Bold", Font.BOLD, 20));
		labelConsumo.setBounds(30, 200, 440, 25);
		this.add(labelConsumo);

		textConsumo = new TextField();
		textConsumo.setBounds(470, 200, 200, 25);
		this.add(textConsumo);


		labelCapacidad = new JLabel();
		labelCapacidad.setFont(new Font("Arial Rounded MT Bold", Font.BOLD, 20));
		labelCapacidad.setBounds(30, 230, 420, 25);
		this.add(labelCapacidad);

		textCapacidad = new TextField();
		textCapacidad.setBounds(470, 230, 200, 25);
		this.add(textCapacidad);


		//Equipo deportivo
		labelDeporte = new JLabel();
		labelDeporte.setFont(new Font("Arial Rounded MT Bold", Font.BOLD, 20));
		labelDeporte.setBounds(30, 200, 440, 25);
		this.add(labelDeporte);

		textDeporte = new TextField();
		textDeporte.setBounds(470, 200, 200, 25);
		this.add(textDeporte);

		labelMaterialDeporte = new JLabel();	
		labelMaterialDeporte.setFont(new Font("Arial Rounded MT Bold", Font.BOLD, 20));
		labelMaterialDeporte.setBounds(30, 230, 420, 25);
		this.add(labelMaterialDeporte);

		textMaterialDeporte = new TextField();
		textMaterialDeporte.setBounds(470, 230, 200, 25);
		this.add(textMaterialDeporte);

		//Herramienta
		labelAlimentacion = new JLabel();
		labelAlimentacion.setFont(new Font("Arial Rounded MT Bold", Font.BOLD, 20));
		labelAlimentacion.setBounds(30, 200, 460, 25);
		this.add(labelAlimentacion);

		textAlimentacion = new TextField();
		textAlimentacion.setBounds(500, 200, 200, 25);
		this.add(textAlimentacion);

		labelMaterialHerramienta = new JLabel();	
		labelMaterialHerramienta.setFont(new Font("Arial Rounded MT Bold", Font.BOLD, 20));
		labelMaterialHerramienta.setBounds(30, 230, 420, 25);
		this.add(labelMaterialHerramienta);

		textMaterialHerramienta = new TextField();
		textMaterialHerramienta.setBounds(500, 230, 200, 25);
		this.add(textMaterialHerramienta);

		//Inmueble
		labelArea = new JLabel();
		labelArea.setFont(new Font("Arial Rounded MT Bold", Font.BOLD, 20));
		labelArea.setBounds(30, 200, 440, 25);
		this.add(labelArea);

		textArea = new TextField();
		textArea.setBounds(580, 200, 200, 25);
		this.add(textArea);


		labelCantidadCuarto = new JLabel();
		labelCantidadCuarto.setFont(new Font("Arial Rounded MT Bold", Font.BOLD, 20));
		labelCantidadCuarto.setBounds(30, 230, 540, 25);
		this.add(labelCantidadCuarto);

		textCantidadCuarto = new TextField();
		textCantidadCuarto.setBounds(580, 230, 200, 25);
		this.add(textCantidadCuarto);


		//juguete
		labelEdad = new JLabel();
		labelEdad.setFont(new Font("Arial Rounded MT Bold", Font.BOLD, 20));
		labelEdad.setBounds(30, 200, 460, 25);
		this.add(labelEdad);

		textEdad = new TextField();
		textEdad.setBounds(500, 200, 200, 25);
		this.add(textEdad);


		labelMaterialJuguete = new JLabel();		
		labelMaterialJuguete = new JLabel("Ingrese el material del producto:");
		labelMaterialJuguete.setFont(new Font("Arial Rounded MT Bold", Font.BOLD, 20));
		labelMaterialJuguete.setBounds(30, 230, 420, 25);
		this.add(labelMaterialJuguete);

		textMaterialJuguete = new TextField();
		textMaterialJuguete.setBounds(500, 230, 200, 25);
		this.add(textMaterialJuguete);


		//Prenda de vestir
		labelTalla = new JLabel();
		labelTalla.setFont(new Font("Arial Rounded MT Bold", Font.BOLD, 20));
		labelTalla.setBounds(30, 200, 460, 25);
		this.add(labelTalla);

		textTalla = new TextField();
		textTalla.setBounds(500, 200, 200, 25);
		this.add(textTalla);


		labelTipoTela = new JLabel();	
		labelTipoTela.setFont(new Font("Arial Rounded MT Bold", Font.BOLD, 20));
		labelTipoTela.setBounds(30, 230, 420, 25);
		this.add(labelTipoTela);

		textTipoTela = new TextField();
		textTipoTela.setBounds(500, 230, 200, 25);
		this.add(textTipoTela);


		//Producto farmaceutico
		labelFormaFarmaceutica = new JLabel();
		labelFormaFarmaceutica.setFont(new Font("Arial Rounded MT Bold", Font.BOLD, 20));
		labelFormaFarmaceutica.setBounds(30, 200, 460, 25);
		this.add(labelFormaFarmaceutica);

		textFormaFarmaceutica = new TextField();
		textFormaFarmaceutica.setBounds(500, 200, 200, 25);
		this.add(textFormaFarmaceutica);


		labelConcentracion = new JLabel();
		labelConcentracion.setFont(new Font("Arial Rounded MT Bold", Font.BOLD, 20));
		labelConcentracion.setBounds(30, 230, 420, 25);
		this.add(labelConcentracion);

		textConcentracion = new TextField();
		textConcentracion.setBounds(500, 230, 200, 25);
		this.add(textConcentracion);


		//Producto sostenible
		labelMaterialEcologico = new JLabel();
		labelMaterialEcologico.setFont(new Font("Arial Rounded MT Bold", Font.BOLD, 20));
		labelMaterialEcologico.setBounds(30, 200, 460, 25);
		this.add(labelMaterialEcologico);

		textMaterialEcologico = new TextField();
		textMaterialEcologico.setBounds(500, 200, 200, 25);
		this.add(textMaterialEcologico);

		labelCertificacion = new JLabel();
		labelCertificacion.setFont(new Font("Arial Rounded MT Bold", Font.BOLD, 20));
		labelCertificacion.setBounds(30, 230, 420, 25);
		this.add(labelCertificacion);

		textCertificacion = new TextField();
		textCertificacion.setBounds(500, 230, 200, 25);
		this.add(textCertificacion);

		//tecnologia
		labelSO = new JLabel();
		labelSO.setFont(new Font("Arial Rounded MT Bold", Font.BOLD, 20));
		labelSO.setBounds(30, 200, 460, 25);
		this.add(labelSO);

		textSO = new TextField();
		textSO.setBounds(500, 200, 200, 25);
		this.add(textSO);

		labelConectividad = new JLabel();
		labelConectividad.setFont(new Font("Arial Rounded MT Bold", Font.BOLD, 20));
		labelConectividad.setBounds(30, 230, 470, 25);
		this.add(labelConectividad);

		textConectividad = new TextField();
		textConectividad.setBounds(500, 230, 200, 25);
		this.add(textConectividad);


		btnCrear = new JButton();
		btnCrear.setFont(new Font("Arial Rounded MT Bold", Font.BOLD, 30));
		btnCrear.setBounds(230, 350, 300, 50);
		btnCrear.setBackground(new Color(254, 230, 1));
		btnCrear.setForeground(Color.WHITE);
		btnCrear.setFocusPainted(false);
		btnCrear.setBorderPainted(false);
		this.add(btnCrear);

	}

	public void aplicarTexto() {
		labelCrear.setText(prop.getProperty("mercadolibre.panelcrear.texto0"));
		labelNombre.setText(prop.getProperty("mercadolibre.panelcrear.labelnombre"));
		labelCantidad.setText(prop.getProperty("mercadolibre.panelcrear.labelcantidad"));
		labelPrecio.setText(prop.getProperty("mercadolibre.panelcrear.labelprecio"));
		labelCategoria.setText(prop.getProperty("mercadolibre.panelcrear.labelcategoria"));
		listaCategoria.addItem(prop.getProperty("mercadolibre.panelcrear.combobox.seleccionar"));
		listaCategoria.addItem(prop.getProperty("mercadolibre.panelcrear.combobox.accesoriovehiculo"));
		listaCategoria.addItem(prop.getProperty("mercadolibre.panelcrear.combobox.electrodomestico"));
		listaCategoria.addItem(prop.getProperty("mercadolibre.panelcrear.combobox.equipodeportivo"));
		listaCategoria.addItem(prop.getProperty("mercadolibre.panelcrear.combobox.herramienta"));
		listaCategoria.addItem(prop.getProperty("mercadolibre.panelcrear.combobox.inmueble"));
		listaCategoria.addItem(prop.getProperty("mercadolibre.panelcrear.combobox.juguete"));
		listaCategoria.addItem(prop.getProperty("mercadolibre.panelcrear.combobox.prendavestir"));
		listaCategoria.addItem(prop.getProperty("mercadolibre.panelcrear.combobox.productofarmaceutico"));
		listaCategoria.addItem(prop.getProperty("mercadolibre.panelcrear.combobox.productosostenible"));
		listaCategoria.addItem(prop.getProperty("mercadolibre.panelcrear.combobox.tecnologia"));
		labelMaterialAccesorio.setText(prop.getProperty("mercadolibre.panelcrear.labelmaterialaccesorio"));
		labelCompatibilidad.setText(prop.getProperty("mercadolibre.panelcrear.labelcompatibilidad"));
		labelConsumo.setText(prop.getProperty("mercadolibre.panelcrear.labelconsumo"));
		labelCapacidad.setText(prop.getProperty("mercadolibre.panelcrear.labelcapacidad"));
		labelDeporte.setText(prop.getProperty("mercadolibre.panelcrear.labeldeporte"));
		labelMaterialDeporte.setText(prop.getProperty("mercadolibre.panelcrear.labelmaterialdeporte"));
		labelAlimentacion.setText(prop.getProperty("mercadolibre.panelcrear.labelalimentacion"));
		labelMaterialHerramienta.setText(prop.getProperty("mercadolibre.panelcrear.labelmaterialherramienta"));
		labelArea.setText(prop.getProperty("mercadolibre.panelcrear.labelarea"));
		labelCantidadCuarto.setText(prop.getProperty("mercadolibre.panelcrear.labelcantidadcuarto"));
		labelEdad.setText(prop.getProperty("mercadolibre.panelcrear.labeledad"));
		labelMaterialJuguete.setText(prop.getProperty("mercadolibre.panelcrear.labelmaterialjuguete"));
		labelTalla.setText(prop.getProperty("mercadolibre.panelcrear.labeltalla"));
		labelTipoTela.setText(prop.getProperty("mercadolibre.panelcrear.labeltipotela"));
		labelFormaFarmaceutica.setText(prop.getProperty("mercadolibre.panelcrear.labelformafarmaceutica"));
		labelConcentracion.setText(prop.getProperty("mercadolibre.panelcrear.labelconcentracion"));
		labelMaterialEcologico.setText(prop.getProperty("mercadolibre.panelcrear.labelmaterialecologico"));
		labelCertificacion.setText(prop.getProperty("mercadolibre.panelcrear.labelcertificacion"));
		labelSO.setText(prop.getProperty("mercadolibre.panelcrear.labelso"));
		labelConectividad.setText(prop.getProperty("mercadolibre.panelcrear.labelconectividad"));
		btnCrear.setText(prop.getProperty("mercadolibre.panelcrear.btncrear"));


	}


	public void ocultarOpcionesEspecificas() {
		labelMaterialAccesorio.setVisible(false);
		textMaterialAccesorio.setVisible(false);
		labelCompatibilidad.setVisible(false);
		textCompatibilidad.setVisible(false);
		labelConsumo.setVisible(false);
		textConsumo.setVisible(false);
		labelCapacidad.setVisible(false);
		textCapacidad.setVisible(false);
		labelDeporte.setVisible(false);
		textDeporte.setVisible(false);
		labelMaterialDeporte.setVisible(false);
		textMaterialDeporte.setVisible(false);
		labelAlimentacion.setVisible(false);
		textAlimentacion.setVisible(false);
		labelMaterialHerramienta.setVisible(false);
		textMaterialHerramienta.setVisible(false);
		labelArea.setVisible(false);
		textArea.setVisible(false);
		labelCantidadCuarto.setVisible(false);
		textCantidadCuarto.setVisible(false);
		labelEdad.setVisible(false);
		textEdad.setVisible(false);
		labelMaterialJuguete.setVisible(false);
		textMaterialJuguete.setVisible(false);
		labelTalla.setVisible(false);
		textTalla.setVisible(false);
		labelTipoTela.setVisible(false);
		textTipoTela.setVisible(false);
		labelFormaFarmaceutica.setVisible(false);
		textFormaFarmaceutica.setVisible(false);
		labelConcentracion.setVisible(false);
		textConcentracion.setVisible(false);
		labelMaterialEcologico.setVisible(false);
		textMaterialEcologico.setVisible(false);
		labelCertificacion.setVisible(false);
		textCertificacion.setVisible(false);
		labelSO.setVisible(false);
		textSO.setVisible(false);
		labelConectividad.setVisible(false);
		textConectividad.setVisible(false);
	}

	public void mostrarAccesorioCarro() {
		labelMaterialAccesorio.setVisible(true);
		textMaterialAccesorio.setVisible(true);
		labelCompatibilidad.setVisible(true);
		textCompatibilidad.setVisible(true);
	}

	public void mostrarElectrodomestico() {
		labelConsumo.setVisible(true);
		textConsumo.setVisible(true);
		labelCapacidad.setVisible(true);
		textCapacidad.setVisible(true);
	}

	public void mostrarEquipoDeporte() {
		labelDeporte.setVisible(true);
		textDeporte.setVisible(true);
		labelMaterialDeporte.setVisible(true);
		textMaterialDeporte.setVisible(true);
	}

	public void mostrarHerramienta() {
		labelAlimentacion.setVisible(true);
		textAlimentacion.setVisible(true);
		labelMaterialHerramienta.setVisible(true);
		textMaterialHerramienta.setVisible(true);
	}

	public void mostrarInmueble() {
		labelArea.setVisible(true);
		textArea.setVisible(true);
		labelCantidadCuarto.setVisible(true);
		textCantidadCuarto.setVisible(true);
	}

	public void mostrarJuguete() {
		labelEdad.setVisible(true);
		textEdad.setVisible(true);
		labelMaterialJuguete.setVisible(true);
		textMaterialJuguete.setVisible(true);
	}

	public void mostrarPrendaVestir() {
		labelTalla.setVisible(true);
		textTalla.setVisible(true);
		labelTipoTela.setVisible(true);
		textTipoTela.setVisible(true);
	}

	public void mostrarFarmaceutico() {
		labelFormaFarmaceutica.setVisible(true);
		textFormaFarmaceutica.setVisible(true);
		labelConcentracion.setVisible(true);
		textConcentracion.setVisible(true);
	}

	public void mostrarSostenible() {
		labelMaterialEcologico.setVisible(true);
		textMaterialEcologico.setVisible(true);
		labelCertificacion.setVisible(true);
		textCertificacion.setVisible(true);
	}

	public void mostrarTecnologia() {
		labelSO.setVisible(true);
		textSO.setVisible(true);
		labelConectividad.setVisible(true);
		textConectividad.setVisible(true);
	}

	public void limpiarCampos() {
		textNombre.setText("");
		textCantidad.setText("");
		textPrecio.setText("");
		textMaterialAccesorio.setText("");
		textCompatibilidad.setText("");
		textConsumo.setText("");
		textCapacidad.setText("");
		textDeporte.setText("");
		textMaterialDeporte.setText("");
		textAlimentacion.setText("");
		textMaterialHerramienta.setText("");
		textArea.setText("");
		textCantidadCuarto.setText("");
		textEdad.setText("");
		textMaterialJuguete.setText("");
		textTalla.setText("");
		textTipoTela.setText("");
		textFormaFarmaceutica.setText("");
		textConcentracion.setText("");
		textMaterialEcologico.setText("");
		textCertificacion.setText("");
		textSO.setText("");
		textConectividad.setText("");
		listaCategoria.setSelectedIndex(0);
	}

	public Properties getProp() {
		return prop;
	}

	public void setProp(Properties prop) {
		this.prop = prop;
		aplicarTexto();
	}

	public JComboBox<String> getListaCategorias() {
		return listaCategoria;
	}

	public void setListaCategorias(JComboBox<String> listaCategorias) {
		this.listaCategoria = listaCategorias;
	}

	public JLabel getLabelNombre() {
		return labelNombre;
	}

	public void setLabelNombre(JLabel labelNombre) {
		this.labelNombre = labelNombre;
	}

	public TextField getTextNombre() {
		return textNombre;
	}

	public void setTextNombre(TextField textNombre) {
		this.textNombre = textNombre;
	}

	public JLabel getLabelCantidad() {
		return labelCantidad;
	}

	public void setLabelCantidad(JLabel labelCantidad) {
		this.labelCantidad = labelCantidad;
	}

	public TextField getTextCantidad() {
		return textCantidad;
	}

	public void setTextCantidad(TextField textCantidad) {
		this.textCantidad = textCantidad;
	}

	public JLabel getLabelPrecio() {
		return labelPrecio;
	}

	public void setLabelPrecio(JLabel labelPrecio) {
		this.labelPrecio = labelPrecio;
	}

	public TextField getTextPrecio() {
		return textPrecio;
	}

	public void setTextPrecio(TextField textPrecio) {
		this.textPrecio = textPrecio;
	}

	public JLabel getLabelCategoria() {
		return labelCategoria;
	}

	public void setLabelCategoria(JLabel labelCategoria) {
		this.labelCategoria = labelCategoria;
	}

	public JButton getBtnCrear() {
		return btnCrear;
	}

	public void setBtnCrear(JButton btnCrear) {
		this.btnCrear = btnCrear;
	}

	public JLabel getLabelMaterialAccesorio() {
		return labelMaterialAccesorio;
	}

	public void setLabelMaterialAccesorio(JLabel labelMaterialAccesorio) {
		this.labelMaterialAccesorio = labelMaterialAccesorio;
	}

	public TextField getTextMaterialAccesorio() {
		return textMaterialAccesorio;
	}

	public void setTextMaterialAccesorio(TextField textMaterialAccesorio) {
		this.textMaterialAccesorio = textMaterialAccesorio;
	}

	public JLabel getLabelCompatibilidad() {
		return labelCompatibilidad;
	}

	public void setLabelCompatibilidad(JLabel labelCompatibilidad) {
		this.labelCompatibilidad = labelCompatibilidad;
	}

	public TextField getTextCompatibilidad() {
		return textCompatibilidad;
	}

	public void setTextCompatibilidad(TextField textCompatibilidad) {
		this.textCompatibilidad = textCompatibilidad;
	}

	public JLabel getLabelConsumo() {
		return labelConsumo;
	}

	public void setLabelConsumo(JLabel labelConsumo) {
		this.labelConsumo = labelConsumo;
	}

	public TextField getTextConsumo() {
		return textConsumo;
	}

	public void setTextConsumo(TextField textConsumo) {
		this.textConsumo = textConsumo;
	}

	public JLabel getLabelCapacidad() {
		return labelCapacidad;
	}

	public void setLabelCapacidad(JLabel labelCapacidad) {
		this.labelCapacidad = labelCapacidad;
	}

	public TextField getTextCapacidad() {
		return textCapacidad;
	}

	public void setTextCapacidad(TextField textCapacidad) {
		this.textCapacidad = textCapacidad;
	}

	public JLabel getLabelDeporte() {
		return labelDeporte;
	}

	public void setLabelDeporte(JLabel labelDeporte) {
		this.labelDeporte = labelDeporte;
	}

	public TextField getTextDeporte() {
		return textDeporte;
	}

	public void setTextDeporte(TextField textDeporte) {
		this.textDeporte = textDeporte;
	}

	public JLabel getLabelMaterialDeporte() {
		return labelMaterialDeporte;
	}

	public void setLabelMaterialDeporte(JLabel labelMaterialDeporte) {
		this.labelMaterialDeporte = labelMaterialDeporte;
	}

	public TextField getTextMaterialDeporte() {
		return textMaterialDeporte;
	}

	public void setTextMaterialDeporte(TextField textMaterialDeporte) {
		this.textMaterialDeporte = textMaterialDeporte;
	}

	public JLabel getLabelAlimentacion() {
		return labelAlimentacion;
	}

	public void setLabelAlimentacion(JLabel labelAlimentacion) {
		this.labelAlimentacion = labelAlimentacion;
	}

	public TextField getTextAlimentacion() {
		return textAlimentacion;
	}

	public void setTextAlimentacion(TextField textAlimentacion) {
		this.textAlimentacion = textAlimentacion;
	}

	public JLabel getLabelMaterialHerramienta() {
		return labelMaterialHerramienta;
	}

	public void setLabelMaterialHerramienta(JLabel labelMaterialHerramienta) {
		this.labelMaterialHerramienta = labelMaterialHerramienta;
	}

	public TextField getTextMaterialHerramienta() {
		return textMaterialHerramienta;
	}

	public void setTextMaterialHerramienta(TextField textMaterialHerramienta) {
		this.textMaterialHerramienta = textMaterialHerramienta;
	}

	public JLabel getLabelArea() {
		return labelArea;
	}

	public void setLabelArea(JLabel labelArea) {
		this.labelArea = labelArea;
	}

	public TextField getTextArea() {
		return textArea;
	}

	public void setTextArea(TextField textArea) {
		this.textArea = textArea;
	}

	public JLabel getLabelCantidadCuarto() {
		return labelCantidadCuarto;
	}

	public void setLabelCantidadCuarto(JLabel labelCantidadCuarto) {
		this.labelCantidadCuarto = labelCantidadCuarto;
	}

	public TextField getTextCantidadCuarto() {
		return textCantidadCuarto;
	}

	public void setTextCantidadCuarto(TextField textCantidadCuarto) {
		this.textCantidadCuarto = textCantidadCuarto;
	}

	public JLabel getLabelEdad() {
		return labelEdad;
	}

	public void setLabelEdad(JLabel labelEdad) {
		this.labelEdad = labelEdad;
	}

	public TextField getTextEdad() {
		return textEdad;
	}

	public void setTextEdad(TextField textEdad) {
		this.textEdad = textEdad;
	}

	public JLabel getLabelMaterialJuguete() {
		return labelMaterialJuguete;
	}

	public void setLabelMaterialJuguete(JLabel labelMaterialJuguete) {
		this.labelMaterialJuguete = labelMaterialJuguete;
	}

	public TextField getTextMaterialJuguete() {
		return textMaterialJuguete;
	}

	public void setTextMaterialJuguete(TextField textMaterialJuguete) {
		this.textMaterialJuguete = textMaterialJuguete;
	}

	public JLabel getLabelTalla() {
		return labelTalla;
	}

	public void setLabelTalla(JLabel labelTalla) {
		this.labelTalla = labelTalla;
	}

	public TextField getTextTalla() {
		return textTalla;
	}

	public void setTextTalla(TextField textTalla) {
		this.textTalla = textTalla;
	}

	public JLabel getLabelTipoTela() {
		return labelTipoTela;
	}

	public void setLabelTipoTela(JLabel labelTipoTela) {
		this.labelTipoTela = labelTipoTela;
	}

	public TextField getTextTipoTela() {
		return textTipoTela;
	}

	public void setTextTipoTela(TextField textTipoTela) {
		this.textTipoTela = textTipoTela;
	}

	public JLabel getLabelFormaFarmaceutica() {
		return labelFormaFarmaceutica;
	}

	public void setLabelFormaFarmaceutica(JLabel labelFormaFarmaceutica) {
		this.labelFormaFarmaceutica = labelFormaFarmaceutica;
	}

	public TextField getTextFormaFarmaceutica() {
		return textFormaFarmaceutica;
	}

	public void setTextFormaFarmaceutica(TextField textFormaFarmaceutica) {
		this.textFormaFarmaceutica = textFormaFarmaceutica;
	}

	public JLabel getLabelConcentracion() {
		return labelConcentracion;
	}

	public void setLabelConcentracion(JLabel labelConcentracion) {
		this.labelConcentracion = labelConcentracion;
	}

	public TextField getTextConcentracion() {
		return textConcentracion;
	}

	public void setTextConcentracion(TextField textConcentracion) {
		this.textConcentracion = textConcentracion;
	}

	public JLabel getLabelMaterialEcologico() {
		return labelMaterialEcologico;
	}

	public void setLabelMaterialEcologico(JLabel labelMaterialEcologico) {
		this.labelMaterialEcologico = labelMaterialEcologico;
	}

	public TextField getTextMaterialEcologico() {
		return textMaterialEcologico;
	}

	public void setTextMaterialEcologico(TextField textMaterialEcologico) {
		this.textMaterialEcologico = textMaterialEcologico;
	}

	public JLabel getLabelCertificacion() {
		return labelCertificacion;
	}

	public void setLabelCertificacion(JLabel labelCertificacion) {
		this.labelCertificacion = labelCertificacion;
	}

	public TextField getTextCertificacion() {
		return textCertificacion;
	}

	public void setTextCertificacion(TextField textCertificacion) {
		this.textCertificacion = textCertificacion;
	}

	public JLabel getLabelSO() {
		return labelSO;
	}

	public void setLabelSO(JLabel labelSO) {
		this.labelSO = labelSO;
	}

	public TextField getTextSO() {
		return textSO;
	}

	public void setTextSO(TextField textSO) {
		this.textSO = textSO;
	}

	public JLabel getLabelConectividad() {
		return labelConectividad;
	}

	public void setLabelConectividad(JLabel labelConectividad) {
		this.labelConectividad = labelConectividad;
	}

	public TextField getTextConectividad() {
		return textConectividad;
	}

	public void setTextConectividad(TextField textConectividad) {
		this.textConectividad = textConectividad;
	}


	public JLabel getLabelCrear() {
		return labelCrear;
	}

	public void setLabelCrear(JLabel labelCrear) {
		this.labelCrear = labelCrear;
	}
	
}
