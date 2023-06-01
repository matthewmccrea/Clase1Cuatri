package Ejercicios;

import java.util.Scanner;

public class Ejercicio09parte2 {
	
	public static Scanner input = new Scanner (System.in);
	public static void main(String[] args) {
		
		int angulo1,angulo2,sumaAngulos,anguloFaltante;
		
		/*Realizá un programa que permita ingresar dos números que representan las medidas en
grados de dos ángulos interiores de cierto triángulo. A partir de los valores de estos dos
ángulos el programa debe mostrar el valor en grados del ángulo restante. Recordá que la
suma de los ángulos interiores de todo triángulo es de 180º.
*/
		System.out.println("Ingrese el primer angulo: ");
		angulo1= Integer.parseInt(input.nextLine());
		System.out.println("Ingrese el segundo angulo: ");
		angulo2= Integer.parseInt(input.nextLine());
		sumaAngulos= angulo1+angulo2;
		anguloFaltante= 180-sumaAngulos;
		System.out.println("El angulo faltante es de: "+anguloFaltante+"°");
	}

}
