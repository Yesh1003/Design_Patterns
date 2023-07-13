package Creational_Design_Patterns.Factory;

public class SavingsAccount extends BankAccount {
    public SavingsAccount(String accountNumber) {
        super(accountNumber);
    }

    public String getAccountType() {
        return "Savings";
    }
}

