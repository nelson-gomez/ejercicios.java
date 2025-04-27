package TALLER3;

import java.util.HashMap;
import java.util.Map;

public class Contador {
    public static void main(String[] args) {
        
        String[] palabras = {"manzana", "mango", "limón", "lima", "plátano", "pera", "fresa", "frambuesa", "durazno"};
        Map<Character, Integer> conteo = contarPorLetraInicial(palabras);

        for (Map.Entry<Character, Integer> entrada : conteo.entrySet()) {
            System.out.println("Letra " + entrada.getKey() + ": " + entrada.getValue() + " palabras");
        }
    }

    public static Map<Character, Integer> contarPorLetraInicial(String[] palabras) {
        Map<Character, Integer> conteo = new HashMap<>();
        
        for (String palabra : palabras) {
            char letraInicial = Character.toLowerCase(palabra.charAt(0)); 
            conteo.put(letraInicial, conteo.getOrDefault(letraInicial, 0) + 1);
        }
        
        return conteo;
    }
}
