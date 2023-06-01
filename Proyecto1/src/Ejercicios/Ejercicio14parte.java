package Ejercicios;

import java.util.Scanner;

public class Ejercicio14parte {

	public static Scanner input = new Scanner (System.in);
	public static void main(String[] args) {
		final int EDAD_MINIMA=7;
		final double ALTURA_MINIMA=1.50;
		int edad;
		double altura;
		String nombre;
		
		/*Para entrar a la montaña rusa Infierno en las alturas se requiere tener al menos 7 años y medir
más de 1,50 metros. Completá el siguiente cuadro a mano según los requisitos y luego
escribí el programa que permita, ejecutándolo cada vez para cada niño y según las edades y
estaturas ingresadas por el usuario, obtener los mismos resultados para los siguientes datos:*/
		
		System.out.println("Ingrese su nombre");
		nombre = input.nextLine();
		System.out.println("Ingrese su edad");
		edad= Integer.parseInt(input.nextLine());
		System.out.println("Ingrese su altura");
		altura = Double.parseDouble(input.nextLine());
		
		if (edad>=EDAD_MINIMA && altura>=ALTURA_MINIMA) {
			System.out.println(nombre+" puede pasar a la montaña rusa");
		}else {
			System.out.println(nombre+" no puede pasar a la montaña rusa");
		}
		
		
		
	}


}
