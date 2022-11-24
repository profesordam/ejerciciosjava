package primeraevaluacion.arrays;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.NoSuchElementException;
import java.util.Scanner;

public class Ejercicio5C {

	static char [] letras = {'T', 'R', 'W', 'A', 'G', 'M', 'Y', 'F', 'P', 'D', 'X', 'B', 'N', 'J', 'Z', 'S', 'Q', 'V', 'H', 'L', 'C', 'K', 'E'};
		
	public static void main(String[] args) throws IOException {
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		System.out.print("NIF: ");
		Scanner validar = new Scanner(in.readLine());
		try {
			int numero = Integer.parseInt(validar.skip("^\\d{7,8}").match().group());
			char letra = validar.skip("\\p{Alpha}$").match().group().charAt(0);
			if (letra == letras[numero % 23])
				System.out.println("NIF CORRECTO");
			else
				System.out.println("NIF INCORRECTO");
		} catch (NoSuchElementException e) {
			System.out.println("NIF INCORRECTO");
		}
		in.close();
	}
	
}
