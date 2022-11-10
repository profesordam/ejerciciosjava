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
			for (int i=0; i<matriz.length; i++)
				System.out.println(Arrays.toString(matriz[i]));
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
		}
		scanner.close();
		return false;
	}
	
	static void matriz(Scanner scanner) {
		try {
			scanner.skip("\\p{javaWhitespace}+");
			int filas = Integer.parseInt(scanner.skip("\\d+").match().group());
			scanner.skip("x");
			int columnas = Integer.parseInt(scanner.skip("\\d+").match().group());
			scanner.skip(":");
			matriz = new int[filas][columnas];
			for (int i=0; i<filas; i++)
				for (int j=0; j<columnas; j++)
					matriz[i][j] = scanner.nextInt();
		} catch (NoSuchElementException e) {
			System.out.println("comando incorrecto");
		}
		
	}
	
	static void intercambia(Scanner scanner) {
		
	}

}
