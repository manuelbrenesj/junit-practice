package primos;

import java.util.ArrayList;

public class Primos {

	public static ArrayList<Integer> factoresPrimos(int numero) {
		
		ArrayList<Integer> dato = new ArrayList<>();
		int i = 2;
		
		do {
			if(numero % i == 0) {
				numero = (numero / i);
				dato.add(i);
			} else {
				i++;
			}
		} while (i <= numero);
		
		return dato;
	}
	
}