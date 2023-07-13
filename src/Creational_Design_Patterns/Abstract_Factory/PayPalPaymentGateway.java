package Creational_Design_Patterns.Abstract_Factory;

public class PayPalPaymentGateway extends PaymentGateway {
    public void processPayment(double amount) {
        System.out.println("Processing PayPal payment of $" + amount);
    }
}

