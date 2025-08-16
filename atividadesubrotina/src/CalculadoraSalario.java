import java.util.Scanner;

public class CalculadoraSalario {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite o valor do salário bruto: ");
        double salarioBruto = sc.nextDouble();

        double desconto = calcularDesconto(salarioBruto);
        double salarioLiquido = salarioBruto - desconto;

        System.out.println("Desconto: R$ " + desconto);
        System.out.println("Salário líquido: R$ " + salarioLiquido);

        sc.close();
    }

    public static double calcularDesconto(double salarioBruto) {
        double percentual;

        if (salarioBruto <= 2000) {
            percentual = 0;
        } else if (salarioBruto <= 4000) {
            percentual = 2;
        } else {
            percentual = 4;
        }

        double desconto = salarioBruto * percentual / 100;

        if (desconto > 400) {
            desconto = 400;
        }

        return desconto;
    }
}