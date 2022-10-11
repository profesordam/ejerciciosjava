package primeraevaluacion.tema2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Ejercicio07 {

	public static void main(String[] args) throws IOException {
		double m1, m2, d, f;
		final double G = 6.673e-11;
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		m1 = leer("Introduce el valor de m1: ", in);
		m2 = leer("Introduce el valor de m2: ", in);
		d = leer("Introduce la distancia: ", in);
		f = G * (m1 * m2 / Math.pow(d, 2));
		System.out.println("La fuerza de atracción es: " + f);
	}

	static double leer(String msg, BufferedReader in) {
		boolean correcto;
		double numero = 0;
		do {
			correcto = true;
			System.out.println(msg);
			try  {
				numero = Double.parseDouble(in.readLine());
			} catch (NumberFormatException e) {
				System.out.println("el dato introducido no es un número, inténtalo de nuevo");
				correcto = false;
			} catch (IOException e) {
			}
		} while (!correcto); // (correcto == false)
		return numero;
	}
	
}
