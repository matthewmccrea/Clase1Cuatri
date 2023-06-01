package Ejercicios;

import java.util.Scanner;

public class Ejercicio05 {

	/* Realizá un programa que permita ingresar valores del mismo tipo para las variables num1 y
num2. Una vez cargadas, mostrar ambas variables por pantalla, intercambiá sus valores (que
lo cargado en num1 quede en num2, y viceversa) y volvé a mostrarlas actualizadas.*/
	
	
	public static Scanner input = new Scanner(System.in);
	public static void main(String[] args) {
	
		int num1,num2;
		
	
	
	System.out.println("Ingrese el primer valor");
	num1 = Integer.parseInt(input.nextLine());
	System.out.println("Ingrese el segundo valor");
	num2 = Integer.parseInt(input.nextLine());
	
	System.out.println("Primer valor "+ num1);
	System.out.println("Segundo valor "+ num2);
	
	System.out.println("Primer valor "+ num2);
	System.out.println("Primer valor "+ num1);
	
	System.out.println("Primer valor "+ num1);
	System.out.println("Segundo valor "+ num2);
	
	
	
	
	
	
	}
	

}
