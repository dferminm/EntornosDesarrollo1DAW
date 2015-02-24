package poo;

public class UsoCoche {

	public static void main(String[] args) {
		
		Coche micoche = new Coche();
		
		micoche.estableceColor("verde");
		
		System.out.println(micoche.dimeDatosGenerales());
		
		System.out.println(micoche.dimeColor());
		
		micoche.configuraAsientos("si");
		
		System.out.println(micoche.dimeAsientos());

	}

}
