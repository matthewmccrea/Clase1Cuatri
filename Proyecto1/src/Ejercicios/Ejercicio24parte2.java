package Ejercicios;

import java.util.Iterator;
import java.util.Scanner;

public class Ejercicio24parte2 {
	
	public static Scanner input = new Scanner(System.in);
	public static void main(String[] args) {
		int num1,num2;
		
	/*Realizá un programa que permita al usuario ingresar dos números enteros num1 y num2,
donde el primero siempre deberá ser menor o igual al segundo. La computadora debe
mostrar la secuencia de números existentes entre ambos:
a. Incluyéndolos;
b. Excluyéndolos.
*/
		System.out.println("Ingrese el primer numero: ");
		num1= Integer.parseInt(input.nextLine());
		System.out.println("Ingrese el segundo numero: ");
		num2= Integer.parseInt(input.nextLine());
		
		for (int i = num1; i <= num2; i++) {
			System.out.println("Incluyendolos: "+i);
		}for (int i = num1+1; i <=num2-1 ; i++) {
			System.out.println("Excluyendolos: "+i);
			
		}
	}

}
