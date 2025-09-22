package co.edu.unbosque.util.exception;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class LanzadorDeExcepcion{

	

	public static void verificarEmail(String email) throws InvalidEmailException {

		Pattern patron = Pattern.compile("^[_A-Za-z0-9-\\+]+(\\.[_A-Za-z0-9-]+)*@"
                + "[A-Za-z0-9-]+(\\.[A-Za-z0-9]+)*(\\.[A-Za-z]{2,})$");
		
		
		Matcher mat = patron.matcher(email);//compara la expresión regular con el correo electrónico
		
		if(!mat.find()) {
			throw new InvalidEmailException();
		}
	}
	
	public static void verificarID(String id) throws InvalidIDException {
		  String idTrim = id.trim();

	       
	        if (id.length()<10&&!id.matches("^[0-9]")) {
	            throw new InvalidIDException();
	        
	    }
	}
	public static void verificarTamanoContrasena(String contrasena) throws InvalidPasswordException {
		if(contrasena.length()<8) {
			throw new InvalidPasswordException();
		}
	}
	
	
	public static void verificarTelefono(String telefono) throws InvalidPhoneException {
			String telTrim = telefono.trim();
		if((telefono.length()<10)&&!telefono.matches("^[0-9]")) {
			throw new InvalidPhoneException();
		}
	}
}


