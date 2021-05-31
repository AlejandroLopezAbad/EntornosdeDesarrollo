package entity;

import service.GenerarTienda;

public class Tienda {

	private Producto[] productos;
	private double[] margenBeneficio;
	private double[] preciosActualizados;
	private double beneficio;

/**
 * constructor por defecto de tienda con unos valores cargados
 */
	public Tienda() {
		productos = new Producto[GenerarTienda.getNumProductos()];
		margenBeneficio = new double[GenerarTienda.getNumProductos()];
		beneficio = 0;
		
		preciosActualizados = new double[GenerarTienda.getNumProductos()];
	}
	/**
	 * Getter del array  producto
	 * 
	 * @return idproducto
	 */
	public Producto[] getProductos() {
		return productos;
	}
/**
 * Setter que carga un un valor Producto[] 
 * @param productos
 */
	public void setProductos(Producto[] productos) {
		this.productos = productos;
	}
	/**
	 * Getter de la variable beneficio
	 * 
	 * @return beneficio
	 */
	public double getBeneficio() {
		return beneficio;
	}
	/**
	 * Setter que carga un valor double a la variable beneficio
	 * @param beneficio
	 */
	public void setBeneficio(double beneficio) {
		this.beneficio = beneficio;
	}

/**
 * Getter de un double[] de margen de beneficio
 * @return margenBeneficio
 */
	public double[] getMargenBeneficio() {
		return margenBeneficio;
	}

	/**
	 * Setter que carga un valor double[] en margenBeneficio
	 * @param margenBeneficio
	 */
	public void setMargenBeneficio(double[] margenBeneficio) {
		this.margenBeneficio = margenBeneficio;
	}
/**
 * Getter de un double[] de precios actualizados
 * @return preciosActualizados
 */
	public double[] getPreciosActualizados() {
		return preciosActualizados;
	}
	/**
	 * Setter que carga un double[] a precios actualizados
	 * @param preciosActualizados
	 */
	public void setPreciosActualizados(double[] preciosActualizados) {
		this.preciosActualizados = preciosActualizados;
	}


}