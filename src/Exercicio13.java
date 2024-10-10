import java.util.Scanner;

public class Exercicio13 {
    public static void main(String[] args) {
        // Faça algoritmo que leia o nome e a idade de uma peso e imprima na tela o nome da pessoa e se ela é maior ou menor de idade.

        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite seu nome: ");
        String nome = scanner.next();
        System.out.print("Digite sua idade: ");
        byte idade = scanner.nextByte();

        System.out.print((idade >= 18) ? "%s. Maior de idade." : "%s. Menor de idade.");

        scanner.close();
    }
}
