public class Monto {
    public static void main(String[] args) {
        
        int Monto=50;
        int saldo=5000;
        int resultado=0;

        if (Monto<saldo){
           if(Monto<1000){
            System.out.println("retiro extiso");
            resultado=saldo-Monto;
            System.out.println(resultado);
           }
           if(Monto>1000){
            System.out.println("limite de retiro por transaccion $1000");
        }
        }
        else{
            System.out.println("fondos insuficientes");
        }
    }
    
}
