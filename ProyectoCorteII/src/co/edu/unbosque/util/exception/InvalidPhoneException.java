package co.edu.unbosque.util.exception;

public class InvalidPhoneException extends Exception{

	public InvalidPhoneException() {
	super("Ingrese un teléfono válido");
	}
}
