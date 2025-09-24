package co.edu.unbosque.model;

import java.io.Serializable;

/**
 * Clase abstracta que representa a una persona con datos básicos.
 * Implementa Serializable para permitir su persistencia.
 */
public abstract class Persona implements Serializable {
	
	private static final long serialVersionUID = -6938235908874924459L;
	
	private String correo;
	private String nombre;
	private String telefono;
	private String id;
	private String contrasena;
	
	/**
	 * Constructor vacío.
	 */
	public Persona() {
	}

	/**
	 * Constructor que inicializa todos los atributos de la persona.
	 * @param correo correo electrónico
	 * @param nombre nombre completo
	 * @param telefono número de teléfono
	 * @param id identificación
	 * @param sexo sexo de la persona
	 * @param contrasena contraseña de acceso
	 */
	public Persona(String correo, String nombre, String telefono, String id, String contrasena) {
		super();
		this.correo = correo;
		this.nombre = nombre;
		this.telefono = telefono;
		this.id = id;
		this.contrasena = contrasena;
	}

	/**
	 * Devuelve el correo electrónico.
	 * @return correo
	 */
	public String getCorreo() {
		return correo;
	}

	/**
	 * Asigna el correo electrónico.
	 * @param correo nuevo correo
	 */
	public void setCorreo(String correo) {
		this.correo = correo;
	}

	/**
	 * Devuelve el nombre completo.
	 * @return nombre
	 */
	public String getNombre() {
		return nombre;
	}

	/**
	 * Asigna el nombre completo.
	 * @param nombre nuevo nombre
	 */
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	/**
	 * Devuelve el número de teléfono.
	 * @return teléfono
	 */
	public String getTelefono() {
		return telefono;
	}

	/**
	 * Asigna el número de teléfono.
	 * @param telefono nuevo teléfono
	 */
	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}

	/**
	 * Devuelve la identificación.
	 * @return id
	 */
	public String getId() {
		return id;
	}

	/**
	 * Asigna la identificación.
	 * @param id nueva identificación
	 */
	public void setId(String id) {
		this.id = id;
	}

	/**
	 * Devuelve la contraseña.
	 * @return contraseña
	 */
	public String getContrasena() {
		return contrasena;
	}

	/**
	 * Asigna la contraseña.
	 * @param contrasena nueva contraseña
	 */
	public void setContrasena(String contrasena) {
		this.contrasena = contrasena;
	}

	/**
	 * Representación en texto de la persona.
	 * @return cadena con los datos de la persona
	 */
	@Override
	public String toString() {
		return "Persona [correo=" + correo + ", nombre=" + nombre + ", telefono=" + telefono +
			   ", id=" + id + ", contrasena=" + contrasena + "]";
	}

}
