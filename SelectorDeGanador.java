package TALLER3;
    import java.util.Scanner;
import java.util.Random;

public class SelectorDeGanador {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        
        System.out.print("Ingrese el número de participantes: ");
        int n = scanner.nextInt();
        scanner.nextLine();

       
        String[] nombres = new String[n];
        System.out.println("Ingrese los nombres de los participantes:");
        for (int i = 0; i < n; i++) {
            nombres[i] = scanner.nextLine();
        }

        int indiceGanador = random.nextInt(n);
        String ganador = nombres[indiceGanador]; 
        System.out.println("¡El ganador seleccionado al azar es: " + ganador + "!");
    }
}

}
