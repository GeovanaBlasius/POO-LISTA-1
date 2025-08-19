import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner en = new Scanner(System.in);
        System.out.println("Convertendo Farenheit para Celsius!! ");
        System.out.print("Digite um valor em Farenheit: ");
        double F = en.nextDouble();
        double C = (5 * (F-32) / 9);

        System.out.println("Convertendo " + F + " Farenheit para Celsius " );
        System.out.println(" | ");
        System.out.println(" v ");
        System.out.print (String.format("%.2f", C ) + " °C");
    }
}
