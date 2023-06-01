package Ejercicios;

import java.util.Scanner;

public class Ejercicio10Parte2 {

	public static Scanner input = new Scanner (System.in);
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String nombre1,nombre2,nombre3;
		double ingreso1,ingreso2,ingreso3;
		double sumaTotal;
		double porcentaje1;
		double porcentaje2;
		double porcentaje3;
		
		System.out.println("Ingrese su nombre");
		nombre1 = input.nextLine();
		System.out.println("Ingrese su importe invertido en la sociedad");
		ingreso1= Double.parseDouble(input.nextLine());
		System.out.println("Ingrese su nombre");
		nombre2 = input.nextLine();
		System.out.println("Ingrese su importe invertido en la sociedad");
		ingreso2= Double.parseDouble(input.nextLine());
		System.out.println("Ingrese su nombre");
		nombre3 = input.nextLine();
		System.out.println("Ingrese su importe invertido en la sociedad");
		ingreso3= Double.parseDouble(input.nextLine());
		
		sumaTotal= ingreso1+ingreso2+ingreso3;
		porcentaje1 = ingreso1*100/sumaTotal;
		porcentaje2 = ingreso2*100/sumaTotal;
		porcentaje3 = ingreso3*100/sumaTotal;
		
		
		System.out.println("El total aportado es de "+ sumaTotal);
		System.out.println(nombre1 + " ha aportado " + porcentaje1);
		System.out.println(nombre2 + " ha aportado " + porcentaje2);
		System.out.println(nombre3 + " ha aportado " + porcentaje3);
		
		
	}

}
