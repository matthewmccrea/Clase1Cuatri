package Ejercicios;

import java.util.Scanner;

public class Ejercicio34 {

	public static Scanner input = new Scanner (System.in);
	public static void main(String[] args) {
		double estatura=0,promedio,totalEstaturas=0;
		String nombre;
		final int FIN=0;
		int acumuladorCantJugadores=0;
		
		/*Realizá un programa que permita ingresar la estatura (en metros con decimales) de cada
jugador de un equipo de baloncesto. La carga finalizará al ingresar cero. Calcular y mostrar la
estatura promedio del equipo.*/
		
		do {System.out.println("Ingrese su nombre");
			nombre= input.nextLine();
			System.out.println("Ingrese su estatura");
			estatura= Double.parseDouble(input.nextLine());
			acumuladorCantJugadores++;
			totalEstaturas= estatura+totalEstaturas;
			
		
			
		} while (estatura!=0);
		promedio=totalEstaturas/acumuladorCantJugadores;
		System.out.println("El promedio de estatura del equipo es de: "+promedio);
		
	}

}
