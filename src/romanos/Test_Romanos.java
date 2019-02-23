package romanos;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class Test_Romanos {

	@Test
	public void testUnDigito() {
		
		int numero1 = 7;
		int numero2 = 10;
		
		String result1 = Romanos.unDigito(numero1);
		String result2 = Romanos.unDigito(numero2);
		
		assertEquals("VII",result1,"VII");
	}
	
	@Test
	public void testDosDigitos() {
		
		int numero1 = 15;
		int numero2 = 59;
		int numero3 = 90;
		
		String result1 = Romanos.dosDigitos(numero1);
		String result2 = Romanos.dosDigitos(numero2);
		String result3 = Romanos.dosDigitos(numero3);
		
		assertEquals("XV",result1,"XV");
		assertEquals("LIX",result2,"LIX");
		assertEquals("XC",result3,"XC");
	}
	
	@Test
	public void testTresDigitos() {
		
		int numero1 = 111;
		int numero2 = 500;
		int numero3 = 999;
	
		String result1 = Romanos.tresDigitos(numero1);
		String result2 = Romanos.tresDigitos(numero2);
		String result3 = Romanos.tresDigitos(numero3);
	
		assertEquals("CXI",result1,"CXI");
		assertEquals("D",result2,"D");
		assertEquals("CMXCIX",result3,"CMXCIX");

	}
}