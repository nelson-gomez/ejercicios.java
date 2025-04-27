package TALLER3;
import java.time.Year;
import java.util.Scanner;
public class MayorEdad {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Solicitar al usuario el año de nacimiento
        System.out.print("Ingresa tu año de nacimiento: ");
        int añioNacimiento = scanner.nextInt();

        // Solicitar el país
        System.out.print("Ingresa tu país (ejemplo: EEUU, Colombia, Reino Unido): ");
        String pais = scanner.next();

        int añioActual = Year.now().getValue();
        int edad = añioActual - añioNacimiento;

        int edadMayoria = 18; 
        if (pais.equalsIgnoreCase("EEUU")) {
            edadMayoria = 21; 
        } else if (pais.equalsIgnoreCase("Reino Unido")) {
            edadMayoria = 16; 
        } 

       
        if (edad >= edadMayoria) {
            System.out.println("Eres mayor de edad en " + pais + ".");
        } else {
            System.out.println("No eres mayor de edad en " + pais + ".");
        }

        
      
    }
}


