package TALLER3;

import java.util.Scanner;

public class velocidad {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese la distancia en kilómetros: ");
        double distancia = scanner.nextDouble();

        System.out.print("Ingrese el tiempo en horas: ");
        double tiempo = scanner.nextDouble();

        
        if (tiempo <= 0) {
            System.out.println("El tiempo debe ser mayor que 0.");
        } else {
            double velocidad = distancia / tiempo;

            
            System.out.printf("La velocidad es: %.2f km/h\n", velocidad);

            if (velocidad < 40) {
                System.out.println("La velocidad es LENTA.");
            } else if (velocidad <= 80) {
                System.out.println("La velocidad es NORMAL.");
            } else {
                System.out.println("La velocidad es RÁPIDA.");
            }
        }
    }
}



   