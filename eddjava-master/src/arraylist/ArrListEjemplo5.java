package arraylist;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class ArrListEjemplo5 {
	public static void main(String[] args) {
		List<String> equiposBKB = new ArrayList<>();
        equiposBKB.add("Chicago Bulls");
        equiposBKB.add("LA Lakers");
        equiposBKB.add("Seattle Sonics");
        equiposBKB.add("Miami Heat");

        System.out.println("Iteracion con ArrayList con forEach");
        equiposBKB.forEach(equipoBKB -> {
            System.out.println(equipoBKB);
        });

        System.out.println("\nIteracion con la funcion Iterator");
        Iterator<String> equipoBKBIterador = equiposBKB.iterator();
        while (equipoBKBIterador.hasNext()) {
            String equipoBKB = equipoBKBIterador.next();
            System.out.println(equipoBKB);
        }

        System.out.println("\nIteracion utilizando la funcion forEachRemaining disponible desde v1.8");
        equipoBKBIterador = equiposBKB.iterator();
        equipoBKBIterador.forEachRemaining(equipoBKB -> {
            System.out.println(equipoBKB);
        });

        System.out.println("\nIteracion usando la funcion listIterator para hacer operaciones en ambas direcciones");
        ListIterator<String> equipoBKBListIterador = equiposBKB.listIterator(equiposBKB.size());
        while (equipoBKBListIterador.hasPrevious()) {
            String tvShow = equipoBKBListIterador.previous();
            System.out.println(tvShow);
        }
        System.out.println("\nIteracion usando for-each");
        for(String equipoBKB: equiposBKB) {
            System.out.println(equipoBKB);
        }
        System.out.println("\nIteracion usando for");
        for(int i = 0; i < equiposBKB.size(); i++) {
            System.out.println(equiposBKB.get(i));
        }
    }		
}
