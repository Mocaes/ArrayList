package ejercicio4;

import java.util.ArrayList;
public class MainGato {
public static void main(String[] args) {
	ArrayList<Gato> g = new ArrayList<Gato>();
	
		g.add(new Gato("Garfield", "naranja", "mestizo"));
		g.add(new Gato("Pepe", "gris", "angora"));
		g.add(new Gato("Mauri", "blanco", "manx"));
		g.add(new Gato("Ulises", "marrón", "persa"));
		
	System.out.println("\nDatos de los gatos:\n");
	for (Gato gato : g) {
		System.out.println(gato.toString());
	}
}
}


