package Adapter;

public class PaypalAdapter implements PaymentProcessor{

    private  ExternalPayPalService payPalService;

    public PaypalAdapter(ExternalPayPalService payPalService){

        this.payPalService = payPalService;

    }

    @Override

    public void pay(double amount) {

        payPalService.makePayment("PEN", amount);

    }
}