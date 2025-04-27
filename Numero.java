package TALLER3;
import java.util.Scanner;
public class Numero {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("¿Cuántos números deseas ingresar?");
        int cantidad = scanner.nextInt();

        int maximo = Integer.MIN_VALUE; 

        System.out.println("Ingresa los números:");
        for (int i = 0; i < cantidad; i++) {
            int numero = scanner.nextInt();
            if (numero > maximo) {
                maximo = numero; 
            }
        }

        System.out.println("El número mayor es: " + maximo);
        scanner.close();
    }
}

  
