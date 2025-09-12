package co.edu.unbosque.util;

public class VerificarFechaExcepcion extends Exception{

	public VerificarFechaExcepcion() {
		super("Ingrese una fecha que exista o ingrese el formato adecuado (año-mes-dia)\n");
	}
	
}
