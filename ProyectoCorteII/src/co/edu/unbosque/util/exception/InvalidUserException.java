package co.edu.unbosque.util.exception;

public class InvalidUserException extends Exception{

	public InvalidUserException() {
		super("Ingrese un usuario válido");
	}
	
}
