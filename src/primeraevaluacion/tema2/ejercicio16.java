package primeraevaluacion.tema2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ejercicio16 {
	public static void main(String[] args) throws IOException {
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		int numaleatorio = (int)(Math.random()*99+1);
		int numero = 0;
		int intentos = 0;
		System.out.println("Adivina el número entre 1 y 100 (tienes 10 intentos): ");
		do { 
			numero = Integer.parseInt(in.readLine());
			intentos++;
			if (numero < numaleatorio) {
				System.out.println("El número introducido es menor que el aleatorio. Vuelve a intentarlo: ");
			}
			else if (numero > numaleatorio) {
				System.out.println("El número introducido es mayor que el aleatorio. Vuelve a intentarlo: ");
			}
		} while (!(numero == numaleatorio || intentos == 10));
		if (numero != numaleatorio) 			
			System.out.println("Agotaste el número de intentos");
		else
			System.out.println("Acertaste!");
	}
	

}
