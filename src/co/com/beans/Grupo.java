package co.com.beans;

import java.util.HashMap;

public class Grupo {
	
	private String id; 
	private String nombre;
	private String  horario;
	private HashMap<String, Alumnos> alumnos;
	
	public Grupo(String id, String nombre, String horario, HashMap<String, Alumnos> alumnos) {
		this.id = id;
		this.nombre = nombre;
		this.horario = horario;
		this.alumnos = alumnos;
		
	}
	

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}


	public String getNombre() {
		return nombre;
	}


	public void setNombre(String nombre) {
		this.nombre = nombre;
	}


	public String getHorario() {
		return horario;
	}


	public void setHorario(String horario) {
		this.horario = horario;
	}


	public HashMap<String, Alumnos> getAlumnos() {
		return alumnos;
	}


	public void setAlumnos(HashMap<String, Alumnos> alumnos) {
		this.alumnos = alumnos;
	}
	
	

}
