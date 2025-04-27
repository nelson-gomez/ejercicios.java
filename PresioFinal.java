package TALLER3;

import java.util.HashMap;
import java.util.Map;

public class PresioFinal {
    public static void main(String[] args) {
        
        Map<String, Double> productos = new HashMap<>();
        productos.put("Camisa", 50.0);
        productos.put("Pantalón", 80.0);
        productos.put("Zapatos", 120.0);

        Map<String, Double> descuentos = new HashMap<>();
        descuentos.put("Camisa", 10.0); // 10% de descuento
        descuentos.put("Pantalón", 20.0); // 20% de descuento
        descuentos.put("Zapatos", 15.0); // 15% de descuento

        double precioFinal = calcularPrecioFinal(productos, descuentos);
        
        System.out.println("El precio total final es: $" + precioFinal);
    }

    public static double calcularPrecioFinal(Map<String, Double> productos, Map<String, Double> descuentos) {
        double total = 0.0;

        for (Map.Entry<String, Double> producto : productos.entrySet()) {
            String nombreProducto = producto.getKey();
            double precio = producto.getValue();
            double descuento = descuentos.getOrDefault(nombreProducto, 0.0); 
            
            double precioConDescuento = precio - (precio * descuento / 100);
            total += precioConDescuento;
        }

        return total;
    }
}
