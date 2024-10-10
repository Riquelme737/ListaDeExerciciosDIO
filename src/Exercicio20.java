import java.util.Scanner;

public class Exercicio20 {
    public static void main(String[] args) {
        // Faça um algoritmo que receba um valor inteiro e imprima na tela a sua tabuada.

        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite um número: ");
        int num = scanner.nextInt();

        for (int i = 1; i <= 11; i++) {
            System.out.printf("%d x %d = %d\n", num, i, num*i);
        }
    }
}
