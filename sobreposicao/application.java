package sobreposicao;



import sobreposicao.entities.Account;
import sobreposicao.entities.SavingsAccount;

public class application {
 public static void main(String[] args) {
    
    Account acc1 = new Account(1001, "Alex", 1000.0);
    acc1.withdraw(200.0);
    System.out.println(acc1.getBalance());

    Account acc2 = new SavingsAccount(1002, "Maria", 1000.0, 0.01);
    acc2.withdraw(200.0);
    System.out.println(acc2.getBalance());
 }
    
}