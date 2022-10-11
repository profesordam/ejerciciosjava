package primeraevaluacion.tema2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Ejercicio14 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("DNI: ");
		int dni = Integer.parseInt(in.readLine());
		System.out.println("Letra: ");
		char letra = in.readLine().charAt(0);
		if (validarDNI(dni, letra))
			System.out.println("datos correctos");
		else
			System.out.println("datos incorrectos");
		System.out.println("Letra: " + letra); 
	}
	
	// Metodo validarDNI que reciba un número de DNI y una letra.
	// Retorna true si la letra se corresponde con el número.
	
	static boolean validarDNI(int numero, char letra) {
		return letra == "TRWAGMYFPDXBNJZSQVHLCKE".charAt(numero % 23);
	}

}
