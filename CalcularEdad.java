package TALLER3;
import java.util.Scanner;


public class CalcularEdad {
    Scanner scanner = new Scanner(System.in);{
    
    System.out.println("digite año de nacimiento y año actual");
    
    int Edad;
    int nacimiento;
    int actual;

    Scanner scanner = new Scanner(System.in);
    System.out.println("Ingrese el año de Nacimiento: ");
    nacimiento = scanner.nextInt();

    System.out.println("Ingrese el año Actual: ");
    actual = scanner.nextInt();

    Edad = actual - nacimiento;  
    System.out.printf("Tu edad es " + Edad + " Años");     
}
}