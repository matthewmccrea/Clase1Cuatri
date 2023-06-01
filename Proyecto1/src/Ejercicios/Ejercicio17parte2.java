package Ejercicios;

import java.util.Scanner;

public class Ejercicio17parte2 {

	public static Scanner input = new Scanner (System.in);
	public static void main(String[] args) {
		final int EDAD_MINIMA=1, EDAD_MAXIMA=120,EDAD_JUBILAR_HOMBRE=65,EDAD_JUBILAR_MUJER=60;
		final char GENERO_MASCULINO='M',GENERO_FEMENINO='F';
		int edad;
		char genero=0;
		
		/*Realizá un programa que permita ingresar una edad (entre 1 y 120 años) y un género ('F'
para mujeres, 'M' para hombres). En caso de haber ingresado valores erróneos (edad fuera
de rango o género inválido), informar tal situación y terminar el programa. Si los datos están
bien ingresados el programa debe indicar, sabiendo que las mujeres se jubilan con 60 años o
más y los hombres con 65 años o más, si la persona está en edad de jubilarse.*/
		
		System.out.println("Ingrese su edad");
		edad= Integer.parseInt(input.nextLine());
		if (edad<=EDAD_MINIMA||edad<=EDAD_MAXIMA) {
			System.out.println("Ingrese su genero");
			genero= input.nextLine().charAt(0);
		
			if ((genero!=GENERO_MASCULINO)&&(genero!=GENERO_FEMENINO)) {
			System.out.println("Genero invalido");	
		}
			}else {
				if (genero==GENERO_FEMENINO&&edad>=EDAD_JUBILAR_MUJER) {
					System.out.println("Se puede jubilar");
					
				}
			}
			
		}
		}
		
		
		
		
		
	
		
		
		
		
		
		
		
		

	


