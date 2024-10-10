import java.util.Scanner;

public class Exercicio02 {
    public static void main(String[] args) {
        // Faça um algoritmo para receber um número qualquer e imprimir na tela se o número é par ou ímpar, positivo ou negativo.

        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();

        String imparOuPar = (n % 2 == 0) ? "PAR!" : "IMPAR!";
        String positivoOuNegativo = (n > 0) ? "POSITIVO!" : "NEGATIVO!";

        System.out.println(imparOuPar);
        System.out.println(positivoOuNegativo);
    }
}
