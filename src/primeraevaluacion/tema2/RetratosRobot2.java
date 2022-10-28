package primeraevaluacion.tema2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class RetratosRobot2 {
	
	public static void main(String[] args) throws IOException {
		String[][] c = {
				{"el pelo", "WWWWWWWWW", "\\\\\\//////", "|\"\"\"\"\"\"\"|", "|||||||||"},
				{"los ojos", "|  O O  |", "|-(· ·)-|", "|-(o o)-|" ,"|  \\ /  |"},
				{"la nariz", "@   J   @", "{   \"   }", "[   j   ]", "<   -   >"},
				{"la boca", "|  ===  |", "|   -   |", "|  ___  |", "|  ---  |"},
				{"la barbilla", " \\_____/ ", " \\,,,,,/ "}
		};
		
		String [] retrato = new String[c.length];
		for (int i=0; i<retrato.length; i++)
			retrato[i] = elegirOpcion(c[i]);
		for (int i=0; i<retrato.length; i++)
			System.out.println(retrato[i]);
	}
	
	
	static String elegirOpcion(String [] opciones) throws IOException {
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Elige una opción para " + opciones[0]);
		for (int i=1; i<opciones.length; i++)
			System.out.println(i + ": " + opciones[i]);
		int opcion;
		do {
			try {
				opcion = Integer.parseInt(in.readLine());
			} catch (NumberFormatException e) {
				opcion = 0;
			}
			if (opcion < 1 || opcion >= opciones.length)
				System.out.println("Opción incorrecta, inténtalo de nuevo:");
		} while (opcion < 1 || opcion >= opciones.length);
		return opciones[opcion];
	}
}
