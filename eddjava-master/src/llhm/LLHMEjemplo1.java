package llhm;
import java.util.LinkedHashMap;

public class LLHMEjemplo1 {
    public static void main(String[] args) {
        LinkedHashMap<String, Integer> palabrasMapeo = new LinkedHashMap<>();

        palabrasMapeo.put("uno", 1);
        palabrasMapeo.put("dos", 2);
        palabrasMapeo.put("tres", 3);
        palabrasMapeo.put("cuatro", 4);
        // agrega un nuevo par key-valor en caso que la key no existe o este mapeada como null
        palabrasMapeo.putIfAbsent("cinco", 5);

        System.out.println(palabrasMapeo);
    }
}
