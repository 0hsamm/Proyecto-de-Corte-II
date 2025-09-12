package co.edu.unbosque.util;

import java.time.LocalDate;

public class LanzadorDeExcepcion {

	public static void verificarTexto(String i) throws StringExcepcion {
		if(!i.toLowerCase().contains("a") &&
				!i.toLowerCase().contains("b")&&
				!i.toLowerCase().contains("c")&&
				!i.toLowerCase().contains("d")&&
				!i.toLowerCase().contains("e")&&
				!i.toLowerCase().contains("f")&&
				!i.toLowerCase().contains("g")&&
				!i.toLowerCase().contains("h")&&
				!i.toLowerCase().contains("i")&&
				!i.toLowerCase().contains("j")&&
				!i.toLowerCase().contains("k")&&
				!i.toLowerCase().contains("l")&&
				!i.toLowerCase().contains("m")&&
				!i.toLowerCase().contains("n")&&
				!i.toLowerCase().contains("o")&&
				!i.toLowerCase().contains("p")&&
				!i.toLowerCase().contains("q")&&
				!i.toLowerCase().contains("r")&&
				!i.toLowerCase().contains("s")&&
				!i.toLowerCase().contains("t")&&
				!i.toLowerCase().contains("u")&&
				!i.toLowerCase().contains("v")&&
				!i.toLowerCase().contains("w")&&
				!i.toLowerCase().contains("x")&&
				!i.toLowerCase().contains("x")&&
				!i.toLowerCase().contains("y")&&
				!i.toLowerCase().contains("z")) {
			throw new StringExcepcion();
		}
	}
	public static void verificarPeso(float j) throws VerificarPesoExcepcion {
		if(j <= 0) {
			throw new VerificarPesoExcepcion();
		}

	}

	public static void verificarEntero(int t) throws VerificarEnteroExcepcion {
		if(t < 0 ) {
			throw new VerificarEnteroExcepcion();
		}
	}
	public static void verificarSexo(char l) throws VerificarSexoExcepcion {
		if(l != 'm' && l != 'f' && l != 'M' && l != 'F') {
			throw new VerificarSexoExcepcion();
		}
	}
	public static void verificarEliminar(int p) throws VerificarEliminarExcepcion {
		if(p < 1 || p > 6) {
			throw new VerificarEliminarExcepcion();
		}
	}
	public static void verificarMenu(int k) throws VerificarMenuExcepcion {
		if(k < 1 || k > 9) {
			throw new VerificarMenuExcepcion();
		}
	}
	public static void verificarFecha(LocalDate fechaIngresada) throws VerificarFechaExcepcion {

		if (fechaIngresada.isAfter(LocalDate.now())) {
			throw new VerificarFechaExcepcion();
			//Aun no sé usar muy bien el LocalDate para hacer las demás excepciones
		}

	}     

}

