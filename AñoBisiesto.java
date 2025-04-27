package TALLER3;
import java.util.Scanner;
public class AñoBisiesto {
   
   public static void main(String[] args) {

      Scanner scanner = new Scanner(System.in);
       
      System.out.println("introduce el año: ");
      int año=scanner.nextInt();
        
        if (año %4 == 0 || año %100==0){
            System.out.println("año bisiesto");
        }
        else{
                System.out.println("no es bisiesto");
        }
   }
     

}