package paquete1;

import java.util.Scanner;
import java.util.ArrayList;
public class Alumno {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Activamos el arrayList y el Scanner 
        Scanner lector= new Scanner(System.in);
        ArrayList<Object> alumnos = new ArrayList<>();
        //generamos una variable
        int opcion;
		
		// TODO Auto-generated method stub
        

	//Creamos un menú de opciones para que se muestre en pantalla y el usuario elija lo que quiere	
    do {
	System.out.println("------------------------------");
	System.out.println("Que operacion quieres hacer?");
	System.out.println("1. Insertar alumno");
	System.out.println("2. Eliminar alumno");
	System.out.println("3. Modificar alumno");
	System.out.println("4. Consultar alumno");
	System.out.println("5. Terminar programa");
	System.out.println("------------------------------");
	
	
	//Utilizamos  if, else if para para preguntar por la opcion que elige el usuario 
	
	//creamos un scanner para elegir la opcion desde la consola
	opcion= lector.nextInt();
	
    if (opcion == 1) {
        System.out.println("introduce el nombre del alumno");
    	String nombre=lector.next();
    	// Agregamos el nombre del alumno al ArrayList
    	alumnos.add(nombre); 
    	
    	System.out.println("introduce el apellido del alumno");
    	String apellido=lector.next();
    	//Agregamos el apellido del alumno al ArrayList
    	alumnos.add(apellido); 
    	
    	System.out.println("introduce el semestre del alumno");
    	int semestre=lector.nextInt();
    	//Agregamos el semestre del alumno al ArrayList
    	alumnos.add(semestre);
    	
    	System.out.println("introduce el correo del alumno");
    	String correo=lector.next();
    	//Agregamos el correo del alumno al ArrayList
    	alumnos.add(correo);
    	
    	
    	System.out.println("introduce el celular del alumno");
    	int celular=lector.nextInt();
    	//Agregamos el celular del alumno al ArrayList
    	alumnos.add(celular);
    	
    	
    	System.out.println("insertar cedula del alumno");
    	int cedula=lector.nextInt();
    	//Agregamos la cedula del alumno al ArrayList
    	alumnos.add(cedula);
    	
    
	} else if (opcion == 2) {
		System.out.println("insertar cedula del alumno");
    	int cedula=lector.nextInt();
	
	} else if (opcion == 3) {
	      System.out.println("introduce el nombre del alumno");
	    	String nombre=lector.next();
	    	System.out.println("introduce el apellido del alumno");
	    	String apellido=lector.next();
	    	System.out.println("introduce el semestre del alumno");
	    	int semestre=lector.nextInt();
	    	System.out.println("introduce el correo del alumno");
	    	String correo=lector.next();
	    	System.out.println("introduce el celular del alumno");
	    	int celular=lector.nextInt();
	    	System.out.println("insertar cedula del alumno");
	    	int cedula=lector.nextInt();
	    	
	} else if (opcion == 4) {
		System.out.println("4. Consultar alumno");
	} else if (opcion == 5) {
		System.out.println("5. Terminar programa");
	} else {
		System.out.println(" Ingrese una opcion valida");
	}
	}while(opcion!=5);
		
		System.out.println(" programa terminado");
		lector.close();
	
	}
    }
	

