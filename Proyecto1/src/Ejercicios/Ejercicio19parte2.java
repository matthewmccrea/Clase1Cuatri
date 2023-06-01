package Ejercicios;

import java.util.Scanner;

public class Ejercicio19parte2 {

	public static Scanner input = new Scanner (System.in);
	public static void main(String[] args) {
		
		int numero;
		boolean estaEnAmbosGrupos, noEstaEnNingunGrupo, esImpar, esDeUnSoloDigito;
		
		System.out.println("Ingresa un numero");
		numero= Integer.parseInt(input.nextLine());
		
		esImpar = numero%2 != 0;
		esDeUnSoloDigito = numero<10;
		estaEnAmbosGrupos= esImpar && esDeUnSoloDigito;
		noEstaEnNingunGrupo = !esImpar&& !esDeUnSoloDigito;
		
		System.out.println("Su numero es: "+numero);
		System.out.println("esDeUnSoloDigito: "+esDeUnSoloDigito);
		System.out.println("esImpar: "+esImpar);
		System.out.println("estaEnAmbosGrupos: "+estaEnAmbosGrupos);
		System.out.println("noEstaEnNingunGrupo: "+noEstaEnNingunGrupo);
	}
	

}
