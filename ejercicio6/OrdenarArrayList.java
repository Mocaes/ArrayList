package ejercicio6;
import java.util.ArrayList;
import java.util.Collections;

public class OrdenarArrayList {
public static void main(String[] args) {
ArrayList<String> a = new ArrayList<String>();
a.add("Malaga");
a.add("Sevilla");
a.add("Cadiz");
a.add("Almeria");
System.out.println("\nCiudades en el orden original:");

for (String numero: a) {
System.out.println(numero);
}

Collections.sort(a);
System.out.println("\nCiudades ordenadenados:");

for (String numero: a) {
System.out.println(numero);
}
}
}

