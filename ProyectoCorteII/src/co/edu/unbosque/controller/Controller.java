package co.edu.unbosque.controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import co.edu.unbosque.view.ViewFacade;

public class Controller implements ActionListener {
	private ViewFacade vf;

	public Controller() {
		vf = new ViewFacade();
	}

	public void runGUI() {
		vf.getVenCRUD().setVisible(true);
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
		vf.getVenInicioVendedor().getPanelCentral().getpInicioSesion().getBtnIniciarSesion().setActionCommand("INICIAR_SESION_COMPRADOR");

		vf.getVenInicioComprador().getBtnVolver().addActionListener(this);
		vf.getVenInicioComprador().getBtnVolver().setActionCommand("VOLVER_ISCOMPRADOR");
		
		vf.getVenInicioVendedor().getPanelCentral().getpInicioSesion().getBtnIniciarSesion().addActionListener(this);
		vf.getVenInicioVendedor().getPanelCentral().getpInicioSesion().getBtnIniciarSesion().setActionCommand("INICIAR_SESION_VENDEDOR");
		
		vf.getVenCRUD().getBtnVolver().addActionListener(this);
		vf.getVenCRUD().getBtnVolver().setActionCommand("VOLVER_MENU_CRUD");

		vf.getVenInicioVendedor().getBtnVolver().addActionListener(this);
		vf.getVenInicioVendedor().getBtnVolver().setActionCommand("VOLVER_ISVENDEDOR");

		vf.getVenInicioComprador().getPanelCentral().getpInicioSesion().getBtnRegistro().addActionListener(this);
		vf.getVenInicioComprador().getPanelCentral().getpInicioSesion().getBtnRegistro().setActionCommand("REGISTRO_COMPRADOR");

		vf.getVenRegistroComprador().getBtnVolver().addActionListener(this);
		vf.getVenRegistroComprador().getBtnVolver().setActionCommand("VOLVER_REGISTRO_COMPRADOR");

		vf.getVenRegistroComprador().getBtnMenu().addActionListener(this);
		vf.getVenRegistroComprador().getBtnMenu().setActionCommand("VOLVER_MENU_REGISTRO_COMPRADOR");

		vf.getVenInicioVendedor().getPanelCentral().getpInicioSesion().getBtnRegistro().addActionListener(this);
		vf.getVenInicioVendedor().getPanelCentral().getpInicioSesion().getBtnRegistro().setActionCommand("REGISTRO_VENDEDOR");

		vf.getVenRegistroVendedor().getBtnVolver().addActionListener(this);
		vf.getVenRegistroVendedor().getBtnVolver().setActionCommand("VOLVER_REGISTRO_VENDEDOR");

		vf.getVenRegistroVendedor().getBtnMenu().addActionListener(this);
		vf.getVenRegistroVendedor().getBtnMenu().setActionCommand("VOLVER_MENU_REGISTRO_VENDEDOR");
		
		vf.getVenCRUD().getBtnCrear().addActionListener(this);
		vf.getVenCRUD().getBtnCrear().setActionCommand("BOTON_CREAR");
		
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
			
		}case "INICIAR_SESION_VENDEDOR": {
			vf.getVenInicioSesion().setVisible(false);
			vf.getVenCRUD().setVisible(true);
			break;
		}case "VOLVER_MENU_CRUD": {
			vf.getVenMenu().setVisible(true);
			vf.getVenCRUD().setVisible(false);
			break;}
		
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
		case "COMBOBOX_CREAR":{
			String seleccionado = (String) vf.getVenCRUD().getPanelCRUD().getpCrear().getListaCategorias().getSelectedItem();
			if (seleccionado.equals("-Seleccione-")) {
				vf.getVenCRUD().getPanelCRUD().getpCrear().ocultarOpcionesEspecificas();
			}
			else if (seleccionado.equals("Accesorio para vehiculo")) {
				vf.getVenCRUD().getPanelCRUD().getpCrear().ocultarOpcionesEspecificas();
				vf.getVenCRUD().getPanelCRUD().getpCrear().mostrarAccesorioCarro();
			}
			else if (seleccionado.equals("Electrodomestico")) {
				vf.getVenCRUD().getPanelCRUD().getpCrear().ocultarOpcionesEspecificas();
				vf.getVenCRUD().getPanelCRUD().getpCrear().mostrarElectrodomestico();
			}
			else if (seleccionado.equals("Equipo deportivo")) {
				vf.getVenCRUD().getPanelCRUD().getpCrear().ocultarOpcionesEspecificas();
				vf.getVenCRUD().getPanelCRUD().getpCrear().mostrarEquipoDeporte();
			}
			else if (seleccionado.equals("Herramientas")) {
				vf.getVenCRUD().getPanelCRUD().getpCrear().ocultarOpcionesEspecificas();
				vf.getVenCRUD().getPanelCRUD().getpCrear().mostrarHerramienta();
			}
			else if (seleccionado.equals("Inmuebles")) {
				vf.getVenCRUD().getPanelCRUD().getpCrear().ocultarOpcionesEspecificas();
				vf.getVenCRUD().getPanelCRUD().getpCrear().mostrarInmueble();
			}
			else if (seleccionado.equals("Juguetes")) {
				vf.getVenCRUD().getPanelCRUD().getpCrear().ocultarOpcionesEspecificas();
				vf.getVenCRUD().getPanelCRUD().getpCrear().mostrarJuguete();
			}
			else if (seleccionado.equals("Prenda de vestir")) {
				vf.getVenCRUD().getPanelCRUD().getpCrear().ocultarOpcionesEspecificas();
				vf.getVenCRUD().getPanelCRUD().getpCrear().mostrarPrendaVestir();
			}
			else if (seleccionado.equals("Producto farmaceutico")) {
				vf.getVenCRUD().getPanelCRUD().getpCrear().ocultarOpcionesEspecificas();
				vf.getVenCRUD().getPanelCRUD().getpCrear().mostrarFarmaceutico();
			}
			else if (seleccionado.equals("Producto sostenible")) {
				vf.getVenCRUD().getPanelCRUD().getpCrear().ocultarOpcionesEspecificas();
				vf.getVenCRUD().getPanelCRUD().getpCrear().mostrarSostenible();
			}
			else if (seleccionado.equals("Tecnologia")) {
				vf.getVenCRUD().getPanelCRUD().getpCrear().ocultarOpcionesEspecificas();
				vf.getVenCRUD().getPanelCRUD().getpCrear().mostrarTecnologia();
			}
			break;
		}
		}

	}
}
