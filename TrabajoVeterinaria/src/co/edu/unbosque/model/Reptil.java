package co.edu.unbosque.model;

import java.time.LocalDate;

public class Reptil extends Animal{
	
	private String mudaPiel;
	private int temperaturaCorporal;
	
	public Reptil() {
		super();
	}

	public Reptil(String mudaPiel, int temperaturaCorporal) {
		super(); //Constructores de la superclase(constructor vacio)
		this.mudaPiel = mudaPiel;
		this.temperaturaCorporal = temperaturaCorporal;
	}
	
	
	public Reptil(String nombre, String raza, float peso, int edad, char sexo, String habitad, LocalDate fechaIngreso, String mudaPiel,
			int temperaturaCorporal) {
		super(nombre, raza, peso, edad, sexo, habitad, fechaIngreso);//Constructor completo
		this.mudaPiel = mudaPiel;
		this.temperaturaCorporal = temperaturaCorporal;
	}

	public Reptil(String nombre, String raza, float peso, int edad, char sexo, String habitad, LocalDate fechaIngreso) {
		super(nombre, raza, peso, edad, sexo, habitad, fechaIngreso);
		// TODO Auto-generated constructor stub
	}

	@Override
	public String dormir(String a) {
		if(a.equals("terrario")) {
			return "El reptil está durmiendo en " + a;
		}else {
			return "El reptil no puede dormir ahí, muevelo a un lugar adecuado";
		}
	}
	
	@Override
	public String alimentarse(String b) {
		if(b.equals("insectos")) {
			return "El reptil se está alimentando de " + b;
		}else {
			return "El reptil no puede comer eso, dale comida adecuada";
		}
	}

	@Override
	public String toString() {
		return "\nEsta mudando piel: " + mudaPiel + "\nTemperatura corporal: " + temperaturaCorporal + "\n----------------";
	}

	public String getMudaPiel() {
		return mudaPiel;
	}

	public void setMudaPiel(String mudaPiel) {
		this.mudaPiel = mudaPiel;
	}

	public int getTemperaturaCorporal() {
		return temperaturaCorporal;
	}

	public void setTemperaturaCorporal(int temperaturaCorporal) {
		this.temperaturaCorporal = temperaturaCorporal;
	}
		
}