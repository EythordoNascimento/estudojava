package trycatch;

import java.util.Scanner;

public class tentarecapturar {
 public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);

    try {
            String[] vect = sc.nextLine().split(" ");
            int position = sc.nextInt();
            System.out.println(vect[position]);

    }
    catch (ArrayIndexOutOfBoundsException e) {
        System.out.println("Invalid Position!");
    }
    catch (IndexOutOfBoundsException e) {
        System.out.println("Input Error!");
    }

    System.out.println("End of program");

    sc.close();
    
 }
}