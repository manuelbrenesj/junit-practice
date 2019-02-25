package cartas;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.ArrayList;

import org.junit.jupiter.api.Test;

public class Test_Cartas {

	@Test
	public void testCartas() {
		
		Cartas cartas = new Cartas();
		ArrayList<String> listaCartas = cartas.repartidor(4, 3);

		assertEquals(3, listaCartas.size(), "the carts were not dealed");
	}
}
