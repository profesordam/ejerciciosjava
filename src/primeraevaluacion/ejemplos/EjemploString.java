package primeraevaluacion.ejemplos;

public class EjemploString {

	public static void main(String[] args) {
		String s1 = "Hola Mundo!";
		String s2 = new String ("Hola Mundo!");
		String s3 = "Hola";
		
		System.out.println("Hola Mundo!".equals(s1));
		System.out.println(s3.equals(s2));
		System.out.println("Hola Mundo!".charAt(3));
	}

}
