public class Numero {
    public static void main(String[] args) {
        int Numero=80;

        if(Numero>50){
            if(Numero %2==0){
                System.out.println("el numero es par y mayor que 50");
            }
        }

        if(Numero<50){
            if(Numero %2==0){
                System.out.println("el numero es par, pero no es mayor que 50");
            }
        }

        if(Numero%2!=0){
            System.out.println("el numero no es par");
        }
    }
}
