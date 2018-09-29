package linkedlist;

import java.util.LinkedList;

public class LLEjemplo2 {
    public static void main(String[] args) {
        LinkedList<Double> ventasDiarias = new LinkedList<>();

        ventasDiarias.add(45.00);
        ventasDiarias.add(51.00);
        ventasDiarias.add(62.50);
        ventasDiarias.add(42.75);
        ventasDiarias.add(36.80);
        ventasDiarias.add(68.40);
        Double primerElmento = ventasDiarias.getFirst();
        System.out.println("Primera Venta del Dia: " + primerElmento);

        // Consideracion de cierta excepcion en caso que LL este vacia
        Double ultimoElemento = ventasDiarias.getLast();
        System.out.println("Ultima Venta Regisrada : " + ultimoElemento);
        
        Double tercerElemento = ventasDiarias.get(2);
        System.out.println("Tercera venta efectuada> " + tercerElemento);
    }
}
