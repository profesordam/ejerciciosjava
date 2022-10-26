package primeraevaluacion.strings;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Ejercicio2 {

	/*
	 * Programa que lea una cadena en desde el teclado y la muestre invertida en la consola.
	 * 
	 */
	
	public static void main(String[] args) throws IOException {
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Escribe un texto: ");
		String cadena = in.readLine();
		String invertida = "";
		for (int i=0; i<cadena.length(); i++)
			invertida = cadena.charAt(i) + invertida;
		System.out.println(invertida);
	}

}
