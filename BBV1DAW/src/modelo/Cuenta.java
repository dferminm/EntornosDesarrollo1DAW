package modelo;

public class Cuenta {

	private double dineroInicial = 1200;
	private String nombre = "David";
	private int numeroCuenta;
	public double getDineroInicial() {
		return dineroInicial;
	}
	public void setDineroInicial(double dineroInicial) {
		this.dineroInicial = dineroInicial;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public int getNumeroCuenta() {
		return numeroCuenta;
	}
	public void setNumeroCuenta(int numeroCuenta) {
		this.numeroCuenta = numeroCuenta;
	}
}