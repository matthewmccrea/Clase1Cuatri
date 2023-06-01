package Ejercicios;

import java.util.Scanner;

public class Ejercicio19 {

	
	/* Existen dos reglas que identifican dos conjuntos de valores:
	a. El número es de un solo dígito.
	b. El número es impar.
	A partir de estas reglas, realizá un programa que permita ingresar un número entero. Debe
	asignar el valor que corresponda a las variables booleanas esDeUnSoloDigito, esImpar,
	estaEnAmbosGrupos y noEstaEnNingunGrupo el valor Verdadero o Falso, según corresponda,
	para indicar si el valor número ingresado pertenece o no a cada conjunto. Al terminar el
	programa debe informar el número cargado y las cuatros variables lógicas. Definí un lote de
	prueba de varios números y probá el algoritmo, escribiendo los resultados tal como se hizo
	en los ejercicios anteriores.*/
	public static Scanner input = new Scanner(System.in);
	
	public static void main(String[] args) {
	int numero;
	boolean esDeUnSoloDigito;
	boolean esImpar;
	boolean estaEnAmbosGrupos;
	boolean noEstaEnNingunGrupo;
	
	System.out.println("Ingrese un numero");
	numero = Integer.parseInt(input.nextLine());
	esDeUnSoloDigito = numero >= -9 && numero <= 9;
	esImpar = numero % 2 == 1;
	estaEnAmbosGrupos = esDeUnSoloDigito && esImpar;
	noEstaEnNingunGrupo = !esDeUnSoloDigito && !esImpar;
	
	System.out.println("El numero ingresado es "+ numero);
	System.out.println("esDeUnSoloDigito: "+ esDeUnSoloDigito);
	System.out.println("esImpar "+ esImpar);
	System.out.println("estaEnAmbosGrupos: "+ estaEnAmbosGrupos);
	System.out.println("noEstaEnNingunGrupo: "+ noEstaEnNingunGrupo);
	
		
		

		
		
		
	}

}
