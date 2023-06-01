package Ejercicios;

import java.util.Scanner;

public class Ejercicio27parte2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int edad;
        int countImparesMayores18 = 0;

        for (int i = 1; i <= 5; i++) {
            System.out.print("Ingrese la edad #" + i + ": ");
            edad = sc.nextInt();
            if (edad > 18 && edad % 2 != 0) {
                countImparesMayores18++;
            }
        }

        System.out.println("\nTodas las edades ingresadas.");
        for (int i = 1; i <= 5; i++) {
            System.out.print("Edad #" + i + ": ");
            edad = sc.nextInt();
            System.out.println(edad);
        }

        System.out.println("\nCantidad de edades impares mayores que 18: " + countImparesMayores18);
    }
}