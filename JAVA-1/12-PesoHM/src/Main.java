import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner en = new Scanner(System.in);

        System.out.println("Calculando seu peso ideal!! ");
        System.out.print("Digite sua altura :");
        double altura = en.nextDouble();
        double homens = ((72.7*altura) - 58);
        double mulheres =((62.1*altura) - 44.7);

        System.out.println("Se você for Homem seu peso ideal é " + homens );
        System.out.print("Se você for Mulher seu peso ideal é " + mulheres );
    }
}
