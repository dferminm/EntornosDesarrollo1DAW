package modelo.test;

import static org.junit.Assert.*;
import modelo.MathDaw1;

import org.junit.Test;

public class MathDaw1Test {

	@Test
	public void testIsPrimo2() {
		assertTrue(MathDaw1.isPrimo(2));
	}

	@Test
	public void testIsPrimo3() {
		assertTrue(MathDaw1.isPrimo(3));
	}
	
	@Test
	public void testIsPrimo8() {
		assertTrue(MathDaw1.isPrimo(8));
	}
	
	@Test
	public void testIsPrimo11() {
		assertTrue(MathDaw1.isPrimo(11));
	}
	
	@Test
	public void testIsPrimo13() {
		assertTrue(MathDaw1.isPrimo(13));
	}
}
