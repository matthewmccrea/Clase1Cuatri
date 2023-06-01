package Ejercicios;

import java.util.Scanner;

public class Ejercicio13 {

    public static Scanner input = new Scanner (System.in);

    public static void main(String[] args) {

        int numero;
        int numero1;
        int numero2;

        System.out.println("Por favor Ingrese tres Numeros: ");
        numero = Integer.parseInt(input.nextLine());
        numero1 = Integer.parseInt(input.nextLine());
        numero2 = Integer.parseInt(input.nextLine());

        if(numero > numero1 && numero2 < numero) {
            System.out.println(numero + " Es mayor");
        }else if ( numero1 > numero2 && numero1 >numero) {
            System.out.println(numero1 + " Es mayor");
        }else {
            System.out.println(numero2 + " Es mayor" );
        }


    }

}
