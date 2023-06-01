package Ejercicios;

import java.util.Scanner;

public class Ejercicio29 {
	
	public static Scanner input = new Scanner (System.in);
	public static void main(String[] args) {
		int nota;
		
		/*Realizá un programa que permita validar la nota de un examen. Se espera que la nota que el
usuario ingrese sea un número comprendido entre 0 y 10. La misma debe ser ingresada
tantas veces como sea necesario hasta que quede comprendida dentro del rango indicado.
*/
		do {System.out.println("Ingrese la nota (Debe estar entre el 1 y el 10)");
			nota=Integer.parseInt(input.nextLine());
			if (nota<1||nota>10) {
				System.out.println("Nota fuera de rango");
				
			}
		} while (nota>=10&&nota<=1);
		
		System.out.println("Su nota es: "+nota);
	
	}

}
