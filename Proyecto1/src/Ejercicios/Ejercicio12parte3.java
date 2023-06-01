package Ejercicios;

import java.util.Scanner;

public class Ejercicio12parte3 {

	public static Scanner input = new Scanner (System.in);
	public static void main(String[] args) {
		int num1,num2;
		
		/*Realizá un programa que permita ingresar dos números enteros e indique cuál de ellos es el
mayor. [EC]
*/

		System.out.println("Ingresa el primer numero: ");
		num1=Integer.parseInt(input.nextLine());
		System.out.println("Ingresa el segundo numero:");
		num2=Integer.parseInt(input.nextLine());
		
		if (num1>num2) {
			System.out.println("El primer numero es mas grande que el segundo numero");
			
		}else {
			System.out.println("El primer numero es mas chico que el segundo numero");
		}
	}

}
