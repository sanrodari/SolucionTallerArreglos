package co.edu.uniquindio.acumulacion;

/**
 * Realice un método similar al anterior pero debe recibir un arreglo de cadenas
 * y retornar la concatenación de todos sus elementos. Dé un ejemplo para
 * `{"Hola ", "como ", "estás ", "?"}` con su correspondiente impresión.
 */
public class Ejercicio9 {
	
	public static void main(String[] args) {
		// 6. Se da un ejemplo para {"Hola ", "como ", "estás ", "?"} con la correspondiente impresión.
		String[] cadenas = {"Hola ", "como ", "estás ", "?"};
		String cadenaTotal = concatenarCadenas(cadenas);
		System.out.println();
		System.out.println("La concatenación total es: " + cadenaTotal);
	}
	
	// 1. Se define el método que retorna la concatenación de las cadenas.
	// Éste método recibe como parámetro el arreglo de cadenas a ser concatenadas.
	public static String concatenarCadenas(String[] cadenas) {
		// 2. Se declara un acumulador para almacenar el resultado de la concatenación.
		// Ya que es una concatenación se inicializa la variable con la cadena vacía "".
		String concatenacion = "";
		
		// 3. Se recorre el arreglo acumulando el valor de los elementos.
		// Como no es necesario usar el valor del índice actual se usa un
		// `foreach`.
		// Nota: También es válida la implementación con el for tradicional.
		for (String cadena : cadenas) {
			
			// Impresión de depuración
			System.out.println("Valor acumulado: \"" + concatenacion + "\", acumulando \"" + cadena + "\"...");
			
			// 4. Se concatena el elemento en la variable concatenacion.
			concatenacion += cadena;
			
			// Impresión de depuración
			System.out.println("Acumuló: \"" + concatenacion + "\"");
		}
		
		// 5. Cuando se complete el recorrido tenemos la concatenación de todos los
		// elementos acumulados en la variable `concatenacion`.
		// Éste es el valor que se retorna.
		return concatenacion;
	}

}
