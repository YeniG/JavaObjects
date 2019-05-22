package co.com.business;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;

import javax.swing.JOptionPane;

import co.com.beans.Alumnos;
import co.com.beans.Grupo;
import co.com.beans.Profesor;
import co.com.beans.Sede;
import co.com.beans.TipoGrupo;

public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	
	Alumnos alumno1 = new Alumnos("1111111111","Yeni","Soto","Yeni@gmail.com","3207818453","Becada");	
    Alumnos alumno2 = new Alumnos("2222222222","Natalia","Suarez","Natalia@gmail.com","31323221","Mensualidad");
    Alumnos alumno3 = new Alumnos("3333333333","Darla","Jarammillo","Darla@gmail.com","3232112","Becada");	
    Alumnos alumno4 = new Alumnos("4444444444","Luisa","Marin","Luisa@gmail.com","31323221","Mensualidad");
    Alumnos alumno5 = new Alumnos("5555555555","Valentina","Milonga","Milonga@gmail.com","3342232","Becada");	
    Alumnos alumno6 = new Alumnos("6666666666","Cristian","Gomez","Gomez@gmail.com","3133423","Mensualidad");
    Alumnos alumno7 = new Alumnos("7777777777","Veronica","Montoya","Vero@gmail.com","30023422","Mensualidad");	
    Alumnos alumno8 = new Alumnos("8888888888","Laura","Gallego","Laura@gmail.com","31323221","Mensualidad");
	
    // Grupos pertenecientes al grupo femenino
    HashMap<String, Alumnos> femenino = new HashMap<String, Alumnos>(); 
   	femenino.put(alumno1.getCedula(), alumno1);
   	femenino.put(alumno3.getCedula(), alumno3);
	femenino.put(alumno4.getCedula(), alumno4);
   
   	HashMap<String, Alumnos> uNivel2 = new HashMap<String, Alumnos>(); 
   	uNivel2.put(alumno6.getCedula(), alumno6);
	uNivel2.put(alumno7.getCedula(), alumno7);
  
   	HashMap<String, Alumnos> sNivel2 = new HashMap<String, Alumnos>(); 
   	sNivel2.put(alumno2.getCedula(), alumno2);
   	sNivel2.put(alumno4.getCedula(), alumno4);
   	
   	HashMap<String, Alumnos> sCompañia = new HashMap<String, Alumnos>();
   	sCompañia.put(alumno5.getCedula(), alumno5);
   	sCompañia.put(alumno8.getCedula(), alumno8);
   	
  
	Grupo grupo1 = new Grupo("1","Femenino","7pm a 8pm",femenino);
	Grupo grupo2 = new Grupo("2","Nivel 2","7pm a 8pm",uNivel2);
    Grupo grupo3 = new Grupo("3","Nivel 2","8pm a 9pm",sNivel2);
    Grupo grupo4 = new Grupo("4","Compañia","7pm a 8pm",sCompañia);
    
	// Grupos pertenecientes al tipo de grupo urbano
	ArrayList<Grupo> urbano = new ArrayList<Grupo>();
	urbano.add(grupo1);
	urbano.add(grupo2);
	
	// Grupos pertenecientes al tipo de grupo salón
	ArrayList<Grupo> salon = new ArrayList<Grupo>();
	salon.add(grupo3);
	salon.add(grupo4);
	
	TipoGrupo tipo1 = new TipoGrupo("1","Urbano",urbano);
	TipoGrupo tipo2 = new TipoGrupo("2","Salón",salon);
	
	// Grupos pertenecientes a la sede1
	ArrayList<Grupo> grupos = new ArrayList<Grupo>();
	grupos.add(grupo1);
	grupos.add(grupo2);
	grupos.add(grupo3);
	grupos.add(grupo4);
	
	Sede sede1 = new Sede("1","Santa sede", "Barrio Obrero","Bello","Cr 34 #12-32",grupos);
	
	
	
	//Grupos pertenecientes al profesor1
    HashMap<String, Grupo> gru1 = new HashMap<String, Grupo>(); 
    gru1.put(grupo1.getId(), grupo1);
    gru1.put(grupo2.getId(), grupo2);
    
    //Grupos pertenecientes al profesor2
    HashMap<String, Grupo> gru2 = new HashMap<String, Grupo>(); 
    gru2.put(grupo3.getId(), grupo3);
    gru2.put(grupo4.getId(), grupo4);
    
    Profesor profesor1 = new Profesor("122322", "Carlos", "Gaviria", "Carlos@gmail.com","30023211","Hip hop", gru1);
    Profesor profesor2 = new Profesor("4435322322", "Cristian", "Berrio", "Berrio@gmail.com","3342233","Bachata", gru2);
    
    JOptionPane.showMessageDialog(null," "+ sede1.getGrupos().get(2).getNombre());
    
    JOptionPane.showMessageDialog(null," "+ profesor1.getGrupos().get("1").getNombre());
    
    JOptionPane.showMessageDialog(null," "+ profesor2.getGrupos().get("3").getNombre());
    
    JOptionPane.showMessageDialog(null," "+ tipo2.getGrupos().get(1).getHorario());
    
    JOptionPane.showMessageDialog(null," "+ tipo1.getGrupos().get(1).getNombre());
    
    JOptionPane.showMessageDialog(null," "+ tipo1.getGrupos().get(1).getNombre());
    
    System.out.println("==> For Loop Example.");
	for (int i = 0; i < grupos.size(); i++) {
		System.out.println(grupos.get(i).getNombre());
	}
    
	
	System.out.println("\n==> Advance For Loop Example..");
	for (Grupo temp : grupos) {
	System.out.println(temp.getHorario());
	}
	
	 
	System.out.println("\n==> Iterator Example...");
	Iterator<Grupo> gruposInte = grupos.iterator();
	while (gruposInte.hasNext()) {
	System.out.println(gruposInte.next());
	}
	
	
	System.out.println("\n==> While Loop Example....");
	int i = 0;
    while (i < grupos.size()) {
	System.out.println(grupos.get(i).getHorario());
	i++;
	}
    
	
    System.out.println("\n==> collection stream() util....");
	grupos.forEach((temp) -> {
    System.out.println(temp.getNombre());
	});
	
    
    
    
    
  
	}

}
