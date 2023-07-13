package Creational_Design_Patterns.Factory;


public abstract class BankAccount {
    protected String accountNumber;
    protected double balance;

    public BankAccount(String accountNumber) {
        this.accountNumber = accountNumber;
        this.balance = 0.0;
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public double getBalance() {
        return balance;
    }

    public abstract String getAccountType();

    public void deposit(double amount) {
        balance += amount;
        System.out.println("Deposited $" + amount + " into account: " + accountNumber);
    }

    public void withdraw(double amount) {
        if (balance >= amount) {
            balance -= amount;
            System.out.println("Withdrawn $" + amount + " from account: " + accountNumber);
        } else {
            System.out.println("Insufficient balance in account: " + accountNumber);
        }
    }
}

