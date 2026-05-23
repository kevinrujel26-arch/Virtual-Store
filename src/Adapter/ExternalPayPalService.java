package Adapter;

public class ExternalPayPalService {

    public void  makePayment(String currency, double amount){

        System.out.println(
                "Pago realizado con Paypal: " + currency + " " + amount);

    }
}
