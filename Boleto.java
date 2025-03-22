public class Boleto {
    public static void main(String[]args){
        int boleto=70;


        if(boleto>5){
            if(boleto<17){
                System.out.println("el boleto cuesta $5");
            }
        }

        if(boleto>18){
            if(boleto<60){
                System.out.println("el boleto cuesta $10");
            }
        }

        if(boleto>60){
            System.out.println("el boleto cuesta $7.(descuento para adultos mayores)");
        }
    }
}
