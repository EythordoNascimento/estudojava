package exercicoclassesabstratas;

import java.util.ArrayList;
import java.util.List;

import exercicoclassesabstratas.entities.Account;
import exercicoclassesabstratas.entities.BusinessAccount;
import exercicoclassesabstratas.entities.SavingsAccount;

public class Program {

	public static void main(String[] args) {

		List<Account> list = new ArrayList<>();

		// Criando contas e adicionando à lista
		Account acc1 = new Account(1001, "Alex", 1000.0);
		Account acc2 = new SavingsAccount(1002, "Maria", 1000.0, 0.01);
		Account acc3 = new BusinessAccount(1003, "Bob", 1000.0, 500.0);

		list.add(acc1);
		list.add(acc2);
		list.add(acc3);

		// Saques
		acc1.withdraw(200.0);
		System.out.println("Alex balance: " + acc1.getBalance());

		acc2.withdraw(200.0);
		System.out.println("Maria balance: " + acc2.getBalance());

		acc3.withdraw(200.0);
		System.out.println("Bob balance: " + acc3.getBalance());

		// Somando os saldos
		double sum = 0.0;
		for (Account acc : list) {
			sum += acc.getBalance();
		}
		System.out.printf("Total balance: %.2f%n", sum);

		// Depósitos
		for (Account acc : list) {
			acc.deposit(10.0);
		}

		// Mostrando os saldos atualizados
		for (Account acc : list) {
			System.out.printf("Updated balance for account %d: %.2f%n", acc.getNumber(), acc.getBalance());
		}
	}
}
