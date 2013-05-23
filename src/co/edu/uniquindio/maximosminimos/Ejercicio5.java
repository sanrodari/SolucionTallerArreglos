package co.edu.uniquindio.maximosminimos;

/**
 * Dado un arreglo como parámetro, defina un método que permita encontrar la
 * cadena con más caracteres y la retorne. Dé un ejemplo para el siguiente
 * arreglo `{"uno", "dos", "tres", "cuatro", "cinco", "seis"}` con la debida
 * impresión.
 */
public class Ejercicio5 {
	
	public static void main(String[] args) {
		// 7. Se da un ejemplo para el arreglo: {"uno", "dos", "tres", "cuatro", "cinco", "seis"}
		String[] cadenas = {"uno", "dos", "tres", "cuatro", "cinco", "seis"};
		String masLarga = encontrarCadenaMasLarga(cadenas);
		
		// 8. Debida impresión.
		System.out.println();
		System.out.println("Cadena más larga: " + masLarga);
	}
	
	// 1. Se define el método que retorna la **cadena** con más caracteres del arreglo de **cadenas**
	// que se le pasa como parámetro.
	public static String encontrarCadenaMasLarga(String[] cadenas) {
		// 2. Se define una variable `masLarga` para almacenar la cadena con más caracteres que se
		// encuentre en el recorrido.
		String masLarga;
		
		// 3. Inicialmente se supone que la primera cadena del arreglo es la más larga.
		// Nota: está implementación arroja una excepción para arreglos vacíos.
		masLarga = cadenas[0];
		
		// 4. Se inicia desde el segundo elemento ya que el primero ya fue considerado.
		// [1, numeros.length)
		for (int i = 1; i < cadenas.length; i++) {
			
			String cadenaActual = cadenas[i];
			
			// 5. Si se encuentra que la cadena actual es mas larga a la que se tiene
			// en la variable `masLarga` entonces se reasigna la variable con dicha cadena.
			// Se hace uso del método `.length()` para comparar el tamaño de las cadenas.   
			if(cadenaActual.length() > masLarga.length()) {
				// Impresión de depuración
				System.out.println("Anterior masLarga: " + masLarga + "\t\tNuevo masLarga: " + cadenaActual);
				
				// Se reasigna la variable con dicho elemento.
				masLarga = cadenaActual;
			}
		}
		
		// 6. Después de que se completa el recorrido del arreglo la variable `masLarga`
		// tiene la cadena con más caracteres.
		// Se retorna esa cadena masLarga.
		return masLarga;
	}

}
