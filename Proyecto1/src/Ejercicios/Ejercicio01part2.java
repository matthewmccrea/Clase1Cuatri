package Ejercicios;

import java.util.Scanner;

public class Ejercicio01part2 {

	
	public static Scanner input = new Scanner (System.in);
	public static void main(String[] args) {
		/*Realiza un programa que permita que el usuario ingrese su nombre. El programa debe emitir una salida con un mensaje de bienvenida que incluya el nombre del usuario*/
	
		String nombre;
		
		System.out.println("Ingrese su nombre");
		nombre = input.nextLine();
		
		System.out.println("Bienvenido "+nombre);
	}

}
