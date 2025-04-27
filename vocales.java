package TALLER3;

public class vocales {
    public static void main(String[] args) {
        
        String[] palabras = {"hola", "mundo", "java", "programación"};
        int totalVocales = contarVocalesTotales(palabras);
        
        System.out.println("El número total de vocales es: " + totalVocales);
    }

    public static int contarVocalesTotales(String[] palabras) {
        int contador = 0;
        
        for (String palabra : palabras) {
            for (char c : palabra.toLowerCase().toCharArray()) {
                if (esVocal(c)) {
                    contador++;
                }
            }
        }
        
        return contador;
    }

    public static boolean esVocal(char c) {
        return (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u');
    }
}
