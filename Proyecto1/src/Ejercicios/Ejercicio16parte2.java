package Ejercicios;

import java.util.Scanner;

public class Ejercicio16parte2 {

	public static Scanner input = new Scanner (System.in);
	public static void main(String[] args) {
		int cantidadDeInscriptos, cantidadDeAsientos, asientosFaltantes;
		
		/*Realizá un programa que permita ingresar la cantidad de inscriptos a una conferencia y la
cantidad de asientos disponibles en el auditorio. Debes indicar si alcanzan los asientos, Si los
asientos no alcanzaran indicar cuántos faltan para que todos los inscriptos puedan sentarse.*/

		System.out.println("Indica la cantidad de inscriptos:");
		cantidadDeInscriptos=Integer.parseInt(input.nextLine());
		System.out.println("Indica la cantidad de asientos: ");
		cantidadDeAsientos= Integer.parseInt(input.nextLine());
		asientosFaltantes=cantidadDeAsientos-cantidadDeInscriptos;
		if (cantidadDeInscriptos>cantidadDeAsientos) {
			System.out.println("Los cantidad de asientos no es suficiente para la cantidad de inscriptos. Faltan "+asientosFaltantes+" asientos");
			
		}else {
			System.out.println("Alcanzan los asientos");
		}
	}

}
