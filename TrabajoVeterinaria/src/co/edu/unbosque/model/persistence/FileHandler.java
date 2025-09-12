package co.edu.unbosque.model.persistence;

import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

public class FileHandler {


	public static File archivo;
	public static PrintWriter escritor;
	public static Scanner lector;

	public static void escribirEnArchivoTexto(String url, String contenido) {

		try {
			archivo = new File(url);
			if(!archivo.exists()) {
				archivo.createNewFile();
				
			} 
			escritor = new PrintWriter(archivo);
			escritor.println(contenido);
			escritor.close();
		}catch (IOException e) {
			System.out.println("Error al crear y escribir el archivo de texto");
			System.out.println(e.getMessage());
			}
		
			//e.printStackTrace();
		}
		
		public static String leerDesdeArchivoDeTexto(String url) {
			
			try {
				
				archivo = new File(url);
				if(!archivo.exists()) {
					archivo.createNewFile();
				
			}
			lector = new Scanner(archivo);
			String contenido = "";
			while(lector.hasNext()) {
				contenido += lector.nextLine()+"\n";
			}
				lector.close();
				return contenido;
				
			}catch (Exception e) {
				System.out.println("Error al leer el archivo");
				System.out.println(e.getMessage());
				
			}
			return null;
			
		
		
	}

}


