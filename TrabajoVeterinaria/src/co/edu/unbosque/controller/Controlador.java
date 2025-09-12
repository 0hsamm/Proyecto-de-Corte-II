package co.edu.unbosque.controller;

import co.edu.unbosque.model.Gato;
import co.edu.unbosque.model.ModelFacade;
import co.edu.unbosque.model.Perro;
import co.edu.unbosque.view.Consola;

import java.time.LocalDate;
import java.util.InputMismatchException;

import co.edu.unbosque.model.Ave;
import co.edu.unbosque.model.Pez;
import co.edu.unbosque.model.Reptil;
import co.edu.unbosque.util.LanzadorDeExcepcion;
import co.edu.unbosque.util.StringExcepcion;
import co.edu.unbosque.util.VerificarEliminarExcepcion;
import co.edu.unbosque.util.VerificarEnteroExcepcion;
import co.edu.unbosque.util.VerificarFechaExcepcion;
import co.edu.unbosque.util.VerificarMenuExcepcion;
import co.edu.unbosque.util.VerificarPesoExcepcion;
import co.edu.unbosque.util.VerificarSexoExcepcion;


public class Controlador {

	private ModelFacade mf;
	private Consola con;


	public Controlador() {
		con = new Consola();
		mf = new ModelFacade();


	}

	public void run() {
		try {
			mainloop:while(true) {
				con.printMenu();
				int op=con.leerEntero();
				LanzadorDeExcepcion.verificarMenu(op);
				switch (op) {
				case 1: {

					con.menuAnimal();
					int opcion=con.leerEntero();
					switch (opcion) {
					case 1: {
						try {
							con.escribirConSalto("Ingrese el nombre del perro: ");
							con.quemarLinea();
							String nombre = con.leerLineaCompleta();
							LanzadorDeExcepcion.verificarTexto(nombre);
							con.escribirConSalto("Ingrese la raza del perro:");
							String raza = con.leerLineaCompleta();
							LanzadorDeExcepcion.verificarTexto(raza);
							con.escribirConSalto("Ingrese el peso del perro: ");
							float peso = con.leerFlotante();	
							LanzadorDeExcepcion.verificarPeso(peso);
							con.escribirConSalto("Ingrese la edad del perro: ");
							int edad = con.leerEntero();
							LanzadorDeExcepcion.verificarEntero(edad);
							con.escribirConSalto("Ingrese el sexo del perro(m/f): ");
							char sexo = con.leerChar();
							LanzadorDeExcepcion.verificarSexo(sexo);
							con.escribirConSalto("Ingrese el habitad del perro: ");
							con.quemarLinea();
							String habitad = con.leerLineaCompleta();
							LanzadorDeExcepcion.verificarTexto(habitad);
							con.escribirConSalto("¿En qué fecha fue ingresado el perro? (año-mes-dia): ");
							LocalDate fechaIngreso = con.leerFecha();
							LanzadorDeExcepcion.verificarFecha(fechaIngreso);
							con.escribirConSalto("Ingrese el color del pelaje del perro: ");
							String colorPelaje = con.leerLineaCompleta();
							LanzadorDeExcepcion.verificarTexto(colorPelaje);
							con.escribirConSalto("Ingrese la forma del hocico del perro: ");
							String formaHocico = con.leerLineaCompleta();
							LanzadorDeExcepcion.verificarTexto(formaHocico);


							Perro newData = new Perro(nombre, raza, peso, edad, sexo, habitad, fechaIngreso, colorPelaje, formaHocico);
							mf.getPerroDao().create(newData);

						} catch (StringExcepcion e) {
							con.escribirConSalto(e.getMessage());

						}catch(VerificarPesoExcepcion e) {
							con.escribirConSalto(e.getMessage());
						}catch(InputMismatchException e) {
							con.escribirConSalto("El valor ingresado no tiene un formato adecuado\n");
							con.quemarLinea();
						}catch(VerificarEnteroExcepcion e) {
							con.escribirConSalto(e.getMessage());
						}catch(VerificarSexoExcepcion e) {
							con.escribirConSalto(e.getMessage());
						}catch(VerificarFechaExcepcion e) {
							con.escribirConSalto(e.getMessage());
						}

					}
					break;
					case 2:{
						try {
							con.escribirConSalto("Ingrese el nombre del gato: ");
							con.quemarLinea();
							String nombre = con.leerLineaCompleta();	
							LanzadorDeExcepcion.verificarTexto(nombre);
							con.escribirConSalto("Ingrese la raza del gato: ");
							String raza = con.leerLineaCompleta();
							LanzadorDeExcepcion.verificarTexto(raza);
							con.escribirConSalto("Ingrese el peso del gato: ");
							float peso = con.leerFlotante();
							LanzadorDeExcepcion.verificarPeso(peso);
							con.escribirConSalto("Ingrese la edad del gato: ");
							int edad = con.leerEntero();
							LanzadorDeExcepcion.verificarEntero(edad);
							con.escribirConSalto("Ingrese el sexo del gato(m/f): ");
							char sexo = con.leerChar();
							LanzadorDeExcepcion.verificarSexo(sexo);
							con.escribirConSalto("Ingrese el habitad del gato: ");
							con.quemarLinea();
							String habitad = con.leerLineaCompleta();
							LanzadorDeExcepcion.verificarTexto(habitad);
							con.escribirConSalto("¿En qué fecha fue ingresado el gato? (año-mes-dia): ");
							LocalDate fechaIngreso = con.leerFecha();
							LanzadorDeExcepcion.verificarFecha(fechaIngreso);
							con.escribirConSalto("Ingrese el color del pelaje del gato: ");
							String colorPelaje = con.leerLineaCompleta();
							LanzadorDeExcepcion.verificarTexto(colorPelaje);
							con.escribirConSalto("Ingrese que tan flexible es el gato: ");
							String flexibilidad = con.leerLineaCompleta();
							LanzadorDeExcepcion.verificarTexto(flexibilidad);

							Gato newData = new Gato(nombre, raza, peso, edad, sexo, habitad, fechaIngreso, colorPelaje, flexibilidad);
							mf.getGatoDao().create(newData);

						} catch (StringExcepcion e) {
							con.escribirConSalto(e.getMessage());

						}catch(VerificarPesoExcepcion e) {
							con.escribirConSalto(e.getMessage());
						}catch(InputMismatchException e) {
							con.escribirConSalto("El valor ingresado no tiene un formato adecuado\n");
							con.quemarLinea();
						}catch(VerificarEnteroExcepcion e) {
							con.escribirConSalto(e.getMessage());
						}catch(VerificarSexoExcepcion e) {
							con.escribirConSalto(e.getMessage());
						}catch(VerificarFechaExcepcion e) {
							con.escribirConSalto(e.getMessage());
						}

					}
					break;
					case 3:{
						try {
							con.escribirConSalto("Ingrese el nombre del ave: ");
							con.quemarLinea();
							String nombre = con.leerLineaCompleta();
							LanzadorDeExcepcion.verificarTexto(nombre);
							con.escribirConSalto("Ingrese la raza del ave: ");
							String raza = con.leerLineaCompleta();
							LanzadorDeExcepcion.verificarTexto(raza);
							con.escribirConSalto("Ingrese el peso del ave: ");
							float peso = con.leerFlotante();
							LanzadorDeExcepcion.verificarPeso(peso);
							con.escribirConSalto("Ingrese la edad del ave: ");
							int edad = con.leerEntero();
							LanzadorDeExcepcion.verificarEntero(edad);
							con.escribirConSalto("Ingrese el sexo del ave(m/f): ");
							char sexo = con.leerChar();
							LanzadorDeExcepcion.verificarSexo(sexo);
							con.escribirConSalto("Ingrese el habitad del ave: ");
							con.quemarLinea();
							String habitad = con.leerLineaCompleta();
							LanzadorDeExcepcion.verificarTexto(habitad);
							con.escribirConSalto("¿En qué fecha fue ingresado el ave?(año-mes-dia): ");
							LocalDate fechaIngreso = con.leerFecha();
							LanzadorDeExcepcion.verificarFecha(fechaIngreso);
							con.escribirConSalto("Ingrese el tamaño del pico del ave: ");
							String tamanoPico = con.leerLineaCompleta();
							LanzadorDeExcepcion.verificarTexto(tamanoPico);
							con.escribirConSalto("Ingrese el tamaño de las plumas del ave: ");
							String tamanoPluma = con.leerLineaCompleta();
							LanzadorDeExcepcion.verificarTexto(tamanoPluma);

							Ave newData = new Ave(nombre, raza, peso, edad, sexo, habitad, fechaIngreso, tamanoPico, tamanoPluma);
							mf.getAveDao().create(newData);
						} catch (StringExcepcion e) {
							con.escribirConSalto(e.getMessage());

						}catch(VerificarPesoExcepcion e) {
							con.escribirConSalto(e.getMessage());
						}catch(InputMismatchException e) {
							con.escribirConSalto("El valor ingresado no tiene un formato adecuado\n");
							con.quemarLinea();
						}catch(VerificarEnteroExcepcion e) {
							con.escribirConSalto(e.getMessage());
						}catch(VerificarSexoExcepcion e) {
							con.escribirConSalto(e.getMessage());
						}catch(VerificarFechaExcepcion e) {
							con.escribirConSalto(e.getMessage());
						}

					}
					break;
					case 4:{
						try {

							con.escribirConSalto("Ingrese el nombre del pez: ");
							con.quemarLinea();
							String nombre = con.leerLineaCompleta();
							LanzadorDeExcepcion.verificarTexto(nombre);
							con.escribirConSalto("Ingrese la raza del pez: ");
							String raza = con.leerLineaCompleta();
							LanzadorDeExcepcion.verificarTexto(raza);
							con.escribirConSalto("Ingrese el peso del pez: ");
							float peso = con.leerFlotante();
							LanzadorDeExcepcion.verificarPeso(peso);
							con.escribirConSalto("Ingrese la edad del pez: ");
							int edad = con.leerEntero();
							LanzadorDeExcepcion.verificarEntero(edad);
							con.escribirConSalto("Ingrese el sexo del pez(m/f): ");
							char sexo = con.leerChar();
							LanzadorDeExcepcion.verificarSexo(sexo);
							con.escribirConSalto("Ingrese el habitad del pez: ");
							con.quemarLinea();
							String habitad = con.leerLineaCompleta();
							LanzadorDeExcepcion.verificarTexto(habitad);
							con.escribirConSalto("¿En qué fecha fue ingresado el pez? (año-mes-dia): ");
							LocalDate fechaIngreso = con.leerFecha();
							LanzadorDeExcepcion.verificarFecha(fechaIngreso);
							con.escribirConSalto("Ingrese el tamaño de las aletas del pez: ");
							String tamanoAleta = con.leerLineaCompleta();
							LanzadorDeExcepcion.verificarTexto(tamanoAleta);
							con.escribirConSalto("Ingrese la profundidad del nado del pez: ");
							String profundidadNado = con.leerLineaCompleta();
							LanzadorDeExcepcion.verificarTexto(profundidadNado);

							Pez newData = new Pez(nombre, raza, peso, edad, sexo, habitad, fechaIngreso, tamanoAleta, profundidadNado);
							mf.getPezDao().create(newData);

						} catch (StringExcepcion e) {
							con.escribirConSalto(e.getMessage());

						}catch(VerificarPesoExcepcion e) {
							con.escribirConSalto(e.getMessage());
						}catch(InputMismatchException e) {
							con.escribirConSalto("El valor ingresado no tiene un formato adecuado\n");
							con.quemarLinea();
						}catch(VerificarEnteroExcepcion e) {
							con.escribirConSalto(e.getMessage());
						}catch(VerificarSexoExcepcion e) {
							con.escribirConSalto(e.getMessage());
						}catch(VerificarFechaExcepcion e) {
							con.escribirConSalto(e.getMessage());
						}

					}
					break;
					case 5:{
						try {

							con.escribirConSalto("Ingrese el nombre del reptil: ");
							con.quemarLinea();
							String nombre = con.leerLineaCompleta();
							LanzadorDeExcepcion.verificarTexto(nombre);
							con.escribirConSalto("Ingrese la raza del reptil: ");
							String raza = con.leerLineaCompleta();
							LanzadorDeExcepcion.verificarTexto(raza);
							con.escribirConSalto("Ingrese el peso del reptil: ");
							float peso = con.leerFlotante();
							LanzadorDeExcepcion.verificarPeso(peso);
							con.escribirConSalto("Ingrese la edad del reptil: ");
							int edad = con.leerEntero();
							LanzadorDeExcepcion.verificarEntero(edad);
							con.escribirConSalto("Ingrese el sexo del reptil(m/f): ");
							char sexo = con.leerChar();
							LanzadorDeExcepcion.verificarSexo(sexo);
							con.escribirConSalto("Ingrese el habitad del reptil: ");
							con.quemarLinea();
							String habitad = con.leerLineaCompleta();
							LanzadorDeExcepcion.verificarTexto(habitad);
							con.escribirConSalto("¿En qué fecha fue ingresado el reptil? (año-mes-dia): ");
							LocalDate fechaIngreso = con.leerFecha();
							LanzadorDeExcepcion.verificarFecha(fechaIngreso);
							con.escribirConSalto("Ingrese si el reptil está mudando piel: ");
							String mudaPiel = con.leerLineaCompleta();
							LanzadorDeExcepcion.verificarTexto(mudaPiel);
							con.escribirConSalto("Ingrese la temperatura corporal del reptil: ");
							int temperaturaCorporal = con.leerEntero();
							LanzadorDeExcepcion.verificarEntero(temperaturaCorporal);

							Reptil newData = new Reptil(nombre, raza, peso, edad, sexo, habitad, fechaIngreso, mudaPiel, temperaturaCorporal);
							mf.getReptilDao().create(newData);

						} catch (StringExcepcion e) {
							con.escribirConSalto(e.getMessage());

						}catch(VerificarPesoExcepcion e) {
							con.escribirConSalto(e.getMessage());
						}catch(InputMismatchException e) {
							con.escribirConSalto("El valor ingresado no tiene un formato adecuado\n");
							con.quemarLinea();
						}catch(VerificarEnteroExcepcion e) {
							con.escribirConSalto(e.getMessage());
						}catch(VerificarSexoExcepcion e) {
							con.escribirConSalto(e.getMessage());
						}catch(VerificarFechaExcepcion e) {
							con.escribirConSalto(e.getMessage());
						}


					}
					break;
					}


				}
				break;
				case 2:{
					con.menuMostrar();
					int op1 = con.leerEntero();
					switch (op1) {
					case 1: {					
						con.escribirConSalto(mf.getPerroDao().showAll());		
					}
					break;
					case 2:{
						con.escribirConSalto(mf.getGatoDao().showAll());
					}
					break;
					case 3:{
						con.escribirConSalto(mf.getAveDao().showAll());
					}
					break;
					case 4:{
						con.escribirConSalto(mf.getPezDao().showAll());
					}
					break;
					case 5:{
						con.escribirConSalto(mf.getReptilDao().showAll());
					}
					break;
					case 6:{
					
						con.escribirConSalto("Perro");
						con.escribirConSalto(mf.getPerroDao().showAll());
						con.escribirConSalto("Gato");
						con.escribirConSalto(mf.getGatoDao().showAll());
						con.escribirConSalto("Ave");
						con.escribirConSalto(mf.getAveDao().showAll());
						con.escribirConSalto("Pez");
						con.escribirConSalto(mf.getPezDao().showAll());
						con.escribirConSalto("Reptil");
						con.escribirConSalto(mf.getReptilDao().showAll());
					}
					break;	
					}
				}
				break;
				case 3:{
					con.menuEliminar();
					int op2 = con.leerEntero();
					switch (op2) {
					case 1: {
						try {
							con.escribirConSalto("Lista de perros: ");
							con.escribirConSalto(mf.getPerroDao().showAll());
							if(mf.getPerroDao().isEmpty()) {
								break;
							}
							con.escribirConSalto("Ingrese el número del perro que desea eliminar:");
							int index = con.leerEntero();
							LanzadorDeExcepcion.verificarEliminar(index);
							boolean eliminado = mf.getPerroDao().delete(index);

							if(eliminado) {
								con.escribirConSalto("El perro ha sido eliminado exitosamente" + "\n");
							}else {
								con.escribirConSalto("No se pudo eliminar, ingrese un índice válido\n");
							}
						} catch (VerificarEliminarExcepcion e) {
							con.escribirConSalto(e.getMessage());
						}

					}
					break;
					case 2:{
						try {
							con.escribirConSalto("Lista de gatos: ");
							con.escribirConSalto(mf.getGatoDao().showAll());
							if(mf.getGatoDao().isEmpty()) {
								break;
							}
							con.escribirConSalto("Ingrese el número del gato que desea eliminar: ");
							int idex = con.leerEntero();
							LanzadorDeExcepcion.verificarEliminar(idex);
							boolean eliminado = mf.getGatoDao().delete(idex);
							if(eliminado) {
								con.escribirConSalto("El gato ha sido eliminado exitosamente" + "\n");
							}else {
								con.escribirConSalto("No se pudo eliminar, ingrese un índice válido\n");
							}
						} catch (VerificarEliminarExcepcion e) {
							con.escribirConSalto(e.getMessage());
						}

					}
					break;
					case 3:{
						try {
							con.escribirConSalto("Lista de aves: ");
							con.escribirConSalto(mf.getAveDao().showAll());
							if(mf.getAveDao().isEmpty()) {
								break;
							}
							con.escribirConSalto("Ingrese el número del ave que desea eliminar: ");
							int idex = con.leerEntero();
							LanzadorDeExcepcion.verificarEliminar(idex);
							boolean eliminado = mf.getAveDao().delete(idex);
							if(eliminado) {
								con.escribirConSalto("El ave ha sido eliminado exitosamente" + "\n");
							}else {
								con.escribirConSalto("No se pudo eliminar, ingrese un índice válido\n");
							}
						} catch (VerificarEliminarExcepcion e) {
							con.escribirConSalto(e.getMessage());
						}

					}
					break;
					case 4:{
						try {
							con.escribirConSalto("Lista de peces: ");
							con.escribirConSalto(mf.getPezDao().showAll());
							if(mf.getPezDao().isEmpty()) {
								break;
							}
							con.escribirConSalto("Ingrese el número del pez que desea eliminar: ");		
							int index = con.leerEntero();
							LanzadorDeExcepcion.verificarEliminar(index);
							boolean eliminado = mf.getPezDao().delete(index);
							if(eliminado) {
								con.escribirConSalto("El pez ha sido eliminado exitosamente\n");
							}else {
								con.escribirConSalto("No se pudo eliminar, ingrese un índice válido\n");
							}
						} catch (VerificarEliminarExcepcion e) {
							con.escribirConSalto(e.getMessage());
						}

					}
					break;
					case 5:{
						try {
							con.escribirConSalto("Lista de reptiles: ");
							con.escribirConSalto(mf.getReptilDao().showAll());
							if(mf.getReptilDao().isEmpty()) {
								break;

							}
							con.escribirConSalto("Ingrese el número del reptil que desea eliminar: ");
							int index = con.leerEntero();
							LanzadorDeExcepcion.verificarEliminar(index);
							boolean eliminado = mf.getReptilDao().delete(index);
							if(eliminado) {
								con.escribirConSalto("El reptil ha sido eliminado exito");
							}else {
								con.escribirConSalto("No se pudo eliminar, ingrese un índice válido");
							}
						} catch (VerificarEliminarExcepcion e) {
							con.escribirConSalto(e.getMessage());
						}

					}
					break;
					case 6:{

						mf.getPerroDao().deleteAll();
						mf.getGatoDao().deleteAll();
						mf.getAveDao().deleteAll();
						mf.getPezDao().deleteAll();
						mf.getReptilDao().deleteAll();
						con.escribirConSalto("Todos los animales han sido eliminados exitosamente\n");
					}
					break;
					}

				}
				break;
				case 4:{

					con.menuActualizar();
					int op3 = con.leerEntero();
					switch (op3) {
					case 1: {
						try {
							con.escribirConSalto("Lista de perros: " + "\n");
							con.escribirConSalto(mf.getPerroDao().showAll());
							if(mf.getPerroDao().isEmpty()) {
								break;
							}
							con.escribirConSalto("Ingrese el número del perro que desea actualizar: ");
							int index = con.leerEntero();
							LanzadorDeExcepcion.verificarEntero(index);



							con.escribirConSalto("Ingrese el nuevo nombre del perro: ");
							con.quemarLinea();
							String nombre = con.leerLineaCompleta();
							LanzadorDeExcepcion.verificarTexto(nombre);
							con.escribirConSalto("Ingrese la nueva raza del perro:");
							String raza = con.leerLineaCompleta();
							LanzadorDeExcepcion.verificarTexto(raza);
							con.escribirConSalto("Ingrese el nuevo peso del perro: ");
							float peso = con.leerFlotante();
							LanzadorDeExcepcion.verificarPeso(peso);
							con.escribirConSalto("Ingrese la nueva edad del perro: ");
							int edad = con.leerEntero();
							LanzadorDeExcepcion.verificarEntero(edad);
							con.escribirConSalto("Ingrese el nuevo sexo del perro(m/f): ");
							char sexo = con.leerChar();
							LanzadorDeExcepcion.verificarSexo(sexo);
							con.escribirConSalto("Ingrese el nuevo hábitat del perro: ");
							con.quemarLinea();
							String habitad = con.leerLineaCompleta();
							LanzadorDeExcepcion.verificarTexto(habitad);
							con.escribirConSalto("Nueva fecha (año-mes-dia)");
							LocalDate fechaIngreso = con.leerFecha();
							LanzadorDeExcepcion.verificarFecha(fechaIngreso);
							con.escribirConSalto("Ingrese el nuevo color del pelaje del perro: ");
							String colorPelaje = con.leerLineaCompleta();
							LanzadorDeExcepcion.verificarTexto(colorPelaje);
							con.escribirConSalto("Ingrese la nueva forma del hocico del perro: ");
							String formaHocico = con.leerLineaCompleta();
							LanzadorDeExcepcion.verificarTexto(formaHocico);

							Perro newData = new Perro(nombre, raza, peso, edad, sexo, habitad, fechaIngreso, colorPelaje, formaHocico);
							boolean actualizado = mf.getPerroDao().update(index, newData);

							if(actualizado) {
								con.escribirConSalto("El perro ha sido actualizado con éxito\n");
							}else {
								con.escribirConSalto("No se pudo actualizar, ingrese un índice válido\n");
							}	
						} catch (StringExcepcion e) {
							con.escribirConSalto(e.getMessage());

						}catch(VerificarPesoExcepcion e) {
							con.escribirConSalto(e.getMessage());
						}catch(InputMismatchException e) {
							con.escribirConSalto("El valor ingresado no tiene un formato adecuado\n");
							con.quemarLinea();
						}catch(VerificarEnteroExcepcion e) {
							con.escribirConSalto(e.getMessage());
						}catch(VerificarSexoExcepcion e) {
							con.escribirConSalto(e.getMessage());
						}catch(VerificarFechaExcepcion e) {
							con.escribirConSalto(e.getMessage());
						}

					}
					break;
					case 2:{
						try {
							con.escribirConSalto("Lista de gatos: ");
							con.escribirConSalto(mf.getGatoDao().showAll());
							if(mf.getGatoDao().isEmpty()) {
								break;
							}
							con.escribirConSalto("Ingrese el número del gato que desea actualizar: ");
							int index = con.leerEntero();
							LanzadorDeExcepcion.verificarEntero(index);

							con.escribirConSalto("Ingrese el nuevo nombre del gato: ");
							con.quemarLinea();
							String nombre = con.leerLineaCompleta();
							LanzadorDeExcepcion.verificarTexto(nombre);
							con.escribirConSalto("Ingrese la nueva raza del gato:");
							String raza = con.leerLineaCompleta();
							LanzadorDeExcepcion.verificarTexto(raza);
							con.escribirConSalto("Ingrese el nuevo peso del gato: ");
							float peso = con.leerFlotante();
							LanzadorDeExcepcion.verificarPeso(peso);
							con.escribirConSalto("Ingrese la nueva edad del gato: ");
							int edad = con.leerEntero();
							LanzadorDeExcepcion.verificarEntero(edad);
							con.escribirConSalto("Ingrese el nuevo sexo del gato(m/f): ");
							char sexo = con.leerChar();
							LanzadorDeExcepcion.verificarSexo(sexo);
							con.escribirConSalto("Ingrese el nuevo hábitat del gato: ");
							con.quemarLinea();
							String habitad = con.leerLineaCompleta();
							LanzadorDeExcepcion.verificarTexto(habitad);
							con.escribirConSalto("Nueva fecha (año-mes-dia): ");
							LocalDate fechaIngreso = con.leerFecha();
							LanzadorDeExcepcion.verificarFecha(fechaIngreso);
							con.escribirConSalto("Ingrese el nuevo color del pelaje del gato: ");
							String colorPelaje = con.leerLineaCompleta();
							LanzadorDeExcepcion.verificarTexto(colorPelaje);
							con.escribirConSalto("Ingrese el nuevo nivel de flexibilidad del gato: ");
							String flexibilidad = con.leerLineaCompleta();
							LanzadorDeExcepcion.verificarTexto(flexibilidad);

							Gato newData = new Gato(nombre, raza, peso, edad, sexo, habitad, fechaIngreso, colorPelaje, flexibilidad);
							boolean actualizado = mf.getGatoDao().update(index, newData);

							if(actualizado) {
								con.escribirConSalto("El gato ha sido actualizado con éxito\n");
							}else {
								con.escribirConSalto("No se pudo actualizar, ingrese un índice válido\n");
							}	
						}  catch (StringExcepcion e) {
							con.escribirConSalto(e.getMessage());

						}catch(VerificarPesoExcepcion e) {
							con.escribirConSalto(e.getMessage());
						}catch(InputMismatchException e) {
							con.escribirConSalto("El valor ingresado no tiene un formato adecuado\n");
							con.quemarLinea();
						}catch(VerificarEnteroExcepcion e) {
							con.escribirConSalto(e.getMessage());
						}catch(VerificarSexoExcepcion e) {
							con.escribirConSalto(e.getMessage());
						}catch(VerificarFechaExcepcion e) {
							con.escribirConSalto(e.getMessage());
						}

					}
					break;
					case 3:{
						try {
							con.escribirConSalto("Lista de aves: ");
							con.escribirConSalto(mf.getAveDao().showAll());
							if(mf.getAveDao().isEmpty()) {
								break;
							}
							con.escribirConSalto("Ingrese el número del ave que desea actualizar: ");
							int index = con.leerEntero();
							LanzadorDeExcepcion.verificarEntero(index);

							con.escribirConSalto("Ingrese el nuevo nombre del ave: ");
							con.quemarLinea();
							String nombre = con.leerLineaCompleta();
							LanzadorDeExcepcion.verificarTexto(nombre);
							con.escribirConSalto("Ingrese la nueva raza del ave: ");
							String raza = con.leerLineaCompleta();
							LanzadorDeExcepcion.verificarTexto(raza);
							con.escribirConSalto("Ingrese el nuevo peso del ave: ");
							float peso = con.leerFlotante();
							LanzadorDeExcepcion.verificarPeso(peso);
							con.escribirConSalto("Ingrese la nueva edad del ave: ");
							int edad = con.leerEntero();
							LanzadorDeExcepcion.verificarEntero(edad);
							con.escribirConSalto("Ingrese el nuevo sexo del ave(m/f): ");
							char sexo = con.leerChar();
							LanzadorDeExcepcion.verificarSexo(sexo);
							con.escribirConSalto("Ingrese el nuevo habitad del ave: ");
							con.quemarLinea();
							String habitad = con.leerLineaCompleta();
							LanzadorDeExcepcion.verificarTexto(habitad);
							con.escribirConSalto("Nueva fecha (año-mes-dia): ");
							LocalDate fechaIngreso = con.leerFecha();
							con.escribirConSalto("Ingrese el nuevo tamaño del pico del ave: ");
							String tamanoPico = con.leerLineaCompleta();
							LanzadorDeExcepcion.verificarTexto(tamanoPico);
							con.escribirConSalto("Ingrese el nuevo tamaño de las plumas del ave: ");
							String tamanoPluma = con.leerLineaCompleta();
							LanzadorDeExcepcion.verificarTexto(tamanoPluma);

							Ave newData = new Ave(nombre, raza, peso, edad, sexo, habitad, fechaIngreso, tamanoPico, tamanoPluma);
							boolean actualizado = mf.getAveDao().update(index, newData);

							if(actualizado) {
								con.escribirConSalto("El ave ha sido actualizado con éxito\n");
							}else {
								con.escribirConSalto("No se pudo actualizar, ingrese un índice válido\n");
							}
						} catch (StringExcepcion e) {
							con.escribirConSalto(e.getMessage());

						}catch(VerificarPesoExcepcion e) {
							con.escribirConSalto(e.getMessage());
						}catch(InputMismatchException e) {
							con.escribirConSalto("El valor ingresado no tiene un formato adecuado\n");
							con.quemarLinea();
						}catch(VerificarEnteroExcepcion e) {
							con.escribirConSalto(e.getMessage());
						}catch(VerificarSexoExcepcion e) {
							con.escribirConSalto(e.getMessage());
						}

					}
					break;
					case 4:{
						try {
							con.escribirConSalto("Lista de peces: ");
							con.escribirConSalto(mf.getPezDao().showAll());
							if(mf.getPezDao().isEmpty()) {
								break;
							}
							con.escribirConSalto("Ingrese el número del pez que desea actualizar: ");
							int index = con.leerEntero();
							LanzadorDeExcepcion.verificarEntero(index);

							con.escribirConSalto("Ingrese el nuevo nombre del pez: ");
							con.quemarLinea();
							String nombre = con.leerLineaCompleta();
							LanzadorDeExcepcion.verificarTexto(nombre);
							con.escribirConSalto("Ingrese la nueva raza del pez: ");
							String raza = con.leerLineaCompleta();
							LanzadorDeExcepcion.verificarTexto(raza);
							con.escribirConSalto("Ingrese el nuevo peso del pez: ");
							float peso = con.leerFlotante();
							LanzadorDeExcepcion.verificarPeso(peso);						con.escribirConSalto("Ingrese la nueva edad del pez: ");
							int edad = con.leerEntero();
							LanzadorDeExcepcion.verificarEntero(edad);
							con.escribirConSalto("Ingrese el nuevo sexo del pez(m/f): ");
							char sexo = con.leerChar();
							LanzadorDeExcepcion.verificarSexo(sexo);
							con.escribirConSalto("Ingrese el nuevo habitad del pez: ");
							con.quemarLinea();
							String habitad = con.leerLineaCompleta();
							LanzadorDeExcepcion.verificarTexto(habitad);
							con.escribirConSalto("Nueva fecha (año-mes-dia): ");
							LocalDate fechaIngreso = con.leerFecha();
							LanzadorDeExcepcion.verificarFecha(fechaIngreso);
							con.escribirConSalto("Ingrese el nuevo tamaño de las aletas del pez: ");
							String tamanoAleta = con.leerLineaCompleta();
							LanzadorDeExcepcion.verificarTexto(tamanoAleta);
							con.escribirConSalto("Ingrese la nueva profundidad del nado del pez: ");
							String profundidadNado = con.leerLineaCompleta();
							LanzadorDeExcepcion.verificarTexto(profundidadNado);

							Pez newData = new Pez(nombre, raza, peso, edad, sexo, habitad, fechaIngreso, tamanoAleta, profundidadNado);
							boolean actualizado = mf.getPezDao().update(index, newData);

							if(actualizado) {
								con.escribirConSalto("El pez ha sido actualizado con éxito\n");
							}else {
								con.escribirConSalto("No se pudo actualizar, ingrese un índice válido");
							}
						} catch (StringExcepcion e) {
							con.escribirConSalto(e.getMessage());

						}catch(VerificarPesoExcepcion e) {
							con.escribirConSalto(e.getMessage());
						}catch(InputMismatchException e) {
							con.escribirConSalto("El valor ingresado no tiene un formato adecuado\n");
							con.quemarLinea();
						}catch(VerificarEnteroExcepcion e) {
							con.escribirConSalto(e.getMessage());
						}catch(VerificarSexoExcepcion e) {
							con.escribirConSalto(e.getMessage());
						}catch(VerificarFechaExcepcion e) {
							con.escribirConSalto(e.getMessage());
						}

					}
					break;
					case 5:{
						try {
							con.escribirConSalto("Lista de reptiles: ");
							con.escribirConSalto(mf.getReptilDao().showAll());
							if(mf.getReptilDao().isEmpty()) {
								break;
							}
							con.escribirConSalto("Ingrese el número del reptil que desea actualizar: ");
							int index = con.leerEntero();
							LanzadorDeExcepcion.verificarEntero(index);

							con.escribirConSalto("Ingrese el nuevo nombre del reptil: ");
							con.quemarLinea();
							String nombre = con.leerLineaCompleta();
							LanzadorDeExcepcion.verificarTexto(nombre);
							con.escribirConSalto("Ingrese la nueva raza del reptil: ");
							String raza = con.leerLineaCompleta();
							LanzadorDeExcepcion.verificarTexto(raza);
							con.escribirConSalto("Ingrese el nuevopeso del reptil: ");
							float peso = con.leerFlotante();
							LanzadorDeExcepcion.verificarPeso(peso);
							con.escribirConSalto("Ingrese la nueva edad del reptil: ");
							int edad = con.leerEntero();
							LanzadorDeExcepcion.verificarEntero(edad);
							con.escribirConSalto("Ingrese el nuevo sexo del reptil(m/f): ");
							char sexo = con.leerChar();
							LanzadorDeExcepcion.verificarSexo(sexo);
							con.escribirConSalto("Ingrese el nuevo habitad del reptil: ");
							con.quemarLinea();
							String habitad = con.leerLineaCompleta();
							LanzadorDeExcepcion.verificarTexto(habitad);
							con.escribirConSalto("Nueva fecha (año-mes-dia): ");
							LocalDate fechaIngreso = con.leerFecha();
							LanzadorDeExcepcion.verificarFecha(fechaIngreso);
							con.escribirConSalto("Ingrese nuevamente si el reptil está mudando piel: ");
							String mudaPiel = con.leerLineaCompleta();
							LanzadorDeExcepcion.verificarTexto(mudaPiel);
							con.escribirConSalto("Ingrese nuevamente la temperatura corporal del reptil: ");
							int temperaturaCorporal = con.leerEntero();
							LanzadorDeExcepcion.verificarEntero(temperaturaCorporal);

							Reptil newData = new Reptil(nombre, raza, peso, edad, sexo, habitad, fechaIngreso, mudaPiel, temperaturaCorporal);
							boolean actualizado = mf.getReptilDao().update(index, newData);

							if(actualizado) {
								con.escribirConSalto("El reptil ha sido actualizado con éxito\n");
							}else {
								con.escribirConSalto("No se pudo actualizar, ingrese un índice válido");
							}
						}  catch (StringExcepcion e) {
							con.escribirConSalto(e.getMessage());

						}catch(VerificarPesoExcepcion e) {
							con.escribirConSalto(e.getMessage());
						}catch(InputMismatchException e) {
							con.escribirConSalto("El valor ingresado no tiene un formato adecuado\n");
							con.quemarLinea();
						}catch(VerificarEnteroExcepcion e) {
							con.escribirConSalto(e.getMessage());
						}catch(VerificarSexoExcepcion e) {
							con.escribirConSalto(e.getMessage());
						}catch(VerificarFechaExcepcion e) {
							con.escribirConSalto(e.getMessage());
						}

					}
					break;
					}

				}
				break;
				case 9:{
					con.escribirConSalto("Muchas gracias por visitar la veterinaria, que tenga un buen día");
					break mainloop;
				}
				default:
					con.escribirConSalto("Valor no válido\n");
				}
			}
		}catch(VerificarMenuExcepcion e) {
			con.escribirConSalto(e.getMessage());
		}catch(InputMismatchException e) {
			con.escribirConSalto("El valor ingresado no tiene un formato adecuado\n");
			con.quemarLinea();
			
		}

	}
}



