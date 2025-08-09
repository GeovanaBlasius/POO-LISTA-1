import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        Scanner en = new Scanner(System.in);
        System.out.print("Quanto você ganha por hora?: ");
        double shora = en.nextDouble();
        System.out.print("São quantas horas trabalhadas por mês: ");
        double horastrabalhadas = en.nextDouble();
        double salario = shora * horastrabalhadas;

        System.out.println("Você ganha R$ " + String.format("%.2f", salario) + " por mês.");
        //String.format -> modelo de formatação, adicionou os 2 zeros após a vírgula no resultado.
    }
}
