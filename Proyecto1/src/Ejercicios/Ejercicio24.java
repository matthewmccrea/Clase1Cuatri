package Ejercicios;

import java.util.Scanner;

public class Ejercicio24 {

	public static Scanner input= new Scanner (System.in);
	public static void main(String[] args) {
	/*Realiza un programa que permita al usuario ingresar 2 numeros enteros num1 y num2, donde el primero siempre debera ser
	 * menor o igual al segundo. La computadora debe mostrar la secuencia de numeros existentes entre ambos:
	 * 
	 * Incluyendolos
	 * Excluyendolos*/

		int num1,num2,i;
		
		System.out.println("Ingrese el primer numero");
		num1 = Integer.parseInt(input.nextLine());
		System.out.println("Ingrese el segundo numero (Debe ser mayor que el primero)");
		num2 = Integer.parseInt(input.nextLine());
		
		for ( i = num1; i <= num2; i++) {
			System.out.println(i);
		}
		for ( i = num1+1; i <=num2-1; i++)  {
			System.out.println(i);
			
		}
	
		
	}

}
