package co.edu.uniquindio.acumulacion;

/**
 * Defina un método que retorne la sumatoria de los elementos de un arreglo que
 * se le pasa por parámetro. Dé un ejemplo para `{1, 2, 3, 4}` con su
 * correspondiente impresión.
 */
public class Ejercicio8 {
	
	public static void main(String[] args) {
		// 6. Se da un ejemplo para {1, 2, 3, 4} con la correspondiente impresión.
		int[] numeros = {1, 2, 3, 4};
		int total = sumarNumeros(numeros);
		System.out.println();
		System.out.println("El total de los números sumado es: " + total);
	}
	
	// 1. Se define el método que retorna la sumatoria de los números.
	// Éste método recibe como parámetro el arreglo de números a ser sumados.
	public static int sumarNumeros(int[] numeros) {
		// 2. Se declara un acumulador para almacenar el resultado de la sumatoria.
		// Ya que es una sumatoria se inicializa la variable en 0.
		int sumatoria = 0;
		
		// 3. Se recorre el arreglo acumulando el valor de los elementos.
		// Como no es necesario usar el valor del índice actual se usa un
		// `foreach`.
		// Nota: También es válida la implementación con el for tradicional.
		for (int n : numeros) {
			
			// Impresión de depuración
			System.out.println("Valor acumulado: " + sumatoria + ", acumulando " + n + "...");
			
			// 4. Se acumula el elemento en la variable sumatoria.
			sumatoria += n;
			
			// Impresión de depuración
			System.out.println("Acumuló: " + sumatoria);
		}
		
		// 5. Cuando se complete el recorrido tenemos el valor de todos los
		// elementos acumulado en la variable `sumatoria`.
		// Éste es el valor que se retorna.
		return sumatoria;
	}

}
