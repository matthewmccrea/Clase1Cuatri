package Ejercicios;

import java.util.Scanner;

public class Ejercicio18parte2 {

	public static Scanner input = new Scanner (System.in);
	public static void main(String[] args) {
		int num1,num2;
		
		/*Realizá un programa que permita al usuario ingresar dos números enteros. La computadora
debe indicar si el mayor es divisible por el menor. (Un número entero a es divisible por un
número entero b cuando el resto de la división entre a y b es 0.*/
		
		System.out.println("Ingrese el primer numero: ");
		num1= Integer.parseInt(input.nextLine());
		System.out.println("Ingrese el segundo numero: ");
		num2= Integer.parseInt(input.nextLine());
		
		if (num1>num2&&num1%num2==0) {
			System.out.println(num2 +" es mas grande que "+num1+ " y es divisible por "+num1);
			
		}
		if (num2>num1&&num2%num1==0) {
			System.out.println(num2 +" es mas grande que "+num1+ "y es divisible por "+num1);
			
		}
	}

}
