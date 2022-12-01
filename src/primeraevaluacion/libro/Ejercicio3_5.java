package primeraevaluacion.libro;

public class Ejercicio3_5 {

	public static void main(String[] args) {
		String s1 = "hola";
		String s2 = "anula la luz azul a la luna";
		String s3 = "abcba";
		System.out.println(palindromo2(s1));
		System.out.println(palindromo2(s2));
		System.out.println(palindromo2(s3));
	}
	
	static String reverso(String s) {
		String nueva = "";
		for (int i=s.length() - 1; i>=0; i--)
			nueva += s.charAt(i);
		return nueva;
	}
	
	static boolean palindromo(String s) {
		return s.replaceAll(" ", "").equalsIgnoreCase(reverso(s).replaceAll(" ", ""));
	}
	
	static boolean palindromo2(String s) {
//		for (int i=0; i<=s.length()/2; i++)
//			if (s.charAt(i) != s.charAt(s.length() - 1 - i))
//				return false;
//		return true;
		boolean esPalindromo = true;
		int i=0;
		while (i <= s.length() / 2 && esPalindromo)
			if (s.charAt(i) != s.charAt(s.length() - 1 - i++))
				esPalindromo = false;
		return esPalindromo;
	}
	
//	static int reverso(int n) {
//		
//	}
//	
//	static boolean capicua(int n) {
//		
//	}

}
