import java.util.Scanner;

public class Main {
    public class Soma_DoisN {
        public static void main(String[] args) {
            Scanner en = new Scanner(System.in);

            System.out.print("Digite o 1° numero : ");
            int num = en.nextInt();
            System.out.print("Digite o 2° numero : ");
            int num2 = en.nextInt();
            System.out.print("Soma = " + (num + num2));
        }
    }
}