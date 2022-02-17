/**
 * 
 */
package notas;

/**
 * @author anton
 *
 */

public class Notas {
	// Queda obsoleto este método ya que se hace la llamada desde Califica.java
	/**
	 * @deprecated Use {@link Califica#main(String[])} instead
	 */
	public static void main(String[] args) {
		Califica.main(args);
	}

	// Queda obsoleto este método porque hemos cambiado el nombre a 'califica'
	/**
	 * @deprecated Use {@link #califica(int)} instead
	 */
	// Dicho método devuelve una cadena con la calificación según la nota dada.
	public static String cali(int nota) {
		return califica(nota);
	}

	/*
	 * Este es el llamado por el anterior. Con la condición IF se determina una
	 * calificación u otra según la nota introducida.
	 */
	public static String califica(int num_nota) {
		String calificacion;
		if (num_nota >= 0 && num_nota < 5)
			calificacion = "Suspenso";
		else if (num_nota >= 5 && num_nota < 7)
			calificacion = "Aprobado";
		else if (num_nota >= 7 && num_nota < 9)
			calificacion = "Notable";
		else if (num_nota >= 9 && num_nota <= 10)
			calificacion = "Sobresaliente";
		else
			calificacion = "La nota introducida no es correcta";
		return calificacion;
	}
}