package primeraevaluacion.arrays;

import java.util.Arrays;
import java.util.function.Consumer;

/*
 * Crear una clase llamada MétodosOrdenación que defina tres métodos estáticos para ordenar vectores
 * de números enteros implementando la ordenación por inserción directa, por selección directa y por
 * intercambio directo respectivamente.
 * 
 */

public class MetodosOrdenación {

	public static void main(String[] args) {
		int [] v = crearVector(1000);
		System.out.println("Original");
		System.out.println(Arrays.toString(v));
		ordenar(Arrays.copyOf(v, v.length), MetodosOrdenación::insercionDirecta, "Inserción Directa");
		ordenar(Arrays.copyOf(v, v.length), MetodosOrdenación::intercambioDirecto, "Intercambio Directo");
		ordenar(Arrays.copyOf(v, v.length), MetodosOrdenación::seleccionDirecta, "Selección Directa");
		ordenar(Arrays.copyOf(v, v.length), Arrays::sort, "Arrays.sort");
	}
	
	static void ordenar(int [] v, Consumer<int []> metodo, String nombre) {
		long t0 = System.nanoTime();
		metodo.accept(v);
		long t1 = System.nanoTime();
		System.out.println("Ordenado por " + nombre);
		System.out.println(Arrays.toString(v));
		System.out.println("tiempo: " + (t1 - t0));
	}
	
	static int [] crearVector(int longitud) {
		int [] v = new int[longitud];
		for (int i=0; i<v.length; i++)
			v[i] = (int) (Math.random() * 2000);
		return v;
	}
	
	static void insercionDirecta(int [] v) {
		for (int i=1; i<v.length; i++) {
			int j = 0;
			while (j < i && v[j] < v[i])
				j++;
			if (j < i) {
				int aux = v[i];
				for (int k=i-1; k>=j; k--)
					v[k+1] = v[k];
				v[j] = aux;
			}
		}
	}
	
	static void intercambioDirecto(int [] v) {
		for (int i=0; i<v.length-1; i++) {
			int min = i;
			for (int j=i+1; j<v.length; j++)
				if (v[j] < v[min])
					min = j;
			if (min != i) {
				int aux = v[min];
				v[min] = v[i];
				v[i] = aux;
			}
		}
	}
	
	static void seleccionDirecta(int [] v) {
		for (int i=0; i<v.length-1; i++)
			for (int j=v.length-1; j>i; j--)
				if (v[j] < v[j-1]) {
					int aux = v[j];
					v[j] = v[j-1];
					v[j-1] = aux;
				}
	}
	
}
