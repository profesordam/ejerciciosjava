package primeraevaluacion.tema2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Random;

public class Ejercicio26 {

//	public static void main(String[] args) {
//		int [] numeros = new int[10];
//		Random r = new Random();
//		for (int i=0; i<numeros.length; i++)
//			numeros[i] = r.nextInt(100); 
//		System.out.println(Arrays.toString(numeros));
//		int [] numeros2 = new int[numeros.length];
//		for (int i=0; i<numeros2.length; i++)
//			numeros2[i] = numeros[numeros2.length -1 - i];
//		System.out.println(Arrays.toString(numeros2));
//	}
	
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Tamaño del array: ");
		int [] numeros = new int[Integer.parseInt(in.readLine())];
		int n = numeros.length;
		Random r = new Random();
		for (int i=0; i<n; i++)
			numeros[i] = r.nextInt(100); 
		System.out.println(Arrays.toString(numeros));
		for (int i=0; i<n / 2; i++) {
			int temp = numeros[i];
			numeros[i] = numeros[n - 1 - i];
			numeros[n - 1 - i] = temp;
		}
		System.out.println(Arrays.toString(numeros));
	}
	
	

}
