package Ejercicios;

import java.util.Scanner;

public class Ejercicio10 {

public static Scanner input = new Scanner (System.in);

    public static void main(String[] args) {

        String socio1;
        String socio2;
        String socio3;

        double ingreso1;
        double ingreso2;
        double ingreso3;
        double total;
        double porcentaje;
        double porcentaje1;
        double porcentaje2;

        System.out.println("Igrensar nombre y Capital ingresado a la sociedad:");
        socio1 = input.nextLine();
        ingreso1 = Double.parseDouble(input.nextLine());

        System.out.println("Igrensar nombre y Capital ingresado a la sociedad:");
        socio2 = input.nextLine();
        ingreso2 = Double.parseDouble(input.nextLine());

        System.out.println("Igrensar nombre y Capital ingresado a la sociedad:");
        socio3 = input.nextLine();
        ingreso3 = Double.parseDouble(input.nextLine());

        total = ingreso1 + ingreso2 + ingreso3;

        porcentaje = ingreso1 * 100 / total;

        porcentaje1 = ingreso2 * 100 / total;

        porcentaje2 = ingreso3 * 100 / total;

        System.out.println("El resultado de todos los ingresos es: " + total);

        System.out.println(socio1 + " aporto " + porcentaje + "%" );

        System.out.println(socio2 + " aporto " + porcentaje1 + "%");

        System.out.println(socio3 + " aporto " + porcentaje2 + "%");
    }

}
