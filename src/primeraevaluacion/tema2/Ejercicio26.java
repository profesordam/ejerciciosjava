package primeraevaluacion.tema2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Ejercicio26 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		double x1 = leerCoordenada("x1: ", in);
		double y1 = leerCoordenada("y1: ", in);
		double x2 = leerCoordenada("x2: ", in);
		double y2 = leerCoordenada("y2: ", in);
		double d = distancia(x1, y1, x2, y2);
		System.out.println("distancia: " + d);
	}
			
	static double leerCoordenada(String msg, BufferedReader in)  {
		boolean correcto;
		double valor = 0;
		System.out.print(msg);
		do {
			correcto = true; 
			try {
				valor = Double.parseDouble(in.readLine());
			} catch (NumberFormatException | IOException e) {
				System.out.println("número incorrecto, inténtalo de nuevo");
				correcto = false;
			}
		} while (!correcto);
		return valor;
	}
	
	static double distancia(double x1, double y1, double x2, double y2) {
		return Math.sqrt(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2));
	}

}
