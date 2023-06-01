package Ejercicios;

import java.util.Scanner;

public class Ejercicio05parte2 {

	public static Scanner input = new Scanner (System.in);
	public static void main(String[] args) {
		int num1,num2,temp;
		
		/*Realizá un programa que permita ingresar valores del mismo tipo para las variables num1 y
num2. Una vez cargadas, mostrar ambas variables por pantalla, intercambiá sus valores (que
lo cargado en num1 quede en num2, y viceversa) y volvé a mostrarlas actualizadas.*/

		System.out.println("Ingresa el primer valor: ");
		num1= Integer.parseInt(input.nextLine());
		System.out.println("Ingresa el segundo valor: ");
		num2= Integer.parseInt(input.nextLine());
		System.out.println("Los numeros son: "+num1+" y "+num2);
		temp = num1;
		num1 = num2;
		num2 = temp;
		System.out.println("Los numeros intercambiados son: "+num1+" y "+num2);
		
		
		
	}

}
