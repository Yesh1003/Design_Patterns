package Creational_Design_Patterns.Abstract_Factory;

public class Main {
    public static void main(String[] args) {

        PaymentGatewayFactory creditCardFactory = new CreditCardPaymentGatewayFactory();
        PaymentGateway creditCardGateway = creditCardFactory.createPaymentGateway();
        creditCardGateway.processPayment(100.0);


        PaymentGatewayFactory paypalFactory = new PayPalPaymentGatewayFactory();
        PaymentGateway paypalGateway = paypalFactory.createPaymentGateway();
        paypalGateway.processPayment(50.0);
    }
}
