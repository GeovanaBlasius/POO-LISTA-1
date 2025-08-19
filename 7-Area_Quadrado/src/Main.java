import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner en = new Scanner(System.in);
        System.out.println("Vamos calcular a área de um Quadrado! ");
        System.out.print("Informe o tamanha de um dos lados ");
        double lado = en.nextDouble();
        double area = lado*lado;

        System.out.printf("Área do círculo é: %.2f\n", area);
    }
}

