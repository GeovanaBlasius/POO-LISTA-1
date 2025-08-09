import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
        public static void main(String[] args) {
            Scanner en = new Scanner(System.in);

            System.out.print("Digite o valor em metros a ser convertido para (Cm): ");
            float converter = en.nextFloat();
            System.out.print("Convertendo " + (converter*100) + "Cm");
        }
}
