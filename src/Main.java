import Adapter.*;
import Modelo.*;
import Observer.*;
import Strategy.*;
import Service.*;

public class Main {
    public static void main(String[]args){
        Product product1 = new Product("Laptop", 3000);
        Product product2 = new Product("Mouse", 100);

        Cart cart = new Cart();

        cart.agregarProducto((product1));
        cart.agregarProducto((product2));

        DiscountStrategy descuento = new PercentageDiscountStrategy(10);

        PaymentProcessor pago = new PaypalAdapter(new ExternalPayPalService());

        OrderService orderService = new OrderService();

        orderService.agregarObserver(new EmailNotificationObserver());

        orderService.agregarObserver(new InventoryObserver());

        orderService.agregarObserver(new AdminNotificationObserver());

        orderService.procesarCompra(cart,descuento,pago);
    }
}