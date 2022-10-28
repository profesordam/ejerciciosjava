package primeraevaluacion.arrays;

import java.util.Arrays;

public class MetodosOrdenación {

	public static void main(String[] args) {
		int [] numeros = new int[1000];
		for (int i=0; i<numeros.length; i++)
			numeros[i] = (int) (Math.random() * 2000);
		System.out.println(Arrays.toString(numeros));
		insercionDirecta(numeros);
		System.out.println(Arrays.toString(numeros));
	}
	
	static void insercionDirecta(int [] array) {
		
	}
	
	static void intercambioDirecto(int [] array) {
	
	}
	
	static void seleccionDirecta(int [] array) {
		
	}

}
