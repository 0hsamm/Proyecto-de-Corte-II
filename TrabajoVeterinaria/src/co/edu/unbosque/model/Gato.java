package co.edu.unbosque.model;

import java.time.LocalDate;

public class Gato extends Animal{

	private String colorPelaje;
	private String flexibilidad;
	public Gato() {
		super();
	}
	public Gato(String colorPelaje, String flexibilidad) {
		super();
		this.colorPelaje = colorPelaje;
		this.flexibilidad = flexibilidad;
	}
	public Gato(String nombre, String raza, float peso, int edad, char sexo, String habitad, LocalDate fechaIngreso, String colorPelaje,
			String flexibilidad) {
		super(nombre, raza, peso, edad, sexo, habitad, fechaIngreso);
		this.colorPelaje = colorPelaje;
		this.flexibilidad = flexibilidad;
	}
	public Gato(String nombre, String raza, float peso, int edad, char sexo, String habitad, LocalDate fechaIngreso) {
		super(nombre, raza, peso, edad, sexo, habitad, fechaIngreso);
		// TODO Auto-generated constructor stub
	}
	public String getColorPelaje() {
		return colorPelaje;
	}
	public void setColorPelaje(String colorPelaje) {
		this.colorPelaje = colorPelaje;
	}
	public String getFlexibilidad() {
		return flexibilidad;
	}
	public void setFlexibilidad(String flexibilidad) {
		this.flexibilidad = flexibilidad;
	}
	@Override
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
		return super.toString() + "\nColor del pelaje: " + colorPelaje + "\nFlexibilidad: " + flexibilidad + "\n---------------------";
	}

}










