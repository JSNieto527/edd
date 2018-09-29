package linkedlist;
import java.util.LinkedList;

public class LLEjemplo4 {
    public static void main(String[] args) {
        LinkedList<String> empleados = new LinkedList<>();

        empleados.add("Lionel Messi");
        empleados.add("Luis Suarez");
        empleados.add("Sergi S");
        empleados.add("Nelson Semedo");
        empleados.add("Samuel Umtiti");
        empleados.add("Jordi Alba");
        empleados.add("Sergi S");        
        
        System.out.println("En la lista existe un Elemento llamado : Ronaldo? " + empleados.contains("Ronaldo"));

        System.out.println("Primer Ocurrencia del Nombre Samuel : " + empleados.indexOf("Samuel Umtiti"));
        System.out.println("Primer Ocurrencia del Nombre Jordi: " + empleados.indexOf("Jordi Alba"));

        System.out.println("Ultima Ocurrencia del nombre Sergi: " + empleados.lastIndexOf("Sergi S"));
    }
}
