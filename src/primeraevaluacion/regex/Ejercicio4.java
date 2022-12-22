package primeraevaluacion.regex;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Ejercicio4 {

	public static void main(String[] args) throws IOException {
		
		Pattern boletoRegex = Pattern.compile("[^\\s,]+");
		Pattern ganadorRegex = Pattern.compile("[^@#\\*\\$]*(@{6,}|#{6,}|\\${6,}|\\*{6,})[^@#\\*\\$]*");

		
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		String linea = in.readLine();
		Matcher m2, m3;
		Matcher m1 = boletoRegex.matcher(linea);
		while (m1.find()) {
			String boleto = m1.group();
			if (boleto.length() == 20) {
				m2 = ganadorRegex.matcher(boleto.substring(0, 10));
				if (m2.find()) {
					String izda = m2.group(1);
					m3 = ganadorRegex.matcher(boleto.substring(10));
					if (m3.find()) {
						String dcha = m3.group(1);
						if  (izda.equals(dcha)) {
							System.out.print(boleto + " - " + izda.charAt(0) + izda.length());
							if (izda.length() == 10)
								System.out.println(" BOTE!");
							else
								System.out.println();
						}
					}
				}
			}
			else
				System.out.println(boleto + " - NO VÁLIDO");
		}
	}

}

// lote$$$$$$ri$$$$$$al, ote###@@@@r###@@@@ia, *******lo#######, @@@@@@@@@@@@@@@@@@@@