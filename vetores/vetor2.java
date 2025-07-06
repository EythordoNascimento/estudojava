// Fazer um programa para ler um número inteiro N e os dados (nome e preço ) de N produtos. Armazene os N produtos em um vetor. Em seguida, mostrar o preço médio dos produtos

package vetores;

import java.util.Locale;
import java.util.Scanner;

 

public class vetor2 {
    
public static void main(String[] args) {
    Locale.setDefault(Locale.US);
    Scanner sc = new Scanner(System.in);

    int n = sc.nextInt();
    Productv2[] vect = new Productv2[n];

    for (int i=0; i<vect.length; i++) {
        sc.nextInt();
        String name = sc.nextLine();
        double price = sc.nextDouble();
        vect[i] = new Productv2(name, price);
    }

    double sum = 0.0;
    for (int i=0; i<vect.length; i++) {
        sum += vect[i].getPrice();

    }

    double avg = sum / vect.length;

    System.out.printf("AVERAGE PRICE = %.2f%n", avg);


    sc.close();
    
}
}
