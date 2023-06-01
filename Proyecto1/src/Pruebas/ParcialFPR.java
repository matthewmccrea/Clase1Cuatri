package Pruebas;

import java.util.Scanner;

public class ParcialFPR {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        // Inicializar variables
        int fechaAnterior = 0;
        int fechaMaxDiferencia = 0;
        double maxDiferencia = 0;
        int contadorRegistros = 0;

        // Entrada de datos
        System.out.print("Ingrese la fecha AAAAMMDD (o -1 para terminar): ");
        int fecha = scanner.nextInt();

        while (fecha != -1) {

            // Validar que la fecha sea mayor que la anterior
            if (fecha <= fechaAnterior) {
                System.out.println("Error: La fecha debe ser mayor que la anterior.");
                System.out.print("Ingrese la fecha AAAAMMDD (o -1 para terminar): ");
                fecha = scanner.nextInt();
                continue;
            }

            // Entrada de datos de la marea
            System.out.print("Ingrese la altura mínima de la marea en metros: ");
            double minMarea = scanner.nextDouble();
            System.out.print("Ingrese la altura máxima de la marea en metros: ");
            double maxMarea = scanner.nextDouble();

            // Validar que la marea mínima sea menor o igual que la máxima
            if (minMarea > maxMarea) {
                System.out.println("Error: La altura mínima de la marea debe ser menor o igual que la altura máxima.");
                System.out.println("Se intercambiarán los valores.");
                double temp = minMarea;
                minMarea = maxMarea;
                maxMarea = temp;
            }

            // Calcular la diferencia de la marea y actualizar la fecha y la mayor diferencia si corresponde
            double diferenciaMarea = maxMarea - minMarea;
            if (diferenciaMarea > maxDiferencia) {
                maxDiferencia = diferenciaMarea;
                fechaMaxDiferencia = fecha;
            }

            // Mostrar los datos del registro
            System.out.println("Fecha: " + fecha);
            System.out.println("Altura mínima de la marea: " + minMarea + " metros");
            System.out.println("Altura máxima de la marea: " + maxMarea + " metros");
            System.out.println("Diferencia de la marea: " + diferenciaMarea + " metros");
            System.out.println();

            // Actualizar la fecha anterior y el contador de registros
            fechaAnterior = fecha;
            contadorRegistros++;

            // Entrada de datos para el siguiente registro
            System.out.print("Ingrese la fecha AAAAMMDD (o -1 para terminar): ");
            fecha = scanner.nextInt();
        }

        // Mostrar la fecha de mayor diferencia de marea si se han ingresado registros
        if (contadorRegistros > 0) {
            System.out.println("La mayor diferencia de marea ocurrió el " + fechaMaxDiferencia + ".");
        } else {
            System.out.println("No hay suficientes datos procesados.");
        }

        scanner.close();
    }

}
