package co.edu.uniquindio.configuracionarreglos;

import java.util.Arrays;
import java.util.Random;

/**
 * Defina un método que retorne un arreglo de enteros de tamaño `n` (`n` está
 * dado como parámetro) y llene sus campos con números aleatorios. Dé un ejemplo
 * para un `n` de 6 con su correspondiente impresión.
 */
public class Ejercicio2 {
	
	public static void main(String[] args) {
		// 6. Se da el ejemplo para un n = 6.
		int[] aleatorios = obtenerAleatorios(6);
		
		// 7. Se imprime el arreglo con la utilidad `Arrays.toString`.
		// Se debe incluír la importación.
		System.out.println(Arrays.toString(aleatorios));
	}
	
	// 1. Se define el método que retorna el arreglo configurado con números aleatorios.
	// Debe recibir un parámetro `n`.
	public static int[] obtenerAleatorios(int n) {
		// 2. Se crea el arreglo que va a ser retornado con el tamaño del parámetro.
		int[] aleatorios = new int[n];
		
		// 3. Se recorre el arreglo para configurar los valores de los elementos.
		// Usamos la clase Random, con su debida importación para la generación
		// de números aleatorios.
		Random random = new Random();
		for (int i = 0; i < aleatorios.length; i++) {
			// 4. El ejercicio no dice en que rango se deben obtener los 
			// números aleatorios, acá definimos que se obtienen entre [0, 100) exclusivo.
			aleatorios[i] = random.nextInt(100);
		}
		
		// 5. Se retorna el arreglo.
		return aleatorios;
	}

}
