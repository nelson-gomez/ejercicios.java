package TALLER3;
import java.util.Scanner;
public class CasaDeCambio {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);{
            // cantidad de dinero
            System.out.println("ingresa el dinero a convertir");
            double dinero=scanner.nextDouble();

            //monedad de cambio
            System.out.println("tasa de cambio de la primrera moneda");
            double cambio1=scanner.nextDouble();
            System.out.println("tasa de cambio de la segunda moneda");
            double cambio2=scanner.nextDouble();
            System.out.println("tasa de cambio de la tercera moneda");
            double cambio3=scanner.nextDouble();

            double conversion1 = dinero * cambio1;
            double conversion2 = dinero * cambio2;
            double conversion3 = dinero * cambio3;

            System.out.println("Conversión de divisas:");
            System.out.println("Primera moneda: " + conversion1);
            System.out.println("Segunda moneda: " + conversion2);
            System.out.println("Tercera moneda: " + conversion3);









    }
}
}
