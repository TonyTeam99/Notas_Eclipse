/**
 * 
 */
package notas;

/**
 * @author anton
 *
 */

import java.util.Scanner;

public class Califica {

	public static void main(String[] args) {
		Scanner reader = new Scanner(System.in);// Para pedir números por teclado
		int nota = 0;
		String calificacion = "";
		System.out.print("Introduzca una nota: ");
		nota = reader.nextInt(); // nota se introduce por teclado

		// Este método llama al método de Notas.java

		calificacion = Notas.califica(nota);
		// Se muestra por pantalla la calificación final.
		System.out.println(calificacion);
		reader.close();
	}

}
