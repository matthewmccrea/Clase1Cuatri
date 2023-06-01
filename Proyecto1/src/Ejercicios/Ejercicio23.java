package Ejercicios;

import java.util.Scanner;

public class Ejercicio23 {

	public static Scanner input = new Scanner (System.in);
	public static void main(String[] args) {
		int n;
	/*Realiza un programa que permita ingresar un numero entero n. Debe mostrar los primeros 10 multiplos de n (desde 1xn)*/	
		
		System.out.println("Ingresa un numero entero");
		n = Integer.parseInt(input.nextLine());
		
		for (int i = 1; i <= 10; i++) {
			System.out.println(n*i);
			
			
		}
		
	}

}
