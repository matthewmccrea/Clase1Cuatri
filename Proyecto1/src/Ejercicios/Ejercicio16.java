package Ejercicios;

import java.util.Scanner;

public class Ejercicio16 {

	public static Scanner input = new Scanner (System.in);
	public static void main(String[] args) {
		/*Ingresa un programa que permita ingresar la cantidad de inscriptos a una conferencia y la cantidad de asientos disponibles. Debes indicar si alcanzan los asientos . Si no alcanzan 
		 * indicar cuantos asientos faltan*/
		
		int inscriptos, asientos,inscriptosMenosAsientos;
		
		System.out.println("Ingrese la cantidad de inscriptos");
		inscriptos = Integer.parseInt(input.nextLine());
		System.out.println("Ingrese la cantidad de asientos");
		asientos = Integer.parseInt(input.nextLine());
		inscriptosMenosAsientos = inscriptos-asientos;
		
		if (inscriptos<=asientos)System.out.println("Alcanzan los asientos para la cantidad de inscriptos");
		else if(inscriptos>asientos)System.out.println("No alcanzan los asientos para la cantidad de inscriptos, faltan "+inscriptosMenosAsientos+ " asientos");

	}

}
