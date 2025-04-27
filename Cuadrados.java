package TALLER3;

import java.util.Arrays;

public class Cuadrados {
    public static void main(String[] args) {
        
        int[] numeros = {1, 2, 3, 4, 5};
        int[] cuadrados = calcularCuadrados(numeros);

        System.out.println("Arreglo de cuadrados: " + Arrays.toString(cuadrados));
    }

    public static int[] calcularCuadrados(int[] numeros) {
        int[] cuadrados = new int[numeros.length];
        for (int i = 0; i < numeros.length; i++) {
            cuadrados[i] = numeros[i] * numeros[i];
        }
        return cuadrados;
    }
}


