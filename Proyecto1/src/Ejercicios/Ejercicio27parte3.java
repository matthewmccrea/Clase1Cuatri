package Ejercicios;

import java.util.Scanner;

public class Ejercicio27parte3 {

	public static Scanner input = new Scanner (System.in);
	public static void main(String[] args) {
		int edad, acumuladorEdad=0,edadImparMayor18=0;
		
		/*Realiza un programa que permita ingresar 5 edades. Calcular y mostrar de todas las edades ingresadas y 
		 * cuantas edades fueron valores impares mayores que 18 */
		
		for (int i = 1; i <= 5; i++) {
			
		System.out.println("Ingrese edad numero "+i);
		edad=Integer.parseInt(input.nextLine());
		if (edad%2!=0&&edad>18) {
			edadImparMayor18++;
			}acumuladorEdad++;
		}
		System.out.println("La cantidad de edades impares y mayor a 18 son: "+edadImparMayor18);
		System.out.println("La cantidad de edades ingresadas son: "+acumuladorEdad);
		
		
	}

}
