package Ejercicios;

import java.util.Scanner;

public class Ejercicio12 {

    public static Scanner input = new Scanner (System.in);

    public static void main(String[] args) {

        int numeroEntero;
        int numeroEntero2;

        System.out.println("Por favor ingrese dos numeros: ");
        numeroEntero = Integer.parseInt(input.nextLine());
        numeroEntero2 = Integer.parseInt(input.nextLine());

        if (numeroEntero > numeroEntero2) {
            System.out.println(numeroEntero + " Es mayor a " + numeroEntero2);
        }else {
            System.out.println(numeroEntero2 + " Es mayor a " + numeroEntero);
        }

    }

}
