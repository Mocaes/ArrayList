package ejercicio7;
import java.util.ArrayList;
import java.util.Collections;

public class Numeros {
	public static void main(String[] args) {
		ArrayList<String> a = new ArrayList<String>();
		a.add("32.12.8");
		a.add("60");
		a.add("20");
		System.out.println("\nNúmeros en el orden original:");
		for (String numero: a) {
		System.out.println(numero);
		}
		Collections.sort(a);
		System.out.println("\nNúmeros ordenados:");
		for (String numero: a) {
		System.out.println(numero);
		}
	}
}


