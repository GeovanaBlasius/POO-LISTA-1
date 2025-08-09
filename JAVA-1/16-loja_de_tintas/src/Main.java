import java.util.Scanner;

public class Main{
    public static void main(String[] args) {
        Scanner en = new Scanner(System.in);

        System.out.println("Vamos calcular quanta tinta você precisa!  ");
        System.out.print("Informe o tamanho em m² da área a ser pintada:");
        double tamanho = en.nextDouble();

        double litros  = tamanho/6;
        double latas = litros/18;
        double galoes = litros/3.6;
        double precogaloes = galoes*25;
        double custo = latas*80;
        System.out.println("---------------------------------------------------------------------------");
        System.out.println("Você precisa de " +String.format("%.2f" , litros )+ " Litros de tinta.");
        System.out.println("Você deve comprar " + String.format("%.2f" , latas) + " Latas de tinta.");
        System.out.println("Você vai pagar pelas latas de tinta R$" + String.format("%.2f" , custo));
        System.out.println("Ou, você precisa de " + String.format("%.2f" , galoes) + " galões de tinta.");
        System.out.println("Você vai pagar pelos galões R$ " + String.format("%.2f" , precogaloes));
    }
}

