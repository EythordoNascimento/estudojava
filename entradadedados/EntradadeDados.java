package entradadedados;

import java.util.Scanner;

public class EntradadeDados {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String x;
        int y;
        double z;
        x = sc.next();
        y = sc.nextInt();
        z = sc.nextDouble();
        System.out.println("Dados digitados: ");
        System.out.println(x);
        System.out.println(y);
        System.out.println(z);
        
        
        sc.close();
    }
}
/*
  ler numeros inteiro e decimal

   numero decimal
 * double x;
 * x = sc.nextDouble();
 * 
 * 
 * numero inteiro
 int x;
 x = sc.nextInt();
 */

/* Para ler vários dados na mesma linha 
 * basta chamar cada um por exemplo
 * 
 * string x;
 * int y;
 * double z;
 * 
 * 
 * x = sc.next()
 * Y = sc.nextInt();
 * z = sc.nextDouble();
 */

 