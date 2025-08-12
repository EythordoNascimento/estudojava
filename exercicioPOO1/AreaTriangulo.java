import java.util.Scanner;

public class AreaTriangulo
{
	public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.print("1º lado: ");
        double ladoA = input.nextDouble();

        System.out.print("2º lado: ");
        double ladoB = input.nextDouble();

        System.out.print("3º lado: ");
        double ladoC = input.nextDouble();

        double semiPerimetro = (ladoA+ladoB+ladoC)/2;
        
        double area = Math.sqrt(semiPerimetro *
                               (semiPerimetro-ladoA) *
                               (semiPerimetro-ladoB) *
                               (semiPerimetro-ladoC));	

        System.out.printf("Área do triângulo: %.1f\n", area);

        if (ladoA==ladoB && ladoA==ladoC) {
            System.out.println("Tipo do triângulo: Equilátero");
        }
        else if (ladoA!=ladoB && ladoB!=ladoC && ladoA!=ladoC){
            System.out.println("Tipo do triângulo: Escaleno");
        }
        else {
            System.out.println("Tipo do triângulo: Isóceles");
        }	    

        input.close();
	}
}