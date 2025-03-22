public class Usuario {
    public static void main(String[] args) {
       String Usuario="admin";
       int contrasena=123;

       if(Usuario =="admin"){
        if(contrasena==123){
            System.out.println("acceso concedido" );
        }
       }
       if(Usuario!="123"){
        System.out.println("contrasena incorrecta");
       }
       if(Usuario!="admin"){
        System.out.println("usuario no encontrado");
       }
    }
}
