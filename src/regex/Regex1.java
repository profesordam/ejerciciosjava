package regex;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Regex1 {

	public static void main(String[] args) throws IOException {
//		try (BufferedReader in = new BufferedReader(
//				new InputStreamReader(Regex1.class.getResourceAsStream("/100-contacts.csv")))) {
		try (BufferedReader in = new BufferedReader(
				new FileReader("C:\\Users\\Julio\\Downloads\\100-contacts.csv"))) {
			StringBuilder s = new StringBuilder();
			String linea;
			while ((linea = in.readLine()) != null) {
				s.append(linea);
				s.append("\n");
			}
			Pattern regex = Pattern.compile("(\\w+(?:\\.\\w+)*)@\\w+(?:\\.\\w+)+");
			Matcher m = regex.matcher(s);
			while (m.find()) {
				int numGrupos = m.groupCount();
				for (int i = 1; i <= numGrupos; i++)
					System.out.println(m.group(i));
			}
		}
	}

}
