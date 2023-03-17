package ejercicio5;

import java.util.ArrayList;

public class MainProductosInformaticos {
	public static void main(String[] args) {
		ArrayList<ProductosInformaticos> P = new ArrayList<ProductosInformaticos>();
		P.add (new ProductosInformaticos("Raton", "usado para clickar", "Juan"));
		P.add (new ProductosInformaticos("Teclado", "usado para escribir", "Alberto"));
		P.add (new ProductosInformaticos("Pantalla", "usado para ver", "Juan alberto"));
		System.out.println("Datos de los productos");
		for (ProductosInformaticos ProductosInformaticos : P) {
			System.out.println(ProductosInformaticos.toString());
		}
		}
}
