package primeraevaluacion.tema2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Bisiesto {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Año: ");
		int año = Integer.parseInt(in.readLine());
		if (año % 4 == 0 && (año % 100 != 0 || año % 400 == 0))
			System.out.println("bisiesto");
		else
			System.out.println("no bisiesto");
	}

}
