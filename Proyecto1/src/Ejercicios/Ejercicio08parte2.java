package Ejercicios;

import java.util.Scanner;

public class Ejercicio08parte2 {

	public static Scanner input = new Scanner (System.in);
	public static void main(String[] args) {
		int num1,num2,suma,resta,multiplicacion,division;
		
		/*Realizá un programa que permita ingresar dos números naturales. Debes mostrar los
resultados para las 4 operaciones matemáticas básicas con los números ingresados. [EC]*/

		System.out.println("Ingresa el primer numero");
		num1= Integer.parseInt(input.nextLine());
		System.out.println("Ingresa el segundo numero");
		num2= Integer.parseInt(input.nextLine());
		suma=num1+num2;
		resta=num1-num2;
		multiplicacion=num1*num2;
		division=num1/num2;
		System.out.println(num1 + " + "+num2+" es "+suma);
		System.out.println(num1 + " - "+num2+" es "+resta);
		System.out.println(num1 + " * "+num2+" es "+multiplicacion);
		System.out.println(num1 + " / "+num2+" es "+division);
	}

}
