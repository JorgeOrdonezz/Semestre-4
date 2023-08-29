package paquete1;
import world.Alumno;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;

/**
 *
 *@author Jorge Andres Ordoñez Parra
 * Ingenieria de Sistemas 4to semestre 2023
 */
public class Proyecto {
    
    
    public static void main(String[] args) {
    //creacion de una lista para guardar datos
    	   ArrayList<Alumno> misAlumnos =leerAlumnos();
        //lectura de opciones
        Scanner lector = new Scanner(System.in);
        //creacion de flag para terminar el programa
        boolean activo= true;
     
          do{
            mostrarMenu();
        // switch para hacer seleccion de funciones
            
            
        int op = lector.nextInt();
        
            switch (op) {
                
                case 1:
                    crearNuevoAlumno(misAlumnos, lector);
                    escribirAlumnos(misAlumnos);
                    break;
                    
                case 2:
                    
                    eliminarAlumno(misAlumnos, lector);
                    
                    break;
                    
                case 3:
                    
                    modificarAlumno(misAlumnos, lector);
                    
                    break;
                    
                case 4:
                    
                    consultarAlumnos(misAlumnos);
                    
                    break;
                case 5:
                    
                    generarReporteSemestre(misAlumnos, lector);
                    
                    break;
                    
                case 6:
                    escribirAlumnos(misAlumnos);
                    activo =!finalizarPrograma(lector);
              
         break;
             
            default:
                    System.out.println("error elija una opcion valida");
            }
        
        
        } while (activo);   
    }
    
   
    private static void mostrarMenu() {
        //se genera un menu para que el usuario sepa que es lo que va a hacer
        System.out.println("---- -opciones------");
        
        System.out.println("1. Agregar alumno");
        System.out.println("2. Eliminar alumno");
        System.out.println("3. Modificar alumno");
        System.out.println("4. Consultar alumno");
        System.out.println("5. Generar reporte segun el semestre");
        System.out.println("6. Terminar programa");
        
        System.out.println("---------------------");
    }
    
    
 
    private static void crearNuevoAlumno(ArrayList<Alumno> misAlumnos, Scanner lector) {
    	
        //vamos a utilizar el Scanner para poder ingresar la opcion que hallamos elegido
    	//Es la entrada del usuario.
    	  
        System.out.println( "----Nuevo Alumno----");

        System.out.println("Digita cedula del alumno");
        int cedula = lector.nextInt();

        System.out.println("Digita nombre del alumno");
        String nombre = lector.next(); 

        System.out.println("Digita apellido del alumno");
        String apellido = lector.next(); 

        System.out.println("Digita semestre del alumno");
        int semestre = lector.nextInt(); 

        System.out.println("Digita correo del alumno");
        String correo = lector.next();

        System.out.println("Digita celular del alumno");
        int celular = lector.nextInt();

    
        Alumno t = new Alumno();
        //guardamos la info ingresada en el objeto Alumno y la metemos en la lista array
        t.setCedula(cedula);
        t.setNombre(nombre);
        t.setApellido(apellido);
        t.setSemestre(semestre);
        t.setCorreo(correo);
        t.setCelular(celular);
        misAlumnos.add(t);

        System.out.println("Se han registrado los datos del alumno");
        System.out.println("-------------------------------------------");
    }
  
    private static void eliminarAlumno(ArrayList<Alumno> misAlumnos, Scanner lector) {
        System.out.println("--------Eliminar Alumno--------");

        System.out.println("Ingrese el número de cédula del alumno que desea eliminar");
        int cedulaE = lector.nextInt();
        boolean buscar = false; 

        Iterator<Alumno> iterador = misAlumnos.iterator();

        while (iterador.hasNext()) {
            Alumno alumno = iterador.next();

            if (alumno.getCedula() == cedulaE) {
                iterador.remove();
                System.out.println("Se eliminó el alumno con la siguiente cédula: " + cedulaE);
                buscar = true;
                break;
            }
        }

        if (!buscar) {
            System.out.println("No se encontró un alumno con la cédula: " + cedulaE);
        }

        if (misAlumnos.isEmpty()) {
            System.out.println("No hay alumnos registrados.");
        }

        System.out.println("---------------------------");
    }
    
    
    private static void modificarAlumno(ArrayList<Alumno> misAlumnos, Scanner lector) {
        System.out.println("--------Modificar datos de alumno--------");

        System.out.println("Ingrese el número de cédula del alumno que desea modificar");
        int cedulaM = lector.nextInt();
        boolean modificar = false; 

        Iterator<Alumno> iterador = misAlumnos.iterator();

        while (iterador.hasNext()) {
            Alumno alumnoModificado = iterador.next();

            if (alumnoModificado.getCedula() == cedulaM) {
                System.out.println("Seleccione el dato que desea modificar:");
                System.out.println("1. Nombre");
                System.out.println("2. Apellido");
                System.out.println("3. Semestre");
                System.out.println("4. Correo");
                System.out.println("5. Celular");
                int opcionDato = lector.nextInt();

                switch (opcionDato) {
                    case 1:
                        System.out.println("Introduzca nuevo nombre del alumno:");
                        String nuevoNombre = lector.next();
                        alumnoModificado.setNombre(nuevoNombre);
                        break;
                    case 2:
                        System.out.println("Introduzca nuevo apellido del alumno:");
                        String nuevoApellido = lector.next();
                        alumnoModificado.setApellido(nuevoApellido);
                        break;
                    case 3:
                        System.out.println("Introduzca nuevo semestre del alumno:");
                        int nuevoSemestre = lector.nextInt();
                        alumnoModificado.setSemestre(nuevoSemestre);
                        break;
                    case 4:
                        System.out.println("Introduzca nuevo correo del alumno:");
                        String nuevoCorreo = lector.next();
                        alumnoModificado.setCorreo(nuevoCorreo);
                        break;
                    case 5:
                        System.out.println("Introduzca el nuevo celular del alumno:");
                        int nuevoCelular = lector.nextInt();
                        alumnoModificado.setCelular(nuevoCelular);
                        break;
                    default:
                        System.out.println("Opción inválida.");
                        break;
                }

                System.out.println("Se modificaron los datos del alumno con la siguiente cédula: " + cedulaM);
                modificar = true;
                break;
            }
        }

        if (!modificar) {
            System.out.println("No se encontró un alumno con la cédula: " + cedulaM);
        }

        if (misAlumnos.isEmpty()) {
            System.out.println("No hay alumnos registrados.");
        }

        System.out.println("---------------------------");
    }
    
    
    private static void consultarAlumnos(ArrayList<Alumno> misAlumnos) {
    System.out.println("--------Consultar Alumnos--------");
    
        if (misAlumnos.isEmpty()) {
            System.out.println("No hay alumnos registrados.");
        } else {
            for (Alumno alumno : misAlumnos) {
                System.out.println("Cédula: " + alumno.getCedula());
                System.out.println("Nombre: " + alumno.getNombre());
                System.out.println("Apellido: " + alumno.getApellido());
                System.out.println("Semestre: " + alumno.getSemestre());
                System.out.println("Correo: " + alumno.getCorreo());
                System.out.println("Celular: " + alumno.getCelular());
                System.out.println("---------------------------");
            }
        }
    }
    
    private static void generarReporteSemestre(ArrayList<Alumno> misAlumnos, Scanner lector) {
        System.out.println("--------Generar reporte por semestre--------");
        System.out.println("Ingrese el semestre del cual necesita una lista");

        int semestreS = lector.nextInt();

        try {
            // El archivo se va a almacenar en la carpeta "data"
            File archivo = new File("C:\\Trabajos de ECLIPSE\\trabajo2\\data\\reporte" + semestreS + ".txt");

            PrintWriter pluma = new PrintWriter(archivo);
            pluma.println("Reporte de estudiantes semestre: " + semestreS);
            pluma.println("-----------------------");

            Iterator<Alumno> iterator = misAlumnos.iterator();
            while (iterator.hasNext()) {
                Alumno alumno = iterator.next();
                if (alumno.getSemestre() == semestreS) {
                	  pluma.println("Apellido: " + alumno.getApellido());
                      pluma.println("Semestre: " + alumno.getSemestre());
                      pluma.println("Correo: " + alumno.getCorreo());
                      pluma.println("Celular: " + alumno.getCelular());
                    pluma.println("Cédula: " + alumno.getCedula());
                    pluma.println("Nombre: " + alumno.getNombre());
                  
                    pluma.println("---------------------------");
                }
            }

            pluma.close();
            System.out.println("Archivo generado exitosamente: reporteEstudiantes" + semestreS + ".txt");
        } catch (IOException e) {
            System.out.println("Error al generar el archivo: " + e.getMessage());
        }

        System.out.println("---------------------------");
    }

    private static boolean finalizarPrograma(Scanner lector) {
        System.out.println("---------------fin dePrograma----------------");
        System.out.println("¿Desea reanudar?");

        String val = lector.next();

        if (val.equalsIgnoreCase("Si")) {
            System.out.println("Fin");
            return true;
        } else if (val.equalsIgnoreCase("No")) {
         
            return false;
        } return false;
    }
    
    private static ArrayList<Alumno>leerAlumnos() {
        ArrayList<Alumno> misAlumnos = new ArrayList<>();

        try {
            File archivo = new File("C:\\Trabajos de ECLIPSE\\trabajo2\\data\\alumnos.txt");
            FileReader fr = new FileReader(archivo);
            BufferedReader lector = new BufferedReader(fr);

            String linea = lector.readLine();

            while (linea != null) {
                String[] datos = linea.split(",");
                
                int semestre = Integer.parseInt(datos[3]);
                String correo = datos[4];
                int celular = Integer.parseInt(datos[5]);
                int cedula = Integer.parseInt(datos[0]);
                String nombre = datos[1];
                String apellido = datos[2];
               

                Alumno nuevoAlumno = new Alumno();
                nuevoAlumno.setSemestre(semestre);
                nuevoAlumno.setCorreo(correo);
                nuevoAlumno.setCelular(celular);
                nuevoAlumno.setCedula(cedula);
                nuevoAlumno.setNombre(nombre);
                nuevoAlumno.setApellido(apellido);
              misAlumnos.add(nuevoAlumno);

                linea = lector.readLine();
            }

                lector.close();
                fr.close();
         } catch (IOException h) {
             System.out.println("Error al cargar los datos : "+ h.getMessage());
        } 

        return misAlumnos;
    }
    
    private static void escribirAlumnos(ArrayList<Alumno> misAlumnos) {
        try {
            File archivo = new File("C:\\Trabajos de ECLIPSE\\trabajo2\\data\\alumnos.txt");
            FileWriter fw = new FileWriter(archivo);
            BufferedWriter escritor = new BufferedWriter(fw);

            for (Alumno alumno : misAlumnos) {
                String linea = alumno.getCedula() + "," +
            
                               alumno.getNombre() + "," +
                               
                               alumno.getApellido()+"," +
                               
                               alumno.getSemestre()+"," +
                               
                               alumno.getCorreo() +"," +
                               alumno.getCelular();
                escritor.write(linea);
                escritor.newLine();
            }

            escritor.close();
            fw.close();
            System.out.println("Datos de alumnos se han guardado.");
        } catch (IOException h) {
            System.out.println("Error al guardar los datos: "+ h.getMessage());
        }
        }
}
        

