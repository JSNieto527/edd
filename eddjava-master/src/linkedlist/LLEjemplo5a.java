package linkedlist;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.ListIterator;

public class LLEjemplo5a {
    public static void main(String[] args) {
        LinkedList<String> especiesHumanas = new LinkedList<>();

        especiesHumanas.add("Homo Sapiens");
        especiesHumanas.add("Homo Neanderthalensis");
        especiesHumanas.add("Homo Erectus");
        especiesHumanas.add("Home Habilis");

        especiesHumanas.forEach(nombreEspecie -> {
            System.out.println(nombreEspecie);
        });

        Iterator<String> especieHumanaIte = especiesHumanas.iterator();
        while (especieHumanaIte.hasNext()) {
            String ehNombre = especieHumanaIte.next();
            System.out.println(ehNombre);
        }

        especieHumanaIte = especiesHumanas.iterator();
        especieHumanaIte.forEachRemaining(ehNombre -> {
            System.out.println(ehNombre);
        });

        Iterator<String> desehIte = especiesHumanas.descendingIterator();
        while (desehIte.hasNext()) {
            String ehNombre = desehIte.next();
            System.out.println(ehNombre);
        }

        ListIterator<String> ehListIte = especiesHumanas.listIterator(especiesHumanas.size());
        while (ehListIte.hasPrevious()) {
            String ehNombre = ehListIte.previous();
            System.out.println(ehNombre);
        }

        for(String ehNombre: especiesHumanas) {
            System.out.println(ehNombre);
        }
    }
}
