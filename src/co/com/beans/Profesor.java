package co.com.beans;

import java.util.HashMap;

public class Profesor extends Persona {
	private String genero;
	private HashMap<String, Grupo> grupos;

	public Profesor(String cedula, String nombre, String apellidos, String correo, String telefono, String genero, HashMap<String, Grupo> grupos) {
		super(cedula, nombre, apellidos, correo, telefono);
		this.genero = genero;
		this.grupos = grupos;
		
		
	}

	public String getGenero() {
		return genero;
	}

	public void setGenero(String genero) {
		this.genero = genero;
	}

	public HashMap<String, Grupo> getGrupos() {
		return grupos;
	}

	public void setGrupo(HashMap<String, Grupo> grupos) {
		this.grupos = grupos;
	}
	
	

}
