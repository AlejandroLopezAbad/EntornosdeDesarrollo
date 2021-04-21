package simulador;
import entity.*;
import service.GenerarTienda;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class Randoms {
	static int maxPrecio=2000;
	static int maxCoste=1000;
	int longitud=20;

	 // Genera precio random entre 0 y 2000
	
	
	
	
	/**
	 * 
	 * Metodo que genera precios aleatorios entre 0 y 2000 y los carga en un array
	 * @return arrayPrecios
	 */
  public double[]generadorPrecios() {
	  double[] arrayPrecios = new double[GenerarTienda.getNumProductos()];
	  
	    for (int i = 0; i < arrayPrecios.length; i++) {
        arrayPrecios[i] = BigDecimal.valueOf(Math.random() * 2000+1).setScale(2, RoundingMode.HALF_UP).doubleValue();
    
    }
	  return arrayPrecios;
  }
  
  // Genera coste random entre 0 y 1000
  
  /**
	 * 
	 * Metodo que genera costes aleatorios entre 0 y 1000 y los carga en un array
	 * @return arrayCoste
	 */
 
   public double[]generadorCoste(){
	   
	   double[] arrayCoste = new double[GenerarTienda.getNumProductos()];
	   
    for (int i = 0; i < arrayCoste.length; i++) {
        arrayCoste[i] = BigDecimal.valueOf(Math.random() * 1000).setScale(2, RoundingMode.HALF_UP).doubleValue();
    }
    return arrayCoste;

}
}
