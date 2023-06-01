package Ejercicios;

import java.util.Scanner;

public class Ejercicio06 {

    public static Scanner input = new Scanner (System.in);
    public static final int  SUELDO_FIJO = 44000;
    public static final double AUMENTO = 0.16;

    public static void main(String[] args) {

        double montoTotal ;
        double montoAumentado; 
        double montoMasSueldo;

        System.out.println("Ingresar el monto de las ventas realizadas este mes: ");
        montoTotal = Double.parseDouble(input.nextLine());

        montoAumentado = montoTotal * AUMENTO;
        montoMasSueldo = montoAumentado + SUELDO_FIJO;

        System.out.println("Monto a cobrar: " + montoMasSueldo);






    }

}