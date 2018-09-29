package arraylist;
/*
 * acceso a elementos de un arrayList
 */
import java.util.ArrayList;
import java.util.List;

public class arrListEjemplo3 {
	    public static void main(String[] args) {
	        List<String> equiposFutbol = new ArrayList<>();
	        System.out.println("Estado de La lista de Equipos de Futbol (vacia) : " + equiposFutbol.isEmpty());
	        
	        equiposFutbol.add("FC Barcelona");
	        equiposFutbol.add("FC Bayern");
	        equiposFutbol.add("Internazionale");
	        equiposFutbol.add("Manchester City");
	        equiposFutbol.add("Gotemburg");

	        System.out.println("Cantidad de Equipos Registrados: " + equiposFutbol.size());
	        System.out.println(equiposFutbol);
	        // Obtener un elemento en una posicion especifica
	        String mejorEquipo = equiposFutbol.get(0);
	        String segundoMejorEquipo = equiposFutbol.get(3);
	        String ultimoEquipoRegistrado = equiposFutbol.get(equiposFutbol.size() - 1);

	        System.out.println("Mejo Equipo: " + mejorEquipo);
	        System.out.println("Segundo Mejor Equipo: " + segundoMejorEquipo);
	        System.out.println("Ultimo Equipo de la Lista: " + ultimoEquipoRegistrado);

	        // Modificar el valor de un elemento en una posicion especifica
	        equiposFutbol.set(2, "AC Milan");
	        System.out.println("Lista de Equipos de Futbol Modificada: " + equiposFutbol);
	    }
}
