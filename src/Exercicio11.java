import java.util.Locale;
import java.util.Scanner;

public class Exercicio11 {
    public static void main(String[] args) {
        /* Faça um algoritmo que leia quatro notas obtidas por um aluno, calcule a média das nota obtidas, imprima na tela o nome do aluno e
        se o aluno foi aprovado ou reprovado. Para o aluno ser considerado aprovado sua média final deve ser maior ou igual a 7.*/
        Locale.setDefault(Locale.US);
        Scanner scanner = new Scanner(System.in);

        System.out.print("Escreva seu nome: ");
        String nomeAluno = scanner.nextLine();

        System.out.println("Escreva suas quatro notas: ");
        double nota1 = scanner.nextDouble();
        double nota2 = scanner.nextDouble();
        double nota3 = scanner.nextDouble();
        double nota4 = scanner.nextDouble();

        double media = (nota1 + nota2 + nota3 + nota4) / 4;
        System.out.print("Sua nota final é: \n" + media);
        System.out.printf((media >= 7.0 ? "%s foi aprovado!" : "%s foi reprovado!"), nomeAluno);

    }
}
