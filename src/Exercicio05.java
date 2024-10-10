import java.util.Locale;
import java.util.Scanner;

public class Exercicio05 {
    public static void main(String[] args) {
        /* Faça um algoritmo que leia o valor do salário mínimo e o valor do salário de um usuário, calcule quantos salários mínimos esse
        usuário ganha e imprima na tela o resultado. (Base para o Salário mínimo R$ 1.293,20). */
        Locale.setDefault(Locale.US);
        Scanner scanner = new Scanner(System.in);

        double salarioMinimo = 1293.2;

        System.out.println("Seu salário mínimo: ");
        double salarioMinimoUsuario = scanner.nextDouble();

        double x = salarioMinimoUsuario / salarioMinimo;

        System.out.printf("O usuário recebe %.1f salário(s) mínimo(s).", x);
    }
}
