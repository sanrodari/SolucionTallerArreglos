package co.edu.uniquindio.invertir;

import java.util.Arrays;

/**
 * Defina un método que reciba como parámetro un arreglo de cadenas y retorne
 * otro arreglo diferente en orden inverso. Dé un ejemplo para `{"Hola ",
 * "como ", "estás ", "?"}` con su correspondiente impresión. // Debe retornar
 * `{"?", "estás ", "como ", "Hola "}`
 */
public class Ejercicio12 {

	public static void main(String[] args) {
		// 7. Se da el ejemplo para {"Hola ", "como ", "estás ", "?"}.
		String[] cadenas = {"Hola ", "como ", "estás ", "?"};
		String[] inverso = generarInverso(cadenas);

		// 8. Se usa la utilidad `Arrays.toString`(se debe importar) para la
		// impresión.
		System.out.println();
		System.out.println("Arreglo original:\t" + Arrays.toString(cadenas));
		System.out.println("Arreglo generado:\t" + Arrays.toString(inverso));
	}

	// 1. Se define el método que recibe un arreglo y retorna otro diferente con
	// los elementos ordenados inversamente.
	public static String[] generarInverso(String[] cadenas) {
		// 2. Se crea el nuevo arreglo que va a contener las cadenas ordenadas inversamente.
		String[] inverso = new String[cadenas.length];

		// 3. Se hace un recorrido completo del arreglo, similar al ejercicio de palíndromos
		// para asignar el extremoDerecho.
		for (int i = 0; i < cadenas.length; i++) {
			
			// 4. Se define el índice por la derecha como el último elemento (cadenas.length - 1)
			// menos la iteración.
			int indicePorLaDerecha = cadenas.length - 1 - i;
			
			// 5. Se define el extremoDerecho para ser asignado al nuevo arreglo.
			String extremoDerecho   = cadenas[indicePorLaDerecha];
			
			// Impresión de depuración
			System.out.println("Asignando cadenas[" + indicePorLaDerecha + "]: \"" + extremoDerecho + "\" a inverso[" + i + "]");
			
			inverso[i] = extremoDerecho;
		}

		// 6. Por úlitmo se retorna el nuevo arreglo con el orden invertido.
		return inverso;
	}

}
