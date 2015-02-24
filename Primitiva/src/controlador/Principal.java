package controlador;

import modelo.BoletoPrimitiva;

public class Principal {

	public static void main(String[] args) {
		int aciertos;
		BoletoPrimitiva combinacionDavid = new BoletoPrimitiva(6);
		BoletoPrimitiva combinacionGanadora = new BoletoPrimitiva(6);
		combinacionDavid.imprimirCombinacion();
		System.out.println("");
		combinacionGanadora.imprimirCombinacion();
		aciertos = combinacionDavid.getAciertos(combinacionGanadora.getCombinacion());
		System.out.println("");
		System.out.println("Número de aciertos: " + aciertos);

	}

}
