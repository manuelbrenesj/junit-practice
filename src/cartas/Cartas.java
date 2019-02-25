package cartas;

import java.util.ArrayList;
import java.util.Random;

public class Cartas {

	static ArrayList<String> listaCartas = new ArrayList<>();
	
	static Random rand = new Random();

	public Cartas() {
		
		String[] palo = { "Diamantes", "Pica", "Corazones", "Espadas" };
		String[] cartasDeCaballeria = { "J", "Q", "K", "As" };
		
		//Este for 
		for (int i = 2; i < 11; i++) { // Numeros del 1 al 10
			for (int j = 0; j < palo.length; j++) { // Diamante, Pica, Corazon, Trebol
				listaCartas.add(String.valueOf(i) + " " + palo[j]); // 1.D,P,C,T - 2.D,P,C,T - 3.D,P,C,T - 4.D,P,C,T - 5.D,P,C,T - 6.D,P,C,T...  
			}
		}
		
		for (int i = 0; i < cartasDeCaballeria.length; i++) { // J, Q, K, AS
			for (int j = 0; j < palo.length; j++) { // Diamante, Pica, Corazon, Trebol
				listaCartas.add(cartasDeCaballeria[i] + " " + palo[j]);
			}
		}
		
		for(int p = 0; p < listaCartas.size(); p++) { // Imprimir
			System.out.println((p+1) + ". " + listaCartas.get(p));
		}
	}

	
	public ArrayList<String> repartidor(int nCartas, int mJugadores) {

		ArrayList<String> cartas = new ArrayList<String>();
		
		for (int i = 1; i <= mJugadores; i++) {
			String result = "Las cartas del jugador " + i + " son:\n";
			for (int j = 1; j <= nCartas; j++) {
				int n = rand.nextInt(listaCartas.size()); // Numero random en n que sea del largo de listaCartas
				String random = listaCartas.get(n); // Selecciona una carta random del maso
				result += random + "\n";
				System.out.println(n);
			}
			cartas.add(result);
		}
	
		return cartas;
	}
	
}
