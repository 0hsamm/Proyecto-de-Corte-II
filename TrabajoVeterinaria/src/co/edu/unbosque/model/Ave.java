package co.edu.unbosque.model;

import java.time.LocalDate;

public class Ave extends Animal{
	
	private String tamanoPico;
	private String tamanoPluma;
	public Ave() {
		super();
	}
	public Ave(String tamanoPluma, String tamanoPico) {
		super();
		this.tamanoPico = tamanoPico;
		this.tamanoPluma = tamanoPluma;
	}
	public Ave(String nombre, String raza, float peso, int edad, char sexo, String habitad, LocalDate fechaIngreso, String tamanoPico,
			String tamanoPluma) {
		super(nombre, raza, peso, edad, sexo, habitad, fechaIngreso);
		this.tamanoPico = tamanoPico;
		this.tamanoPluma = tamanoPluma;
	}
	public Ave(String nombre, String raza, float peso, int edad, char sexo, String habitad, LocalDate fechaIngreso) {
		super(nombre, raza, peso, edad, sexo, habitad, fechaIngreso);
		// TODO Auto-generated constructor stub
	}
	@Override
	public String dormir(String a) {
		if(a.equals("jaula")) {
			return "El ave está durmiendo en una " + a;
		}else {
			return "El ave no puede dormir en " + a + " por favor ponlo en una jaula";
		}
	}
	@Override
	public String alimentarse(String b) {
		if(b.equals("semillas")) {
			return "El ave se está alimentando de " + b;
		}else {
			return "El ave no puede alimentarse de  " + b + " por favor alimentelo de semillas";
		}
	}
	@Override
	public String toString() {
		return super.toString() +  "\nTamano del pico: " + tamanoPico + "\nTamano de las plumas: " + tamanoPluma + "\n-----------------";
	}
	public String getTamanoPico() {
		return tamanoPico;
	}
	public void setTamanoPico(String tamanoPico) {
		this.tamanoPico = tamanoPico;
	}
	public String getTamanoPluma() {
		return tamanoPluma;
	}
	public void setTamanoPluma(String tamanoPluma) {
		this.tamanoPluma = tamanoPluma;
	}
	
}
