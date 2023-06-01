package Ejercicios;

import java.util.Scanner;

public class Ejercicio13parte2 {

	public static Scanner input = new Scanner (System.in);
	public static void main(String[] args) {
		int num1,num2,num3;
		
		/*Realizá un programa para ingresar tres números enteros e indique cuál de ellos es el mayor y
su valor. [EC]
*/
		System.out.println("Ingrese el primer numero");
		num1= Integer.parseInt(input.nextLine());
		
		System.out.println("Ingrese el segundo numero");
		num2= Integer.parseInt(input.nextLine());
		
		System.out.println("Ingrese el tercer numero");
		num3= Integer.parseInt(input.nextLine());
		
		if (num1>num2&&num1>num3) {
			System.out.println(num1+" es el numero mas grande de los 3");
		}else if (num2>num1&&num2>num3) {
			System.out.println(num2+" es el numero mas grande de los 3");
			}else {
				System.out.println(num3+" es el numero mas grande de los 3");
			}
	}

}
