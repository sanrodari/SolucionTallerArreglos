package co.edu.uniquindio.maximosminimos;

/**
 * Dado un arreglo de enteros como parámetro, defina un método que permita
 * encontrar el número mayor. Dé un ejemplo para el siguiente arreglo `{1, 2, 3,
 * 100, 5, 6, 101, 8, 9, 100}` con la debida impresión.
 */
public class Ejercicio4 {
	
	public static void main(String[] args) {
		// 7. Se da un ejemplo para el arreglo: {1, 2, 3, 100, 5, 6, 101, 8, 9, 100}
		int[] numeros = {1, 2, 3, 100, 5, 6, 101, 8, 9, 100};
		int mayor = encontrarMayor(numeros);
		
		// 8. Debida impresión.
		System.out.println();
		System.out.println("Número mayor: " + mayor);
	}
	
	// 1. Se define el método que retorna el número mayor del arreglo
	// que se le pasa como parámetro.
	public static int encontrarMayor(int[] numeros) {
		// 2. Se define una variable `mayor` para almacenar el número mayor que se
		// encuentre en el recorrido.
		int mayor;
		
		// 3. Inicialmente se supone que el primer número del arreglo es el mayor.
		// Nota: está implementación arroja una excepción para arreglos vacíos.
		mayor = numeros[0];
		
		// 4. Se inicia desde el segundo elemento ya que el primero ya fue considerado.
		// [1, numeros.length)
		for (int i = 1; i < numeros.length; i++) {
			
			int elementoActual = numeros[i];
			
			// 5. Si se encuentra que el elemento actual es mayor al que se tiene
			// en la variable `mayor` entonces se reasigna la variable con dicho elemento.
			if(elementoActual > mayor) {
				// Impresión de depuración
				System.out.println("Anterior mayor: " + mayor + "\tNuevo mayor: " + elementoActual);
				
				// Se reasigna la variable con dicho elemento.
				mayor = elementoActual;
			}
		}
		
		// 6. Después de que se completa el recorrido del arreglo la variable `mayor`
		// tiene el número mayor entre todos los elementos.
		// Se retorna ese número mayor.
		return mayor;
	}

}
