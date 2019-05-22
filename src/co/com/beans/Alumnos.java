package co.com.beans;

public class Alumnos extends Persona {
	
	private String estado;
	

	
	public Alumnos(String cedula, String nombre, String apellidos, String correo, String telefono, String estado) {
		
	    super(cedula,nombre,apellidos,correo,telefono);
		this.estado = estado;		
			
	}

	public String getEstado() {
		return estado;
	}

	public void setEstado(String estado) {
		this.estado = estado;
	}

	
	
	
	

}
