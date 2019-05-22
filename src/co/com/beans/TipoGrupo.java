package co.com.beans;

import java.util.ArrayList;

public class TipoGrupo {

	private String id;
	private String nombre;
	private ArrayList<Grupo> grupos;

	public TipoGrupo(String id, String nombre, ArrayList<Grupo> grupos) {
		this.id = id;
		this.nombre = nombre;
		this.grupos = grupos;
	}

	public String getId() {
		return id;
	}

	public void setIdTg(String id) {
		this.id = id;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public ArrayList<Grupo> getGrupos() {
		return grupos;
	}

	public void setGrupos(ArrayList<Grupo> grupos) {
		this.grupos = grupos;
	}

}
