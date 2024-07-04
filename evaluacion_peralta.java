package evaluacion_peralta;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class evaluacion_peralta {

	public static void main(String[] args) {
		Scanner datos = new Scanner(System.in);

		List<String> nombre = new ArrayList<>(); // almacena elementos de manera ordenada permitiendo modificar,
													// eliminar,etc.
		List<String> apellido = new ArrayList<>();
		List<Integer> legajo = new ArrayList<>();
		int legajomax = 9;

		System.out.println("cuantas persona desea registrar?:");/* para mostrar datos por pantalla */
		int personas = datos.nextInt();/* ingreso de datos por usuario */

		for (int i = 0; i < personas; i++) { /*
												 * Pide el ingreso de datos la cantidad de veces que el usuario asignó
												 * en el scanner anterior
												 */
			System.out.println("ingrese nombre: ");
			nombre.add(datos.next());/*
										 * "variable.add, ingreso de datos que permite ingresarlo directamente a la
										 * lista correspondiente.
										 */
			System.out.println("ingrese el apellido: ");
			apellido.add(datos.next());
			System.out.println("ingrese el numero de legajo (5 cifras): ");
			int numLegajo = datos.nextInt();

			while (numLegajo < 10000 || numLegajo > 99999) { /* pone condicion de cantidad de valores, */
				System.err.println("tiene que ser de 5 cifras!");
				System.out.println("vuelva a intentar: ");
			}
			legajo.add(numLegajo);

		}

		for (int i = 0; i < legajo.get(i); i++) { /* ordenar los datos ingresados de menor a mayor */
			for (int j = 0; j < legajo.get(i) - 1; j++) {
				if (legajo.get(i) > legajo.get(i) + 1) {
					int templegajo = legajo.get(i); /* variable temporal, ayuda al ordenamiento */

					legajo.set(j, legajo.get(j+1) );
					legajo.set(j + 1 ,  templegajo);

					String tempapellido = apellido.get(j);
					apellido.set(j, apellido.get(j+1) );
					apellido.set(j + 1 ,  tempapellido);
					
				}

				System.out.println("ingrese un numero de legajo");
				int numingresado = datos.nextInt();
				boolean encontrado = false;

				for (int o = 0; o < legajo.size(); o++) {

				}
				if (numingresado == (legajo.get(i))) {

					System.out.println("numero de legajo " + legajo.get(i) + nombre + " " + apellido);
					encontrado = true;
				}

				if (encontrado == false) { /*
											 * sin la anterior condicion resultaba falsa (legajo no encontrado) mandar
											 * por pantalla el mensaje
											 */
					System.out.println("no existe ese numero de legajo");

				}

				System.err.println("Programa finalizado");
			}
		}
	}

}
