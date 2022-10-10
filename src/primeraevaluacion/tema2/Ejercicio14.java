package primeraevaluacion.tema2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Ejercicio14 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("DNI: ");
		int dni = Integer.parseInt(in.readLine());
		char letra = "TRWAGMYFPDXBNJZSQVHLCKE".charAt(dni % 23);
		System.out.println("Letra: " + letra); 
	}

}
