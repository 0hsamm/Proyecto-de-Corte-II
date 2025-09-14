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

	       
	        if (!Pattern.matches("^[0-9]+$", idTrim)) {
	            throw new InvalidIDException();
	        
	    }
	}
}


