package TALLER3;


import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class SimuladorDeInventario {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        
        Map<String, Integer> inventario = new HashMap<>();
        inventario.put("Manzanas", 50);
        inventario.put("Plátanos", 30);
        inventario.put("Naranjas", 20);

        System.out.println("Inventario inicial: " + inventario);

        System.out.print("Ingrese el número de ventas que desea registrar: ");
        int numVentas = scanner.nextInt();
        scanner.nextLine();

        for (int i = 0; i < numVentas; i++) {
            System.out.println("Registro de venta #" + (i + 1));
            System.out.print("Ingrese el producto vendido: ");
            String producto = scanner.nextLine();
            System.out.print("Ingrese la cantidad vendida: ");
            int cantidadVendida = scanner.nextInt();
            scanner.nextLine(); 

            if (inventario.containsKey(producto)) {
                int cantidadActual = inventario.get(producto);
                if (cantidadVendida <= cantidadActual) {
                    inventario.put(producto, cantidadActual - cantidadVendida);
                } else {
                    System.out.println("Error: No hay suficiente stock de " + producto);
                }
            } else {
                System.out.println("Error: Producto " + producto + " no encontrado en el inventario.");
            }
        }

        System.out.println("Inventario actualizado: " + inventario);
    }
}
}