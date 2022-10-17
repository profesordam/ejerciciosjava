package primeraevaluacion.arrays;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Random;

public class Ejercicio7 {

	/*
	 * Programa que realice las tareas siguientes:
	 *   • Crear un vector de números enteros de un tamaño especificado
	 *     por el usuario entre 10 y 1.000.000 de elementos.
	 *   • Llenar el vector con números aleatorios comprendidos entre -999.999
	 *     y 1.000.000 sin repetir ninguno.
	 *   • Mostrar en la consola los datos siguientes:
	 *       o Tamaño del vector.
	 *       o Tiempo empleado en llenarlo.
	 *       o Diferencia entre el menor y el mayor de los números almacenados.
	 *       o Tiempo empleado en calcular la diferencia entre el menor y el mayor
	 *         de los números almacenados.
	 */
	
	public static void main(String[] args) throws NumberFormatException, IOException {
		Random r = new Random();
		int [] numeros = new int [leerNumero()];
		long t0 = System.nanoTime();
		for (int i=0; i<numeros.length; i++)
			almacenarNumeroAleatorioSinRepetir(numeros, i, r);
		long t = System.nanoTime() - t0; 
		System.out.println("Tamaño del vector: " + numeros.length);
		System.out.println("Tiempo empleado en llenarlo: " + t + " nanosegundos");
		t0 = System.nanoTime();
		int mayor = Integer.MIN_VALUE;
		int menor = Integer.MAX_VALUE;
		for (int numero: numeros) {
			if (numero > mayor)
				mayor = numero;
			if (numero < menor)
				menor = numero;
		}
		t = System.nanoTime() - t0;
		System.out.println("Diferencia entre el mayor y el menor: " + (mayor - menor));
		System.out.println("Tiempo empleado en calcularla: " + t + " nanosegundos");
	}
	
	static int leerNumero() throws IOException {
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		boolean correcto;
		int numero = 0;
		
		do {
			correcto = true;
			System.out.println("Tamaño del vector (entre 10 y 1.000.000): ");
			try {
				numero = Integer.parseInt(in.readLine());
				if (numero < 10 || numero > 1000000) {
					correcto = false;
					System.out.println("no esta dentro del intervalo, inténtalo de nuevo");
				}
			} catch (NumberFormatException e) {
				System.out.println("no es un número, inténtalo de nuevo");
				correcto = false;
			}
		}while (!correcto);
		return numero;
	}
	
	static void almacenarNumeroAleatorioSinRepetir(int [] numeros, int posicion, Random r) {
		int i;
		do {
			i = 0;
			int n = r.nextInt(2000000000) - 999999999; // numeros entre -999.999 y 1.000.000
			while (i < posicion && numeros[i] != n) 
				i++;
			if (i == posicion)
				numeros[i] = n;
		} while (i != posicion);
	}

}
