package notas;

import java.util.Scanner;

public class Califica {

	public static void main(String[] args) {
			Scanner reader = new Scanner(System.in);// Para pedir números por teclado
			int nota = 0;
			String calificacion = "";
			System.out.print("Introduzca una nota: ");
			nota = reader.nextInt();
			
	//Método cali, que determina según la nota, la calificación.
			calificacion = Notas.califica(nota);
	
			System.out.println(calificacion);
			reader.close();
		}

}
