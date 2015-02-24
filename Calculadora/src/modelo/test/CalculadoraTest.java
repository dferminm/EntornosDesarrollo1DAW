package modelo.test;

import static org.junit.Assert.*;
import modelo.Calculadora;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;

public class CalculadoraTest {
	private static Calculadora calculadora;
	private int resultado;
	
	@BeforeClass
	public static void crearCalculadora() {
		calculadora = new Calculadora(20, 10);
	}
	@AfterClass
	public static void borrarCalculadora() {
		calculadora = null;
	}
	
	@Test
	public void testSuma() {
		//Calculadora calculadora = new Calculadora(10, 7);
		resultado = calculadora.suma();
		assertEquals(30, resultado);
	}

	@Test
	public void testResta() {
		//Calculadora calculadora = new Calculadora(16, 6);
		resultado = calculadora.resta();
		assertEquals(10, resultado);
	}

	@Test
	public void testMultiplica() {
		//Calculadora calculadora = new Calculadora(6, 2);
		resultado = calculadora.multiplica();
		assertEquals(200, resultado);
	}

	@Test
	public void testDivide() {
		//Calculadora calculadora = new Calculadora(16, 2);
		resultado = calculadora.divide();
		assertEquals(2, resultado);
	}

}
