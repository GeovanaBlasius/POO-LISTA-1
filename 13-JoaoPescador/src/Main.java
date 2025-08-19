import java.util.Scanner;

public class Main{
    public static void main(String[] args) {
        Scanner en = new Scanner(System.in);

        System.out.print("Informe o peso total de peixes pescados: ");
        double peso = en.nextDouble();
        double excesso = Math.max(0, peso - 50);
        double multa = excesso * 4;

        System.out.printf("Excesso: %.2f kg%n", excesso);
        System.out.printf("Multa: R$ %.2f%n", multa);
    }
}
