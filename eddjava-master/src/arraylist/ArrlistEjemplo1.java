package arraylist;
/*
 * implementacion de ArrayList para agregar 2 elementos en una posicion
 * arbitraria
 */
import java.util.ArrayList;
import java.util.List;

public class ArrlistEjemplo1 {
    private static List<String> estudiantes = new ArrayList<>();	
	public static void generarArrList() {
        estudiantes.add("Jose");
        estudiantes.add("Maria");
        estudiantes.add("Jorge");
        estudiantes.add("Karla");

        System.out.println(estudiantes);		
	}
	
	public static void agrElementoArrList() {
        estudiantes.add(2, "Mario");
        estudiantes.add(4, "Marcela");        
        System.out.println(estudiantes);			
	}
	
	    public static void main(String[] args) {
	        generarArrList();
	        agrElementoArrList();

	    }
}
	    
