package Ejercicios;

import java.util.Scanner;

public class Ejercicio11part2 {
	
	/*Realiza un programa que permita ingresar un numero entero e indique si se trata de un numero par o impar*/
	
	public static Scanner input = new Scanner (System.in);	
	public static void main(String[] args) {
		
		int numero;
		
		System.out.println("Ingrese un numero");
		numero = Integer.parseInt(input.nextLine());
		
		if(numero%2 == 0)System.out.println("El numero es par");
		else if(numero%2 != 0) System.out.println("El numero es impar");
		
	}

}
