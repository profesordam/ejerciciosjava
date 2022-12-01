package primeraevaluacion.libro;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import javax.swing.plaf.synth.SynthOptionPaneUI;

public class Ejercicio4_14 {

	static BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
	static char [] elegidos = new char[9];
	
	public static void main(String[] args) throws IOException {
		int sumaA;
		int sumaB;
		while (true) {
			sumaA = sumaB = 0;
			for (int i=0; i<elegidos.length; i++)
				elegidos[i] = 0;
			System.out.println("Partida iniciada");
			for (int i=0; i<3; i++) {
				System.out.println("Jugador A elige: ");
				sumaA += elegir('A');
				if (i == 2 && sumaA == 15)
					System.out.println("JUGADOR A GANA LA PARTIDA!");
				else {
					System.out.println("Jugador B elige: ");
					sumaB += elegir('B');
					if (i == 2 && sumaB == 15)
						System.out.println("JUGADOR B GANA LA PARTIDA!");
				}
			}
			if (sumaA !=15 && sumaB != 15)
				System.out.println("A Y B PIERDEN\n");
		}
	}
	
	static int elegir(char jugador) throws IOException {
		int n = 0;
		boolean correcto = false;
		while (!correcto) {
			try {
				n = Integer.parseInt(in.readLine());
				if (n >= 1 && n <= 9 && elegidos[n - 1] == 0)
					correcto = true;
				else
					System.out.println("El número ya está elegido y no es correcto");
			} catch (NumberFormatException e) {
				System.out.println("No has introducido un número");
			}
			if (!correcto)
				System.out.println("Elige de nuevo: ");
		}
		elegidos[n - 1] = jugador;
		return n;
	}

}
