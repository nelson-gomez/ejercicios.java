package TALLER3;

import java.util.ArrayList;
import java.util.List;

public class Palabra {
    public static void main(String[] args) {
        
        String[] palabras = {"hola", "sol", "ar", "java", "uno", "sí"};
        
        
        List<String> palabrasCortas = filtrarPalabrasCortas(palabras);
        
        
        System.out.println("Palabras de tres letras o menos: " + palabrasCortas);
    }

    public static List<String> filtrarPalabrasCortas(String[] palabras) {
        List<String> palabrasCortas = new ArrayList<>();
        for (String palabra : palabras) {
            if (palabra.length() <= 3) {
                palabrasCortas.add(palabra);
            }
        }
        return palabrasCortas;
    }
}


