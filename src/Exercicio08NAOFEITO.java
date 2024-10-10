import java.util.Arrays;
import java.util.Scanner;

public class Exercicio08NAOFEITO {
    public static void main(String[] args) {
        // Faça um algoritmo que leia três valores inteiros diferentes e imprima na tela os valores em ordem decrescente.

        Scanner scanner = new Scanner(System.in);

        System.out.print("A: ");
        int a = scanner.nextInt();
        System.out.print("B: ");
        int b = scanner.nextInt();
        System.out.print("C: ");
        int c = scanner.nextInt();

        int[] numeros = {a, b, c};
        Arrays.sort(numeros);

        System.out.print("Números em ordem decrescente: ");
        for (int i = numeros.length - 1; i >= 0; i--) {
            System.out.print(numeros[i] + " ");
        }
    }
}
