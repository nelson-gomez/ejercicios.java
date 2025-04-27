package TALLER3;

import java.util.Scanner;

public class Dado {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        
        System.out.print("Ingrese la cantidad de números: ");
        int cantidad = scanner.nextInt();

        double[] numeros = new double[cantidad];

        
        for (int i = 0; i < cantidad; i++) {
            System.out.print("Ingrese el número " + (i + 1) + ": ");
            numeros[i] = scanner.nextDouble();
        }

        double promedio = calcularPromedio(numeros);
        System.out.println("El promedio es: " + promedio);

        scanner.close();
    }

    public static double calcularPromedio(double[] numeros) {
        double suma = 0;

        
        for (double numero : numeros) {
            suma += numero;
        }

        return suma / numeros.length;
    }
}


