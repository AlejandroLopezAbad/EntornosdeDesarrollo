package service;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class GenerarTiendaTest {

	GenerarTienda mercadonaTest= new GenerarTienda();
	/**
	 * Este Test sirve para confirmar que se genera una tienda
	 * 
	 */
	@Test
	public void generarTiendaOk() {
		
		Assertions.assertEquals(20,mercadonaTest.generaTienda().getProductos().length);
		
	}		
}
