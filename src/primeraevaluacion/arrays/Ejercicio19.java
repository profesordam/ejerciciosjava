package primeraevaluacion.arrays;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Ejercicio19 {

	public static void main(String[] args) throws IOException {
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		String linea;
		linea = in.readLine();
		String [] v = linea.split(" ");
		int filas = Integer.parseInt(v[0]);
		int columnas = Integer.parseInt(v[1]);
		char [][] m = new char[filas][columnas];
		for (int i=0; i<filas; i++)
			insertarDatosEnLaFila(m[i], in.readLine());
		mostrarMatriz(m);
		char relleno = in.readLine().charAt(0);
		int filIni = Integer.parseInt(in.readLine());
		int colIni = Integer.parseInt(in.readLine());
		rellenar(m, filIni, colIni, relleno);
		mostrarMatriz(m);
	}
	
	static void mostrarMatriz(char [][] m) {
		System.out.println();
		for (int i=0; i<m.length; i++)
			System.out.println(m[i]);
		System.out.println();
	}
	
	static void insertarDatosEnLaFila(char [] fila, String datos) {
		for (int i=0; i<fila.length; i++)
			fila[i] = datos.charAt(i);
	}
	
	static void rellenar(char [][] m, int f, int c, char r) {
		
	}

}
