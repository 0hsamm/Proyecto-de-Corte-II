package co.edu.unbosque.model;

import java.time.LocalDate;

public abstract class Animal {

	private String nombre;
	private String raza;
	private float peso;
	private int edad;
	private char sexo; 
	private String habitad;
	private LocalDate fechaIngreso;
	
	
	public Animal() {
		super();
	}
	public Animal(String nombre, String raza, float peso, int edad, char sexo, String habitad, LocalDate fechaIngreso) {
		super();
		this.nombre = nombre;
		this.raza = raza;
		this.peso = peso;
		this.edad = edad;
		this.sexo = sexo;
		this.habitad = habitad;
		this.fechaIngreso = fechaIngreso;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getRaza() {
		return raza;
	}
	public void setRaza(String raza) {
		this.raza = raza;
	}
	public float getPeso() {
		return peso;
	}
	public void setPeso(float peso) {
		this.peso = peso;
	}
	public int getEdad() {
		return edad;
	}
	public void setEdad(int edad) {
		this.edad = edad;
	}
	public char getSexo() {
		return sexo;
	}
	public void setSexo(char sexo) {
		this.sexo = sexo;
	}
	public String getHabitad() {
		return habitad;
	}
	public void setHabitad(String habitad) {
		this.habitad = habitad;
	}
	
	
	public LocalDate getFechaIngreso() {
		return fechaIngreso;
	}
	public void setFechaIngreso(LocalDate fechaIngreso) {
		this.fechaIngreso = fechaIngreso;
	}
	public String dormir(String a) {
		return "Todos los animales pueden dormir";
	}
	public String alimentarse(String b) {
		return "Todos los animales pueden alimentarse";
	}
	@Override
	public String toString() {
		return "\n----------" + "\nNombre: " + nombre + "\nRaza: " + raza + "\nPeso: " + peso + "\nEdad: " + edad + "\nSexo: " + sexo
				+ "\nHabitad: " + habitad + "\nFecha de ingreso: " + fechaIngreso;
	}
	
}
