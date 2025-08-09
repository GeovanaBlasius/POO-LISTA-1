import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner en = new Scanner(System.in);

        System.out.print("Digite o primeiro número inteiro: ");
        int n1 = en.nextInt();
        System.out.print("Digite segundo número inteiro : ");
        int n2 = en.nextInt();
        System.out.print("Digite um número real: ");
        float n3 = en.nextFloat();
        double A = ((2*n1)*(n2/2.0));
        double B = (3*n1+n3);
        double C = (n3*n3*n3);

        System.out.println("O produto do dobro do primeiro com metade do segundo = " + A);
        System.out.println("A soma do triplo do primeiro com o terceiro = " + B);
        System.out.println("O terceiro elevado ao cubo = " + C);
    }
}
