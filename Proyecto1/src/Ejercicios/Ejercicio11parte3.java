package Ejercicios;

import java.util.Scanner;

public class Ejercicio11parte3 {

	public static Scanner input = new Scanner (System.in);
	public static void main(String[] args) {
		int num1,esImpar;
		
		/*.Realizá un programa que permita ingresar un número entero e indique si se trata de un
número par o impar*/
		System.out.println("Ingresa un numero para averiguar si es par o impar: ");
		num1=Integer.parseInt(input.nextLine());
		if (num1%2!=0) {
			System.out.println("El numero ingresado es impar");
			
		}else {
			System.out.println("El numero ingresado es par");
		}

	}

}
