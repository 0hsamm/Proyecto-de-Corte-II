package co.edu.unbosque.model;

public abstract class Persona {
	
	private String correo;
	private String nombre;
	private String telefono;
	private String id;
	private char sexo;
	private String contrasena;
	
	public Persona() {
		
	}

	

	public Persona(String correo, String nombre, String telefono, String id, char sexo, String contrasena) {
		super();
		this.correo = correo;
		this.nombre = nombre;
		this.telefono = telefono;
		this.id = id;
		this.sexo = sexo;
		this.contrasena = contrasena;
	}



	public String getCorreo() {
		return correo;
	}

	public void setCorreo(String correo) {
		this.correo = correo;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getTelefono() {
		return telefono;
	}

	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public char getSexo() {
		return sexo;
	}

	public void setSexo(char sexo) {
		this.sexo = sexo;
	}

	@Override
	public String toString() {
		return "Persona [correo=" + correo + ", nombre=" + nombre + ", telefono=" + telefono + ", id=" + id + ", sexo="
				+ sexo + "]";
	}

	
	
	

}
