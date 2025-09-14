package co.edu.unbosque.util.exception;

public class InvalidUserException extends Exception{

	public InvalidUserException() {
		super("Usuario no válido, ingrese un usuario válido");
	}
	
}
