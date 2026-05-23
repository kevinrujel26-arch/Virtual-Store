package Adapter;
import  java.util.*;
public class Cart {

    private List<Product> productos
            = new ArrayList<>();

    public void agregarProducto(Product producto) {

        productos.add(producto);
    }

    public double calcularTotal() {

        double total = 0;

        for(Product producto : productos) {

            total += producto.getPrecio();
        }

        return total;
    }
}
