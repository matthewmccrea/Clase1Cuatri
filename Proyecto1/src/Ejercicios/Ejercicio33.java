package Ejercicios;

import java.util.Scanner;

public class Ejercicio33 {

	public static Scanner input = new Scanner (System.in);
	public static void main(String[] args) {
		int numero=0;
		
		/*Realizá un programa que permita al usuario ingresar números hasta que se introduzca un 0.
La computadora debe mostrar el número máximo y el número mínimo.*/

		do {System.out.println("Ingresa un numero.Ingresa (0) para terminar");
			numero=Integer.parseInt(input.nextLine());
			
		
			
		} while (numero!=0);
	}

}
