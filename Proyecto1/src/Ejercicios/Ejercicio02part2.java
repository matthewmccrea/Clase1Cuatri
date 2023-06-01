package Ejercicios;

import java.util.Scanner;

public class Ejercicio02part2 {

	public static Scanner input = new Scanner (System.in);
	public static void main(String[] args) {
		int nota1,nota2,nota3,sumaNotas,promedio;
		
		/*. Realizá un programa que permita ingresar 3 notas pertenecientes a tres trimestres distintos
para cierto alumno de nivel secundario. Debe calcularse y mostrarse la nota promedio. [EC]
*/
		
		System.out.println("Igrese la primera nota: ");
		nota1= Integer.parseInt(input.nextLine());
		System.out.println("Igrese la segunda nota: ");
		nota2= Integer.parseInt(input.nextLine());
		System.out.println("Igrese la tercer nota: ");
		nota3= Integer.parseInt(input.nextLine());
		sumaNotas= nota1+nota2+nota3;
		promedio=sumaNotas/3;
		System.out.println("El promedio de las 3 notas es: "+promedio);
				
	}

}
