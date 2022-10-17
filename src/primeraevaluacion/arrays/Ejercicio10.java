package primeraevaluacion.arrays;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Ejercicio10 {

	/*
	 * Programa que realice las tareas siguientes:
	 * 	• Crear un vector de números enteros de un tamaño especificado por el usuario que esté
	 *    comprendido entre 10 y 20 elementos.
	 *  • Llenar el vector con números aleatorios.
	 *  • Mostrar el contenido del vector.
	 *  • Mostrar la mínima diferencia entre dos valores adyacentes. 
	 *  La diferencia entre dos valores adyacentes se calcula como el valor almacenado en cada
	 *   posición [i] (excepto la primera) menos el valor almacenado en la posición [i-1]
	 */
	
	public static void main(String[] args) throws IOException {
		int [] v = crearVector(100, 20);
		if (v == null)
			System.out.println("no se ha creado");
		else
			System.out.println(v.length);
	}
	
	static int[] crearVector(int min, int max) throws IOException {
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		if (min < 1 || min >= max)
			return null;
		boolean correcto;
		int l = 0;
		do {
			correcto = true;
			System.out.println("Tamaño del vector (entre " + min + " y " + max + "): ");
			try {
				l = Integer.parseInt(in.readLine());
				if (l < min || l > max) {
					correcto = false;
					System.out.println("no esta dentro del intervalo, inténtalo de nuevo");
				}
			} catch (NumberFormatException e) {
				System.out.println("no es un número, inténtalo de nuevo");
				correcto = false;
			}
		} while (!correcto);
		return new int[l];
	}

}
