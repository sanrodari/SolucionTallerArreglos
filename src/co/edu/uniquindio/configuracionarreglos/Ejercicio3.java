package co.edu.uniquindio.configuracionarreglos;

import java.util.Arrays;

import javax.swing.JOptionPane;

/**
 * Defina un método que retorne un arreglo de cadenas de tamaño `n` (`n` está
 * dado como parámetro) y llene sus campos con entradas del usuario. Dé un
 * ejemplo para un `n` de 4 con su correspondiente impresión.
 */
public class Ejercicio3 {
	
	public static void main(String[] args) {
		// 5. Se da el ejemplo para un n = 4.
		String[] entradas = obtenerEntradas(4);
		
		// 6. Se imprime el arreglo con la utilidad `Arrays.toString`.
		// Se debe incluír la importación.
		System.out.println(Arrays.toString(entradas));
	}
	
	// 1. Se define el método que retorna el arreglo de **cadenas** configurado con
	// entradas de usuario. Debe recibir un parámetro `n`.
	public static String[] obtenerEntradas(int n) {
		// 2. Se crea el arreglo de **cadenas** que va a ser retornado con el tamaño del parámetro.
		String[] entradas = new String[n];
		
		// 3. Se recorre el arreglo para configurar los valores de los elementos.
		// En cada elemento se configura con una cadena que el usuario provee. 
		for (int i = 0; i < entradas.length; i++) {
			entradas[i] = JOptionPane.showInputDialog("Ingrese un mensaje");
		}
		
		// 4. Se retorna el arreglo.
		return entradas;
	}

}
