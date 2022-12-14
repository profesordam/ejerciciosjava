package primeraevaluacion.arrays;

/*
 * Ejercicio 18
 */

public class Arrays {

	public static int [][] cuadrada1(int dim) {
		int [][] matriz = new int[dim][dim];
		
		int v = 1;
		
//		for (int f=0; f<dim; f++) {
//			for (int c=0; c<dim; c++) {
//				matriz[f][c] = v;
//				v += dim;
//			}
//			v -= 15;
//		}
		
//		for (int c=0; c<dim; c++)
//			for (int f=0; f<dim; f++) {
//				matriz[f][c] = v;
//				v++;
//			}
//		
		
		for (int f=0; f<dim; f++)
			for (int c=0; c<dim; c++)
				matriz[f][c] = f + 1 + c * dim;
		
		return matriz;
	}
	
	public static int [][] cuadrada2(int dim) {
		int [][] matriz = new int[dim][dim];
		int v = 1;
		for (int c=0; c<dim; c++) {
			for (int f=0; f<dim; f++) {
				matriz[f][c] = v;
				if (c % 2 == 0)
					v++;
				else
					v--;
			}
			if (c % 2 == 0)
				v += dim - 1;
			else
				v += dim + 1;
		}
		return matriz;
	}
	
	public static String [][] palindromos(int c, int f) {
		
		String [][] matriz;

		if (c < 1 || f < 1 || f + c > 26 )
			matriz = null;
		else {
			matriz =  new String[f][c];
			for (int i=0; i<f; i++) {
				for (int j=0; j<c; j++) {
					char c13 = (char) ('a' + i);
					char c2 =  (char) ('a' + i + j);
					matriz[i][j] = String.valueOf(c13) + String.valueOf(c2) + String.valueOf(c13);
				}
			}
		}
	
		return matriz;
	}
	
	public static int max3x3sum(int [][] matriz) {
		int max = Integer.MIN_VALUE;
		for (int i=0; i<matriz.length - 2; i++)
			for (int j=0; j<matriz[i].length - 2; j++) {
				int suma = 0;
				for (int k=0; k<3; k++)
					for(int l=0; l<3; l++)
						suma += matriz[i + k][j + l];
				if (suma > max)
					max = suma;
			}
		return max;
	}
	
	public static void mostrarMatriz(int [][] matriz) {
		for (int i=0; i<matriz.length; i++)
			System.out.println(java.util.Arrays.toString(matriz[i]));
	}
	
	public static void mostrarMatriz(String [][] matriz) {
		for (int i=0; i<matriz.length; i++)
			System.out.println(java.util.Arrays.toString(matriz[i]));
	}
	
	public static void main(String[] args) {
		mostrarMatriz(cuadrada1(4));
		System.out.println();
		mostrarMatriz(cuadrada2(4));
		System.out.println();
		mostrarMatriz(palindromos(6, 4));
		System.out.println();
		int max = max3x3sum(new int[][]{
						{1, 5, 5, 2, 4},
						{2, 1, 4, 14, 3},
						{3, 7, 11, 2, 8},
						{4, 8, 12, 16, 4}});
		System.out.println(max);
	}
	
}
