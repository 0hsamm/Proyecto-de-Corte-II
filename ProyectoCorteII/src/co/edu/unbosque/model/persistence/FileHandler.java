package co.edu.unbosque.model.persistence;

import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

public class FileHandler {

	public static File archivo;
	public static PrintWriter escritor;
	public static Scanner sc;

	public static void escribirEnArchivoDeTexto(String url, String contenido) {
		try {
			archivo = new File(url);
			if (!archivo.exists()) {
				archivo.createNewFile();
			}
			escritor = new PrintWriter(archivo);
			escritor.println(contenido);

			escritor.close();

		} catch (IOException e) {
			System.out.println("Error al crear y escribir el archivo");
			System.out.println(e.getMessage());
		}
	}

	public static String leerDesdeArchivoDeTexto(String url) {
		try {
			archivo = new File(url);

			if (!archivo.exists()) {
				archivo.createNewFile();
			}

			sc = new Scanner(archivo);
			String contenido = "";
			while (sc.hasNext()) {
				contenido += sc.nextLine() + "\n";
			}
			sc.close();
			return contenido;
		} catch (IOException e) {
			System.out.println("Error al leer el archivo de texto");
			System.out.println(e.getMessage());
		}
		return null;
	}
}
