package Ejercicios;

import java.util.Scanner;

public class Ejercicio07parte2 {

	public static Scanner input = new Scanner (System.in);
	public static void main(String[] args) {
		double ancho,largo,valorMetroCuadrado, areaTerreno, valorTerreno, metrosCercado;
		
		/*Realizá un programa que permita ingresar el ancho y el largo de un terreno en metros y el
valor del metro cuadrado de tierra. Debe mostrarse el valor total del terreno y la cantidad de
metros de alambre para cercarlo completamente a tres alturas distintas.*/

		System.out.println("Ingresa el ancho del terreno: ");
		ancho= Double.parseDouble(input.nextLine());
		System.out.println("Ingresa el largo del terreno: ");
		largo= Double.parseDouble(input.nextLine());
		System.out.println("Ingresa el valor del metro cuadrado: ");
		valorMetroCuadrado= Double.parseDouble(input.nextLine());
		areaTerreno= ancho*largo;
		valorTerreno= valorMetroCuadrado*areaTerreno;
		metrosCercado=2*(ancho*largo);
		System.out.println("El area del terreno es de: "+areaTerreno);
		System.out.println("El valor del terreno es de: "+valorTerreno);
		System.out.println("La cantidad de metros para cercar el terreno es de: "+metrosCercado);
		
		
	}

}
