/*Fazer um programa que lê números inteiros até que um zero seja lido. Ao final mostrar a soma dos numeros lidos */


package repetitivaenquanto;

import java.util.Scanner;

public class enquanto {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        
        int soma = 0;
        while (x != 0){
            soma += x;
            x = sc.nextInt();
        }
        
        System.out.println(soma);
        
        sc.close();
    }
}

/*É uma estrutura de controle que repete um bloco de comandos enquanto uma consição for verdadeira 
 * 
 * 
 * Quando usar: quando não se sabe previamente a quantidade de repetições que será realizada
*/

