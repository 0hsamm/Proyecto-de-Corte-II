package co.edu.unbosque.model;

import java.time.LocalDate;

public class Perro extends Animal{

	private String colorPelaje;
	private String formaHocico;
	public Perro() {
		super();
	}
	public Perro(String colorPelaje, String formaHocico) {
		super();
		this.colorPelaje = colorPelaje;
		this.formaHocico = formaHocico;
	}
	public Perro(String nombre, String raza, float peso, int edad, char sexo, String habitad, LocalDate fechaIngreso, String colorPelaje,
			String formaHocico) {
		super(nombre, raza, peso, edad, sexo, habitad, fechaIngreso);
		this.colorPelaje = colorPelaje;
		this.formaHocico = formaHocico;
	}
	public Perro(String nombre, String raza, float peso, int edad, char sexo, String habitad, LocalDate fechaIngreso) {
		super(nombre, raza, peso, edad, sexo, habitad, fechaIngreso);
		// TODO Auto-generated constructor stub
	}
	public String getColorPelaje() {
		return colorPelaje;
	}
	public void setColorPelaje(String colorPelaje) {
		this.colorPelaje = colorPelaje;
	}
	public String getFormaHocico() {
		return formaHocico;
	}
	public void setFormaHocico(String formaHocico) {
		this.formaHocico = formaHocico;
	}

	@Override //se está haciendo una sobreescritura
	public String dormir(String a) {
		if(a.equals("guacal")||(a.equals("huacal")||(a.equals("jaula")))) {
			return "El perro está dormido en " + a;
		}else {
			return "El perro no puede dormir en ese lugar, cambialo a un lugar adecuado";
		}
	}
	@Override
	public String alimentarse(String b) {
		if(b.equals("Concentrado")) {
			return "El perro está comiendo " + b;
		}else {
			return "El perro no puede comer " + b;
		}
		
	}
	@Override
	public String toString() {
		return super.toString() + "\nColor del pelaje: " + colorPelaje + "\nForma del hocico: " + formaHocico + "\n--------------";
	}
	
}

