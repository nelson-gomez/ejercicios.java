package TALLER3;

import java.util.Scanner;

public class CalculadoraImc {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("ingresa tu peso ");
        double peso =scanner.nextDouble();
        
        System.out.println("ingresa tu altura ");
        double altura =scanner.nextDouble();
        
        double IMC = peso/(altura*altura);
        System.out.println("masa corporal es de " +IMC);
        
        if (IMC <24.9){
            System.out.println("normal: ");
        } else if ((IMC > 25 ) && (IMC < 29.9)){
            System.out.println("sobrepeso: ");
        } else if (IMC > 30 && IMC < 34.9){
            System.out.println("obesidad grado 1: ");
        } else if (IMC > 35 && IMC < 39.9){
            System.out.println("obesidad grado 2: ");
        } else if (IMC > 40){
            System.out.println("obesidad grado 3: ");
        }

    }
    
}
