package Ejercicios;

import java.util.Scanner;

public class Ejercicio28parte2 {

	public static Scanner input = new Scanner (System.in);
	public static void main(String[] args) {
		int edad,acumuladorEdad=0,promedio=0,edadImparMayor18=0,totalEdad=0;
		
		/*Realizá un programa que permita ingresar 5 edades. Calcular y mostrar el promedio de todas
las edades ingresadas y cuántas edades fueron valores impares mayores que 18.*/

		for (int i = 1; i <= 5 ; i++) {
			System.out.println("Ingresa la edad numero "+i);
			edad= Integer.parseInt(input.nextLine());
			if (edad%2!=0&&edad>18) {
				edadImparMayor18++;
			}
			
			acumuladorEdad++;
			totalEdad=totalEdad+edad; 
			promedio=totalEdad/acumuladorEdad;
			
		}
		
		System.out.println("El promedio de todas las edades es de: "+promedio+" %");
		System.out.println("La cantidad de edades impares mayores a 18 son: "+edadImparMayor18);
		
		
	}

}
