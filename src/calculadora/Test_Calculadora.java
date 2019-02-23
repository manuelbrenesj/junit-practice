package calculadora;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class Test_Calculadora {

	@Test
	public void testReturn0() throws Throwable {
		
		String numbers1 = "1,2";
//		String numbers2 = "1,2,4";
		
		int result1 = Calculadora.Add(numbers1);
//		int result2 = Calculadora.Add(numbers2);
				
		assertEquals(3,result1,"Should return 3");		
		
//		Calculadora foo = new Calculadora();
//		Exception exception = assertThrows(Exception.class, () -> foo.Add(numbers2));
//		assertEquals("Máximo 2 números",result2 , exception.getMessage());
		
	}
	
}