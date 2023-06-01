package Ejercicios;

import java.util.Scanner;

public class Ejercicio12parte2 {

	public static Scanner input = new Scanner (System.in);
	public static void main(String[] args) {
		int numero1,numero2;
		
		System.out.println("Ingrese un numero");
		numero1 = Integer.parseInt(input.nextLine());
		System.out.println("Ingrese otro numero");
		numero2 = Integer.parseInt(input.nextLine());
		
		if(numero1>numero2)System.out.println(numero1+" es mayor a "+ numero2);
		else if(numero2>numero1)System.out.println(numero2+ " es mayor a "+ numero1);
	}

}
