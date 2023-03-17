package ejercicio1;

import java.util.ArrayList;

public class Eliminar {
public static void main(String[] args) {
ArrayList<String> asigna = new ArrayList<String>();
asigna.add("Entorno");
asigna.add("Programación");
asigna.add("Base de datos");
asigna.add("Sistemas");
asigna.add("matematicas");
System.out.println("Nº de elementos: " + asigna.size());
System.out.println(asigna);

asigna.removeIf(asignatura -> asignatura.equals("matematicas"));

System.out.println("Nº de elementos: " + asigna.size());
System.out.println(asigna);
}
}
