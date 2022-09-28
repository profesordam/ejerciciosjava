package primeraevaluacion.ejemplos;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Ejemplo {

	public static void main(String[] args) throws IOException {
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		double numero1;
		double numero2;
		System.out.println("Introduce un número");
		String linea = in.readLine();
		numero1 = Integer.parseInt(linea);
		System.out.println("Introduce otro número");
		linea = in.readLine();
		numero2 = Integer.parseInt(linea);
		double suma;
		suma = numero1 + numero2;
		linea = "El resultado de la suma es: " + String.valueOf(suma);
		System.out.println(linea);
	}

}
