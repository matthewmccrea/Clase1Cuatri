package Ejercicios;

import java.util.Scanner;

public class Ejercicio25 {

	public static Scanner input = new Scanner (System.in);
	public static void main(String[] args) {
		/*Reliza un programa que permita ingresar dos nuemeros enteros que representen el ancho y largo de una matriz de 'x'.
		 * El programa debe dibujarla*/
		
		int numero1,numero2;
		


		System.out.println("Ingrese el primer numero");
		numero1 = Integer.parseInt(input.nextLine());
		System.out.println("Ingrese el segundo numero");
		numero2 = Integer.parseInt(input.nextLine());
		
		for (int i = 0; i < numero1; i++) {
			for (int j = 0; j < numero2; j++) {
				
				System.out.print("X");
				
			}
			System.out.println();
			
		}
		
	}

}
