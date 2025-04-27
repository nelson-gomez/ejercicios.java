package TALLER3;
import java.util.Scanner;
public class CalculadoraPropina {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("ingresa los montos: ");
        int monto1=scanner.nextInt();
        int monto2=scanner.nextInt();
        int monto3=scanner.nextInt();
        
    
        int total=monto1+monto2+monto3;
        System.out.println("total apagar " +total);
        
        System.out.println("ingrese el porcentaje de propina");
        int propina=scanner.nextInt();
        propina = (propina * total) / 100;
        System.out.println("el total de la propina es "+propina);




    }
}
