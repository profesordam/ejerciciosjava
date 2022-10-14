package primeraevaluacion.arrays;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Random;

public class Ejercicio4 {

	/*
	 * Programa que, utilizando una cantidad mínima de variables, simule el
	 * lanzamiento de un dado N veces, siendo N un número entero que se introducirá
	 * por teclado. Antes de finalizar mostrará el número de veces que salió cada
	 * una de las caras.
	 */

	public static void main(String[] args) throws NumberFormatException, IOException {
		Random r = new Random();
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Número de tiradas: ");
		int n = Integer.parseInt(in.readLine());
		
		int [] valores = new int[6];
				
		for (int i = 0; i < n; i++) 
			valores[r.nextInt(6)]++;
		
		for (int i = 0; i<6; i++) 
			System.out.println("El " + (i+1) + " ha salido " + valores[i] + " veces.");
	}
	
//	public static void main(String[] args) throws NumberFormatException, IOException {
//		Random r = new Random();
//		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
//		System.out.println("Número de tiradas: ");
//		int n = Integer.parseInt(in.readLine());
//		int uno = 0, dos = 0, tres = 0, cuatro = 0, cinco = 0, seis = 0, tirada;
//
//		for (int i = 0; i < n; i++) {
//			tirada = r.nextInt(6) + 1;
//			if (tirada == 1)
//				uno++;
//			else if (tirada == 2)
//				dos++;
//			else if (tirada == 3)
//				tres++;
//			else if (tirada == 4)
//				cuatro++;
//			else if (tirada == 5)
//				cinco++;
//			else if (tirada == 6)
//				seis++;
//		}
//		
//		System.out.println("El 1 ha salido " + uno + " veces");
//		System.out.println("El 2 ha salido " + dos + " veces");
//		System.out.println("El 3 ha salido " + tres + " veces");
//		System.out.println("El 4 ha salido " + cuatro + " veces");
//		System.out.println("El 5 ha salido " + cinco + " veces");
//		System.out.println("El 6 ha salido " + seis + " veces");
//
//	}

}
