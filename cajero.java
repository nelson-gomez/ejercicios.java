package TALLER3;

import java.util.Scanner;

public class cajero {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        
        double montoDisponible;
        double montoARetirar; 

        System.out.print("Ingrese el monto disponible en el cajero: ");
        montoDisponible = scanner.nextDouble();

        
        System.out.print("Ingrese el monto que desea retirar: ");
        montoARetirar = scanner.nextDouble();

        
        if (montoARetirar <= montoDisponible) {  
            montoDisponible -= montoARetirar;
            System.out.println("Transacción exitosa.");
            System.out.println("Monto restante en el cajero: $" + montoDisponible);
        } else {
          
            System.out.println("Fondos insuficientes. No se puede realizar la transacción.");
        }

}
}