package Creational_Design_Patterns.Singleton;

public class Account {

    private static Account instance;
    private Account() {
    }

    public static Account getInstance(){

        if(instance == null){
            synchronized (Account.class){
                if(instance == null){

                    instance = new Account();
                }
            }
        }

        return instance;
    }

    public static void main(String[] args) {

        Account A1 = Account.getInstance();

        System.out.println(A1);

        Account A2 = Account.getInstance();

        System.out.println(A2);
    }
}
