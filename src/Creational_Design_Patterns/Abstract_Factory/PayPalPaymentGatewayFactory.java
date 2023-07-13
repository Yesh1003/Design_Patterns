package Creational_Design_Patterns.Abstract_Factory;

// Concrete PayPalPaymentGatewayFactory class
public class PayPalPaymentGatewayFactory extends PaymentGatewayFactory {
    public PaymentGateway createPaymentGateway() {
        return new PayPalPaymentGateway();
    }
}

