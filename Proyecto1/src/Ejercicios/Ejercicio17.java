package Ejercicios;

import java.util.Scanner;

public class Ejercicio17 {

public static Scanner input = new Scanner (System.in);

    public static final int EDAD_MUJER = 60;

    public static final int EDAD_HOMBRE = 65;

    public static final int EDAD_MINIMA = 1;

    public static final int EDAD_MAXIMA = 120;

    public static final char GENERO_FEMENINO = 'F';

    public static final char GENERO_MASCULINO = 'M';

    public static void main(String[] args) {

        int edad;
        char genero;

        System.out.println("Ingrese su edad");
        edad = Integer.parseInt(input.nextLine());

        if (edad >= EDAD_MINIMA && edad <= EDAD_MAXIMA) {
            System.out.println("Ingrese su género");
            genero = input.nextLine().charAt(0);

            if (genero != GENERO_FEMENINO && genero != GENERO_MASCULINO) {
                System.out.println("El género es incorrecto");
            } else {
                if ((genero == GENERO_FEMENINO && edad >= EDAD_MUJER) || 
                        (genero == GENERO_MASCULINO && edad >= EDAD_HOMBRE)) {
                    System.out.println("Se puede jubilar");
                        } else {
                            System.out.println("No se puede jubilar");
                    } 
            }
        } else {
            System.out.println("Edad incorrecta");
        }
    }
}
