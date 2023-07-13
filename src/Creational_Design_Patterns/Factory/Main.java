package Creational_Design_Patterns.Factory;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        System.out.println("Enter the type of account you want to create:");

        String acc_type;

        Scanner sc = new Scanner(System.in);

        acc_type = sc.nextLine();

        BankAccount Account = BankAccountFactory.createBankAccount("123456789", acc_type);
        System.out.println("Account created");
        System.out.println("Account Type: " + Account.getAccountType());
        System.out.println("Account Number: " + Account.getAccountNumber());

        Account.deposit(1000.0);
        Account.withdraw(500.0);

        System.out.println("Current Balance: $" + Account.getBalance());

    }
}

