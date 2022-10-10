package primeraevaluacion.tema2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Ejercicio18 {
	
	public static void main(String[] args) throws IOException {
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		int total = 0;
		int mayores18 = 0;
		int edad;
		int alumnos = 0;
		
		do { 
			System.out.print("Edad (negativa = fin): ");
			edad = Integer.parseInt(in.readLine());
			if (edad >= 0) {
				total += edad;
				if (edad > 18)
					mayores18++;
				alumnos++;
			}
		} while (edad >= 0);
		
		if (alumnos == 0)
			System.out.println("No se han introducido datos");
		else {
			System.out.println("Edad Media: " + ((float) total / alumnos));
			System.out.println("Total: " + total);
			System.out.println("Mayores de 18: " + mayores18);
		}
	}
	
//	public static void main(String[] args) throws IOException {
//		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
//		int total = 0;
//		int mayores18 = 0;
//		int edad;
//		int alumnos = 0;
//		String linea;
//		
//		System.out.print("Edad (ctrl + z = fin): ");
//		while ((linea = in.readLine()) != null) {
//			edad = Integer.parseInt(linea);
//			total += edad;
//			if (edad > 18)
//				mayores18++;
//			alumnos++;
//			System.out.print("Edad (ctrl + z = fin): ");
//		}
//		if (alumnos == 0)
//			System.out.println("No se han introducido datos");
//		else {
//			System.out.println("Edad Media: " + ((float) total / alumnos));
//			System.out.println("Total: " + total);
//			System.out.println("Mayores de 18: " + mayores18);
//		}
//	}

}
