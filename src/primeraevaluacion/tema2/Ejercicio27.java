package primeraevaluacion.tema2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Ejercicio27 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Cuantos números primos quieres almacenar: ");
		int maxPrimos = Integer.parseInt(in.readLine());
		int [] primos = new int[maxPrimos];
		int numPrimos = 0;
		int n = 1;
		do {
			if (esPrimo(n)) {
				primos[numPrimos] = n;
				numPrimos++;
			}
			n++;
		} while (numPrimos < maxPrimos);
		System.out.println(Arrays.toString(primos));
	}
	
	static boolean esPrimo(int n) {
		int divisor = n - 1;
		while (divisor > 1 && n % divisor != 0)
			divisor--;
		return divisor <= 1;
	}
	
//	static boolean esPrimo(int n) {
//	int divisor = n - 1;
//	while (divisor > 1) {
//		if (n % divisor == 0)
//			return false;
//		divisor--;
//	}
//	return true;
//}
	
}
