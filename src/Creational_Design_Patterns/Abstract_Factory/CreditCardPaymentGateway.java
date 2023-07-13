package Creational_Design_Patterns.Abstract_Factory;

public class CreditCardPaymentGateway extends PaymentGateway {
    public void processPayment(double amount) {
        System.out.println("Processing credit card payment of $" + amount);

    }
}

