package Creational_Design_Patterns.Factory;

public class BankAccountFactory {
    public static BankAccount createBankAccount(String accountNumber, String accountType) {
        if (accountType.equalsIgnoreCase("savings")) {
            return new SavingsAccount(accountNumber);
        } else if (accountType.equalsIgnoreCase("salary")) {
            return new SalaryAccount(accountNumber);
        } else {
            throw new IllegalArgumentException("Invalid account type.");
        }
    }
}

