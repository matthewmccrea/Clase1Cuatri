package Ejercicios;

import java.util.Scanner;

public class Ejercicio06parte2 {

	public static Scanner input = new Scanner (System.in);
	public static void main(String[] args) {
		final int SUELDO_FIJO=44000;
		final double PORCENTAJE= 16;
		double ventasMes,importeCobrar,comision;
		
		/* Realizá un programa que permita ingresar el monto total de las ventas realizadas por un
vendedor durante el mes, de quien se sabe que gana un sueldo fijo de 44000 pesos más el 16
por ciento del monto total vendido. Con tales datos debes calcular y mostrar el importe a
cobrar por el vendedor.*/
		
		System.out.println("Ingrese el monto total de las ventas realizadas en el mes: ");
		ventasMes=Integer.parseInt(input.nextLine());
		comision=ventasMes/PORCENTAJE;
		importeCobrar= SUELDO_FIJO+comision;
		System.out.println("El importe a cobrar es de: "+importeCobrar);
	}

}
