import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner en = new Scanner(System.in);

        System.out.println("Vamos calcular o seu peso ideal !");
        System.out.print("Informe sua altura :");
        double altura = en.nextDouble();
        double pesoideal = ((72.7 * altura) - 58);

        System.out.print("Seu peso ideal é " + String.format("%.2f", pesoideal) + "Kg ");
    }
}
