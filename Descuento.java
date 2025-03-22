public class Descuento {
    public static void main(String[]args){
        int Descuento=600;

        if(Descuento>=1000){
            System.out.println("recibe un descuento del 20%");
        }

        if(Descuento>500){
            if(Descuento<999){
                System.out.println("recibe un descuento del 10%");
            }
        }

        if(Descuento<500){
            System.out.println("no recibe descuento ");
        }
    }
}
