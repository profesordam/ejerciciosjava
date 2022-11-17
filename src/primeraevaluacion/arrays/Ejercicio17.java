package primeraevaluacion.arrays;

import java.util.Arrays;

/*
	 * Programa que cree dos vectores de números enteros, cada uno de ellos de una longitud aleatoria
	 * entre 10 y 100, los rellene con valores aleatorios, los ordene, los mezcle en un tercer vector
	 * manteniendo la ordenación y finalmente muestre el contenido de los tres vectores.
	 */

public class Ejercicio17 {

	public static void main(String[] args) {
		int longitud = (int) (Math.random() * 90 + 10);
		int [] v1 = new int[longitud];
		longitud = (int) (Math.random() * 90 + 10);
		int [] v2 = new int[longitud];
		rellenar(v1);
		rellenar(v2);
		Arrays.sort(v1);
		Arrays.sort(v2);
		int [] v3 = new int[v1.length + v2.length];
		int i1 = 0;
		int i2 = 0;
		for (int i=0; i<v3.length; i++) {
			
		}
	}
	
	static void rellenar(int [] v) {
		for (int i=0; i<v.length; i++) {
			v[i] = (int) (Math.random() * Integer.MAX_VALUE); 
		}
	}

}
