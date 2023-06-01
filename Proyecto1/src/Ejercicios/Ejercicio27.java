package Ejercicios;

import java.util.Scanner;

public class Ejercicio27 {

	public static Scanner input = new Scanner (System.in);
	public static void main(String[] args) {
		/*Realiza un programa que permita ingresar 5 edades. Calcular y mostrar de todas las edades ingresadas y 
		 * cuantas edades fueron valores impares mayores que 18 */

	int edad,acumuladorEdad=0, acumuladorEdad18Impar=0,promedio;
		
		
		
		for (int i = 1; i <= 5; i++) {
			do {
				System.out.println("Ingresa la edad "+i);
				edad = Integer.parseInt(input.nextLine());
				if (edad<1) {
					System.out.println("Ingrese una edad correcta");
				}
			} while (edad>1);
			acumuladorEdad=acumuladorEdad+edad;	
			if (edad>18&&edad%2!=0) {
				acumuladorEdad18Impar++;
			}
			
		}
		promedio = acumuladorEdad/5;
		System.out.println(acumuladorEdad18Impar);
		System.out.println("El promedio es de "+promedio);
	}

}


