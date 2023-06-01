package Ejercicios;

import java.util.Scanner;

public class Ejercicio20 {

	
	public static Scanner input = new Scanner (System.in);
	public static void main(String[] args) {
		
		/*20.Realizá un programa que permita ingresar dos números enteros y la operación a realizar
('+', '-', '*', '/'). Debe mostrarse el resultado para la operación ingresada. Considerar
que no se puede dividir por cero (en ese caso mostrar el texto 'ERROR').*/
		
		int numero1,numero2,resultado=0;
		char operacion;
		
		
		
		System.out.println("Ingrese el primer numero");
		numero1 = Integer.parseInt(input.nextLine());
		
		System.out.println("Ingrese el segundo numero");
		numero2 = Integer.parseInt(input.nextLine());
		
		System.out.println("Ingrese la operacion (+,-,*,/)"); 
		operacion = input.next().charAt(0);
		
		switch (operacion) {
		
		case '+':
			resultado = numero1+numero2;
			break;
			
			
		case '-':
			resultado = numero1-numero2;
			break;
			
		case '*':
			resultado = numero1*numero2;
			break;
		
			case '/':
				if (numero2==0) {
					System.out.println("'ERROR'");
					break;
					}else {
						resultado=numero1/numero2;
			}	
			
		
		
		
				
			
		
		}
		
		System.out.println(resultado);	
		
	}

}
