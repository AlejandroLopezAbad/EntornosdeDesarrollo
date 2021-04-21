package entity;

public class Producto {
	//Hemos creado un contador para saber cuantos objetos se han creado, entonces lo igualaremos al idproducto creado para este idproducto poder modificarlo, lo modificaremos con los getter y setter
	//creados para poder cambiar el idproducto si queremos y que el contador no se vea afectado.
	private static int contador;
	private int idproducto;
	private double precio;
	private double coste;

	/**
	 * Constructor por defecto donde los valores han sido iniciados a 0. El
	 *              idproducto se ire incrementando en 1 cada vez que se llame al
	 *              metodo.
	 */
	public Producto() {
		contador++;
		idproducto=contador;
		precio = 0;
		coste = 0;
		
	}

	/**
	 * Constructor donde precio y coste son metodos de entrada
	 * @param precio
	 * @param coste
	 */
	
	public Producto(double precio, double coste) {
		contador++;
		this.precio = precio;
		this.coste = coste;
		idproducto=contador;
	
	}
	/**
	 * Getter de la variable contador
	 * 
	 * @return contador
	 */
	public static int getContador() {
		return contador;
	}


	/**
	 * Getter de la variable idproducto
	 * 
	 * @return idproducto
	 */

	public int getIdproducto() {
		return idproducto;
	}

	/**
	 * setter que carga un valor int a idproducto
	 * 
	 * @param idproducto
	 */
	public void setIdproducto(int idproducto) {
		this.idproducto = idproducto;
	}

	/**
	 * Getter de la variable Precio
	 * 
	 * @return Precio
	 */

	public double getPrecio() {
		return precio;
	}

	/**
	 * Setter que carga un valor double a precio
	 * 
	 * @param precio
	 */

	public void setPrecio(double precio) {
		this.precio = precio;
	}

	/**
	 * Getter de la variable Coste
	 * 
	 * @return coste
	 */

	public double getCoste() {
		return coste;
	}

	/**
	 * Setter que carga un valor double a Coste
	 * 
	 * @param coste
	 */
	public void setCoste(double coste) {
		this.coste = coste;
	}
}
