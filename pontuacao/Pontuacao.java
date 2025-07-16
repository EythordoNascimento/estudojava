package pontuacao;

import java.util.Scanner;

public class Pontuacao {
    public static void main(String[] args) {
         Scanner scanner = new Scanner(System.in);

        System.out.print("Digite a pontuação por questão: ");
        double pontuacaoPorQuestao = scanner.nextDouble();

        System.out.print("gigite a quantidade de questões corretas: ");
        int quantidadeAcertos = scanner.nextInt();

        double pontuacaoTotal = pontuacaoPorQuestao * quantidadeAcertos;

        System.out.println("pontuação total do estudante: " + pontuacaoTotal);
        
        scanner.close();

    }
}
