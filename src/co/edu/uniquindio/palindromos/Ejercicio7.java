package co.edu.uniquindio.palindromos;

/**
 *
  Un arreglo es palíndromo si al invertir sus elementos no se ve alterada su disposición.
  Ej.:
  * SÍ es palíndromo `{1, 2, 3, 4, 3, 2, 1}` se invierte y no se ve alterada la disposición de los elementos: `{1, 2, 3, 4, 3, 2, 1}`.
  * NO es palíndromo `{1, 2, 3}`             se invierte y se ve alterada la disposición de los elementos:    `{3, 2, 1}`.

  Defina una método que reciba como parámetro un arreglo de enteros y retorne un booleano indicando si es o no 
  palíndromo. Dé ejemplos para los arreglos `{1, 2, 3, 4, 3, 2, 1}` y `{1, 2, 3}`.
 *
 */
public class Ejercicio7 {
	
	public static void main(String[] args) {
		// 8. Se dan los correspondiente ejemplos.
		int[] arreglo0 = {1, 2, 3, 4, 3, 2, 1};
		int[] arreglo1 = {1, 2, 3};
		
		System.out.println("¿El arreglo0 es palindromo? " + esPalindromo(arreglo0));
		System.out.println();
		
		System.out.println("¿El arreglo1 es palindromo? " + esPalindromo(arreglo1));
	}
	
	// 1. Se define el método que retorna un booleano indicando si el arreglo que
	// se le pasa por parámetro es o no palíndromo.
	public static boolean esPalindromo(int[] numeros) {
		// 2. Se hace un recorrido del extremo izquierdo y derecho del arreglo.
		// Por lo que la iteración está en el rango de [0, numeros.length / 2)
		for (int i = 0; i < numeros.length / 2; i++) {
			// 3. Se define el índice por la derecha como el último elemento (numeros.length - 1)
			// menos la iteración.
			int indicePorLaDerecha = numeros.length - 1 - i;
			
			// 4. Se definen los extremos que se van a comparar.
			int extremoIzquierdo = numeros[i];
			int extremoDerecho   = numeros[indicePorLaDerecha];
			
			// Impresión de depuración
			System.out.println("Comparando numeros[" + i + "] extremoIzquierdo: " + extremoIzquierdo + 
					"\tcon numeros[" + indicePorLaDerecha + "] extremoDerecho " + extremoDerecho);
			
			// 5. Si se encuentra que por lo menos una comparación entre extremos no coincide se puede decir
			// que el arreglo no es palíndromo. 
			if(extremoIzquierdo != extremoDerecho) {
				// Impresión de depuración
				System.out.println("Diferencia encontrada extremoIzquierdo: " + extremoIzquierdo + " != extremoDerecho: " + extremoDerecho);
				
				// 6. No es palíndrome por lo que se retorna falso.
				return false;
			}
		}
		
		// 7. Si se completa el recorrido y no se encontró ninguna diferencia entre
		// los extremos comparados se afirma que el arreglo es palíndromo.
		return true;
	}

}
