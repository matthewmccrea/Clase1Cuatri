package Ejercicios;

import java.util.Scanner;

public class Ejercicio15 {

    public static Scanner input = new Scanner (System.in);

    public static final double ALTURA = 1.50; 

    public static final int EDAD = 6; 

    public static void main(String[] args) {

        double altura;
        int edad;
        String nombre;

        System.out.println("Ingrese un nombre, edad y altura ");
        nombre = input.nextLine();
        edad = Integer.parseInt(input.nextLine());
        altura = Double.parseDouble(input.nextLine());

        if (altura >= ALTURA || edad >= 6) {
            System.out.println(nombre + " puede pasar a la montaña rusa.");

        } else {
            System.out.println(nombre + " no puede pasar a la montaña rusa.");
        }
    }

}
