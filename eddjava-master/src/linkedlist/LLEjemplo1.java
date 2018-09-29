package linkedlist;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class LLEjemplo1{
    public static void main(String[] args) {
        LinkedList<String> jugadores = new LinkedList<>();
        jugadores.add("Lionel Messi");
        jugadores.add("Luis Suarez");
        jugadores.add("Coutinho");
        jugadores.add("Ousmane Dembele");

        System.out.println("Valores iniciales del LL: " + jugadores);
        jugadores.add(3, "Sergio Busquets");
        System.out.println("Resultados despues de agregar SB en posic 3) : " + jugadores);

        jugadores.addFirst("Marc Andre Ter Stegen");
        System.out.println("Despues de Agregar un elemento al inicio: " + jugadores);

        jugadores.addLast("Malcom");
        System.out.println("Despues de agregar un elemento al final: " + jugadores);

        List<String> cambiosJugadores = new ArrayList<>();
        cambiosJugadores.add("Clement Lenglet");
        cambiosJugadores.add("Nelson Semedo");

        jugadores.addAll(cambiosJugadores);
        System.out.println("Combinacion de un LL y un AL: " + jugadores);
    }
}