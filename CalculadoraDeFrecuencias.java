package TALLER3;


    import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class CalculadoraDeFrecuencias {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

       
        System.out.print("Ingrese el número de elementos: ");
        int n = scanner.nextInt();

        
        int[] numeros = new int[n];
        System.out.println("Ingrese los números:");
        for (int i = 0; i < n; i++) {
            numeros[i] = scanner.nextInt();
        }

       
        Map<Integer, Integer> frecuencias = calcularFrecuencias(numeros);

       
        System.out.println("Frecuencias de los números:");
        for (Map.Entry<Integer, Integer> entrada : frecuencias.entrySet()) {
            System.out.println("Número " + entrada.getKey() + ": " + entrada.getValue() + " veces");
        }
    }

    public static Map<Integer, Integer> calcularFrecuencias(int[] numeros) {
        Map<Integer, Integer> frecuencias = new HashMap<>();
        for (int numero : numeros) {
            frecuencias.put(numero, frecuencias.getOrDefault(numero, 0) + 1);
        }
        return frecuencias;
    }

}
