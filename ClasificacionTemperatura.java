package TALLER3;

import java.util.Arrays;

public class ClasificacionTemperatura {
     public static void main(String[] args) {
   
        double[] temperaturas = {15.5, 25.0, 10.0, 30.0, 21.0, 5.0};
        String[] clasificaciones = clasificarTemperaturas(temperaturas);
        
        System.out.println("Clasificaciones de temperaturas: " + Arrays.toString(clasificaciones));
    }

    public static String[] clasificarTemperaturas(double[] temperaturas) {
        String[] clasificaciones = new String[temperaturas.length];
        
        for (int i = 0; i < temperaturas.length; i++) {
            if (temperaturas[i] < 15) {
                clasificaciones[i] = "frío";
            } else if (temperaturas[i] <= 25) {
                clasificaciones[i] = "templado";
            } else {
                clasificaciones[i] = "calor";
            }
        }
        
        return clasificaciones;
    }
}


