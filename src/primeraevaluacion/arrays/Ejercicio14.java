package primeraevaluacion.arrays;

import java.util.Arrays;
import java.util.InputMismatchException;
import java.util.Scanner;

/*
	 * Programa que utilice un único array para leer y almacenar los datos de varias secuencias de números enteros.
	 * 
	 * Los datos se introducirán por teclado de la forma siguiente:
	 * 
	 *     • Se escribe una primera línea que contiene el número de secuencias.
	 *     • A continuación, se escriben las secuencias a razón de dos líneas por secuencia
	 *       con el formato siguiente:
	 *       
	 *           o La primera contiene la cantidad de números de la secuencia.
	 *           o La segunda contiene los números de la secuencia separados por espacios
	 *           
	 */

public class Ejercicio14 {

	public static void main(String[] args) {
		int [][] secuencias;
		Scanner s = new Scanner(System.in);
		try {
			int numeroSecuencias = Integer.parseInt(s.next("(?m)^[0-9]+$"));
			secuencias = new int[numeroSecuencias][];
			for (int i=0; i<secuencias.length; i++) {
				int longitudSecuencia = s.nextInt();
				secuencias[i] = new int[longitudSecuencia];
				for (int j=0; j<secuencias[i].length; j++) {
					int numero = s.nextInt();
					secuencias[i][j] = numero;
				}
			}
			for (int i=0; i<secuencias.length; i++)
				 System.out.println(Arrays.toString(secuencias[i]));
		} catch (InputMismatchException e) {
			System.out.println("error de entrada de datos");
		}
	}

}
