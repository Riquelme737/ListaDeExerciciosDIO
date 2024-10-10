import java.util.Scanner;

public class Exercicio17 {
    public static void main(String[] args) {
        /* Faça um algoritmo que leia uma temperatura em Fahrenheit e calcule a temperatura correspondente em grau Celsius. Imprima na tela as duas temperaturas.
        Fórmula: C = (5 * ( F-32) / 9)*/

        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite uma temperatura em Fahrenheit: ");
        int f = scanner.nextInt();

        int c = (5 * (f - 32) / 9);

        System.out.printf("%d°F é igual à %d°C", f, c);
    }
}
