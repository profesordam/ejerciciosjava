package primeraevaluacion.regex;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Ejercicio1 {

	public static void main(String[] args) throws IOException {
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		Pattern regex = Pattern.compile("\\b[A-ZÁÉÍÓÚ][a-záéíóú]+(?: \\b[A-ZÁÉÍÓÚ][a-záéíóú]+)+\\b");
		System.out.println("Nombres:");
		Matcher m = regex.matcher(in.readLine());
		while (m.find())
			System.out.println(m.group());
	}

}

// María Fernández Pérez, Alberto González, Mariano Martínez, Laura Sánchez López