package heranca;

import heranca.entities.BusinessAccount;

public class application {
    public static void main(String[] args) {

        BusinessAccount account = new BusinessAccount(8010, "Bob Brown", 0.0, 500.0);

        System.out.println("Saldo inicial: R$ " + account.getBalance());

        account.loan(200.0);
        System.out.println("Saldo após empréstimo: R$ " + account.getBalance());
    }
}