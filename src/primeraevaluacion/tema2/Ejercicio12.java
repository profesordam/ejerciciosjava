package primeraevaluacion.tema2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Ejercicio12 {

	public static void main(String[] args) throws IOException{
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Introduce un numero entero a ser posible");
		int n = 0;
		boolean correcto;
		do {
			correcto = true;
			try {
				n = Integer.parseInt(in.readLine());
			} catch (NumberFormatException e) {
				correcto = false;
				System.out.println("No es un número entero, introdúcelo de nuevo:");
			}
		} while ( correcto == false );
		double suma = 0;
		for(int i=1;i<=n;i++)
			suma += 1d / i;
		System.out.println("suma = " + suma);
	}

}
