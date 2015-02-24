package modelo;

public class MathDaw1 {

	public static boolean isPrimo(int n) {
		boolean esprimo = true;
		int contador = 2;
		
		while ((esprimo) && (contador!=n)){
		    if (n % contador == 0)
		      esprimo = false;
		    contador++;
		}
		    
		return esprimo;
		
		//probar que el método funciona para los valores 2, 3, 8, 11 y 13.
	}
}
