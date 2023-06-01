package Ejercicios;

import java.util.Scanner;

public class Ejercicio09 {

    public static Scanner input = new Scanner (System.in);

    public static void main(String[] args) {
        final int GRADOS = 180; 

        int angulo1;
        int angulo2;
        int suma;
        int resultado;

        System.out.println("Ingresar dos angulos :");
        angulo1 = Integer.parseInt(input.nextLine());
        angulo2 = Integer.parseInt(input.nextLine());

        suma = angulo1 + angulo2 ;
        resultado = GRADOS - suma;

        System.out.println("El angulo restante es: " + resultado+"°");
    }

}
