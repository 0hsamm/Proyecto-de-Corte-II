package co.edu.unbosque.util.exception;

public class InvalidPasswordException extends Exception{

	public InvalidPasswordException() {
		super("Contraseña no válida, ingrese una contraseña válida");
	}
	
}
