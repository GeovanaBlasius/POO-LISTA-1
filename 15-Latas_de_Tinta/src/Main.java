import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Vamos calcular quanta tinta você precisa!  ");
        System.out.print("Informe o tamanho em m² da área a ser pintada:");
        double tamanho = sc.nextDouble();

        double litros  = tamanho/3;
        double latas = litros/18;
        double custo = latas*80;
        System.out.println("---------------------------------------------------------------------------");
        System.out.println("Você precisa de " +String.format("%.2f" , litros )+ " Litros de tinta.");
        System.out.println("Você deve comprar " + String.format("%.2f" , latas) + " Latas de tinta.");
        System.out.println("Você vai gastar R$" + String.format("%.2f" , custo));
    }
}