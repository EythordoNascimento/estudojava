package upcasting_e_downcasting;

import upcasting_e_downcasting.entities.Account;
import upcasting_e_downcasting.entities.BusinessAccount;
import upcasting_e_downcasting.entities.SavingsAccount;

public class application { 

    public static void main(String[] args) {

        Account acc = new Account(1001, "Alex", 0.0);
        System.out.println("Titular: " + acc.getHolder() + " | Saldo: " + acc.getBalance());

        BusinessAccount bacc = new BusinessAccount(1002, "Maria", 0.0, 500.0);

        // UPCASTING
        Account acc1 = bacc;
        System.out.println("Titular via upcasting: " + acc1.getHolder() + " | Saldo: " + acc1.getBalance());

        Account acc2 = new BusinessAccount(1003, "Bob", 0.0, 200.0);
        Account acc3 = new SavingsAccount(1004, "Anna", 0.0, 0.01);

        // DOWNCASTING
        BusinessAccount acc4 = (BusinessAccount) acc2;
        acc4.loan(100.0);
        System.out.println("Bob após empréstimo: " + acc4.getBalance());

        if (acc3 instanceof BusinessAccount) {
            BusinessAccount acc5 = (BusinessAccount) acc3;
            acc5.loan(200.0);
            System.out.println("Loan!");
        }

        if (acc3 instanceof SavingsAccount) {
            SavingsAccount acc5 = (SavingsAccount) acc3;
            acc5.updateBalance();
            System.out.println("Update! Novo saldo de Anna: " + acc5.getBalance());
        }
    }
}