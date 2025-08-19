import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner en = new Scanner(System.in);
        System.out.println("Vamos calcular a área de um círculo!!  ");
        System.out.print("Informe o Raio do circulo: ");
        double raio = en.nextDouble();
        double area = 3.14 * raio * raio;
        System.out.printf("Área do círculo é: %.2f\n", area);
    }
}
