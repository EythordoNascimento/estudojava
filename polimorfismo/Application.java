package polimorfismo;

import polimorfismo.entities.Account;
import polimorfismo.entities.SavingsAccount;

public class Application {
    public static void main(String[] args) {
        
        Account x = new Account(1020, "Alex", 1000.0);
        Account y = new SavingsAccount(1023, "Maria", 1000.0, 0.01);

        x.withdraw(50.0);
        y.withdraw(50.0);
        System.out.println(x.getBalance());
        System.out.println(y.getBalance());
    }
}
