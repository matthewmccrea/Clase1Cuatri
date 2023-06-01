package Ejercicios;

import java.util.Scanner;

public class Ejercicio04 {

	
	public static Scanner input = new Scanner(System.in);
	public static void main(String[] args) {
		
/* Realizá un programa que permita ingresar el valor monetario de una hora de trabajo y la
cantidad de horas trabajadas por día por un trabajador. Debes mostrar el valor del salario
semanal, sabiendo que trabaja todos los días hábiles y la mitad de las horas del día hábil los
sábados. (Todas las horas valen lo mismo.)*/

	int valorMonetario;
	int horas;
	int horasTotalesConSabado;
	
	
	System.out.println("Ingresa el valor monetario");
	
	valorMonetario = Integer.parseInt(input.nextLine());
	
	System.out.println("Ingresa las horas");
	horas = Integer.parseInt(input.nextLine());
	
	horasTotalesConSabado = horas*valorMonetario + (valorMonetario / 2);
	
	System.out.println(+horasTotalesConSabado);
	
	
	
	
	
	}

}
