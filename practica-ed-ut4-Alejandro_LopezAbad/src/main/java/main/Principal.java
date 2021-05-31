package main;
import java.util.*;

import entity.Tienda;
import service.GenerarTienda;
import service.Servicio;
import simulador.Randoms;


public class Principal {
	
	 public static void main(String[] args) {
	
	Servicio serv =  new Servicio();
	GenerarTienda tienda1=new GenerarTienda();
	Tienda mercadona = tienda1.generaTienda();
	serv.margenBeneficio(mercadona);
	serv.nuevoPrecioMargenMenorDiez(mercadona);
	serv.beneficioTotal(mercadona);

	System.out.println("Array Precio:"+Arrays.toString(serv.creararraysPrecios(mercadona)));
	System.out.println("Array Costes:"+Arrays.toString(serv.creararraysCostes(mercadona)));
	System.out.println("Array Margen: " + Arrays.toString(mercadona.getMargenBeneficio()));
	System.out.println("Array Nuevo: " + Arrays.toString(mercadona.getPreciosActualizados()));
	System.out.println("Margen Maximo: " + serv.mayorMargenBeneficio(mercadona));
	System.out.println("Margen Minimo: " + serv.menorMargenBeneficio(mercadona));
	System.out.println("Id producto margen maximo: " + serv.obtenerIdproductoMargen(mercadona,serv.mayorMargenBeneficio(mercadona)));
	System.out.println("Id producto margen minimo: " + serv.obtenerIdproductoMargen(mercadona,serv.menorMargenBeneficio(mercadona)));
	System.out.println("Beneficio total: " + mercadona.getBeneficio());


	 }
}
