
package service;

import entity.Producto;
import entity.Tienda;
import simulador.Randoms;


public class GenerarTienda {
	
	Randoms random = new Randoms();
	public final static int NUM_PRODUCTOS=20;

	/**
	 *  Es un método que genera un array de productos, los cuales han sido obtenidos con la ayuda de otros metodos {@link Randoms} y se introduce como un producto a la tienda
	 * @return tienda
	 */
	public Tienda generaTienda() {
		
		Tienda tienda = new Tienda();
		
		Producto[] productos = new Producto[ NUM_PRODUCTOS];
		double [] precios= random.generadorPrecios();
		double[] costes=random.generadorCoste();
		
		for (int i = 0; i < productos.length; i++) {
			Producto producto = new Producto();
			producto.setPrecio(precios[i]);
			producto.setCoste(costes[i]);
			productos[i] = producto;
		}
		tienda.setProductos(productos);
		return tienda;
	}
	
	/**
	 * Getter de un Int que es constante
	 * @return NUM_PRODUCTOS
	 */
		public static int getNumProductos() {
			return NUM_PRODUCTOS;
		}
	
	
	
	
	
}