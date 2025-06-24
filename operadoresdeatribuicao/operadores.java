package operadoresdeatribuicao;

import java.util.Locale;
import java.util.Scanner;

public class operadores {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        int minutos = sc.nextInt();

        double conta = 50.0;
        if (minutos > 100) {
            conta += (minutos - 100) * 2.0;
           // conta = conta + (minutos - 100) * 2.0;

        }

        System.out.printf("Valor da conta = R$ %.2f%n", conta);


        sc.close();
    }
}

/* Operadores de atribuição 1
 * a += b; é a mesma coisa que a = a + b;
 * a -= b; é a mesma coisa que a = a - b;
 * a *= b; é a mesma coisa que a = a * b;
 * a /= b; é a mesma coisa que a = a / b;
 * a = b; é a mesma coisa que a = a % b;
 */
