package co.edu.uniquindio.transformar;

import java.util.Arrays;

/**
 * Defina un método que reciba como parámetro un arreglo de enteros y retorne
 * otro arreglo diferente con sus cuadrados. Dé un ejemplo para `{1, 2, 3, 4}`
 * con su correspondiente impresión. // Debe retornar `{1, 4, 9, 16}`
 */
public class Ejercicio10 {

	public static void main(String[] args) {
		// 5. Se da el ejemplo para {1, 2, 3, 4}.
		int[] numeros   = {1, 2, 3, 4};
		int[] cuadrados = generarCuadrados(numeros); 

		// 6. Se usa la utilidad `Arrays.toString`(se debe importar) para la impresión.
		System.out.println("Arreglo original:\t" + Arrays.toString(numeros));
		System.out.println("Arreglo generado:\t" + Arrays.toString(cuadrados));
	}
	
	// 1. Se define el método que recibe un arreglo y retorna otro diferente
	// con sus cuadrados.
	public static int[] generarCuadrados(int[] numeros) {
		// 2. Se crea el nuevo arreglo que va a contener los cuadrados usando
		// la longitud del arreglo parametro.
		int[] cuadrados = new int[numeros.length];
		
		// 3. Se hace un recorrido sobre los números y se asignan los
		// cuadrado sobre el nuevo arreglo.
		for (int i = 0; i < numeros.length; i++) {
			// Atención, son los cuadrados de los elementos, no de la posición
			// del arreglo.
			// La expresión i * i es INCORRECTA.
			cuadrados[i] = numeros[i] * numeros[i];
		}
		
		// 4. Por úlitmo se retorna el nuevo arreglo configurado con los cuadrados.
		return cuadrados;
	}

}
