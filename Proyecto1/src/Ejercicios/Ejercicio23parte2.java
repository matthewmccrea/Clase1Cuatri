package Ejercicios;

import java.util.Iterator;
import java.util.Scanner;

public class Ejercicio23parte2 {

	public static Scanner input = new Scanner(System.in);
	public static void main(String[] args) {
		int n;
		
		/*Realizá un programa que permita ingresar un número entero n. Debe mostrar los primeros
10 múltiplos de n (desde 1 x n).*/
		System.out.println("Ingrese un numero");
		n=Integer.parseInt(input.nextLine());
		
		for (int i = 1; i <= 10; i++) {
			System.out.println(n*i);
			
		}
	}

}
