package Ejercicios;

import java.util.Scanner;

public class Ejercicio21parte2 {
	
	public static Scanner input = new Scanner(System.in);
	public static void main(String[] args) {
		int num;
		
		/*.Realizá un programa que permita al usuario ingresar un número entero entre 1 y 7. Debe
mostrarse por pantalla el nombre del día de la semana que representa tal número tomando
como el primer día de la semana el Domingo. De ingresar un número fuera de rango debe
mostrar error.*/
		System.out.println("Ingrese un numero");
		num=Integer.parseInt(input.nextLine());
		
		switch (num) {
		case 1:
			System.out.println("Domingo");
			
			break;
		case 2:
			System.out.println("Lunes");
					
			break;
		case 3:
			System.out.println("Martes");
			
			break;
		case 4:
			System.out.println("Miercoles");
			
			break;
		case 5:
			System.out.println("Jueves");
			
			break;
		case 6:
			System.out.println("Viernes");
			
			break;
		case 7:
			System.out.println("Sabado");
			
			break;

		default:
			System.out.println("Numero invalido");
			break;
		}

	}

}
