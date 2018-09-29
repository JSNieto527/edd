package linkedlist;

import java.util.LinkedList;

public class LLEjemplo3 {
    public static void main(String[] args) {
        LinkedList<String> lenguajesProgramacion = new LinkedList<>();

        lenguajesProgramacion.add("Assembler");
        lenguajesProgramacion.add("Fortran");
        lenguajesProgramacion.add("Pascal");
        lenguajesProgramacion.add("C");
        lenguajesProgramacion.add("C++");
        lenguajesProgramacion.add("Java");
        lenguajesProgramacion.add("C#");
        lenguajesProgramacion.add("Android");

        System.out.println("Valores Iniciales= " + lenguajesProgramacion);
        String elemento = lenguajesProgramacion.removeFirst();  
        System.out.println("Eliminar el primer elemento: " + elemento + " => " + lenguajesProgramacion);

        elemento = lenguajesProgramacion.removeLast();   
        System.out.println("Eliminar el ultimo elemento" + elemento + " => " + lenguajesProgramacion);

        boolean eliminado = lenguajesProgramacion.remove("C#");
        if(eliminado) {
            System.out.println("Eliminar un valor por el contenido especifico (C#): " + lenguajesProgramacion);
        }

        lenguajesProgramacion.removeIf(lenguajeProgramac -> lenguajeProgramac.startsWith("C"));
        System.out.println("Eliminar elementos que inician con C " + lenguajesProgramacion);

        lenguajesProgramacion.clear();
        System.out.println("Eliminar todos los elementos: " + lenguajesProgramacion);
    }
}
