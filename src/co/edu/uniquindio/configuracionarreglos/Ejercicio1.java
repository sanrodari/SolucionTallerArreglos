package co.edu.uniquindio.configuracionarreglos;

import java.util.Arrays;

/**
 * Defina un método que retorne un arreglo de tamaño `n` (`n` está dado como 
 * parámetro) con los primeros `n` números pares. Dé un ejemplo para un `n` de 
 * 10 con su correspondiente impresión.
 */
public class Ejercicio1 {
	
	public static void main(String[] args) {
		// 5. Se da el ejemplo para un n = 10.
		int[] pares = obtenerPares(10);
		
		// 6. Se imprime el arreglo con la utilidad `Arrays.toString`.
		// Se debe incluír la importación.
		System.out.println(Arrays.toString(pares));
	}
	
	// 1. Se define el método que retorna el arreglo configurado.
	// Debe recibir un parámetro `n`.
	public static int[] obtenerPares(int n) {
		// 2. Se crea el arreglo que va a ser retornado con el tamaño del parámetro.
		int[] pares = new int[n];
		
		// 3. Se recorre el arreglo para configurar los valores de los elementos,
		// se aprovecha la iteración para calcular los pares: `(i + 1) * 2`
		for (int i = 0; i < pares.length; i++) {
			pares[i] = (i + 1) * 2;
		}
		
		// 4. Se retorna el arreglo.
		return pares;
	}

}
