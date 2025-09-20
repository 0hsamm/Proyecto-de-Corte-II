package co.edu.unbosque.model.persistence;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.PrintWriter;
import java.util.Properties;
import java.util.Scanner;

public class FileHandler {

	public static Scanner sc;
	public static File archivo;

	// syso para archivos
	public static PrintWriter escritor;

	// scanner para lectura de archivos
	public static Scanner lector;

	// serializado
	// leer el archivo o lo crea
	public static FileInputStream fis;
	public static ObjectInputStream ois;
	
	// escritura de archivo
	public static FileOutputStream fos;
	public static ObjectOutputStream oos;
	
	//archivo de propiedades
	public static Properties prop;
	

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

	public static void escribirEnArchivoSerializado(String url, Object contenido) {
		try {
			archivo = new File(url);
			if (!archivo.exists()) {
				archivo.createNewFile();
			}
			fos = new FileOutputStream(archivo);
			oos = new ObjectOutputStream(fos);
			oos.writeObject(contenido);
			oos.close();
			fos.close();
		} catch (IOException e) {
			System.out.println("Error al leer el archivo serializado");
			e.printStackTrace();
		}

	}

	public static Object leerDesdeArchivoSerializado(String url) {
		archivo = new File(url);
		
		try {

			if (!archivo.exists()) {
				archivo.createNewFile();
			}
			
			fis = new FileInputStream(archivo);
			ois = new ObjectInputStream(fis);
			
			Object contenido = ois.readObject();
			
			ois.close();
			fis.close();
			
			return contenido;
			
		} catch (IOException e) {
			System.out.println("Error al leer el archivo serializado");
			System.out.println(e.getMessage());
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			System.out.println("Error al desserializar los datos del archivo");
			e.printStackTrace();
		}

		return null;
	}
	
	public static Properties cargarArchivoDePropiedades(String url) {

		archivo = new File(url);

		try {
			archivo = new File(url);

			if (!archivo.exists()) {
				archivo.createNewFile();
			}
			prop = new Properties();
			
			prop.load(new FileInputStream(archivo));
			return prop;

		} catch (IOException e) {
			System.out.println("Error al cargar el archivo de propiedades");
			System.out.println(e.getMessage());
			e.printStackTrace();
		}
		return null;

	}

}
