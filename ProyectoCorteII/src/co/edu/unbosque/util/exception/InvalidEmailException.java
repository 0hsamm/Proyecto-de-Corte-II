package co.edu.unbosque.util.exception;

public class InvalidEmailException extends Exception{

	public InvalidEmailException() {
		super("Correo no válido, ingrese un correo válido");
	}
	
}
