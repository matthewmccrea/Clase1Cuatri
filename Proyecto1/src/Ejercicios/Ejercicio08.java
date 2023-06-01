package Ejercicios;

import java.util.Scanner;

public class Ejercicio08 {

	public static Scanner input = new Scanner (System.in); 
	public static void main(String[] args) {
		/*Realizá un programa que permita ingresar dos números naturales. Debes mostrar los
resultados para las 4 operaciones matemáticas básicas con los números ingresados. */
		
		int numero1,numero2;
		int suma, resta, multiplicacion, division;
		
		System.out.println("Ingrese el primer numero");
		numero1 = Integer.parseInt(input.nextLine()); 
		
		System.out.println("Ingrese el segundo numero");
		numero2 = Integer.parseInt(input.nextLine());
		
		suma = numero1+numero2;
		resta = numero1-numero2;
		multiplicacion = numero1 * numero2;
		division = numero1/numero2;
		
		
		
		System.out.println("suma "+suma);
		System.out.println("resta "+resta);
		System.out.println("multiplicacion "+multiplicacion);
		System.out.println("division "+division);
		
	}
	

}
