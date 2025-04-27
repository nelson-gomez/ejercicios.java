package TALLER3;

public class pares {
    public static void main(String[] args) {
       
        int[] numeros = {40, 35, 13, 42, 57, 11, 39, 76};

        int pares = 0;
        int impares = 0;

        for (int numero : numeros) {
            if (numero % 2 == 0) {
                pares++;
            } else {
                impares++;
            }
        }

        System.out.println("Cantidad de números pares: " + pares);
        System.out.println("Cantidad de números impares: " + impares);
    }
}


