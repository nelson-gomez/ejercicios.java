package TALLER3;

import java.util.Scanner;

public class calificaciones {
    public static void main(String[] args) {
       
        Scanner scanner = new Scanner(System.in);

        
        System.out.print("Ingrese la calificación numérica: ");
        int calificacion = scanner.nextInt();

        
        String letra;
        if (calificacion >= 90 && calificacion <= 100) {
            letra = "A";
        } else if (calificacion >= 80 && calificacion < 90) {
            letra = "B";
        } else if (calificacion >= 70 && calificacion < 80) {
            letra = "C";
        } else if (calificacion >= 60 && calificacion < 70) {
            letra = "D";
        } else if (calificacion >= 0 && calificacion < 60) {
            letra = "F";
        } else {
            letra = "Calificación inválida";
        }

       
        System.out.println("La calificación en letra es: " + letra);
    }

    }

