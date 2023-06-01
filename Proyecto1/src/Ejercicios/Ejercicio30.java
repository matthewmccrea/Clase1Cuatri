package Ejercicios;

import java.util.Scanner;

public class Ejercicio30 {

	public static Scanner input = new Scanner (System.in);
	public static void main(String[] args) {
		int num1=0,num2=0,resultado=0;
		char operacion=0;
		final char FIN='F',SUMA='+',RESTA='-',MULTIPLICACION='*',DIVISION='/';
		
		/*Realizá un programa que permita realizar varias operaciones matemáticas ingresando un
		caracter por cada una la operación a realizar (‘+’, ‘-’, ‘*’, ‘/’, ‘F’) y dos números enteros en el caso
		que no haya elegido ‘F’. La computadora debe mostrar el resultado para la operación
		ingresada. Considerar que no se puede dividir por cero. Cuando la operación ingresada sea ‘F’
		nos indicará que no se desean calcular más operaciones.*/
		
		do {
			System.out.println("Ingrese el primer numero");
			num1= Integer.parseInt(input.nextLine());
			System.out.println("Ingrese la operacion ('+','-','*','/')");
			operacion= input.nextLine().charAt(0);
			System.out.println("Ingrese el segundo numero");
			num2= Integer.parseInt(input.nextLine());
			
			switch (operacion) {
			case '+':
				resultado=num1+num2;
				System.out.println(num1+" + "+num2+" es "+resultado);
				break;
			case '-':
				resultado=num1-num2;
				System.out.println(num1+" - "+num2+" es "+resultado);
				break;
			case '*':
				resultado=num1*num2;
				System.out.println(num1+" * "+num2+" es "+resultado);
				break;
			case '/':
				
				if (num2==0) {
					System.out.println("No se puede dividir por cero");
					
				}else {
					
				resultado=num1/num2;
				System.out.println(num1+" / "+num2+" es "+resultado);
				break;
				}
			default:
				System.out.println("Operacion invalida");
				break;
			}
			
		} while (operacion!='F'&&num1!='F'&&num2!='F');

	}

}