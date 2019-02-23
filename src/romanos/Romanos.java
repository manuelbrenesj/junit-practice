

package romanos;

public class Romanos {

	public static int ingresarDato() {
		
		int dato = 0;
		int numero = 0;
		
		unDigito(numero);
		dosDigitos(numero);
		
		//Sistem.out.println(dosDigitos(numero));
		
		return dato;
		
	}
	
	public static String unDigito(int numero) {
		
		String numeroRomano = "";
		String[] lista = {"I","II","III","IV","V","VI","VII","VIII","IX"};
		
		for(int i=0; i<lista.length; i++) {
			
			if(numero == i) {
				numeroRomano = lista[i-1];
			}
		}
		return numeroRomano;
	}
	
	public static String dosDigitos(int numero) {
		
		String numeroRomanoA = "";
		String numeroRomanoB = "";
		String[] listaDecimal = {"","X","XX","XXX","XL","L","LX","LXX","LXXX","XC"};
		String[] listaUnidad = {"","I","II","III","IV","V","VI","VII","VIII","IX"};
		
		String numToString = Integer.toString(numero);
		String[] parte = numToString.split("");
		
		String dec = parte[0];
		int decimal = Integer.parseInt(dec);
		String uni = parte[1];
		int unidad = Integer.parseInt(uni);

		
		for(int i=0; i<listaDecimal.length; i++) {
			for(int j=0; j<listaUnidad.length; j++) {
				if(decimal == i && unidad == j ) {
					numeroRomanoA = listaDecimal[i];
					numeroRomanoB = listaUnidad[j];
				}
			}
		}
		return numeroRomanoA + numeroRomanoB;
	}
	
public static String tresDigitos(int numero) {
		
		String numeroRomanoA = "";
		String numeroRomanoB = "";
		String numeroRomanoC = "";
		String[] listaCentena = {"","C","CC","CCC","CD","D","DC","DCC","DCCC","CM"};
		String[] listaDecimal = {"","X","XX","XXX","XL","L","LX","LXX","LXXX","XC"};
		String[] listaUnidad = {"","I","II","III","IV","V","VI","VII","VIII","IX"};
		
		String numToString = Integer.toString(numero);
		String[] parte = numToString.split("");
		
		String cen = parte[0];
		int centena = Integer.parseInt(cen);
		String dec = parte[1];
		int decimal = Integer.parseInt(dec);
		String uni = parte[2];
		int unidad = Integer.parseInt(uni);

		
		for(int p=0; p<listaCentena.length; p++) {
			
			for(int j=0; j<listaDecimal.length; j++) {
				
				for(int i=0; i<listaUnidad.length; i++) {
					
					if(centena == 100) {
						numeroRomanoA = listaCentena[p];

						break;
						
					} else if(centena == p && decimal == j && unidad == i) {
						numeroRomanoA = listaCentena[p];
						numeroRomanoB = listaDecimal[j];
						numeroRomanoC = listaUnidad[j];
					}
				}
			}
		}
		return numeroRomanoA + numeroRomanoB + numeroRomanoC;
	}
	
}

