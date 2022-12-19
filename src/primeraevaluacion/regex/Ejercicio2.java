package primeraevaluacion.regex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Ejercicio2 {

	public static void main(String[] args) {
		Pattern p = Pattern.compile("\\b\\d{2}([.\\-/])\\w{3}\\1\\d{4}\\b");
		Matcher m = p.matcher("01-ene-2022");
		System.out.println(m.matches());
	}

}
