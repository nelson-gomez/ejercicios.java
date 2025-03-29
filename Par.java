public class Par {
    public static void main(String[] args) {
        int numero=1;
        int par=0;
        
        for (numero=1;numero<=10;numero=numero+1){
           par=numero%2;
           if(par==0){
            System.out.println("numero par "+numero);
           }
            
        }
    }
}
