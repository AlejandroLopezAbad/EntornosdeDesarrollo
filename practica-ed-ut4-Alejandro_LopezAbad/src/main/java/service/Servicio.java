package service;

import java.math.BigDecimal;
import java.math.RoundingMode;

import entity.Producto;
import entity.Tienda;
import simulador.*;

public class Servicio {

	Randoms random = new Randoms();
	Tienda tienda = new Tienda();

	
	public Servicio() {

	}
/**
 * Es un método donde cargamos el margen de beneficio y lo retornamos para conseguir un valor que tiene como parametro de entrada un objeto tienda
 * @param tienda
 * @return arrayMargenes
 */
	// Operaciones
	

	public double[] margenBeneficio(Tienda tienda) {

		double[] arrayMargenes = new double[tienda.getProductos().length];

		for (int i = 0; i < tienda.getProductos().length; i++) {
			arrayMargenes[i] = BigDecimal
					.valueOf(((tienda.getProductos()[i].getPrecio() - tienda.getProductos()[i].getCoste())
							/ tienda.getProductos()[i].getPrecio()) * 100)
					.setScale(2, RoundingMode.HALF_UP).doubleValue();
		}
		tienda.setMargenBeneficio(arrayMargenes);
		return arrayMargenes;
	}

	/**
	 * Metodo que calcula el mayor margen de beneficio de la tienda que tiene como parametro de entrada un objeto tienda
	 * @param tienda
	 */
	
	public double mayorMargenBeneficio(Tienda tienda) {
        // double postEval = Double.MIN_VALUE;
		
        double aux = Double.MIN_VALUE;
        double margenMayor=0;
        for (int i = 0; i < tienda.getMargenBeneficio().length; i++) {
            double margenMayorTemporal = tienda.getMargenBeneficio()[i];
            if (margenMayorTemporal > aux) {
                aux = margenMayorTemporal;
               margenMayor=margenMayorTemporal;
             
            }
        }return margenMayor;
    }
	/**
	 * Metodo que compara el double margen con los almacenados en el array margenesBeneficio[] si encuentra una coincidencia retorna el idpructo
	 * @param tienda Tienda
	 * @param margen double
	 * @return el id del producto
	 */
	
	public int obtenerIdproductoMargen(Tienda tienda,double margen) {
		
		for (int i =0;i<tienda.getProductos().length;i++) {
			
			if(margen==tienda.getMargenBeneficio()[i]) {
				
				return tienda.getProductos()[i].getIdproducto();
			}
			
		}return 0;
		
	}
		
/**
 * Metodo que calcula el menor margen de beneficio de una tienda que tiene como parametro de entrada un objeto tienda
 * @param tienda
 */
    
    public double menorMargenBeneficio(Tienda tienda) {
        double aux = Double.MAX_VALUE;
        double margenMenor=0;
        // double postEval = Double.MAX_VALUE;

        for (int i = 0; i < tienda.getMargenBeneficio().length; i++) {
            double margenMenorTemporal = tienda.getMargenBeneficio()[i];
            if (margenMenorTemporal < aux) {
                aux = margenMenorTemporal;
               margenMenor=margenMenorTemporal;
                
          
            }
        }return margenMenor;
    }
    

/**
 * metodo que calcula el nuevo precio de un producto si su margen es de almenos 10% que tiene como parametro de entrada un objeto tienda
 * @param tienda
 * @return arrayNuevoPrecio
 */
	
	// tengan al menos un margen del 10%
	public double[] nuevoPrecioMargenMenorDiez(Tienda tienda) {
		// declaro la variable para el 10% evitando magic numbers
		int porcentajeBeneficioPequenio = 10;
		double fraccionPorcentaje = 0.1;
		double[] arrayNuevoPrecio = new double[tienda.getProductos().length];
		for (int i = 0; i < tienda.getMargenBeneficio().length; i++) {
			if (tienda.getMargenBeneficio()[i] < porcentajeBeneficioPequenio) {
				arrayNuevoPrecio[i] = BigDecimal
						.valueOf((tienda.getProductos()[i].getCoste() / (1 - fraccionPorcentaje)))
						.setScale(2, RoundingMode.HALF_UP).doubleValue();
			}
		}
		tienda.setPreciosActualizados(arrayNuevoPrecio);
		return arrayNuevoPrecio;
	}

	/**
	 * Es un metodo que calcula el Beneficio total de la tienda, que tiene como parametro de entrada un objeto tienda
	 * @param tienda
	 * @return beneficios
	 */
	
	
	public double beneficioTotal(Tienda tienda) {
		double beneficio = tienda.getBeneficio();
		for (int i = 0; i < tienda.getProductos().length; i++) {
			beneficio = BigDecimal
					.valueOf(beneficio + (tienda.getProductos()[i].getPrecio() - tienda.getProductos()[i].getCoste()))
					.setScale(2, RoundingMode.HALF_UP).doubleValue();
		}
		tienda.setBeneficio(beneficio);
		return beneficio;
	}

	/**
	 * Es un metodo intermedio que hemos utilizado para poder imprimir preciosy tiene como parametro de entrada un objeto tienda
	 * 
	 * @param tienda
	 * @return precios
	 */

	public double[] creararraysPrecios(Tienda tienda) {
	
double[]precios= new double[tienda.getProductos().length];
	
for (int i = 0; i < tienda.getProductos().length; i++) {
	
	precios[i]=tienda.getProductos()[i].getPrecio(); 
}
	return precios;
}


/**
 * Es un meotodo intermedio que hemos utilizado para poder imprimir los costes y tiene como parametro de entrada un objeto tienda
 * @param tienda
 * @return costes
 */

	public double[] creararraysCostes(Tienda tienda) {
	
	double[]costes= new double[tienda.getProductos().length];
		
	for (int i = 0; i < tienda.getProductos().length; i++) {
		
		costes[i]=tienda.getProductos()[i].getCoste(); 
	}
	return costes;
	}





 
 
 }
 
	

