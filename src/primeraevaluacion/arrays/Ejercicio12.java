package primeraevaluacion.arrays;

public class Ejercicio12 {

	public static void main(String[] args) {
		int [] v = { 6, 2, 3, 0, 1 };
		Integer c = centro(v);
		System.out.println(c == null ? "no exite el centro" : c);
	}

	static Integer centro(int [] v) {
		for (int c = 1; c < v.length - 1; c++) {
			int izda = 0;
			int dcha = 0;
			for (int i = 0; i < c; i++)
				izda += (c - i) * v[i];
			for (int j = c + 1; j < v.length; j++)
				dcha += (j - c) * v[j];
			if (izda == dcha)
				return c;
		}
		return null;
	}
}
