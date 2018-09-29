package arraylist;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

public class ArrListEjemplo4 {
	    public static void main(String[] args) {
	        List<String> lenguajesProgramacion = new ArrayList<>();
	        lenguajesProgramacion.add("C");
	        lenguajesProgramacion.add("C++");
	        lenguajesProgramacion.add("Java");
	        lenguajesProgramacion.add("C#");
	        lenguajesProgramacion.add("Python");
	        lenguajesProgramacion.add("Perl");
	        lenguajesProgramacion.add("Ruby");

	        System.out.println("lista Inicial de Lenguajes de Programacion: " + lenguajesProgramacion);

	        // elimina un elemento en la posicion especificada
	        lenguajesProgramacion.remove(5);
	        System.out.println("El elmento 5 de la lista fue eliminado, verificar: " + lenguajesProgramacion);

	        //elimina la primera ocurrencia que cumpla con el parametro establecido
	        boolean fueEliminado = lenguajesProgramacion.remove("C#");
	        System.out.println("Listado despues de Eliminar C Sharp: " + lenguajesProgramacion);

	        // nuevo ArrayList
	        List<String> lpScripting = new ArrayList<>();
	        lpScripting.add("React");
	        lpScripting.add("Node");
	        lpScripting.add("Angular");

	        lenguajesProgramacion.removeAll(lpScripting);
	        System.out.println("Listado despues de Eliminar los LP Scripting): " + lenguajesProgramacion);

	        // elimina los elementos del arraylist que cumplen con el parametro establecido
	        lenguajesProgramacion.removeIf(new Predicate<String>() {
	            @Override
	            public boolean test(String s) {
	                return s.startsWith("C");
	            }
	        });

	        System.out.println("Listado de Lenguajes de Programacion despues de Eliminar aquellos que inician con \"C\": " + lenguajesProgramacion);

	        // Elimina todos los elementos de un ArrayList
	        lenguajesProgramacion.clear();
	        System.out.println("After clear(): " + lenguajesProgramacion);
	    }
}
