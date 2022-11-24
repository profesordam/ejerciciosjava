package primeraevaluacion.arrays;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.regex.Pattern;

public class Ejercicio5B {

	static char [] letras = {'T', 'R', 'W', 'A', 'G', 'M', 'Y', 'F', 'P', 'D', 'X', 'B', 'N', 'J', 'Z', 'S', 'Q', 'V', 'H', 'L', 'C', 'K', 'E'};
		
	public static void main(String[] args) throws IOException {
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		System.out.print("NIF: ");
		String nif = in.readLine();
		System.out.println("Es correcto: " + validar(nif));
	}
	
	static boolean validar(String nif) {
		boolean correcto = true;
		Pattern pattern = Pattern.compile("\\d{7,8}\\p{Alpha}");
		correcto = pattern.matcher(nif).matches();
		if (correcto) {
			int numero = Integer.parseInt(nif.substring(0, nif.length() - 1));
			char letra = nif.charAt(nif.length() -1);
			int i = numero % 23;
			correcto = letra == letras[i];
		}
		return correcto;
	}
	
}
