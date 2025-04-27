package TALLER3;

import java.util.Arrays;

public class Medidas {
    public static void main(String[] args) {
       
        double[] metros = {1000, 500, 2000, 7500, 120};
        double[] kilometros = convertirAKilometros(metros);
        
        System.out.println("Arreglo en kilómetros: " + Arrays.toString(kilometros));
    }

    public static double[] convertirAKilometros(double[] metros) {
        double[] kilometros = new double[metros.length];
        for (int i = 0; i < metros.length; i++) {
            kilometros[i] = metros[i] / 1000.0; 
        }
        return kilometros;
    }
}


