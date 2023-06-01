package Ejercicios;

import java.util.Scanner;

public class Ejercicio04parte2 {

	public static Scanner input = new Scanner(System.in);
	public static void main(String[] args) {
		int valorMonetarioPorHora,cantidadDeHoras, salarioSemanal,sabados;
		
		/*Realizá un programa que permita ingresar el valor monetario de una hora de trabajo y la
cantidad de horas trabajadas por día por un trabajador. Debes mostrar el valor del salario
semanal, sabiendo que trabaja todos los días hábiles y la mitad de las horas del día hábil los
sábados. (Todas las horas valen lo mismo.)
*/

		System.out.println("Ingrese el valor monetario de una hora de trabajo: ");
		valorMonetarioPorHora=Integer.parseInt(input.nextLine());
		System.out.println("Ingresa la cantidad de horas trabajadas por dia: ");
		cantidadDeHoras=Integer.parseInt(input.nextLine());
		sabados=valorMonetarioPorHora*cantidadDeHoras/2;
		salarioSemanal= valorMonetarioPorHora*cantidadDeHoras*5+sabados;
		
		System.out.println("El salario semanal es de: "+salarioSemanal);
	}

}
