package ejercicio2;
import java.util.ArrayList;
public class Clase {
	public static void main(String[] args) {
		ArrayList<String> alumno= new ArrayList<String>();
		
		alumno.add("Alberto");
		alumno.add("Juan");
		alumno.add("Pablo");
		alumno.add("Pedro");
		System.out.println(alumno);
		alumno.remove("Pedro");
		System.out.println(alumno);
		alumno.add("Ana");
		System.out.println(alumno);
		String buscar= "Ana";
		int position = alumno.indexOf(buscar);
		alumno.set(position, "Laura");
		System.out.println(alumno);
	}
}
