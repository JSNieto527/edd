package llhm;

import java.util.LinkedHashMap;

public class LLHMEjemplo2 {
    public static void main(String[] args) {
        LinkedHashMap<Integer, String> clientesMapeo = new LinkedHashMap<>();

        clientesMapeo.put(1001, "Lionel Messi");
        clientesMapeo.put(1002, "Luis Suarez");
        clientesMapeo.put(1003, "Sergio Busquets");
        clientesMapeo.put(1004, "Gerard Pique");
        clientesMapeo.put(1005, "Jordi Alba");

        System.out.println("Mapeo de Clientes Codigo + Nombres: " + clientesMapeo);

        // verifica si una key existe en el mapeo
        Integer codigoCliente = 1005;
        if(clientesMapeo.containsKey(codigoCliente)) {
            System.out.println("Cliente Encontrado: " + codigoCliente + " : " + clientesMapeo.get(codigoCliente));
        } else {
            System.out.println("Cliente no encontrado: " + codigoCliente);
        }

        // verifica si un valor existe en el mapeo
        String nombreCliente = "Lionel Messi";
        if(clientesMapeo.containsValue(nombreCliente)) {
            System.out.println("El cliente fue encontrado: " + nombreCliente);
        } else {
            System.out.println("Cliente no encontrado: " + nombreCliente);
        }

        // actualizacion de un valor asociado con una llave
        codigoCliente = 1004;
        clientesMapeo.put(codigoCliente, "Rafinha");
        System.out.println("Cambio en el nombre del cliente: " + codigoCliente + ", nuevo mapeo: " + clientesMapeo);
    }
}
//ejercicio de eliminar valores y de iteraciones