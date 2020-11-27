package LaPrueba;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class testPrueba {

	@Test
	public void testPrueba() {
		Prueba1 p = new Prueba1();
		String resultado = p.aleatorio(3);
		String resultadoEsperado = "mayor";
		assertEquals(resultado, resultadoEsperado);
	}
	@Test
	public void testPrueba2() {
		Prueba1 p = new Prueba1();
		String resultado = p.aleatorio(13);
		String resultadoEsperado = "menor";
		assertEquals(resultado, resultadoEsperado);
	}
}
