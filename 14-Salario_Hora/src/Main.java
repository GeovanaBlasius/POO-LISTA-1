import java.util.Scanner;

public class Main{
    public static void main(String[] args) {
        Scanner en = new Scanner(System.in);

        System.out.print("Informe seu salário por hora:");
        double salario = en.nextDouble();
        System.out.print("Informe o total de horas trabalhadas no mês:");
        double horasTrabalhadas = en.nextDouble();

        double salariobruto = salario * horasTrabalhadas;
        double ir = salariobruto*0.11;
        double inss = salariobruto*0.08;
        double sindicato = salariobruto*0.05;
        double salarioLiquido = salariobruto - ir - inss - sindicato;

        System.out.println("\n--- Demonstrativo de Pagamento ---");
        System.out.printf("+ Salário Bruto:     R$ %.2f%n", salariobruto);
        System.out.printf("- IR (11%%):         R$ %.2f%n", ir);
        System.out.printf("- INSS (8%%):        R$ %.2f%n", inss);
        System.out.printf("- Sindicato (5%%):   R$ %.2f%n", sindicato);
        System.out.printf("= Salário Líquido:   R$ %.2f%n", salarioLiquido);
    }
}
