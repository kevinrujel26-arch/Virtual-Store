package Service;

import Adapter.*;
import Modelo.*;
import Observer.*;
import Strategy.*;
import java.util.*;

public class OrderService {
    private List<OrderObserver> observers = new ArrayList<>();

    public void agregarObserver(
            OrderObserver observer) {

        observers.add(observer);
    }
    public void notificarObservers(String mensaje){

        for (OrderObserver observer : observers){

            observer.update(mensaje);
        }
    }
    public void procesarCompra(Cart cart, DiscountStrategy discountStrategy, PaymentProcessor paymentProcessor){
        double total = cart.calcularTotal();

        total = discountStrategy.applyDiscount(total);

        paymentProcessor.pay(total);

        System.out.println("Compra confirmada por S/ " + total);

        notificarObservers("Compra realizada");
    }
}