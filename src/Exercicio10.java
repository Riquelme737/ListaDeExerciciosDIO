import java.util.Locale;
import java.util.Scanner;

public class Exercicio10 {
    public static void main(String[] args) {
        // Faça um algoritmo que leia três notas obtidas por um aluno, e imprima na tela a média das notas.
        Locale.setDefault(Locale.US);
        Scanner scanner = new Scanner(System.in);

        System.out.print("Primeira Nota: ");
        double nota1 = scanner.nextDouble();
        System.out.print("Segunda Nota: ");
        double nota2 = scanner.nextDouble();
        System.out.print("Terceira Nota: ");
        double nota3 = scanner.nextDouble();

        System.out.print("A média das notas é: ");
        double media = (nota1 + nota2 + nota3) / 3;
        System.out.printf("%.2f", media);
    }
}
