import java.util.Scanner;

public class Exercicio03 {
    public static void main(String[] args) {
        /* Faça um algoritmo que leia dois valores inteiros A e B, se os valores de A e B forem iguais, deverá somar os dois valores,
        caso contrário devera multiplicar A por B. Ao final de qualquer um dos cálculos deve-se atribuir o resultado a uma variável C e
        imprimir seu valor na tela. */

        Scanner scanner = new Scanner(System.in);

        System.out.print("a: ");
        int a = scanner.nextInt();

        System.out.print("b: ");
        int b = scanner.nextInt();

        int somaAB = 0;
        int multiplicacaoAB = 0;

        if (a == b || b == a) {
            somaAB = a + b;
            int c = somaAB;
            System.out.println("Soma: " + somaAB);
        } else {
            multiplicacaoAB = a * b;
            int c = multiplicacaoAB;
            System.out.println("Multiplacação: " + multiplicacaoAB);
        }


    }
}
