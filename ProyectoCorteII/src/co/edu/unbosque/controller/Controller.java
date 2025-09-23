package co.edu.unbosque.controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Properties;

import javax.swing.JOptionPane;

import co.edu.unbosque.model.AccesorioVehiculo;
import co.edu.unbosque.model.Carrito;
import co.edu.unbosque.model.Electrodomestico;
import co.edu.unbosque.model.EquipoDeportivo;
import co.edu.unbosque.model.Herramienta;
import co.edu.unbosque.model.Inmueble;
import co.edu.unbosque.model.Juguete;
import co.edu.unbosque.model.ModelFacade;
import co.edu.unbosque.model.PrendaDeVestir;
import co.edu.unbosque.model.Producto;
import co.edu.unbosque.model.ProductoFarmaceutico;
import co.edu.unbosque.model.ProductoSostenible;
import co.edu.unbosque.model.Tecnologia;
import co.edu.unbosque.model.persistence.FileHandler;
import co.edu.unbosque.view.ViewFacade;

/**
 * 
 */
public class Controller implements ActionListener {
	private ViewFacade vf;
	private ModelFacade mf;
	private Properties prop;

	/**
	 * 
	 */
	public Controller() {
		vf = new ViewFacade();
		mf = new ModelFacade();
		prop = new Properties();
	}
	
	/**
	 * 
	 */
	public void runGUI() {
		String opcion = JOptionPane.showInputDialog(null,
				"Seleccione el idioma a ejecutar:\n1.Español\n2.English\n3.Português\n4.Latinus", "Seleccion idioma",
				JOptionPane.QUESTION_MESSAGE);
		switch (opcion) {
		case "1": {
			prop = FileHandler.cargarArchivoDePropiedades("spa.properties");
			vf.setProp(prop);
			vf.cargarIdioma();
			break;
		}
		case "2": {
			prop = FileHandler.cargarArchivoDePropiedades("eng.properties");
			vf.setProp(prop);
			vf.cargarIdioma();
			break;
		}
		case "3": {
			prop = FileHandler.cargarArchivoDePropiedades("por.properties");
			vf.setProp(prop);
			vf.cargarIdioma();
			break;
		}
		case "4": {
			prop = FileHandler.cargarArchivoDePropiedades("lat.properties");
			vf.setProp(prop);
			vf.cargarIdioma();
			break;
		}
		default:
			throw new IllegalArgumentException("Unexpected value: " + opcion);
		}
		vf.getVenMenu().setVisible(true);
		System.out.println(vf.getVenComprar().getPanelMostrar().getListaCategorias().getItemAt(5));
		asignarListeners();

	}

	public void asignarListeners() {

		vf.getVenMenu().getBtnIniciar().addActionListener(this);
		vf.getVenMenu().getBtnIniciar().setActionCommand("INICIAR");

		vf.getVenMenu().getBtnSalir().addActionListener(this);
		vf.getVenMenu().getBtnSalir().setActionCommand("SALIR");

		vf.getVenInicioSesion().getBtnEsComprador().addActionListener(this);
		vf.getVenInicioSesion().getBtnEsComprador().setActionCommand("ES_COMPRADOR");

		vf.getVenInicioSesion().getBtnEsVendedor().addActionListener(this);
		vf.getVenInicioSesion().getBtnEsVendedor().setActionCommand("ES_VENDEDOR");

		vf.getVenInicioSesion().getBtnVolver().addActionListener(this);
		vf.getVenInicioSesion().getBtnVolver().setActionCommand("VOLVER_OPCIONES");

		vf.getVenInicioComprador().getPanelCentral().getpInicioSesion().getBtnIniciarSesion().addActionListener(this);
		vf.getVenInicioComprador().getPanelCentral().getpInicioSesion().getBtnIniciarSesion()
				.setActionCommand("INICIAR_SESION_COMPRADOR");

		vf.getVenInicioComprador().getBtnVolver().addActionListener(this);
		vf.getVenInicioComprador().getBtnVolver().setActionCommand("VOLVER_ISCOMPRADOR");

		vf.getVenInicioVendedor().getPanelCentral().getpInicioSesion().getBtnIniciarSesion().addActionListener(this);
		vf.getVenInicioVendedor().getPanelCentral().getpInicioSesion().getBtnIniciarSesion()
				.setActionCommand("INICIAR_SESION_VENDEDOR");

		vf.getVenCRUD().getBtnVolver().addActionListener(this);
		vf.getVenCRUD().getBtnVolver().setActionCommand("VOLVER_MENU_CRUD");

		vf.getVenInicioVendedor().getBtnVolver().addActionListener(this);
		vf.getVenInicioVendedor().getBtnVolver().setActionCommand("VOLVER_ISVENDEDOR");

		vf.getVenInicioComprador().getPanelCentral().getpInicioSesion().getBtnRegistro().addActionListener(this);
		vf.getVenInicioComprador().getPanelCentral().getpInicioSesion().getBtnRegistro()
				.setActionCommand("REGISTRO_COMPRADOR");

		vf.getVenRegistroComprador().getBtnVolver().addActionListener(this);
		vf.getVenRegistroComprador().getBtnVolver().setActionCommand("VOLVER_REGISTRO_COMPRADOR");

		vf.getVenRegistroComprador().getBtnMenu().addActionListener(this);
		vf.getVenRegistroComprador().getBtnMenu().setActionCommand("VOLVER_MENU_REGISTRO_COMPRADOR");

		vf.getVenComprar().getBtnVolver().addActionListener(this);
		vf.getVenComprar().getBtnVolver().setActionCommand("VOLVER_COMPRA");

		vf.getVenInicioVendedor().getPanelCentral().getpInicioSesion().getBtnRegistro().addActionListener(this);
		vf.getVenInicioVendedor().getPanelCentral().getpInicioSesion().getBtnRegistro()
				.setActionCommand("REGISTRO_VENDEDOR");

		vf.getVenRegistroVendedor().getBtnVolver().addActionListener(this);
		vf.getVenRegistroVendedor().getBtnVolver().setActionCommand("VOLVER_REGISTRO_VENDEDOR");

		vf.getVenRegistroVendedor().getBtnMenu().addActionListener(this);
		vf.getVenRegistroVendedor().getBtnMenu().setActionCommand("VOLVER_MENU_REGISTRO_VENDEDOR");

		vf.getVenCRUD().getBtnCrear().addActionListener(this);
		vf.getVenCRUD().getBtnCrear().setActionCommand("BOTON_CREAR");

		vf.getVenCRUD().getPanelCRUD().getpCrear().getBtnCrear().addActionListener(this);
		vf.getVenCRUD().getPanelCRUD().getpCrear().getBtnCrear().setActionCommand("CREAR_ARTICULO");

		vf.getVenCRUD().getBtnMostrar().addActionListener(this);
		vf.getVenCRUD().getBtnMostrar().setActionCommand("BOTON_MOSTRAR");

		vf.getVenCRUD().getBtnActualizar().addActionListener(this);
		vf.getVenCRUD().getBtnActualizar().setActionCommand("BOTON_ACTUALIZAR");

		vf.getVenComprar().getBtnMostrar().addActionListener(this);
		vf.getVenComprar().getBtnMostrar().setActionCommand("BOTON_MOSTRAR_ARTICULO");
		;

		vf.getVenCRUD().getPanelCRUD().getpActualizar().getBtnActualizar().addActionListener(this);
		vf.getVenCRUD().getPanelCRUD().getpActualizar().getBtnActualizar().setActionCommand("ACTUALIZAR_ARTICULO");

		vf.getVenCRUD().getBtnEliminar().addActionListener(this);
		vf.getVenCRUD().getBtnEliminar().setActionCommand("BOTON_ELIMINAR");

		vf.getVenCRUD().getPanelCRUD().getpCrear().getListaCategorias().addActionListener(this);
		vf.getVenCRUD().getPanelCRUD().getpCrear().getListaCategorias().setActionCommand("COMBOBOX_CREAR");

		vf.getVenCRUD().getPanelCRUD().getpActualizar().getListaCategorias().addActionListener(this);
		vf.getVenCRUD().getPanelCRUD().getpActualizar().getListaCategorias().setActionCommand("COMBOBOX_ACTUALIZAR");

		vf.getVenCRUD().getPanelCRUD().getpMostrar().getListaCategoria().addActionListener(this);
		vf.getVenCRUD().getPanelCRUD().getpMostrar().getListaCategoria().setActionCommand("COMBOBOX_MOSTRAR");

		vf.getVenComprar().getPanelMostrar().getListaCategorias().addActionListener(this);
		vf.getVenComprar().getPanelMostrar().getListaCategorias().setActionCommand("COMBOBOX_MOSTRAR_PRODUCTO");

		vf.getVenComprar().getPanelMostrar().getBtnAgregarCarrito().addActionListener(this);
		vf.getVenComprar().getPanelMostrar().getBtnAgregarCarrito().setActionCommand("BOTON_AGREGAR_A_CARRITO");

		vf.getVenComprar().getPanelMostrar().getBtnCrearCarrito().addActionListener(this);
		vf.getVenComprar().getPanelMostrar().getBtnCrearCarrito().setActionCommand("BOTON_CREAR_CARRITO");
		
		vf.getVenComprar().getBtnCarrito().addActionListener(this);
		vf.getVenComprar().getBtnCarrito().setActionCommand("BOTON_PANEL_CARRITO");
		
		vf.getVenComprar().getPanelCarrito().getBtnMostrarCarritos().addActionListener(this);
		vf.getVenComprar().getPanelCarrito().getBtnMostrarCarritos().setActionCommand("BOTON_MOSTRAR_CARRITOS");

	}


	public void actionPerformed(ActionEvent e) {
		switch (e.getActionCommand()) {
		case "INICIAR": {
			vf.getVenMenu().setVisible(false);
			vf.getVenInicioSesion().setVisible(true);
			break;
		}
		case "SALIR": {
			vf.getVenMenu().dispose();
			break;
		}
		case "ES_COMPRADOR": {
			vf.getVenInicioSesion().setVisible(false);
			vf.getVenInicioComprador().setVisible(true);
			break;
		}
		case "ES_VENDEDOR": {
			vf.getVenInicioSesion().setVisible(false);
			vf.getVenInicioVendedor().setVisible(true);
			break;
		}
		case "VOLVER_OPCIONES": {
			vf.getVenInicioSesion().setVisible(false);
			vf.getVenMenu().setVisible(true);
			break;

		}
		case "INICIAR_SESION_VENDEDOR": {


		/*	String usuario = vf.getVenInicioVendedor().getPanelCentral().getpInicioSesion().getTextUsuario().getText();
			char[] contrasenaChar = vf.getVenInicioVendedor().getPanelCentral().getpInicioSesion().getTextContrasena()

			String usuario = vf.getVenInic2ioVendedor().getPanelCentral().getpInicioSesion().getTextUsuario().getText();
			char[] contrasenaChar = vf.getVenInicioVendedor().getPanelCentral().getpInicioSesion().getTextContrasena()

					.getPassword();
			String contrasena = new String(contrasenaChar);

			if (mf.getVendedorDAO().getListaVendedores().contains(contrasena)

					&& mf.getVendedorDAO().getListaVendedores().contains(usuario)) {
				vf.getVenInicioVendedor().setVisible(false);
			
					&& mf.getVendedorDAO().getListaVendedores().contains(usuario)) {
				vf.getVenInicioVendedor().setVisible(false);*/

				vf.getVenCRUD().setVisible(true);
				
			} /*else {

				JOptionPane.showMessageDialog(vf.getVenInicioVendedor(),
						"El usuario o la contraseña no existen en el sistema.", "Error de inicio de sesión",
						JOptionPane.ERROR_MESSAGE);

			}
=======
			/**
			 * String usuario =
			 * vf.getVenInicioVendedor().getPanelCentral().getpInicioSesion().getTextUsuario().getText();
			 * /char[] contrasenaChar =
			 * vf.getVenInicioVendedor().getPanelCentral().getpInicioSesion().getTextContrasena()
			 * .getPassword(); String contrasena = new String(contrasenaChar);
			 * 
			 * if (mf.getVendedorDAO().getListaVendedores().contains(contrasena) &&
			 * mf.getVendedorDAO().getListaVendedores().contains(usuario)) {
			 */
			vf.getVenInicioVendedor().setVisible(false);
			vf.getVenCRUD().setVisible(true);
			/*
			 * } else { JOptionPane.showMessageDialog(vf.getVenInicioVendedor(),
			 * "El usuario o la contraseña no existen en el sistema.",
			 * "Error de inicio de sesión", JOptionPane.ERROR_MESSAGE);
			 * 
			 * }
			 


			break;

		}*/

		case "VOLVER_COMPRA": {
			vf.getVenMenu().setVisible(true);
			vf.getVenComprar().setVisible(false);
			break;
		}

		case "INICIAR_SESION_COMPRADOR": {

		/*	String usuario = vf.getVenInicioComprador().getPanelCentral().getpInicioSesion().getTextUsuario().getText();
			char[] contrasenaChar = vf.getVenInicioComprador().getPanelCentral().getpInicioSesion().getTextContrasena()
					.getPassword();
			String contrasena = new String(contrasenaChar);

			// String usuario =
			// vf.getVenInicioComprador().getPanelCentral().getpInicioSesion().getTextUsuario().getText();
			// char[] contrasenaChar =
			// vf.getVenInicioComprador().getPanelCentral().getpInicioSesion().getTextContrasena()
			// .getPassword();
			// String contrasena = new String(contrasenaChar);



			if (mf.getCompradorDAO().getListaCompradores().contains(contrasenaChar)
					&& mf.getCompradorDAO().getListaCompradores().contains(usuario)) {*/
				vf.getVenInicioComprador().setVisible(false);
				vf.getVenComprar().setVisible(true);
				/*JOptionPane.showMessageDialog(vf.getVenInicioComprador(),
						"El usuario o la contraseña no existen en el sistema.", "Error de inicio de sesión",
						JOptionPane.ERROR_MESSAGE);
			}

			// if (mf.getCompradorDAO().getListaCompradores().contains(contrasenaChar)
			// && mf.getCompradorDAO().getListaCompradores().contains(usuario)) {
			vf.getVenInicioComprador().setVisible(false);
			vf.getVenComprar().setVisible(true);
			// JOptionPane.showMessageDialog(vf.getVenInicioComprador(),
			// "El usuario o la contraseña no existen en el sistema.", "Error de inicio de
			// sesión",
			// JOptionPane.ERROR_MESSAGE);
			// }

			break;
*/
		}
		case "BOTON_PANEL_CARRITO":{
			vf.getVenComprar().getPanelMostrar().setVisible(false);
			vf.getVenComprar().getPanelCarrito().setVisible(true);
			break;
		}

		case "BOTON_MOSTRAR_ARTICULO": {

			vf.getVenComprar().getPanelCarrito().setVisible(false);
			vf.getVenComprar().getPanelMostrar().setVisible(true);
			break;

		}

		case "VOLVER_MENU_CRUD": {
			vf.getVenMenu().setVisible(true);
			vf.getVenCRUD().setVisible(false);
			break;
		}

		case "VOLVER_ISCOMPRADOR": {
			vf.getVenInicioComprador().setVisible(false);
			vf.getVenInicioSesion().setVisible(true);
			break;
		}
		case "VOLVER_ISVENDEDOR": {
			vf.getVenInicioVendedor().setVisible(false);
			vf.getVenInicioSesion().setVisible(true);
			break;
		}
		case "REGISTRO_COMPRADOR": {
			vf.getVenInicioComprador().setVisible(false);
			vf.getVenRegistroComprador().setVisible(true);
			break;
		}
		case "VOLVER_REGISTRO_COMPRADOR": {
			vf.getVenInicioComprador().setVisible(true);
			vf.getVenRegistroComprador().setVisible(false);
			break;
		}
		case "VOLVER_MENU_REGISTRO_COMPRADOR": {
			vf.getVenRegistroComprador().setVisible(false);
			vf.getVenMenu().setVisible(true);
			break;
		}
		case "REGISTRO_VENDEDOR": {
			vf.getVenInicioVendedor().setVisible(false);
			vf.getVenRegistroVendedor().setVisible(true);
			break;
		}
		case "VOLVER_REGISTRO_VENDEDOR": {
			vf.getVenInicioVendedor().setVisible(true);
			vf.getVenRegistroVendedor().setVisible(false);
			break;
		}
		case "VOLVER_MENU_REGISTRO_VENDEDOR": {
			vf.getVenRegistroVendedor().setVisible(false);
			vf.getVenMenu().setVisible(true);
			break;
		}
		case "BOTON_CREAR": {
			vf.getVenCRUD().getPanelCRUD().mostrarPanel("panelCrear");
			break;
		}

		case "BOTON_MOSTRAR": {
			vf.getVenCRUD().getPanelCRUD().mostrarPanel("panelMostrar");
			break;
		}
		case "BOTON_ACTUALIZAR": {
			vf.getVenCRUD().getPanelCRUD().mostrarPanel("panelActualizar");
			break;
		}
		case "BOTON_ELIMINAR": {
			vf.getVenCRUD().getPanelCRUD().mostrarPanel("panelEliminar");
			break;
		}

		case "COMBOBOX_CREAR": {
			String seleccionado = (String) vf.getVenCRUD().getPanelCRUD().getpCrear().getListaCategorias()
					.getSelectedItem();
			if (seleccionado.equals("-Seleccione-")) {
				vf.getVenCRUD().getPanelCRUD().getpCrear().ocultarOpcionesEspecificas();
			} else if (seleccionado.equals("Accesorio para vehiculo")) {
				vf.getVenCRUD().getPanelCRUD().getpCrear().ocultarOpcionesEspecificas();
				vf.getVenCRUD().getPanelCRUD().getpCrear().mostrarAccesorioCarro();
			} else if (seleccionado.equals("Electrodomestico")) {
				vf.getVenCRUD().getPanelCRUD().getpCrear().ocultarOpcionesEspecificas();
				vf.getVenCRUD().getPanelCRUD().getpCrear().mostrarElectrodomestico();
			} else if (seleccionado.equals("Equipo deportivo")) {
				vf.getVenCRUD().getPanelCRUD().getpCrear().ocultarOpcionesEspecificas();
				vf.getVenCRUD().getPanelCRUD().getpCrear().mostrarEquipoDeporte();
			} else if (seleccionado.equals("Herramientas")) {
				vf.getVenCRUD().getPanelCRUD().getpCrear().ocultarOpcionesEspecificas();
				vf.getVenCRUD().getPanelCRUD().getpCrear().mostrarHerramienta();
			} else if (seleccionado.equals("Inmuebles")) {
				vf.getVenCRUD().getPanelCRUD().getpCrear().ocultarOpcionesEspecificas();
				vf.getVenCRUD().getPanelCRUD().getpCrear().mostrarInmueble();
			} else if (seleccionado.equals("Juguetes")) {
				vf.getVenCRUD().getPanelCRUD().getpCrear().ocultarOpcionesEspecificas();
				vf.getVenCRUD().getPanelCRUD().getpCrear().mostrarJuguete();
			} else if (seleccionado.equals("Prenda de vestir")) {
				vf.getVenCRUD().getPanelCRUD().getpCrear().ocultarOpcionesEspecificas();
				vf.getVenCRUD().getPanelCRUD().getpCrear().mostrarPrendaVestir();
			} else if (seleccionado.equals("Producto farmaceutico")) {
				vf.getVenCRUD().getPanelCRUD().getpCrear().ocultarOpcionesEspecificas();
				vf.getVenCRUD().getPanelCRUD().getpCrear().mostrarFarmaceutico();
			} else if (seleccionado.equals("Producto sostenible")) {
				vf.getVenCRUD().getPanelCRUD().getpCrear().ocultarOpcionesEspecificas();
				vf.getVenCRUD().getPanelCRUD().getpCrear().mostrarSostenible();
			} else if (seleccionado.equals("Tecnologia")) {
				vf.getVenCRUD().getPanelCRUD().getpCrear().ocultarOpcionesEspecificas();
				vf.getVenCRUD().getPanelCRUD().getpCrear().mostrarTecnologia();
			}
			break;
		}

		case "COMBOBOX_ACTUALIZAR": {

			String seleccionado = (String) vf.getVenCRUD().getPanelCRUD().getpActualizar().getListaCategorias()
					.getSelectedItem();
			if (seleccionado.equals("-Seleccione-")) {
				vf.getVenCRUD().getPanelCRUD().getpActualizar().ocultarOpcionesEspecificas();
			} else if (seleccionado.equals("Accesorio para vehiculo")) {
				vf.getVenCRUD().getPanelCRUD().getpActualizar().ocultarOpcionesEspecificas();
				vf.getVenCRUD().getPanelCRUD().getpActualizar().mostrarAccesorioCarro();
			} else if (seleccionado.equals("Electrodomestico")) {
				vf.getVenCRUD().getPanelCRUD().getpActualizar().ocultarOpcionesEspecificas();
				vf.getVenCRUD().getPanelCRUD().getpActualizar().mostrarElectrodomestico();
			} else if (seleccionado.equals("Equipo deportivo")) {
				vf.getVenCRUD().getPanelCRUD().getpActualizar().ocultarOpcionesEspecificas();
				vf.getVenCRUD().getPanelCRUD().getpActualizar().mostrarEquipoDeporte();
			} else if (seleccionado.equals("Herramientas")) {
				vf.getVenCRUD().getPanelCRUD().getpActualizar().ocultarOpcionesEspecificas();
				vf.getVenCRUD().getPanelCRUD().getpActualizar().mostrarHerramienta();
			} else if (seleccionado.equals("Inmuebles")) {
				vf.getVenCRUD().getPanelCRUD().getpActualizar().ocultarOpcionesEspecificas();
				vf.getVenCRUD().getPanelCRUD().getpActualizar().mostrarInmueble();
			} else if (seleccionado.equals("Juguetes")) {
				vf.getVenCRUD().getPanelCRUD().getpActualizar().ocultarOpcionesEspecificas();
				vf.getVenCRUD().getPanelCRUD().getpActualizar().mostrarJuguete();
			} else if (seleccionado.equals("Prenda de vestir")) {
				vf.getVenCRUD().getPanelCRUD().getpActualizar().ocultarOpcionesEspecificas();
				vf.getVenCRUD().getPanelCRUD().getpActualizar().mostrarPrendaVestir();
			} else if (seleccionado.equals("Producto farmaceutico")) {
				vf.getVenCRUD().getPanelCRUD().getpActualizar().ocultarOpcionesEspecificas();
				vf.getVenCRUD().getPanelCRUD().getpActualizar().mostrarFarmaceutico();
			} else if (seleccionado.equals("Producto sostenible")) {
				vf.getVenCRUD().getPanelCRUD().getpActualizar().ocultarOpcionesEspecificas();
				vf.getVenCRUD().getPanelCRUD().getpActualizar().mostrarSostenible();
			} else if (seleccionado.equals("Tecnologia")) {
				vf.getVenCRUD().getPanelCRUD().getpActualizar().ocultarOpcionesEspecificas();
				vf.getVenCRUD().getPanelCRUD().getpActualizar().mostrarTecnologia();
			}
			break;
		}

		case "CREAR_ARTICULO": { // funcion creacion articulo

			String artSeleccionado = (String) vf.getVenCRUD().getPanelCRUD().getpCrear().getListaCategorias()
					.getSelectedItem();

			if (artSeleccionado.equals("Accesorio para vehiculo")) {
				String nombre = vf.getVenCRUD().getPanelCRUD().getpCrear().getTextNombre().getText();
				int cantidad = Integer.parseInt(vf.getVenCRUD().getPanelCRUD().getpCrear().getTextCantidad().getText());
				float precio = Float.parseFloat(vf.getVenCRUD().getPanelCRUD().getpCrear().getTextPrecio().getText());
				String material = vf.getVenCRUD().getPanelCRUD().getpCrear().getTextMaterialAccesorio().getText();
				String compatibilidad = vf.getVenCRUD().getPanelCRUD().getpCrear().getTextCompatibilidad().getText();

				AccesorioVehiculo accesorioVehiculo = new AccesorioVehiculo(nombre, cantidad, precio, material,
						compatibilidad);
				mf.getAccesorioVehiculoDAO().create(accesorioVehiculo);

				JOptionPane.showMessageDialog(null, "Artículo Creado", "Crear artículo",
						JOptionPane.INFORMATION_MESSAGE, null);

				vf.getVenCRUD().getPanelCRUD().getpCrear().limpiarCampos();

			} else if (artSeleccionado.equals("Electrodomestico")) {
				String nombre = vf.getVenCRUD().getPanelCRUD().getpCrear().getTextNombre().getText();
				int cantidad = Integer.parseInt(vf.getVenCRUD().getPanelCRUD().getpCrear().getTextCantidad().getText());
				float precio = Float.parseFloat(vf.getVenCRUD().getPanelCRUD().getpCrear().getTextPrecio().getText());
				String consumoEnergia = vf.getVenCRUD().getPanelCRUD().getpCrear().getTextConsumo().getText();
				String capacidad = vf.getVenCRUD().getPanelCRUD().getpCrear().getTextCapacidad().getText();
				Electrodomestico electrodomestico = new Electrodomestico(nombre, cantidad, precio, consumoEnergia,
						capacidad);
				mf.getElectrodomesticoDAO().create(electrodomestico);

				JOptionPane.showMessageDialog(null, "Artículo Creado", "Crear artículo",
						JOptionPane.INFORMATION_MESSAGE, null);

				vf.getVenCRUD().getPanelCRUD().getpCrear().limpiarCampos();

			} else if (artSeleccionado.equals("Equipo deportivo")) {
				String nombre = vf.getVenCRUD().getPanelCRUD().getpCrear().getTextNombre().getText();
				int cantidad = Integer.parseInt(vf.getVenCRUD().getPanelCRUD().getpCrear().getTextCantidad().getText());
				float precio = Float.parseFloat(vf.getVenCRUD().getPanelCRUD().getpCrear().getTextPrecio().getText());
				String deporte = vf.getVenCRUD().getPanelCRUD().getpCrear().getTextDeporte().getText();
				String material = vf.getVenCRUD().getPanelCRUD().getpCrear().getTextMaterialDeporte().getText();
				EquipoDeportivo equipoDeportivo = new EquipoDeportivo(nombre, cantidad, precio, deporte, material);
				mf.getEquipoDeportivoDAO().create(equipoDeportivo);

				JOptionPane.showMessageDialog(null, "Artículo Creado", "Crear artículo",
						JOptionPane.INFORMATION_MESSAGE, null);

				vf.getVenCRUD().getPanelCRUD().getpCrear().limpiarCampos();

			} else if (artSeleccionado.equals("Herramientas")) {
				String nombre = vf.getVenCRUD().getPanelCRUD().getpCrear().getTextNombre().getText();
				int cantidad = Integer.parseInt(vf.getVenCRUD().getPanelCRUD().getpCrear().getTextCantidad().getText());
				float precio = Float.parseFloat(vf.getVenCRUD().getPanelCRUD().getpCrear().getTextPrecio().getText());
				String tipoAlimentacion = vf.getVenCRUD().getPanelCRUD().getpCrear().getTextAlimentacion().getText();
				String material = vf.getVenCRUD().getPanelCRUD().getpCrear().getTextMaterialHerramienta().getText();
				Herramienta herramienta = new Herramienta(nombre, cantidad, precio, tipoAlimentacion, material);
				mf.getHerramientaDAO().create(herramienta);

				JOptionPane.showMessageDialog(null, "Artículo Creado", "Crear artículo",
						JOptionPane.INFORMATION_MESSAGE, null);

				vf.getVenCRUD().getPanelCRUD().getpCrear().limpiarCampos();

			} else if (artSeleccionado.equals("Inmuebles")) {
				String nombre = vf.getVenCRUD().getPanelCRUD().getpCrear().getTextNombre().getText();
				int cantidad = Integer.parseInt(vf.getVenCRUD().getPanelCRUD().getpCrear().getTextCantidad().getText());
				float precio = Float.parseFloat(vf.getVenCRUD().getPanelCRUD().getpCrear().getTextPrecio().getText());
				String area = vf.getVenCRUD().getPanelCRUD().getpCrear().getTextArea().getText();
				String cantidadCuarto = vf.getVenCRUD().getPanelCRUD().getpCrear().getTextCantidadCuarto().getText();
				Inmueble inmueble = new Inmueble(nombre, cantidad, precio, area, cantidadCuarto);
				mf.getInmbuenleDAO().create(inmueble);

				JOptionPane.showMessageDialog(null, "Artículo Creado", "Crear artículo",
						JOptionPane.INFORMATION_MESSAGE, null);

				vf.getVenCRUD().getPanelCRUD().getpCrear().limpiarCampos();

			} else if (artSeleccionado.equals("Juguetes")) {
				String nombre = vf.getVenCRUD().getPanelCRUD().getpCrear().getTextNombre().getText();
				int cantidad = Integer.parseInt(vf.getVenCRUD().getPanelCRUD().getpCrear().getTextCantidad().getText());
				float precio = Float.parseFloat(vf.getVenCRUD().getPanelCRUD().getpCrear().getTextPrecio().getText());
				String edadRecomendada = vf.getVenCRUD().getPanelCRUD().getpCrear().getTextEdad().getText();
				String material = vf.getVenCRUD().getPanelCRUD().getpCrear().getTextMaterialJuguete().getText();
				Juguete juguete = new Juguete(nombre, cantidad, precio, edadRecomendada, material);
				mf.getJugueteDAO().create(juguete);

				JOptionPane.showMessageDialog(null, "Artículo Creado", "Crear artículo",
						JOptionPane.INFORMATION_MESSAGE, null);

				vf.getVenCRUD().getPanelCRUD().getpCrear().limpiarCampos();

			} else if (artSeleccionado.equals("Prenda de vestir")) {
				String nombre = vf.getVenCRUD().getPanelCRUD().getpCrear().getTextNombre().getText();
				int cantidad = Integer.parseInt(vf.getVenCRUD().getPanelCRUD().getpCrear().getTextCantidad().getText());
				float precio = Float.parseFloat(vf.getVenCRUD().getPanelCRUD().getpCrear().getTextPrecio().getText());
				String talla = vf.getVenCRUD().getPanelCRUD().getpCrear().getTextTalla().getText();
				String tipoTela = vf.getVenCRUD().getPanelCRUD().getpCrear().getTextTipoTela().getText();
				PrendaDeVestir prendaDeVestir = new PrendaDeVestir(nombre, cantidad, precio, talla, tipoTela);
				mf.getPrendaDAO().create(prendaDeVestir);

				JOptionPane.showMessageDialog(null, "Artículo Creado", "Crear artículo",
						JOptionPane.INFORMATION_MESSAGE, null);

				vf.getVenCRUD().getPanelCRUD().getpCrear().limpiarCampos();

			} else if (artSeleccionado.equals("Producto farmaceutico")) {
				String nombre = vf.getVenCRUD().getPanelCRUD().getpCrear().getTextNombre().getText();
				int cantidad = Integer.parseInt(vf.getVenCRUD().getPanelCRUD().getpCrear().getTextCantidad().getText());
				float precio = Float.parseFloat(vf.getVenCRUD().getPanelCRUD().getpCrear().getTextPrecio().getText());
				String formaFarmaceutico = vf.getVenCRUD().getPanelCRUD().getpCrear().getTextFormaFarmaceutica()
						.getText();
				String concentracion = vf.getVenCRUD().getPanelCRUD().getpCrear().getTextConcentracion().getText();
				ProductoFarmaceutico productoFarmaceutico = new ProductoFarmaceutico(nombre, cantidad, precio,
						formaFarmaceutico, concentracion);
				mf.getProductoFarmaceuticoDAO().create(productoFarmaceutico);

				JOptionPane.showMessageDialog(null, "Artículo Creado", "Crear artículo",
						JOptionPane.INFORMATION_MESSAGE, null);

				vf.getVenCRUD().getPanelCRUD().getpCrear().limpiarCampos();

			} else if (artSeleccionado.equals("Producto sostenible")) {
				String nombre = vf.getVenCRUD().getPanelCRUD().getpCrear().getTextNombre().getText();
				int cantidad = Integer.parseInt(vf.getVenCRUD().getPanelCRUD().getpCrear().getTextCantidad().getText());
				float precio = Float.parseFloat(vf.getVenCRUD().getPanelCRUD().getpCrear().getTextPrecio().getText());
				String materialEcologico = vf.getVenCRUD().getPanelCRUD().getpCrear().getTextMaterialEcologico()
						.getText();
				String certificacion = vf.getVenCRUD().getPanelCRUD().getpCrear().getTextCertificacion().getText();
				ProductoSostenible productoSostenible = new ProductoSostenible(nombre, cantidad, precio,
						materialEcologico, certificacion);
				mf.getProductoSostenibleDAO().create(productoSostenible);

				JOptionPane.showMessageDialog(null, "Artículo Creado", "Crear artículo",
						JOptionPane.INFORMATION_MESSAGE, null);

				vf.getVenCRUD().getPanelCRUD().getpCrear().limpiarCampos();

			} else if (artSeleccionado.equals("Tecnologia")) {
				String nombre = vf.getVenCRUD().getPanelCRUD().getpCrear().getTextNombre().getText();
				int cantidad = Integer.parseInt(vf.getVenCRUD().getPanelCRUD().getpCrear().getTextCantidad().getText());
				float precio = Float.parseFloat(vf.getVenCRUD().getPanelCRUD().getpCrear().getTextPrecio().getText());
				String sistemaOperativo = vf.getVenCRUD().getPanelCRUD().getpCrear().getTextSO().getText();
				String conectividad = vf.getVenCRUD().getPanelCRUD().getpCrear().getTextConectividad().getText();
				Tecnologia tecnologia = new Tecnologia(nombre, cantidad, precio, sistemaOperativo, conectividad);
				mf.getTecnologoiaDAO().create(tecnologia);

				JOptionPane.showMessageDialog(null, "Artículo Creado", "Crear artículo",
						JOptionPane.INFORMATION_MESSAGE, null);

				vf.getVenCRUD().getPanelCRUD().getpCrear().limpiarCampos();

			}
			break;
		}

		case "ACTUALIZAR_ARTICULO": {
			String artSeleccionado = (String) vf.getVenCRUD().getPanelCRUD().getpCrear().getListaCategorias()
					.getSelectedItem();

			if (artSeleccionado.equals("Accesorio para vehiculo")) {
				String nombre = vf.getVenCRUD().getPanelCRUD().getpCrear().getTextNombre().getText();
				int cantidad = Integer.parseInt(vf.getVenCRUD().getPanelCRUD().getpCrear().getTextCantidad().getText());
				float precio = Float.parseFloat(vf.getVenCRUD().getPanelCRUD().getpCrear().getTextPrecio().getText());
				String material = vf.getVenCRUD().getPanelCRUD().getpCrear().getTextMaterialAccesorio().getText();
				String compatibilidad = vf.getVenCRUD().getPanelCRUD().getpCrear().getTextCompatibilidad().getText();

				int indice = Integer
						.parseInt(vf.getVenCRUD().getPanelCRUD().getpActualizar().getIndiceText().getText());
				AccesorioVehiculo accesorioVehiculo = new AccesorioVehiculo(nombre, cantidad, precio, material,
						compatibilidad);
				mf.getAccesorioVehiculoDAO().update(indice, accesorioVehiculo);

				JOptionPane.showMessageDialog(null, "Artículo Actualizado", "Actualizar artículo",
						JOptionPane.INFORMATION_MESSAGE, null);

				vf.getVenCRUD().getPanelCRUD().getpActualizar().limpiarCampos();

			} else if (artSeleccionado.equals("Electrodomestico")) {
				String nombre = vf.getVenCRUD().getPanelCRUD().getpCrear().getTextNombre().getText();
				int cantidad = Integer.parseInt(vf.getVenCRUD().getPanelCRUD().getpCrear().getTextCantidad().getText());
				float precio = Float.parseFloat(vf.getVenCRUD().getPanelCRUD().getpCrear().getTextPrecio().getText());
				String consumoEnergia = vf.getVenCRUD().getPanelCRUD().getpCrear().getTextConsumo().getText();
				String capacidad = vf.getVenCRUD().getPanelCRUD().getpCrear().getTextCapacidad().getText();

				int indice = Integer
						.parseInt(vf.getVenCRUD().getPanelCRUD().getpActualizar().getIndiceText().getText());
				Electrodomestico electrodomestico = new Electrodomestico(nombre, cantidad, precio, consumoEnergia,
						capacidad);
				mf.getElectrodomesticoDAO().update(indice, electrodomestico);

				JOptionPane.showMessageDialog(null, "Artículo Actualizado", "Actualizar artículo",
						JOptionPane.INFORMATION_MESSAGE, null);

				vf.getVenCRUD().getPanelCRUD().getpActualizar().limpiarCampos();
				;

			} else if (artSeleccionado.equals("Equipo deportivo")) {
				String nombre = vf.getVenCRUD().getPanelCRUD().getpCrear().getTextNombre().getText();
				int cantidad = Integer.parseInt(vf.getVenCRUD().getPanelCRUD().getpCrear().getTextCantidad().getText());
				float precio = Float.parseFloat(vf.getVenCRUD().getPanelCRUD().getpCrear().getTextPrecio().getText());
				String deporte = vf.getVenCRUD().getPanelCRUD().getpCrear().getTextDeporte().getText();
				String material = vf.getVenCRUD().getPanelCRUD().getpCrear().getTextMaterialDeporte().getText();

				int indice = Integer
						.parseInt(vf.getVenCRUD().getPanelCRUD().getpActualizar().getIndiceText().getText());
				EquipoDeportivo equipoDeportivo = new EquipoDeportivo(nombre, cantidad, precio, deporte, material);
				mf.getEquipoDeportivoDAO().update(indice, equipoDeportivo);

				JOptionPane.showMessageDialog(null, "Artículo Actualizado", "Actualizar artículo",
						JOptionPane.INFORMATION_MESSAGE, null);

				vf.getVenCRUD().getPanelCRUD().getpActualizar().limpiarCampos();

			} else if (artSeleccionado.equals("Herramientas")) {
				String nombre = vf.getVenCRUD().getPanelCRUD().getpCrear().getTextNombre().getText();
				int cantidad = Integer.parseInt(vf.getVenCRUD().getPanelCRUD().getpCrear().getTextCantidad().getText());
				float precio = Float.parseFloat(vf.getVenCRUD().getPanelCRUD().getpCrear().getTextPrecio().getText());
				String tipoAlimentacion = vf.getVenCRUD().getPanelCRUD().getpCrear().getTextAlimentacion().getText();
				String material = vf.getVenCRUD().getPanelCRUD().getpCrear().getTextMaterialHerramienta().getText();

				int indice = Integer
						.parseInt(vf.getVenCRUD().getPanelCRUD().getpActualizar().getIndiceText().getText());
				Herramienta herramienta = new Herramienta(nombre, cantidad, precio, tipoAlimentacion, material);
				mf.getHerramientaDAO().update(indice, herramienta);

				JOptionPane.showMessageDialog(null, "Artículo Actualizado", "Actualizar artículo",
						JOptionPane.INFORMATION_MESSAGE, null);

				vf.getVenCRUD().getPanelCRUD().getpActualizar().limpiarCampos();

			} else if (artSeleccionado.equals("Inmuebles")) {
				String nombre = vf.getVenCRUD().getPanelCRUD().getpCrear().getTextNombre().getText();
				int cantidad = Integer.parseInt(vf.getVenCRUD().getPanelCRUD().getpCrear().getTextCantidad().getText());
				float precio = Float.parseFloat(vf.getVenCRUD().getPanelCRUD().getpCrear().getTextPrecio().getText());
				String area = vf.getVenCRUD().getPanelCRUD().getpCrear().getTextArea().getText();
				String cantidadCuarto = vf.getVenCRUD().getPanelCRUD().getpCrear().getTextCantidadCuarto().getText();

				int indice = Integer
						.parseInt(vf.getVenCRUD().getPanelCRUD().getpActualizar().getIndiceText().getText());
				Inmueble inmueble = new Inmueble(nombre, cantidad, precio, area, cantidadCuarto);
				mf.getInmbuenleDAO().update(indice, inmueble);

				JOptionPane.showMessageDialog(null, "Artículo Actualizado", "Actualizar artículo",
						JOptionPane.INFORMATION_MESSAGE, null);

				vf.getVenCRUD().getPanelCRUD().getpActualizar().limpiarCampos();

			} else if (artSeleccionado.equals("Juguetes")) {
				String nombre = vf.getVenCRUD().getPanelCRUD().getpCrear().getTextNombre().getText();
				int cantidad = Integer.parseInt(vf.getVenCRUD().getPanelCRUD().getpCrear().getTextCantidad().getText());
				float precio = Float.parseFloat(vf.getVenCRUD().getPanelCRUD().getpCrear().getTextPrecio().getText());
				String edadRecomendada = vf.getVenCRUD().getPanelCRUD().getpCrear().getTextEdad().getText();
				String material = vf.getVenCRUD().getPanelCRUD().getpCrear().getTextMaterialJuguete().getText();

				int indice = Integer
						.parseInt(vf.getVenCRUD().getPanelCRUD().getpActualizar().getIndiceText().getText());
				Juguete juguete = new Juguete(nombre, cantidad, precio, edadRecomendada, material);
				mf.getJugueteDAO().update(indice, juguete);

				JOptionPane.showMessageDialog(null, "Artículo Actualizado", "Actualizar artículo",
						JOptionPane.INFORMATION_MESSAGE, null);

				vf.getVenCRUD().getPanelCRUD().getpActualizar().limpiarCampos();

			} else if (artSeleccionado.equals("Prenda de vestir")) {
				String nombre = vf.getVenCRUD().getPanelCRUD().getpCrear().getTextNombre().getText();
				int cantidad = Integer.parseInt(vf.getVenCRUD().getPanelCRUD().getpCrear().getTextCantidad().getText());
				float precio = Float.parseFloat(vf.getVenCRUD().getPanelCRUD().getpCrear().getTextPrecio().getText());
				String talla = vf.getVenCRUD().getPanelCRUD().getpCrear().getTextTalla().getText();
				String tipoTela = vf.getVenCRUD().getPanelCRUD().getpCrear().getTextTipoTela().getText();

				int indice = Integer
						.parseInt(vf.getVenCRUD().getPanelCRUD().getpActualizar().getIndiceText().getText());
				PrendaDeVestir prendaDeVestir = new PrendaDeVestir(nombre, cantidad, precio, talla, tipoTela);
				mf.getPrendaDAO().update(indice, prendaDeVestir);

				JOptionPane.showMessageDialog(null, "Artículo Actualizado", "Actualizar artículo",
						JOptionPane.INFORMATION_MESSAGE, null);

				vf.getVenCRUD().getPanelCRUD().getpActualizar().limpiarCampos();

			} else if (artSeleccionado.equals("Producto farmaceutico")) {
				String nombre = vf.getVenCRUD().getPanelCRUD().getpCrear().getTextNombre().getText();
				int cantidad = Integer.parseInt(vf.getVenCRUD().getPanelCRUD().getpCrear().getTextCantidad().getText());
				float precio = Float.parseFloat(vf.getVenCRUD().getPanelCRUD().getpCrear().getTextPrecio().getText());
				String formaFarmaceutico = vf.getVenCRUD().getPanelCRUD().getpCrear().getTextFormaFarmaceutica()
						.getText();
				String concentracion = vf.getVenCRUD().getPanelCRUD().getpCrear().getTextConcentracion().getText();

				int indice = Integer
						.parseInt(vf.getVenCRUD().getPanelCRUD().getpActualizar().getIndiceText().getText());
				ProductoFarmaceutico productoFarmaceutico = new ProductoFarmaceutico(nombre, cantidad, precio,
						formaFarmaceutico, concentracion);
				mf.getProductoFarmaceuticoDAO().update(indice, productoFarmaceutico);

				JOptionPane.showMessageDialog(null, "Artículo Actualizado", "Actualizar artículo",
						JOptionPane.INFORMATION_MESSAGE, null);

				vf.getVenCRUD().getPanelCRUD().getpActualizar().limpiarCampos();

			} else if (artSeleccionado.equals("Producto sostenible")) {
				String nombre = vf.getVenCRUD().getPanelCRUD().getpCrear().getTextNombre().getText();
				int cantidad = Integer.parseInt(vf.getVenCRUD().getPanelCRUD().getpCrear().getTextCantidad().getText());
				float precio = Float.parseFloat(vf.getVenCRUD().getPanelCRUD().getpCrear().getTextPrecio().getText());
				String materialEcologico = vf.getVenCRUD().getPanelCRUD().getpCrear().getTextMaterialEcologico()
						.getText();
				String certificacion = vf.getVenCRUD().getPanelCRUD().getpCrear().getTextCertificacion().getText();

				int indice = Integer
						.parseInt(vf.getVenCRUD().getPanelCRUD().getpActualizar().getIndiceText().getText());
				ProductoSostenible productoSostenible = new ProductoSostenible(nombre, cantidad, precio,
						materialEcologico, certificacion);
				mf.getProductoSostenibleDAO().update(indice, productoSostenible);

				JOptionPane.showMessageDialog(null, "Artículo Actualizado", "Actualizar artículo",
						JOptionPane.INFORMATION_MESSAGE, null);

				vf.getVenCRUD().getPanelCRUD().getpActualizar().limpiarCampos();

			} else if (artSeleccionado.equals("Tecnologia")) {
				String nombre = vf.getVenCRUD().getPanelCRUD().getpCrear().getTextNombre().getText();
				int cantidad = Integer.parseInt(vf.getVenCRUD().getPanelCRUD().getpCrear().getTextCantidad().getText());
				float precio = Float.parseFloat(vf.getVenCRUD().getPanelCRUD().getpCrear().getTextPrecio().getText());
				String sistemaOperativo = vf.getVenCRUD().getPanelCRUD().getpCrear().getTextSO().getText();
				String conectividad = vf.getVenCRUD().getPanelCRUD().getpCrear().getTextConectividad().getText();

				int indice = Integer
						.parseInt(vf.getVenCRUD().getPanelCRUD().getpActualizar().getIndiceText().getText());
				Tecnologia tecnologia = new Tecnologia(nombre, cantidad, precio, sistemaOperativo, conectividad);
				mf.getTecnologoiaDAO().update(indice, tecnologia);

				JOptionPane.showMessageDialog(null, "Artículo Actualizado", "Actualizar artículo",
						JOptionPane.INFORMATION_MESSAGE, null);

				vf.getVenCRUD().getPanelCRUD().getpActualizar().limpiarCampos();

			}
			break;
		}
		case "COMBOBOX_MOSTRAR": {
			String seleccionado = (String) vf.getVenCRUD().getPanelCRUD().getpMostrar().getListaCategoria()
					.getSelectedItem();

			if (seleccionado.equals("-Seleccione-")) {
				vf.getVenCRUD().getPanelCRUD().getpMostrar().getVerObjeto().setText("");
			} else if (seleccionado.equals("Accesorio para vehiculo")) {
				vf.getVenCRUD().getPanelCRUD().getpMostrar().getVerObjeto()
						.setText(mf.getAccesorioVehiculoDAO().showAll().toString());
			} else if (seleccionado.equals("Electrodomestico")) {
				vf.getVenCRUD().getPanelCRUD().getpMostrar().getVerObjeto()
						.setText(mf.getElectrodomesticoDAO().showAll().toString());
			} else if (seleccionado.equals("Equipo deportivo")) {
				vf.getVenCRUD().getPanelCRUD().getpMostrar().getVerObjeto()
						.setText(mf.getEquipoDeportivoDAO().showAll().toString());
			} else if (seleccionado.equals("Herramientas")) {
				vf.getVenCRUD().getPanelCRUD().getpMostrar().getVerObjeto()
						.setText(mf.getHerramientaDAO().showAll().toString());
			} else if (seleccionado.equals("Inmuebles")) {
				vf.getVenCRUD().getPanelCRUD().getpMostrar().getVerObjeto()
						.setText(mf.getInmbuenleDAO().showAll().toString());
			} else if (seleccionado.equals("Juguetes")) {
				vf.getVenCRUD().getPanelCRUD().getpMostrar().getVerObjeto()
						.setText(mf.getJugueteDAO().showAll().toString());
			} else if (seleccionado.equals("Prenda de vestir")) {
				vf.getVenCRUD().getPanelCRUD().getpMostrar().getVerObjeto()
						.setText(mf.getPrendaDAO().showAll().toString());
			} else if (seleccionado.equals("Producto farmaceutico")) {
				vf.getVenCRUD().getPanelCRUD().getpMostrar().getVerObjeto()
						.setText(mf.getProductoFarmaceuticoDAO().showAll().toString());
			} else if (seleccionado.equals("Producto sostenible")) {
				vf.getVenCRUD().getPanelCRUD().getpMostrar().getVerObjeto()
						.setText(mf.getProductoSostenibleDAO().showAll().toString());
			} else if (seleccionado.equals("Tecnologia")) {
				vf.getVenCRUD().getPanelCRUD().getpMostrar().getVerObjeto()
						.setText(mf.getTecnologoiaDAO().showAll().toString());
			} else if (seleccionado.equals("Mostrar todo")) {
				StringBuilder sb = new StringBuilder();
				sb.append("Accesorios:\n").append(mf.getAccesorioVehiculoDAO().showAll()).append("\n");
				sb.append("Electrodomésticos:\n").append(mf.getElectrodomesticoDAO().showAll()).append("\n");
				sb.append("Equipos deportivos:\n").append(mf.getEquipoDeportivoDAO().showAll()).append("\n");
				sb.append("Herramientas:\n").append(mf.getHerramientaDAO().showAll()).append("\n");
				sb.append("Inmuebles:\n").append(mf.getInmbuenleDAO().showAll()).append("\n");
				sb.append("Juguetes:\n").append(mf.getJugueteDAO().showAll()).append("\n");
				sb.append("Prendas de vestir:\n").append(mf.getPrendaDAO().showAll()).append("\n");
				sb.append("Productos farmacéuticos:\n").append(mf.getProductoFarmaceuticoDAO().showAll()).append("\n");
				sb.append("Productos sostenibles:\n").append(mf.getProductoSostenibleDAO().showAll()).append("\n");
				sb.append("Tecnología:\n").append(mf.getTecnologoiaDAO().showAll()).append("\n");

				vf.getVenCRUD().getPanelCRUD().getpMostrar().getVerObjeto().setText(sb.toString());
			}
			break;
		}

		case "COMBOBOX_MOSTRAR_PRODUCTO": {
			String seleccionado = (String) vf.getVenComprar().getPanelMostrar().getListaCategorias().getSelectedItem();

			if (seleccionado.equals("-Seleccione-")) {
				vf.getVenComprar().getPanelMostrar().getVerObjeto().setText("Por favor seleccione una categoría.");
			} else if (seleccionado.equals("Accesorio para vehiculo")) {
				vf.getVenComprar().getPanelMostrar().getVerObjeto().setText(mf.getAccesorioVehiculoDAO().showAll());
			} else if (seleccionado.equals("Electrodomestico")) {
				vf.getVenComprar().getPanelMostrar().getVerObjeto().setText(mf.getElectrodomesticoDAO().showAll());
			} else if (seleccionado.equals("Equipo deportivo")) {
				vf.getVenComprar().getPanelMostrar().getVerObjeto().setText(mf.getEquipoDeportivoDAO().showAll());
			} else if (seleccionado.equals("Herramientas")) {
				vf.getVenComprar().getPanelMostrar().getVerObjeto().setText(mf.getHerramientaDAO().showAll());
			} else if (seleccionado.equals("Inmuebles")) {
				vf.getVenComprar().getPanelMostrar().getVerObjeto().setText(mf.getInmbuenleDAO().showAll());
			} else if (seleccionado.equals("Juguetes")) {
				vf.getVenComprar().getPanelMostrar().getVerObjeto().setText(mf.getJugueteDAO().showAll());
			} else if (seleccionado.equals("Prenda de vestir")) {
				vf.getVenComprar().getPanelMostrar().getVerObjeto().setText(mf.getPrendaDAO().showAll());
			} else if (seleccionado.equals("Producto farmaceutico")) {
				vf.getVenComprar().getPanelMostrar().getVerObjeto().setText(mf.getProductoFarmaceuticoDAO().showAll());
			} else if (seleccionado.equals("Producto sostenible")) {
				vf.getVenComprar().getPanelMostrar().getVerObjeto().setText(mf.getProductoSostenibleDAO().showAll());
			} else if (seleccionado.equals("Tecnologia")) {
				vf.getVenComprar().getPanelMostrar().getVerObjeto().setText(mf.getTecnologoiaDAO().showAll());
			} else if (seleccionado.equals("Mostrar todo")) {
				StringBuilder texto = new StringBuilder();

				texto.append(mf.getAccesorioVehiculoDAO().showAll()).append("\n");
				texto.append(mf.getElectrodomesticoDAO().showAll()).append("\n");
				texto.append(mf.getEquipoDeportivoDAO().showAll()).append("\n");
				texto.append(mf.getHerramientaDAO().showAll()).append("\n");
				texto.append(mf.getInmbuenleDAO().showAll()).append("\n");
				texto.append(mf.getJugueteDAO().showAll()).append("\n");
				texto.append(mf.getPrendaDAO().showAll()).append("\n");
				texto.append(mf.getProductoFarmaceuticoDAO().showAll()).append("\n");
				texto.append(mf.getProductoSostenibleDAO().showAll()).append("\n");
				texto.append(mf.getTecnologoiaDAO().showAll()).append("\n");

				vf.getVenComprar().getPanelMostrar().getVerObjeto().setText(texto.toString());
			}
			break;
		}
		case "BOTON_CREAR_CARRITO": {
			int id = mf.getCarritoDAO().getListaCarritos().size() + 1;
			Carrito carrito = new Carrito(id);
			mf.getCarritoDAO().create(carrito);
			JOptionPane.showMessageDialog(null, "Carrito creado existosamente", "Carrito creado exitosamente",
			        JOptionPane.INFORMATION_MESSAGE);
			break;

		}

		case "BOTON_AGREGAR_A_CARRITO": {
		    try {
		        String seleccionado = (String) vf.getVenComprar().getPanelMostrar().getListaCategorias().getSelectedItem();
		        int indiceAñadir = Integer.parseInt(vf.getVenComprar().getPanelMostrar().getTxtIndice().getText());
		        int indiceRelativo = indiceAñadir - 1;

		        int idCarrito = Integer.parseInt(vf.getVenComprar().getPanelMostrar().getTxtCarrito().getText());
		        int indexCarrito = idCarrito - 1;

		        Producto productoSeleccionado = null;

		        if (seleccionado.equals(prop.getProperty("mercadolibre.panelmostrar.combobox.accesoriovehiculo"))) {
		            productoSeleccionado = mf.getAccesorioVehiculoDAO().getListaAccesorioVehiculo().get(indiceRelativo);
		        } else if (seleccionado.equals(prop.getProperty("mercadolibre.panelmostrar.combobox.electrodomestico"))) {
		            productoSeleccionado = mf.getElectrodomesticoDAO().getListaElectrodomestico().get(indiceRelativo);
		        } else if (seleccionado.equals(prop.getProperty("mercadolibre.panelmostrar.combobox.equipodeportivo"))) {
		            productoSeleccionado = mf.getEquipoDeportivoDAO().getListaEquipoDeportivo().get(indiceRelativo);
		        } else if (seleccionado.equals(prop.getProperty("mercadolibre.panelmostrar.combobox.herramienta"))) {
		            productoSeleccionado = mf.getHerramientaDAO().getListaHerramienta().get(indiceRelativo);
		        } else if (seleccionado.equals(prop.getProperty("mercadolibre.panelmostrar.combobox.inmueble"))) {
		            productoSeleccionado = mf.getInmbuenleDAO().getListaInmueble().get(indiceRelativo);
		        } else if (seleccionado.equals(prop.getProperty("mercadolibre.panelmostrar.combobox.juguete"))) {
		            productoSeleccionado = mf.getJugueteDAO().getListaJuguete().get(indiceRelativo);
		        } else if (seleccionado.equals(prop.getProperty("mercadolibre.panelmostrar.combobox.prendavestir"))) {
		            productoSeleccionado = mf.getPrendaDAO().getListaPrendaDeVestir().get(indiceRelativo);
		        } else if (seleccionado.equals(prop.getProperty("mercadolibre.panelmostrar.combobox.productofarmaceutico"))) {
		            productoSeleccionado = mf.getProductoFarmaceuticoDAO().getListaProductoFarmaceutico().get(indiceRelativo);
		        } else if (seleccionado.equals(prop.getProperty("mercadolibre.panelmostrar.combobox.productosostenible"))) {
		            productoSeleccionado = mf.getProductoSostenibleDAO().getListaProductoSostenible().get(indiceRelativo);
		        } else if (seleccionado.equals(prop.getProperty("mercadolibre.panelmostrar.combobox.tecnologia"))) {
		            productoSeleccionado = mf.getTecnologoiaDAO().getListaTecnologia().get(indiceRelativo);
		        }

		        if (productoSeleccionado != null) {
		            boolean exito = mf.getCarritoDAO().añadirProductoAlCarrito(indexCarrito, productoSeleccionado);
		            if (exito) {
		                JOptionPane.showMessageDialog(null, "Producto añadido al carrito #" + idCarrito,
		                        "Éxito", JOptionPane.INFORMATION_MESSAGE);
		            } else {
		                JOptionPane.showMessageDialog(null, "No se pudo añadir el producto al carrito",
		                        "Error", JOptionPane.ERROR_MESSAGE);
		            }
		        } else {
		            JOptionPane.showMessageDialog(null, "Seleccione una categoría válida",
		                    "Error", JOptionPane.ERROR_MESSAGE);
		        }
		    } catch (Exception e1) {
		        JOptionPane.showMessageDialog(null, "Error al añadir producto: " + e1.getMessage(),
		                "Error", JOptionPane.ERROR_MESSAGE);
		    }
		    break;
		}

		
		
		case "BOTON_MOSTRAR_CARRITOS": {
		    String contenido = mf.getCarritoDAO().showAll(); 
		    vf.getVenComprar().getPanelCarrito().getTextCarritos().setText(contenido);
		    break;
		}
		
		


		}

	}

}
