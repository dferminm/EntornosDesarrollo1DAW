package poo;

public class Coche {

	private int ruedas;
	private int largo;
	private int ancho;
	private int motor;
	private int pesoPlataforma;
	private String color;
	private int pesoTotal;
	private boolean asientosCuero, climatizador;
	
	public Coche() {
		ruedas = 4;
		largo = 2000;
		ancho = 300;
		motor = 1600;
		pesoPlataforma = 500;
	}
	
	public String dimeDatosGenerales() { //metodo getter.
		 
		return "La plataforma del vehículo tiene " + ruedas + " ruedas." + 
		" Mide " + largo/1000 + " metros, con un ancho de " + ancho + " cm y un peso de plataforma de " +
		pesoPlataforma + " kg.";
	}
	
	public void estableceColor(String colorCoche) { //metodo setter.
		
		color = colorCoche;
	}
	
	public String dimeColor() {
		
		return "El color del coche es " + color;
	}
	
	public void configuraAsientos(String asientosCuero) {//metodo setter.
		
		if(asientosCuero == "si") {
			this.asientosCuero = true;
		}else{
			this.asientosCuero = false;
		}
	}
	
public String dimeAsientos() {//metodo getter.
		
		if(asientosCuero == true) {
			return "El coche tiene asientos de cuero";
		}else{
			return "El coche no tiene asientos de cuero";
		}
	}
}
