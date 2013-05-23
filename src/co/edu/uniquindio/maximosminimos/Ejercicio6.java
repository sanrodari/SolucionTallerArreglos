package co.edu.uniquindio.maximosminimos;

/**
 * Dado un arreglo de enteros como parámetro, defina un método que permita
 * encontrar el menor número par. Dé un ejemplo para el siguiente arreglo `{1,
 * 2, 3, 100, 5, 6, 101, 8, 9, 100}` con la debida impresión.
 */
public class Ejercicio6 {
	
	public static void main(String[] args) {
		// 7. Se da un ejemplo para el arreglo: {1, 2, 3, 100, 5, 6, 101, 8, 9, 100}
		int[] numeros = {1, 2, 3, 100, 5, 6, 101, 8, 9, 100};
		int menor = encontrarMenorPar(numeros);
		
		// 8. Debida impresión.
		System.out.println();
		System.out.println("Número menor par: " + menor);
	}
	
	// 1. Se define el método que retorna el número par menor del arreglo
	// que se le pasa como parámetro.
	public static int encontrarMenorPar(int[] numeros) {
		// 2. Se define una variable `menor` para almacenar el número menor que se
		// encuentre en el recorrido.
		int menor;
		
		// 3. Inicialmente NO se puede suponer que el primer número del arreglo
		// sea un número par.
		// Por lo tanto se usa un número arbitrario grande como punto de partida
		// (Cualquier número del arreglo se supone que va a ser menor que éste
		// número grande). 
		menor = 100_000_000;
		
		// 4. Recorremos **completamente** el arreglo buscando números pares
		// menores que el almacenado en la variable `menor`.
		for (int i = 0; i < numeros.length; i++) {
			
			int elementoActual = numeros[i];
			
			// 5. Si se encuentra que el elemento actual es par y además es menor al que se tiene
			// en la variable `menor` entonces se reasigna la variable con dicho elemento.
			if(elementoActual % 2 == 0 && elementoActual < menor) {
				// Impresión de depuración
				System.out.println("Anterior menor: " + menor + "\tNuevo menor: " + elementoActual);
				
				// Se reasigna la variable con dicho elemento.
				menor = elementoActual;
			}
		}
		
		// 6. Después de que se completa el recorrido del arreglo la variable `menor`
		// tiene el número menor entre todos los elementos.
		// Se retorna ese número menor.
		return menor;
	}

}
