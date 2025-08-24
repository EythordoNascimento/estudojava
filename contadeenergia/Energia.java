package contadeenergia;

import java.util.Scanner;

public class Energia {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Entrada de dados
        System.out.print("Digite a leitura anterior (kWh): ");
        int leituraAnterior = sc.nextInt();

        System.out.print("Digite a leitura atual (kWh): ");
        int leituraAtual = sc.nextInt();

 
        int consumo = calcularConsumo(leituraAnterior, leituraAtual);
        double valorConta = calcularValorConta(consumo);
        String classificacao = classificarConta(valorConta);

     
        System.out.println("\nConsumo de energia: " + consumo + " kWh");
        System.out.printf("Valor da conta: R$ %.2f\n", valorConta);
        System.out.println("Classificação: " + classificacao);
    }

   
    public static int calcularConsumo(int anterior, int atual) {
        return atual - anterior;
    }

    public static double calcularValorConta(int consumo) {
        double valorKWh;

        if (consumo <= 100) {
            valorKWh = 0.48;
        } else if (consumo <= 200) {
            valorKWh = 0.55;
        } else if (consumo <= 500) {
            valorKWh = 0.65;
        } else {
            valorKWh = 0.75;
        }

        double valor = consumo * valorKWh;

     
        return Math.max(valor, 25.00);
    }

  
    public static String classificarConta(double valor) {
        if (valor <= 100.00) {
            return "Consumo baixo";
        } else if (valor <= 400.00) {
            return "Consumo médio";
        } else {
            return "Consumo máximo";
        }
    }
}
