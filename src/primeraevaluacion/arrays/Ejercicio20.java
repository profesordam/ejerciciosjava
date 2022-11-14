package primeraevaluacion.arrays;

import java.util.Arrays;
import java.util.NoSuchElementException;
import java.util.Scanner;

public class Ejercicio20 {
	
	static int[][] matriz;

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		boolean fin = false;
		while (!fin) {
			System.out.print("> ");
			fin = ejecutarComando(in.nextLine());
		}
		in.close();
	}
	
	static boolean ejecutarComando(String comando) {
		Scanner scanner = new Scanner(comando);
		try {
			String cmd = scanner.next("matriz|intercambia|fin");
			switch (cmd) {
			case "matriz":
				matriz(scanner);
				break;
			case "intercambia":
				intercambia(scanner);
				break;
			default: /* fin */
				return true;
			}
		} catch (NoSuchElementException e) {
			System.out.println("comando incorrecto");
		} finally {
			scanner.close();
		}
		return false;
	}
	
	/*
	 * matriz 2x3: 1 2 3 4 5 6
	 */
	
	static void matriz(Scanner scanner) {
		try {
			scanner.skip("\\p{javaWhitespace}+");
			int filas = Integer.parseInt(scanner.skip("\\d+").match().group());
			scanner.skip("\\p{javaWhitespace}*x\\p{javaWhitespace}*");
			int columnas = Integer.parseInt(scanner.skip("\\d+").match().group());
			scanner.skip("\\p{javaWhitespace}*:\\p{javaWhitespace}*");
			matriz = new int[filas][columnas];
			for (int i=0; i<filas; i++)
				for (int j=0; j<columnas; j++)
					matriz[i][j] = scanner.nextInt();
			if (scanner.hasNext()) {
				System.out.println("comando incorrecto: demasiados números");
				matriz = null;
			}
			
		} catch (NoSuchElementException e) {
			System.out.println("comando incorrecto");
		}
		
	}
	
	
	/*
	 * intercambia 0 0 1 1
	 */
	static void intercambia(Scanner scanner) {
		try {
			int f0 = scanner.nextInt();
			int c0 = scanner.nextInt();
			int f1 = scanner.nextInt();
			int c1 = scanner.nextInt();
			if (scanner.hasNext()) 
				System.out.println("comando incorrecto: demasiados números");
			else {
				int aux = matriz[f0][c0];
				matriz[f0][c0] = matriz[f1][c1];
				matriz[f1][c1] = aux;
				mostrarMatriz();
			}
		} catch (NoSuchElementException e) {
			System.out.println("comando incorrecto");
		}
	}
	
	static void mostrarMatriz() {
		for (int i=0; i<matriz.length; i++)
			System.out.println(Arrays.toString(matriz[i]));
	}

}
