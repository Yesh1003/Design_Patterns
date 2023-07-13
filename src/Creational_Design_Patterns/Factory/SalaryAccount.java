package Creational_Design_Patterns.Factory;

public class SalaryAccount extends BankAccount {
    public SalaryAccount(String accountNumber) {
        super(accountNumber);
    }

    public String getAccountType() {
        return "Salary";
    }
}

