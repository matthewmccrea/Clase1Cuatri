package Ejercicios;

import java.util.Scanner;

public class Ejercicio35 {

	public static Scanner input = new Scanner (System.in);
	public static void main(String[] args) {
		String nombre;
		int edad=0;
		final char FIN='*';
		
		/*Realizá un programa que permita ingresar nombre y edad de un grupo de personas (para
cada una, nombre y edad). La carga termina cuando en el nombre de la persona se ingresa un
asterisco ('*'). Mostrar al final cómo se llama la persona más joven*/

		do {System.out.println("Ingrese su nombre");
			nombre=input.nextLine();
			System.out.println("Ingrese su edad");
			edad = Integer.parseInt(input.nextLine());
			
		} while (edad!=FIN);
	}

}
