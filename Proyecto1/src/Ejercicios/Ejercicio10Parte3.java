package Ejercicios;

import java.util.Scanner;

public class Ejercicio10Parte3 {

	public static Scanner input = new Scanner (System.in);
	public static void main(String[] args) {
		String socio1,socio2,socio3;
		double capitalAportado1,capitalAportado2,capitalAportado3,porcentajePrimerSocio,porcentajeSegundoSocio,porcentajeTercerSocio,sumaAportes;
		
		/*Realizá un programa que permita resolver el siguiente problema: Tres personas aportan
diferente capital a una sociedad y desean saber el valor total aportado y qué porcentaje
aportó cada una (indicando nombre y porcentaje). Solicitar la carga por teclado del nombre
de cada socio, su capital aportado y a partir de esto calcular e informar lo requerido
previamente.*/
		System.out.println("Ingrese su nombre: ");
		socio1=input.nextLine();
		System.out.println("Capital aportado: ");
		capitalAportado1= Double.parseDouble(input.nextLine());
		
		System.out.println("Ingrese su nombre: ");
		socio2=input.nextLine();
		System.out.println("Capital aportado: ");
		capitalAportado2= Double.parseDouble(input.nextLine());
		
		System.out.println("Ingrese su nombre: ");
		socio3=input.nextLine();
		System.out.println("Capital aportado: ");
		capitalAportado3= Double.parseDouble(input.nextLine());
		
		sumaAportes=capitalAportado1+capitalAportado2+capitalAportado3;
		porcentajePrimerSocio=100*capitalAportado1/sumaAportes;
		porcentajeSegundoSocio=100*capitalAportado2/sumaAportes;
		porcentajeTercerSocio=100*capitalAportado3/sumaAportes;
		
		System.out.println("El total aportado por "+socio1+ " es: "+capitalAportado1+ " el promedio de lo aportado es de: "+porcentajePrimerSocio);
		System.out.println("El total aportado por "+socio2+ " es: "+capitalAportado2+ " el promedio de lo aportado es de: "+porcentajeSegundoSocio);
		System.out.println("El total aportado por "+socio3+ " es: "+capitalAportado3+ " el promedio de lo aportado es de: "+porcentajeTercerSocio);
	}

}
