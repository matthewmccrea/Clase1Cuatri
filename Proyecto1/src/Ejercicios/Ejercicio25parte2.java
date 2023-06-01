package Ejercicios;

import java.util.Scanner;

public class Ejercicio25parte2 {

	public static Scanner input = new Scanner(System.in);
	public static void main(String[] args) {
		int ancho,largo;
		
		/*.Realizá un programa que permita ingresar dos números enteros que representen el ancho y
el alto de una matriz de cruces. El programa debe dibujar dicha matriz.
*/
		System.out.println("Ingrese el ancho");
		ancho= Integer.parseInt(input.nextLine());
		System.out.println("Ingrese el largo");
		largo= Integer.parseInt(input.nextLine());
		
		for (int i = 0; i < ancho; i++) {
			for (int j = 0; j < largo; j++) {
				System.out.print("X");
				
			}
			System.out.println();
			
		}
		
		

	}

}
