package paquete1;

import java.util.Scanner;
import java.util.ArrayList;

/**
 * Author:Jorge Andres Ordoñez Parra Universidad Mariana - 4 semestre Ingenieria
 * de sistemas 2023
 */

public class Alumno {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Creamos el arrayList y el Scanner
		Scanner lector = new Scanner(System.in);
		ArrayList<Object> alumnos = new ArrayList<>();
		// generamos una variable para guardar la opcion que hallamos elegido en el if
		int opcion;

		// TODO Auto-generated method stub

		// Creamos un menú de opciones para que se muestre en pantalla y el usuario
		// elija lo que quiere
		// ponemos la estructura DO While para que el programa entre en bucle hasta que
		// nosotros queramos
		do {
			System.out.println("------------------------------");
			System.out.println("Que operacion quieres hacer?");
			System.out.println("1. Insertar alumno");
			System.out.println("2. Eliminar alumno");
			System.out.println("3. Modificar alumno");
			System.out.println("4. Consultar alumno");
			System.out.println("5. Terminar programa");
			System.out.println("------------------------------");

			// Utilizamos if, else if para para preguntar por la opcion que elige el usuario
			// y el programa siga la instruccion contenida

			// creamos un scanner para elegir la opcion desde la consola
			opcion = lector.nextInt();

			if (opcion == 1) {

				// Insertar un alumno

				System.out.println("introduce el nombre del alumno");
				String nombre = lector.next();
				// Agregamos el nombre del alumno al ArrayList
				alumnos.add(nombre);

				System.out.println("introduce el apellido del alumno");
				String apellido = lector.next();
				// Agregamos el apellido del alumno al ArrayList
				alumnos.add(apellido);

				System.out.println("introduce el semestre del alumno");
				int semestre = lector.nextInt();
				// Agregamos el semestre del alumno al ArrayList
				alumnos.add(semestre);

				System.out.println("introduce el correo del alumno");
				String correo = lector.next();
				// Agregamos el correo del alumno al ArrayList
				alumnos.add(correo);

				System.out.println("introduce el celular del alumno");
				int celular = lector.nextInt();
				// Agregamos el celular del alumno al ArrayList
				alumnos.add(celular);

				System.out.println("insertar cedula del alumno");
				int cedula = lector.nextInt();
				// Agregamos la cedula del alumno al ArrayList
				alumnos.add(cedula);

			} else if (opcion == 2) {

				// Eliminar un alumno

				System.out.println("insertar cedula del alumno");
				int cedula = lector.nextInt();

				boolean encontrado = false;

				for (int i = 0; i < alumnos.size(); i += 6) {
					int cedulaAlumno = (int) alumnos.get(i + 5); // Obtener la cédula del alumno en la posición i+5
					if (cedulaAlumno == cedula) {
						// Quitar el nombre del alumno
						alumnos.remove(i);
						// Quitar el apellido del alumno
						alumnos.remove(i);
						// Quitar el semestre del alumno
						alumnos.remove(i);
						// Quitar el correo del alumno
						alumnos.remove(i);
						// quitar el celular del alumno
						alumnos.remove(i);
						// quitar la cedula del alumno
						alumnos.remove(i);
						encontrado = true;
						System.out.println("Alumno eliminado exitosamente.");
						break;
					}
				}
				// si la cedula ingresada no tiene un alumno registrado salta el mensaje de que
				// no se encontró un alumno

				if (!encontrado) {
					System.out.println("No se encontró ningún alumno con la cédula proporcionada.");
				}

			} else if (opcion == 3) {

				// modificar un alumno

				System.out.println("Modificar alumno");
				System.out.println("Ingrese la cedula del alumno a modificar:");
				int cedulaModificar = lector.nextInt();

				boolean encontrado = false;

				for (int i = 0; i < alumnos.size(); i += 6) {
					int cedulaAlumno = (int) alumnos.get(i + 5); // Obtener la cédula del alumno en el array
					if (cedulaAlumno == cedulaModificar) {
						System.out.println("Alumno encontrado:");
						System.out.println("Nombre: " + alumnos.get(i));
						System.out.println("Apellido: " + alumnos.get(i + 1));
						System.out.println("Semestre: " + alumnos.get(i + 2));
						System.out.println("Correo: " + alumnos.get(i + 3));
						System.out.println("Celular: " + alumnos.get(i + 4));
						System.out.println("Cédula: " + alumnos.get(i + 5));
						System.out.println("------------------------------");

						System.out.println("Qué dato desea modificar?");
						System.out.println("1. Nombre");
						System.out.println("2. Apellido");
						System.out.println("3. Semestre");
						System.out.println("4. Correo");
						System.out.println("5. Celular");
						int opcionModificar = lector.nextInt();

						switch (opcionModificar) {
						case 1:
							System.out.println("Ingrese el nuevo nombre:");
							String nuevoNombre = lector.next();
							alumnos.set(i, nuevoNombre);
							break;
						case 2:
							System.out.println("Ingrese el nuevo apellido:");
							String nuevoApellido = lector.next();
							alumnos.set(i + 1, nuevoApellido);
							break;
						case 3:
							System.out.println("Ingrese el nuevo semestre:");
							int nuevoSemestre = lector.nextInt();
							alumnos.set(i + 2, nuevoSemestre);
							break;
						case 4:
							System.out.println("Ingrese el nuevo correo:");
							String nuevoCorreo = lector.next();
							alumnos.set(i + 3, nuevoCorreo);
							break;
						case 5:
							System.out.println("Ingrese el nuevo celular:");
							int nuevoCelular = lector.nextInt();
							alumnos.set(i + 4, nuevoCelular);
							break;
						default:
							System.out.println("Opción inválida.");
							break;
						}

						encontrado = true;
						System.out.println("Datos del alumno modificados exitosamente.");
						break;
					}
				}

				if (!encontrado) {
					System.out.println("No se encontró ningún alumno con la cédula proporcionada.");
				}

			} else if (opcion == 4) {

				// Consultar alumnos

				for (int i = 0; i < alumnos.size(); i += 6) {
					System.out.println("Nombre: " + alumnos.get(i));
					System.out.println("Apellido: " + alumnos.get(i + 1));
					System.out.println("Semestre: " + alumnos.get(i + 2));
					System.out.println("Correo: " + alumnos.get(i + 3));
					System.out.println("Celular: " + alumnos.get(i + 4));
					System.out.println("Cédula: " + alumnos.get(i + 5));
					System.out.println("------------------------------");

				}

			} else if (opcion == 5) {

				// Detener programa

			} else {
				System.out.println(" Ingrese una opcion valida");
			}
		} while (opcion != 5);

		System.out.println(" programa terminado");
		lector.close();

	}
}
