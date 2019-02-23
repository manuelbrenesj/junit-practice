package fooBarQix;

public class FooBarQix {

	public static String process(int number) {
		
		if(number % 3 == 0)
			return "FOO";
		if(number % 5 == 0)
			return "BAR";
		if(number % 7 == 0)
			return "QIX";
		if(number % 2 == 0)
			return "FOOBARQIX";
		if(number % 2 == 0 && number % 3 == 0 && number % 5 == 0 && number % 7 == 0)
			return "FOOBARQIX";
		
		return number+"";
	}
	
}