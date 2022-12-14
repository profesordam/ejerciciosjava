package primeraevaluacion.tema2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/*
 * Construir un programa que calcule el perímetro y el área de
 * una circunferencia leyendo su radio por teclado. (π = 3.14159)
 */

public class Ejercicio06 {

	public static void main(String[] args) throws IOException {
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		double perimetro;
		double area;
		double radio;
		System.out.println("Introduce el radio: ");
		radio = Double.parseDouble(in.readLine());
		perimetro = perimetroCircunferencia(radio);
		area = areaCircunferencia(radio);
		System.out.println("Perímetro: " + perimetro);
		System.out.println("Área: " + area);
	}
	
	static double perimetroCircunferencia(double radio) {
		double perimetro = 2 * Math.PI * radio;
		return perimetro;
	}
	
	static double areaCircunferencia(double radio) {
		double area = Math.pow(radio, 2) * Math.PI;
		return area;
	}

}
