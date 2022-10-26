package primeraevaluacion.tema2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class RetratosRobot2 {
	
	public static void main(String[] args) throws IOException {
		
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		
		String[][] c = {
				{"WWWWWWWWW", "\\\\\\//////", "|\"\"\"\"\"\"\"|", "|||||||||"},
				{"|  O O  |", "|-(· ·)-|", "|-(o o)-|" ,"|  \\ /  |"},
				{"@   J   @", "{   \"   }", "[   j   ]", "<   -   >"},
				{"|  ===  |", "|   -   |", "|  ___  |", "|  ---  |"},
				{" \\_____/ ", " \\,,,,,/ "}
		};
		
		for (int i=0 ; i<=5 ; i++) {
			System.out.println("Select an option:");
			System.out.println(c[i]);
			int sel = Integer.parseInt(in.readLine());
			boolean ok = true;
			try {
				do {
					if (sel < 1 || sel > 4 ) ok=true;
				}while(!ok);
			}catch (IOException e) {
				System.out.println("Not a number");
			}
		}
		
		System.out.println("Vamos a crear un retrato robot");
		
		System.out.println("Opciones para el pelo:");
		System.out.printf("1. %s\n2. %s\n3. %s\n4. %s\nElige un número:", PELO01, PELO2, PELO3, PELO4);
		int pelo = Integer.parseInt(in.readLine());
		if (pelo < 1 || pelo > 4)
			System.out.println("Opción incorrecta");
		else {
			System.out.println("Opciones para los ojos:");
			System.out.printf("1. %s\n2. %s\n3. %s\n4. %s\nElige un número:", OJOS1, OJOS2, OJOS3, OJOS4);
			int ojos = Integer.parseInt(in.readLine());
			if (ojos < 1 || ojos > 4)
				System.out.println("Opción incorrecta");
			else {
				System.out.println("Opciones para la nariz y orejas:");
				System.out.printf("1. %s\n2. %s\n3. %s\n4. %s\nElige un número:", NARIZ1, NARIZ2, NARIZ3, NARIZ4);
				int nariz = Integer.parseInt(in.readLine());
				if (nariz < 1 || nariz > 4)
					System.out.println("Opción incorrecta");
				else {
					System.out.println("Opciones para la boca:");
					System.out.printf("1. %s\n2. %s\n3. %s\n4. %s\nElige un número:", BOCA1, BOCA2, BOCA3, BOCA4);
					int boca = Integer.parseInt(in.readLine());
					if (boca < 1 || boca > 4)
						System.out.println("Opción incorrecta");
					else {
						System.out.println("Opciones para la barbilla:");
						System.out.printf("1. %s\n2. %s\nElige un número:", BARBILLA1, BARBILLA2);
						int barbilla = Integer.parseInt(in.readLine());
						if (barbilla < 1 || barbilla > 2)
							System.out.println("Opción incorrecta");
						else {
							switch (pelo) {
							case 1:
								System.out.println(c[0][0]);
								break;
							case 2:
								System.out.println(c[0][1]);
								break;
							case 3:
								System.out.println(c[0][2]);
								break;
							default:
								System.out.println(c[0][3]);
							}
							switch (ojos) {
							case 1:
								System.out.println(c[1][0]);
								break;
							case 2:
								System.out.println(c[1][1]);
								break;
							case 3:
								System.out.println(c[1][2]);
								break;
							default:
								System.out.println(c[1][3]);
							}
							switch (nariz) {
							case 1:
								System.out.println(c[2][0]);
								break;
							case 2:
								System.out.println(c[2][1]);
								break;
							case 3:
								System.out.println(c[2][2]);
								break;
							default:
								System.out.println(c[2][3]);
							}
							switch (boca) {
							case 1:
								System.out.println(c[3][0]);
								break;
							case 2:
								System.out.println(c[3][1]);
								break;
							case 3:
								System.out.println(c[3][2]);
								break;
							default:
								System.out.println(c[3][3]);
							}
							switch (barbilla) {
							case 1:
								System.out.println(c[4][0]);
								break;
							default:
								System.out.println(c[4][1]);
							}
						}
					}
				}
			}
		}
	}
}
