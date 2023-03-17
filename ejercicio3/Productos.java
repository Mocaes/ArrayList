package ejercicio3;

import java.util.ArrayList;

public class Productos {

	public static void main(String[] args) {
		ArrayList<String> producto = new ArrayList<String>();
		String buscar = "Naranja";
		producto.add("Huevo");
		producto.add("Alcachofa");
		producto.add("Naranja");
		producto.add("Fuet");
		producto.add("Empanada");
		System.out.println(producto);
		producto.remove(0);
		int posicion = producto.indexOf(buscar);
		producto.set(posicion, "Platanos");
		System.out.println("Lista final");
		for (String a:producto) {
			System.out.println("-"+ a);
			}

	}

}
