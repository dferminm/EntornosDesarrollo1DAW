package modelo.test;

import static org.junit.Assert.*;

import java.util.Arrays;
import java.util.Collection;

import modelo.Calculadora;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;

@RunWith(Parameterized.class)
public class CalculadoraTestParametrizado {
	private int num1;
	private int num2;
	private int result;
	
public CalculadoraTestParametrizado(int num1, int num2, int result) {
	this.num1 = num1;
	this.num2 = num2;
	this.result = result;
}
	
@Parameters(name="{index}: Dividir ({0} entre {1})={2}")
public static Collection<Object[]>casosPrueba(){
return Arrays.asList(new Object[][]{
{20,10,2},{30,15,2}
});
}

@Test
public void testDivide() {
	Calculadora calcu=new Calculadora(num1,num2);
	int resultado=calcu.divide();
	assertEquals(result,resultado);
}

}
