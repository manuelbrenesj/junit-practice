package calculadora;

public class Calculadora {
	

    public static void main(String[] args) throws Exception {
        
        System.out.println(String.valueOf(Add("1,44444")));
        
    }

    public static int Add(String numbers) throws Exception {
        
    	int resultado = 0; 
    	
        // aqui se valida que la cadena no sea nula o esta vacía, y retorna 0 si se cumple
        if (numbers == null || numbers.equals("")) {
            return 0;
        }
         // dispara un error el separador no es coma
        if (!numbers.contains(",")) {
            throw new Exception("El separador debe de ser coma");
        }
        
        // separa los números que estan entre las comas
        String[] numObtenidos = numbers.split(",");

        // dispara un error si son más de 2 números
        if (numObtenidos.length > 2) {
            throw new Exception("Máximo 2 números");
        }

        int num1 = 0;
        int num2 = 0;

        switch (numObtenidos.length) {
            case 1:
                num1 = Integer.parseInt(numObtenidos[0]);
                resultado = num1;
                break;
            case 2:
                num1 = Integer.parseInt(numObtenidos[0]);
                num2 = Integer.parseInt(numObtenidos[1]);
                resultado = num1 + num2;
                break;
            default:
                resultado = 0;
                break;
        }

        return resultado;
    }

}