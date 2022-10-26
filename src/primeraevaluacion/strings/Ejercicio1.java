package primeraevaluacion.strings;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Ejercicio1 {

	/*
	 * Programa que lea una cadena desde el teclado y muestre en la consola
	 * el número de veces que se repite cada vocal.
	 * 
	 */
	
	public static void main(String[] args) throws IOException {
		int [][] contador = {{'a', 0}, {'e', 0}, {'i', 0}, {'o', 0}, {'u', 0}};
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Escribe un texto: ");
		String cadena = in.readLine();
		for (int j = 0; j<cadena.length(); j++) {
		
		}
		
	}
	
//	public static void main(String[] args) throws IOException {
//		int a = 0, e = 0, i = 0, o = 0, u = 0;
//		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
//		System.out.println("Escribe un texto: ");
//		String cadena = in.readLine();
//		for (int j = 0; j<cadena.length(); j++) {
//			switch (cadena.charAt(j)) {
//			case 'a': a++; break;
//			case 'e': e++; break;
//			case 'i': i++; break;
//			case 'o': o++; break;
//			case 'u': u++;
//			}
//		}
//		System.out.println("La a se repite " + a + " veces");
//		System.out.println("La e se repite " + e + " veces");
//		System.out.println("La i se repite " + i + " veces");
//		System.out.println("La o se repite " + o + " veces");
//		System.out.println("La u se repite " + u + " veces");
//	}

}
