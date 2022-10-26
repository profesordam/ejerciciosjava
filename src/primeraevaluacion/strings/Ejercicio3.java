package primeraevaluacion.strings;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/*
	 * Programa que lea dos cadenas desde el teclado y muestre el número de veces que la segunda está
	 * contenida en la primera.
	 * 
	 */

public class Ejercicio3 {

	public static void main(String[] args) throws IOException {
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Escribe un texto: ");
		String texto1 = in.readLine();
		System.out.println("Escribe otro texto: ");
		String texto2 = in.readLine();
		int c = 0;
		int i = 0;
		do {
			i = texto1.indexOf(texto2, i);
			if (i >= 0) {
				i++;
				c++;
			}
		} while (i >= 0 && i < texto1.length());
		System.out.println("El segundo texto están contenido en el primero " + c + " veces");
	}

}
