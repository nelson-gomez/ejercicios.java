package TALLER3;
import java.util.Scanner;

//Conversor de Tiempo Convierte una cantidad de segundos a formato horas:minutos:segundos.

public class ConversorTiempo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("digite los el numero de segundos a covertir ");
        int segundos =scanner.nextInt();

        int hora =segundos /3600;
        int minutos = (segundos % 3600) / 60;
        int segundosrestantes = segundos % 60;

        System.out.println("tiempo convertido ");
        System.out.println(hora + " horas, " + minutos + " minutos, " + segundosrestantes + " segundos.");
        

    }
}
