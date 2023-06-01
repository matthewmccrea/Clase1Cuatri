package Ejercicios;

import java.util.Scanner;

public class Ejercicio03 {
	
	public static Scanner input = new Scanner(System.in);
	
	public static void main(String[] args) {
		/*Realizá un programa que permita ingresar un número entero. Debe mostrarse el número
		ingresado:
		a. Multiplicado por 5.
		b. Dividido por 2.*/

	int numero1;
	int numero2;
	
	System.out.println("Ingrese un numero");
	numero1 = Integer.parseInt(input.nextLine());
	numero2 = numero1*5/2;
	
	System.out.println("Tu numero es el " + numero2);
	

}
}