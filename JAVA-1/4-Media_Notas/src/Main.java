import java.util.Scanner;

public class Main {
            public static void main(String[] args) {
                Scanner en = new Scanner(System.in);

                System .out.print("Digite a primeira nota: ");
                float nota1 = en.nextFloat();
                System .out.print("Digite a segunda nota: ");
                float nota2 = en.nextFloat();
                System .out.print("Digite a terceira nota: ");
                float nota3 = en.nextFloat();
                System .out.print("Digite a quarta nota: ");
                float nota4 = en.nextFloat();
                System .out.print("A média é " +(nota1+nota2+nota3+nota4)/4);

            }
        }
