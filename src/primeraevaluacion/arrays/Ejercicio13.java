package primeraevaluacion.arrays;

import java.util.Arrays;

public class Ejercicio13 {

	public static void main(String[] args) {
		int [][] m = new int [dim(2, 20)][dim(2, 20)];
		llenarMatriz(m);
		System.out.println("Matriz:");
		for (int [] fila: m)
			System.out.println(Arrays.toString(fila));
		System.out.println("Suma de las filas:");
		System.out.println(java.util.Arrays.toString(sumaFilas(m)));
		System.out.println("Suma de las columnas:");
		System.out.println(Arrays.toString(sumaColumnas(m)));
	}
	
	public static int dim(int min, int max) {
		return (int) (Math.random() * (max - min) + min);
	}
	
	static void llenarMatriz(int [][] m) {
		for (int i=0; i<m.length; i++)
			for (int j=0; j<m[i].length; j++)
				m[i][j] = dim(1, 1000000);
	}
	
	static int[] sumaFilas(int [][] m) {
		int [] sumas = new int[m.length];
		for (int i=0; i<m.length; i++) {
			for (int j=0; j<m[i].length; j++)
				sumas[i] += m[i][j];
		}
		return sumas;
	}
	
	static int[] sumaColumnas(int [][] m) {
		int [] sumas = new int[m[0].length];
		
		for (int i=0; i<m.length; i++) {
			for (int j=0; j<m[i].length; j++)
				sumas[j] += m[i][j];
		}
		
		return sumas;
	}

}
