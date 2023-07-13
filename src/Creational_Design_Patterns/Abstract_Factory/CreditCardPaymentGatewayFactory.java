package Creational_Design_Patterns.Abstract_Factory;

public class CreditCardPaymentGatewayFactory extends PaymentGatewayFactory {
    public PaymentGateway createPaymentGateway() {
        return new CreditCardPaymentGateway();
    }
}

