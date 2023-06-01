package Ejercicios;

import java.util.Scanner;

public class Ejercicio26 {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        System.out.print("Ingrese un número natural: ");
        int n = sc.nextInt();
        sc.close();
        
        int contador = 0;
        int numero = 1;
        while (contador < n) {
            if (n % 3 == 0 && n % 5 != 0) {
                System.out.println(numero);
                contador++;
            }
            numero++;
        }
        
    }

}