package co.com.beans;

import java.util.ArrayList;

public class Sede {
	private String id;
	private String nombre;
	private String barrio;
	private String cuidad;
	private String direccion;
	private ArrayList<Grupo> grupos;
	
	public Sede(String id, String nombre, String barrio, String cuidad, String direccion, ArrayList<Grupo> grupos) {
		this.id = id;
		this.nombre = nombre;
		this.barrio = barrio;
		this.cuidad = cuidad;
		this.direccion = direccion;
		this.grupos = grupos;
		
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
	
	public String getBarrio() {
		return barrio;
	}

	public void setBarrio(String barrio) {
		this.barrio = barrio;
	}

	public String getCuidad() {
		return cuidad;
	}

	public void setCuidad(String cuidad) {
		this.cuidad = cuidad;
	}

	public String getDireccion() {
		return direccion;
	}

	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}

	public ArrayList<Grupo> getGrupos() {
		return grupos;
	}

	public void setGrupos(ArrayList<Grupo> grupos) {
		this.grupos = grupos;
	}


	
	
	

}
