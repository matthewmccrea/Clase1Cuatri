package Ejercicios;

import java.util.Scanner;

public class Ejercicio03parte2 {

	public static Scanner input = new Scanner (System.in);
	public static void main(String[] args) {
		int num1, multiplicacion,resultado;
		/*Realizá un programa que permita ingresar un número entero. Debe mostrarse el número
ingresado:
a. Multiplicado por 5.
b. Dividido por 2.
*/
		System.out.println("Ingrese un numero entero:");
		num1= Integer.parseInt(input.nextLine());
		multiplicacion= num1*5;
		resultado=multiplicacion/2;
		System.out.println("El resultado es: "+resultado);
	}

}
