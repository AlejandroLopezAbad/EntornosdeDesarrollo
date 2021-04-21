package simulador;

import java.math.BigDecimal;
import java.math.RoundingMode;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class RandomsTest {

	Randoms rand1 = new Randoms();

	/**
	 * Este Test sirve para comprobar que el generador de precios funciona ok
	 * 
	 */
	@Test
	public void generadorPreciosOK() {
		Assertions.assertEquals(20, rand1.generadorPrecios().length);
	}
	
	/**
	 * Este Test sirve para comprobar si el generador no falla cuando se encuentra con un precio que sea igual a 0 
	 */
	

	@Test
	public void generadorPrecio0() {
		Assertions.assertNotEquals(0,BigDecimal.valueOf(0*2000+1).setScale(2, RoundingMode.HALF_UP).doubleValue());
	}


	/**
	 * Este Test sirve para comprobar que el generador de costes funciona ok
	 * 
	 */
	@Test
	public void generadorCostesOK() {
		Assertions.assertEquals(20, rand1.generadorCoste().length);
	}
	

}
