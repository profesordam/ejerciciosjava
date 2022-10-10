package primeraevaluacion.tema2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Ejercicio7 {

	public static void main(String[] args) throws IOException {
		double m1, m2, d, f;
		final double G = 6.673e-11;
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Introduce el valor de m1: ");
		m1 = Double.parseDouble(in.readLine());
		System.out.println("Introduce el valor de m2: ");
		m2 = Double.parseDouble(in.readLine());
		System.out.println("Introduce la distancia: ");
		d = Double.parseDouble(in.readLine());
		f = G * (m1 * m2 / Math.pow(d, 2));
		System.out.println("La fuerza de atracción es: " + f);
	}

}
