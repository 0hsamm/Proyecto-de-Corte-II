package co.edu.unbosque.view;

import java.time.LocalDate;
import java.util.Scanner;

public class Consola {
	private Scanner sc;

	public Consola() {
		sc = new Scanner(System.in);

	}

	public int leerEntero() {
		return sc.nextInt();
	}

	public double leerDoble() {
		return sc.nextDouble();
	}

	public float leerFlotante() {
		return sc.nextFloat();
	}

	public long leerLong() {
		return sc.nextLong();
	}

	public String leerLineaCompleta() {
		return sc.nextLine();
	}

	public char leerChar() {
		return sc.next().charAt(0);
	}

	public String leerPalabra() {
		return sc.next();
	}

	public void escribirConSalto(String texto) {
		System.out.println(texto);	}

	public void escribirSinSalto(String texto) {
		System.out.print(texto);
	}

	public void quemarLinea() {
		sc.nextLine();
	}

	public boolean leerBooleano() {
		String entrada = leerLineaCompleta();
		if(entrada.toLowerCase().contains("si")) {
			return true;	
		}else {
			return false;
		}
	}
	
	public LocalDate leerFecha() {
		String fechaTexto = sc.nextLine();
		LocalDate fecha = LocalDate.parse(fechaTexto);
		return fecha;
	}
	
	public void printMenu() {
		System.out.println("Bienvenido a la veterinaria");
		System.out.println("¿Qué va a realizar el día de hoy?");
		System.out.println("1) Ingresar animal \n2) Mostrar lista de animales\n3) Eliminar animal\n4) Actualizar animal\n9) Salir");
	}
	public void menuAnimal() {
		System.out.println("¿Qué animal va a ingresar a la veterinaria?");
		System.out.println("1) Perro \n2) Gato\n3) Ave\n4) Pez\n5) Reptil");
	}
	public void menuMostrar() {
		System.out.println("¿Qué lista de animales desea ver?");
		System.out.println("1) Perro \n2) Gato\n3) Ave\n4) Pez\n5) Reptil\n6) Todos");
	}
	public void menuEliminar() {
		System.out.println("¿Qué animal desea eliminar?");
		System.out.println("1) Perro \n2) Gato\n3) Ave\n4) Pez\n5) Reptil\n6) Todos");
	}
	public void menuActualizar() {
		System.out.println("¿Qué animal desea actualizar?");
		System.out.println("1) Perro \n2) Gato\n3) Ave\n4) Pez\n5) Reptil");
	}
}


