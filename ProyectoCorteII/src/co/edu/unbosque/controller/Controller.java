package co.edu.unbosque.controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import co.edu.unbosque.model.AccesorioVehiculo;
import co.edu.unbosque.model.Electrodomestico;
import co.edu.unbosque.model.EquipoDeportivo;
import co.edu.unbosque.model.Herramienta;
import co.edu.unbosque.model.Inmueble;
import co.edu.unbosque.model.Juguete;
import co.edu.unbosque.model.ModelFacade;
import co.edu.unbosque.model.PrendaDeVestir;
import co.edu.unbosque.model.ProductoFarmaceutico;
import co.edu.unbosque.model.ProductoSostenible;
import co.edu.unbosque.model.Tecnologia;
import co.edu.unbosque.view.PanelCRUD;
import co.edu.unbosque.view.ViewFacade;

public class Controller implements ActionListener {
	private ViewFacade vf;
	private ModelFacade mf;

	public Controller() {
		vf = new ViewFacade();
		mf = new ModelFacade();
	}

	public void runGUI() {
		vf.getVenMenu().setVisible(true);
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

		vf.getVenInicioVendedor().getPanelCentral().getpInicioSesion().getBtnIniciarSesion().addActionListener(this);
		vf.getVenInicioVendedor().getPanelCentral().getpInicioSesion().getBtnIniciarSesion()
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

		vf.getVenCRUD().getBtnEliminar().addActionListener(this);
		vf.getVenCRUD().getBtnEliminar().setActionCommand("BOTON_ELIMINAR");

		vf.getVenCRUD().getPanelCRUD().getpCrear().getListaCategorias().addActionListener(this);
		vf.getVenCRUD().getPanelCRUD().getpCrear().getListaCategorias().setActionCommand("COMBOBOX_CREAR");
	}

	@Override
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
			vf.getVenInicioVendedor().setVisible(false);
			vf.getVenCRUD().setVisible(true);
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

		case "CREAR_ARTICULO": {
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

			} else if (artSeleccionado.equals("Electrodomestico")) {
				String nombre = vf.getVenCRUD().getPanelCRUD().getpCrear().getTextNombre().getText();
				int cantidad = Integer.parseInt(vf.getVenCRUD().getPanelCRUD().getpCrear().getTextCantidad().getText());
				float precio = Float.parseFloat(vf.getVenCRUD().getPanelCRUD().getpCrear().getTextPrecio().getText());
				String consumoEnergia = vf.getVenCRUD().getPanelCRUD().getpCrear().getTextConsumo().getText();
				String capacidad = vf.getVenCRUD().getPanelCRUD().getpCrear().getTextCapacidad().getText();
				Electrodomestico electrodomestico = new Electrodomestico(nombre, cantidad, precio, consumoEnergia,
						capacidad);
				mf.getElectrodomesticoDAO().create(electrodomestico);
				;

			} else if (artSeleccionado.equals("Equipo deportivo")) {
				String nombre = vf.getVenCRUD().getPanelCRUD().getpCrear().getTextNombre().getText();
				int cantidad = Integer.parseInt(vf.getVenCRUD().getPanelCRUD().getpCrear().getTextCantidad().getText());
				float precio = Float.parseFloat(vf.getVenCRUD().getPanelCRUD().getpCrear().getTextPrecio().getText());
				String deporte = vf.getVenCRUD().getPanelCRUD().getpCrear().getTextDeporte().getText();
				String material = vf.getVenCRUD().getPanelCRUD().getpCrear().getTextMaterialDeporte().getText();
				EquipoDeportivo equipoDeportivo = new EquipoDeportivo(nombre, cantidad, precio, deporte, material);
				mf.getEquipoDeportivoDAO().create(equipoDeportivo);

			} else if (artSeleccionado.equals("Herramientas")) {
				String nombre = vf.getVenCRUD().getPanelCRUD().getpCrear().getTextNombre().getText();
				int cantidad = Integer.parseInt(vf.getVenCRUD().getPanelCRUD().getpCrear().getTextCantidad().getText());
				float precio = Float.parseFloat(vf.getVenCRUD().getPanelCRUD().getpCrear().getTextPrecio().getText());
				String tipoAlimentacion = vf.getVenCRUD().getPanelCRUD().getpCrear().getTextAlimentacion().getText();
				String material = vf.getVenCRUD().getPanelCRUD().getpCrear().getTextMaterialHerramienta().getText();
				Herramienta herramienta = new Herramienta(nombre, cantidad, precio, tipoAlimentacion, material);
				mf.getHerramientaDAO().create(herramienta);

			} else if (artSeleccionado.equals("Inmuebles")) {
				String nombre = vf.getVenCRUD().getPanelCRUD().getpCrear().getTextNombre().getText();
				int cantidad = Integer.parseInt(vf.getVenCRUD().getPanelCRUD().getpCrear().getTextCantidad().getText());
				float precio = Float.parseFloat(vf.getVenCRUD().getPanelCRUD().getpCrear().getTextPrecio().getText());
				String area = vf.getVenCRUD().getPanelCRUD().getpCrear().getTextArea().getText();
				String cantidadCuarto = vf.getVenCRUD().getPanelCRUD().getpCrear().getTextCantidadCuarto().getText();
				Inmueble inmueble = new Inmueble(nombre, cantidad, precio, area, cantidadCuarto);
				mf.getInmbuenleDAO().create(inmueble);

			} else if (artSeleccionado.equals("Juguetes")) {
				String nombre = vf.getVenCRUD().getPanelCRUD().getpCrear().getTextNombre().getText();
				int cantidad = Integer.parseInt(vf.getVenCRUD().getPanelCRUD().getpCrear().getTextCantidad().getText());
				float precio = Float.parseFloat(vf.getVenCRUD().getPanelCRUD().getpCrear().getTextPrecio().getText());
				String edadRecomendada = vf.getVenCRUD().getPanelCRUD().getpCrear().getTextEdad().getText();
				String material = vf.getVenCRUD().getPanelCRUD().getpCrear().getTextMaterialJuguete().getText();
				Juguete juguete = new Juguete(nombre, cantidad, precio, edadRecomendada, material);
				mf.getJugueteDAO().create(juguete);

			} else if (artSeleccionado.equals("Prenda de vestir")) {
				String nombre = vf.getVenCRUD().getPanelCRUD().getpCrear().getTextNombre().getText();
				int cantidad = Integer.parseInt(vf.getVenCRUD().getPanelCRUD().getpCrear().getTextCantidad().getText());
				float precio = Float.parseFloat(vf.getVenCRUD().getPanelCRUD().getpCrear().getTextPrecio().getText());
				String talla = vf.getVenCRUD().getPanelCRUD().getpCrear().getTextTalla().getText();
				String tipoTela = vf.getVenCRUD().getPanelCRUD().getpCrear().getTextTipoTela().getText();
				PrendaDeVestir prendaDeVestir = new PrendaDeVestir(nombre, cantidad, precio, talla, tipoTela);
				mf.getPrendaDAO().create(prendaDeVestir);

			} else if (artSeleccionado.equals("Producto farmaceutico")) {
				String nombre = vf.getVenCRUD().getPanelCRUD().getpCrear().getTextNombre().getText();
				int cantidad = Integer.parseInt(vf.getVenCRUD().getPanelCRUD().getpCrear().getTextCantidad().getText());
				float precio = Float.parseFloat(vf.getVenCRUD().getPanelCRUD().getpCrear().getTextPrecio().getText());
				String formaFarmaceutico = vf.getVenCRUD().getPanelCRUD().getpCrear().getTextFormaFarmaceutica()
						.getText();
				String concentracion = vf.getVenCRUD().getPanelCRUD().getpCrear().getTextConcentracion().getText();
				ProductoFarmaceutico productoFarmaceutico = new ProductoFarmaceutico(nombre, cantidad, precio, formaFarmaceutico, concentracion);
				mf.getProductoFarmaceuticoDAO().create(productoFarmaceutico);

			} else if (artSeleccionado.equals("Producto sostenible")) {
				String nombre = vf.getVenCRUD().getPanelCRUD().getpCrear().getTextNombre().getText();
				int cantidad = Integer.parseInt(vf.getVenCRUD().getPanelCRUD().getpCrear().getTextCantidad().getText());
				float precio = Float.parseFloat(vf.getVenCRUD().getPanelCRUD().getpCrear().getTextPrecio().getText());
				String materialEcologico = vf.getVenCRUD().getPanelCRUD().getpCrear().getTextMaterialEcologico()
						.getText();
				String certificacion = vf.getVenCRUD().getPanelCRUD().getpCrear().getTextCertificacion().getText();
				ProductoSostenible productoSostenible = new ProductoSostenible(nombre, cantidad, precio, materialEcologico, certificacion);
				mf.getProductoSostenibleDAO().create(productoSostenible);

			} else if (artSeleccionado.equals("Tecnologia")) {
				String nombre = vf.getVenCRUD().getPanelCRUD().getpCrear().getTextNombre().getText();
				int cantidad = Integer.parseInt(vf.getVenCRUD().getPanelCRUD().getpCrear().getTextCantidad().getText());
				float precio = Float.parseFloat(vf.getVenCRUD().getPanelCRUD().getpCrear().getTextPrecio().getText());
				String sistemaOperativo = vf.getVenCRUD().getPanelCRUD().getpCrear().getTextSO().getText();
				String conectividad = vf.getVenCRUD().getPanelCRUD().getpCrear().getTextConectividad().getText();
				Tecnologia tecnologia = new Tecnologia(nombre, cantidad, precio, sistemaOperativo, conectividad);
				mf.getTecnologoiaDAO().create(tecnologia);

			}
		}
		}

	}
}
