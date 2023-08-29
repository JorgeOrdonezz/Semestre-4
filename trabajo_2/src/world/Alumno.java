package world;
/**
 * autor:Jorge Andres Ordoñez Parra
 * Ingeniera de sistemas 2do semestre 2023
 */
public class Alumno {
	//Aqui se definen los atributos
    private String apellido;
    private int semestre;
    private String correo;
    private int celular;
    private int cedula;
    private String nombre;


    public Alumno() {
    }
//hacemos un constructor se encarga de poner los valores iniciales para los atributos
 // Cuando se crea un objeto de la clase "Alumno" utilizando este constructor, se asignan los valores proporcionados a los atributos correspondientes.


    public Alumno(int cedula, String nombre, String apellido, int semestre, String correo, int celular) {
        this.cedula = cedula;
        this.nombre = nombre;
        this.apellido = apellido;
        this.semestre = semestre;
        this.correo = correo;
        this.celular = celular;
    }
    
    // Métodos getters y setters para cada atributo
    //getters se utilizan para obtener el valor de un atributo
   //los "setters" se utilizan para establecer o modificar el valor de un atributo.
    public String getNombre() {
    	
        return nombre;
    }

    public void setNombre(String nombre) {
    	
        this.nombre = nombre;
    }

    public int getCedula() {
    	
        return cedula;
    }

    public void setCedula(int cedula) {
    	
        this.cedula = cedula;
    }


    public String getApellido() {
    	
        return apellido;
    }

    public void setApellido(String apellido) {
    	
        this.apellido = apellido;
    }

    public int getSemestre() {
    	
        return semestre;
    }

    public void setSemestre(int semestre) {
    	
        this.semestre = semestre;
    }

    public int getCelular() {
    	
        return celular;
    }

    public void setCelular(int celular) {
    	
        this.celular = celular;
    }
    public String getCorreo() {
    	
        return correo;
    }

    public void setCorreo(String correo) {
    	
        this.correo = correo;
    }
    
    
}
