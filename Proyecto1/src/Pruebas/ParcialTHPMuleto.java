package Pruebas;

import java.util.Scanner;

public class ParcialTHPMuleto {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int fechaAnterior = 19010101;
        double temperaturaMinima, temperaturaMaxima, amplitudMaxima = 0;
        int fechaMaxima = 0;
        
        System.out.println("Ingrese la fecha en formato AAAAMMDD (para finalizar ingrese -1): ");
        int fecha = sc.nextInt();
        
        while (fecha != -1) {
            if (fecha <= fechaAnterior) {
                System.out.println("Error: la fecha ingresada es menor o igual a la anterior.");
            } else {
                System.out.println("Ingrese la temperatura mínima: ");
                temperaturaMinima = sc.nextDouble();
                
                System.out.println("Ingrese la temperatura máxima: ");
                temperaturaMaxima = sc.nextDouble();
                
                double amplitud = Math.abs(temperaturaMaxima - temperaturaMinima);
                
                System.out.println("Temperatura mínima: " + Math.min(temperaturaMinima, temperaturaMaxima));
                System.out.println("Temperatura máxima: " + Math.max(temperaturaMinima, temperaturaMaxima));
                System.out.println("Amplitud térmica: " + amplitud);
                
                if (amplitud > amplitudMaxima) {
                    amplitudMaxima = amplitud;
                    fechaMaxima = fecha;
                }
                
                fechaAnterior = fecha;
            }
            
            System.out.println("Ingrese la fecha en formato AAAAMMDD (para finalizar ingrese -1): ");
            fecha = sc.nextInt();
        }
        
        if (amplitudMaxima == 0) {
            System.out.println("No se ingresaron datos para procesar.");
        } else {
            System.out.println("La mayor amplitud térmica fue de " + amplitudMaxima + " grados centígrados,");
            System.out.println("y se registró el día " + fechaMaxima + ".");
        }
        
        sc.close();
    }

}