package primeraevaluacion.libro;

public class Ejercicio4_16 {

	public static void main(String[] args) {
		String [] codigo = {"a", "bb"};
		System.out.println(distanciaCodigo(codigo));
	}
	
	static int distanciaHamming(String s1, String s2) {
		if (s1.length() != s2.length())
			return -1;
		int d = 0;
		for (int i=0; i<s1.length(); i++)
			if (s1.charAt(i) != s2.charAt(i))
				d++;
		return d;
	}
	
	static int distanciaCodigo(String [] codigo) {
		int min = Integer.MAX_VALUE;
		for (int i=0; i<codigo.length-1; i++)
			for (int j=i+1; j<codigo.length; j++) {
				int d = distanciaHamming(codigo[i], codigo[j]);
				if (d >= 0 && d < min)
					min = d;
			}
		return min;
	}
	
}
