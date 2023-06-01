package Ejercicios;

import java.util.Scanner;

public class Ejercicio02 {
	
	public static Scanner input = new Scanner(System.in);

	public static void main(String[] args) {
		/* Realiza un programa que permita ingresar 3 notas pertenecientes a 3 trimestres distintos para 
		 * cierto alumno del nivel secundario. Debe calcularse y mostrarse la nota promedio*/
	
	double nota1,nota2,nota3;
	double promedio;
	
	System.out.println("Ingrese la nota");
	 nota1 = Double.parseDouble(input.nextLine());
	 nota2 = Double.parseDouble(input.nextLine());
	 nota3 = Double.parseDouble(input.nextLine());
	 
	 promedio= (nota1+nota2+nota3)/3;
	 
	
	 System.out.println("Tu promedio es "+ promedio);
	
	
	}
	
	
}
