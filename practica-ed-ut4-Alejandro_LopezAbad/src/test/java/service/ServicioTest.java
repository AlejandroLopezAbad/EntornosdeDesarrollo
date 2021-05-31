package service;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import entity.Producto;
import entity.Tienda;

public class ServicioTest {

	Servicio servTest = new Servicio();
	Tienda tiendaTest = new Tienda();

	/*
	 * Test para comprobar que la salida del margen de beneficios sea Ok
	 * 
	 */
	@Test
	public void margenBeneficioSalidaOK() {
		Producto prodTest1 = new Producto(2, 2);
		Producto prodTest2 = new Producto(2, 2);
		Producto prodTest3 = new Producto(2, 2);
		Producto[] productos = { prodTest1, prodTest2, prodTest3 };
		tiendaTest.setProductos(productos);
		Assertions.assertEquals(3, servTest.margenBeneficio(tiendaTest).length);
		
	}

	/**
	 * Test para comprobar que el calculo de margen de beneficio este ok
	 * 
	 */
	@Test
	public void margenBeneficioCalculoOk() {
		Producto prodTest1 = new Producto(90, 45);
		Producto[] productos = { prodTest1 };
		tiendaTest.setProductos(productos);
		Assertions.assertEquals(50.0, servTest.margenBeneficio(tiendaTest)[0]);
	}
	
	/**
	 * Test para comprobar que un margen beneficio puede dar cero
	 */
	@Test
	public void margenBeneficioNulo() {
		Producto prodTest1 =new Producto(15,15);
		Producto [] productos= {prodTest1};
		tiendaTest.setProductos(productos);
		Assertions.assertEquals(0.0, servTest.margenBeneficio(tiendaTest)[0]);
	}

	
	/**
	 * Test para comprobar que el calculo del mayor margen de beneficio este ok
	 * 
	 */
	@Test
	public void mayorMargenBeneficioCalculoOk() {
		double[] margenes = {100.0,85.0,50.0};
		tiendaTest.setMargenBeneficio(margenes);
		Assertions.assertEquals(100.0,servTest.mayorMargenBeneficio(tiendaTest));
		}
	
	
		/**
		 * Test para comprobar que el calculo del menor margen de beneficio este ok
		 * 
		 */
	@Test
	public void menorMargenBeneficioCalculoOk() {
		double[] margenes = {85.0,40.0,50.0};
		tiendaTest.setMargenBeneficio(margenes);
		Assertions.assertEquals(40.0,servTest.menorMargenBeneficio(tiendaTest));
	}
	

	/**
	 * Test para comprobar que el idproducto se obtenga bien
	 * 
	 */
	@Test
	public void obtenerIdproductoOK() {
		Producto prodTest1 = new Producto();
		Producto prodTest2 = new Producto();
		Producto prodTest3 = new Producto();
		Producto[] productos = { prodTest1, prodTest2, prodTest3 };
		tiendaTest.setProductos(productos);
		double[] margenes = {85.0,40.0,50.0};
		tiendaTest.setMargenBeneficio(margenes);
		Assertions.assertEquals(3,servTest.obtenerIdproductoMargen(tiendaTest, 50.0));
	
		
	}
	
	/**
	 * Test para comprobar que el idprodcucto no es encontrado
	 * 
	 */
	@Test
	public void obtenerIdproductoNoEncontrado() {
		Producto prodTest1 = new Producto();
		Producto prodTest2 = new Producto();
		Producto prodTest3 = new Producto();
		Producto[] productos = { prodTest1, prodTest2, prodTest3 };
		tiendaTest.setProductos(productos);
		double[] margenes = {85.0,40.0,50.0};
		tiendaTest.setMargenBeneficio(margenes);
		Assertions.assertEquals(0,servTest.obtenerIdproductoMargen(tiendaTest, 15.0));		
	}
	
	/**
	 * Test para comprobar que el calculo del nuevo precio este ok
	 * 
	 */
	@Test
	public void nuevoPrecioCalculoOk() {
		Producto prodTest1 = new Producto();
		Producto prodTest2 = new Producto();
		Producto[] productos = { prodTest1, prodTest2};
		tiendaTest.setProductos(productos);
		double[] margenes = {85.0,5.0};
		tiendaTest.setMargenBeneficio(margenes);
		Assertions.assertNotEquals(5.0, servTest.nuevoPrecioMargenMenorDiez(tiendaTest)[1]);
		

	}

	/**
	 * 
	 * Test para comprobar que el calculo total de beneficio este ok
	 * 
	 */
	@Test
	public void beneficioTotalCalculoOK() {
		Producto prodTest1 = new Producto(95, 45);
		Producto prodTest2 = new Producto(90, 30);
		Producto[] productos = { prodTest1, prodTest2};
		tiendaTest.setProductos(productos);

		Assertions.assertEquals(110.0, servTest.beneficioTotal(tiendaTest));

	}

	/**
	 * Test para comprobar que el length del array es igual al creado
	 * 
	 */
	@Test
	public void crearArrayPreciosOk() {
		Producto prodTest1 = new Producto();
		Producto prodTest2 = new Producto();
		Producto prodTest3 = new Producto();
		Producto[] productos = { prodTest1, prodTest2, prodTest3 };
		tiendaTest.setProductos(productos);
		Assertions.assertEquals(3,servTest.creararraysPrecios(tiendaTest).length);

	}

	/**
	 * Test para comprobar que el length del array es igual al creado
	 * 
	 * 
	 */
	@Test
	public void crearArrayCostesOk() {
		Producto prodTest1 = new Producto();
		Producto prodTest2 = new Producto();
		Producto prodTest3 = new Producto();
		Producto[] productos = { prodTest1, prodTest2, prodTest3 };
		tiendaTest.setProductos(productos);
		Assertions.assertEquals(3,servTest.creararraysCostes(tiendaTest).length);
		
	}
	

}
