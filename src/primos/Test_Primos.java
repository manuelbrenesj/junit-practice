package primos;

import static org.junit.jupiter.api.Assertions.assertEquals;
import java.util.ArrayList;
import org.junit.jupiter.api.Test;

public class Test_Primos {

	@Test
	public void testFactoresPrimos() {
		
		int numero1 = 3;
		
		ArrayList<Integer> result1 = Primos.factoresPrimos(numero1);
		
		System.out.println(result1);	
		assertEquals("[3]",result1.toString(),"Debe traer un numero");
	}
}
