package co.edu.unbosque.model;

import java.time.LocalDate;

public class Pez extends Animal{
	
	private String tamanoAleta;
	private String profundidadNado;
	public Pez() {
		super();
	}
	public Pez(String tamanoAleta, String profundidadNado) {
		super();
		this.tamanoAleta = tamanoAleta;
		this.profundidadNado = profundidadNado;
	}
	public Pez(String nombre, String raza, float peso, int edad, char sexo, String habitad, LocalDate fechaIngreso, String tamanoAleta,
			String profundidadNado) {
		super(nombre, raza, peso, edad, sexo, habitad, fechaIngreso);
		this.tamanoAleta = tamanoAleta;
		this.profundidadNado = profundidadNado;
	}
	public Pez(String nombre, String raza, float peso, int edad, char sexo, String habitad, LocalDate fechaIngreso) {
		super(nombre, raza, peso, edad, sexo, habitad, fechaIngreso);
		// TODO Auto-generated constructor stub
	}
	
	@Override
	public String alimentarse(String b) {
		if(b.equals("plantas")||(b.equals("peces"))) {
			return "El pez se está alimentando de " + b;
		}else {
			return "El pez no se puede alimentar de " + b + " dele alimento adecuado";
		}
	}
	@Override
	public String dormir(String a) {
		if(a.equals("pecera")) {
			return "Mantenga el pez en la " + a;
		}else {
			return "Mueva el pez a una pecera";
		}
	}
	@Override
	public String toString() {
		return super.toString() + "\nTamaño de la aleta: " + tamanoAleta + "\nProfundidad del nado: " + profundidadNado + "\n----------------";
	}
	public String getTamanoAleta() {
		return tamanoAleta;
	}
	public void setTamanoAleta(String tamanoAleta) {
		this.tamanoAleta = tamanoAleta;
	}
	public String getProfundidadNado() {
		return profundidadNado;
	}
	public void setProfundidadNado(String profundidadNado) {
		this.profundidadNado = profundidadNado;
	}
	
}
