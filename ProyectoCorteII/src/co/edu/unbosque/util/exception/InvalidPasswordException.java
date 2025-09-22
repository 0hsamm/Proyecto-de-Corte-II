package co.edu.unbosque.util.exception;

public class InvalidPasswordException extends Exception{

	public InvalidPasswordException() {
		super("La contraseña es muy corta");
	}
	
}
