package co.edu.uniquindio.transformar;


/**
 * Realice un método similar al anterior pero que retorne la sumatoria de los
 * elementos generados para el nuevo arreglo. Dé un ejemplo para `{1, 2, 3, 4}`
 * con su correspondiente impresión.
 * // Debe retornar la sumatoria de los elementos `{1, 4, 9, 16}` o sea 30.
 */
public class Ejercicio11 {

	public static void main(String[] args) {
		// 6. Se da el ejemplo para {1, 2, 3, 4} con su correspondiente impresión.
		int[] numeros   = {1, 2, 3, 4};
		int sumatoriaCuadrados = sumarCuadrados(numeros); 

		System.out.println("Suma de números cuadrados: " + sumatoriaCuadrados);
	}
	
	// 1. Se define el método que recibe un arreglo y retorna la sumatoria
	// del arreglo generado.
	public static int sumarCuadrados(int[] numeros) {
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
		
		// 4. Se realiza la sumatoria para el arreglo que contiene los cuadrados.
		int sumatoria = 0;
		for (int n : cuadrados) {
			sumatoria += n;
		}
		
		// 5. Se retorna el valor acumulado.
		return sumatoria;
	}

}
