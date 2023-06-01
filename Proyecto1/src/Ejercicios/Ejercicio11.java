package Ejercicios;

import java.util.Scanner;

public class Ejercicio11 {

    public static Scanner input = new Scanner (System.in);

    public static void main(String[] args) {

        int num;

        System.out.println("Ingrese un numero por favor: ");
        num = Integer.parseInt(input.nextLine());

        if(num % 2==0) {
            System.out.println(num + " Es un numero par");
        }else {
            System.out.println(num + " Es un numero impar");
        }

    }

}
