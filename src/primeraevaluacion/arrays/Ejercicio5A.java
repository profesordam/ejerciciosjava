package primeraevaluacion.arrays;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Ejercicio5A {

	static char [] letras = {'T', 'R', 'W', 'A', 'G', 'M', 'Y', 'F', 'P', 'D', 'X', 'B', 'N', 'J', 'Z', 'S', 'Q', 'V', 'H', 'L', 'C', 'K', 'E'};
	
	public static void main(String[] args) throws IOException {
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		System.out.print("NIF: ");
		String nif = in.readLine();
		String numero = nif.substring(0, nif.length() - 1);
		char letra = nif.charAt(nif.length() - 1);
		System.out.println("correcto: " + validar(numero, letra));
	}
	
//	static boolean validar(String numero, char letra) {
//		if (numero.length() < 7 || numero.length() > 8)
//			return false;
//		for (int i=0; i<numero.length(); i++)
//			if (!Character.isDigit(numero.charAt(i)))
//				return false;
//		if (!Character.isAlphabetic(letra))
//			return false;
//		int i = Integer.parseInt(numero) % 23;
//		return letra == letras[i];
//	}
	
	static boolean validar(String numero, char letra) {
		boolean correcto = true;
		if (numero.length() < 7 || numero.length() > 8)
			correcto = false;
		else {
			int i = 0;
			while (correcto && i<numero.length())
				if (!Character.isDigit(numero.charAt(i++)))
					correcto = false;
			if (correcto && !Character.isAlphabetic(letra))
				correcto = false;
		}
		return correcto;
	}

}
