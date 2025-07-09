/*
 * A DONA DE UM PENSIOATO POSSUI DEZ QUARTO PARA ALUGAR PARA ESTUDANTES SENDO ESSES QUARTOS QUARTOS IDENTIFICADOS PELOS NÚMEROS 0 A 9.
 */

 // Fazer um programa que inicie com todos os dez quartos vazios e depois leia uma quantidade N representando o número de estudantes que vão alugar quartos (N pode ser de 1 a 10). Em Seguida registre o aluguel dos esudante, bem como o quarto ele escolheu (de 0 a 9). Suponha que seja como qual dos quarto vago. Ao final seu programa deve imprimir um relatorio de todas ocupações do pensionato, por ondem de quarto.
package desafio;

import java.util.Locale;
import java.util.Scanner;

public class application {
  public static void main(String[] args) {
    Locale.setDefault(Locale.US);
    Scanner sc = new Scanner(System.in); 
     
    Rent[] vect = new Rent[10];

    System.out.print("How many rooms will be rented? ");
    int n = sc.nextInt();

    for ( int i = 1; i<=n; i++) { 
        System.out.println();
        System.out.println("Rent #" + i + ": ");
        System.out.print("Name: ");
        sc.nextLine();
        String name = sc.nextLine();
        System.out.print("Email: ");
        String email = sc.next();
        System.out.print("Room: "); 
        int roomNumber = sc.nextInt();

        vect[roomNumber] = new Rent(name, email);

    }

    System.out.println();
    System.out.println("Busy rooms: ");
    for (int i = 0; i < 10; i++) {
        if (vect[i] != null) {
            System.out.println(i + ": " + vect[i]);
        }
    }

    sc.close();
  }
}
