package primeraevaluacion.tema2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Exercise21 {

	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.print("n: ");
		
		for (int i=Integer.parseInt(br.readLine()); i>0; i--) {
			for (int j=0; j<i; j++)
				System.out.print('*');
			System.out.println();
		}
		
	}

}
