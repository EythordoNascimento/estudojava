// Fazer um programa para ler os dados de um produto em estoque (nome, preço e quantoidade no estoque) Em seguida:
//Mostrar os dados do produto (nome, preço, quantidade no estoque, valor total no estoque)
//Realizar uma entrada no estoque e mostrar novamente os dados do produto
//Realizar uma saída no estoque e mostrar novamente os dados do produto

package construtor;

import java.util.Scanner;
import java.util.Locale;

public class construtor{
    
  public static void main(String[] args) {
    Locale.setDefault(Locale.US);
    Scanner sc = new Scanner(System.in);

    System.out.println("Enter product data: ");
    System.out.print("Name: ");
    String name = sc.nextLine();
    System.out.print("Price: ");
    double price = sc.nextDouble();
     Product product = new Product(name, price);

    System.out.println();
    System.out.println("Product data: " + product);

    System.out.println();
    System.out.print("Enter the number of products to be added in stock");
    int quantity = sc.nextInt();
    product.addProducts(quantity);

    System.out.println();
    System.out.println("Update data: " + product);

    System.out.println();
    System.out.print("Enter the number of products to be removed in stock");
    quantity = sc.nextInt();
    product.removeProducts(quantity);

    System.out.println();
    System.out.println("Update data: " + product);



 
    sc.close();
  }

}
