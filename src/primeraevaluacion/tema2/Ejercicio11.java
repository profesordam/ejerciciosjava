package primeraevaluacion.tema2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Ejercicio11 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Número: ");
		double numero = Double.parseDouble(in.readLine());
		if (numero == 0)
			System.out.println("El número es cero");
		else if (numero > 0)
			System.out.println("El número es positivo");
		else
			System.out.println("El número es negativo");
	}

}
