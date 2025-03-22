public class Clima {
    public static void main(String[] args) {
        int Clima=36;

        if(Clima<10){
            System.out.println("dia muy frio");
        }

        if(Clima>10){ 
        if(Clima<20){
            System.out.println("dia fresco");
        }
        }
        if(Clima>21){ 
            if(Clima<30){
                System.out.println("dia calido");
            }
        }

        if(Clima>30){
            System.out.println("dia muy caluroso");

        }    
        
    }
}
