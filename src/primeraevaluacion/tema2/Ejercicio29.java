package primeraevaluacion.tema2;

import java.util.Arrays;

public class Ejercicio29 {

	public static void main(String[] args) {
		int n = primeraevaluacion.arrays.Ejercicio13.dim(2, 20);
		int m = primeraevaluacion.arrays.Ejercicio13.dim(2, 20);
		int [][] matriz = new int [n][m];
		for (int i=0; i<matriz.length; i++)
			for (int j=0; j<matriz[i].length; j++)
				matriz[i][j] = i + j;
		for (int [] fila: matriz)
			System.out.println(Arrays.toString(fila));
	}

}
