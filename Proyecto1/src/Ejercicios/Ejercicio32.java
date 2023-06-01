package Ejercicios;

import java.util.Scanner;

public class Ejercicio32 {
	
	public static Scanner input = new Scanner (System.in);
	public static void main(String[] args) {
		int nota;
		
		/*.Realizá un programa que permita validar la nota de un examen de la misma manera que el
ejercicio 29 pero con las siguientes nuevas directivas:
● Las notas 1 y 3 no usan nunca.
● La nota 0 se reserva para los ausentes
En resumen, las notas válidas pueden ser un 2 o un valor entre 4 y 10.*/

		do {System.out.println("Ingrese la nota: ");
		nota = Integer.parseInt(input.nextLine());
		if (nota==1||nota==3||nota==0) {
			System.out.println("Nota invalida");
			
		}
			
		} while (nota==1||nota==3||nota==0);
		
		 if (nota==2&&nota>=4&&nota<=10) {
			nota=Integer.parseInt(input.nextLine());
		
			
		}
		 System.out.println("Su nota es: "+nota);
	}

}
