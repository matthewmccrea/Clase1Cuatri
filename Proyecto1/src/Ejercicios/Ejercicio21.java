package Ejercicios;

import java.util.Scanner;

public class Ejercicio21 {

	public static Scanner input = new Scanner(System.in);
	public static void main(String[] args) {
	int numero;	
	
/*Realiza un programa que permita al usuario ingresar un numero entre 1 y 7. Debe mostrarse por pantalla el nombre del dia de la
* semana que representa tal numero tomando como el primer dia de la semana al domingo. De ingresar un numero fuera de rango 
* debe mostrar error
*/
	System.out.println("Ingresa un numero del 1 al 7");
	numero = Integer.parseInt(input.nextLine());
	if (numero<1||numero>7) {
		System.out.println("Numero fuera de rango");	
	}
	switch(numero) {
	
	case 1:
		System.out.println("Domingo");
		break;
		
	case 2:
		System.out.println("Lunes");
		break;
	case 3:
		System.out.println("Lunes");
		break;
	case 4:
		System.out.println("Lunes");
		break;
	case 5:
		System.out.println("Lunes");
		break;
	case 6:
		System.out.println("Lunes");
		break;
	case 7:
		System.out.println("Lunes");
		break;
	}
		
		
		
		
		
		
			}
		
	

}
