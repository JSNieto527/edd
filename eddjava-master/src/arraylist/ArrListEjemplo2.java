package arraylist;
/*
 * crea una arrList a partir de otro
 */
import java.util.ArrayList;
import java.util.List;

public class ArrListEjemplo2 {	
	public static void main(String[] args) {
		List<Integer> numerosPares = new ArrayList<>();
		numerosPares.add(0);
		numerosPares.add(2);		
		numerosPares.add(4);
		numerosPares.add(6);		
		numerosPares.add(8);		
		numerosPares.add(10);		
		System.out.println("ArrList Num Pares: "+numerosPares);		
		//segundo ArrayList
		List<Integer> numerosImpares = new ArrayList<>();		
		numerosImpares.add(1);		
		numerosImpares.add(3);				
		numerosImpares.add(5);
		numerosImpares.add(7);		
		numerosImpares.add(9);		
		numerosImpares.add(11);
		System.out.println("ArrList Num Impares: "+numerosImpares);				
		//combinacion de ArrayList
		numerosImpares.addAll(numerosPares);
		System.out.println("ArrList Combinados: "+numerosImpares);
	}

}
