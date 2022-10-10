package primeraevaluacion.tema2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Ejercicio26 {

	public static void main(String[] args) {
		
	}
	
	static double distancia() throws NumberFormatException, IOException {
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		System.out.print("x1: ");
		double x1 = Double.parseDouble(in.readLine());
		System.out.print("y1: ");
		double y1 = Double.parseDouble(in.readLine());
		System.out.print("x2: ");
		double x2 = Double.parseDouble(in.readLine());
		System.out.print("y2: ");
		double y2 = Double.parseDouble(in.readLine());
		return Math.sqrt(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2));
	}

}
