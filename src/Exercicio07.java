import java.util.Scanner;

public class Exercicio07 {
    public static void main(String[] args) {
        // Faça um algoritmo que leia dois valores booleanos (lógicos) e determine se ambos são VERDADEIRO ou FALSO.

        Scanner scanner = new Scanner(System.in);

        boolean a = scanner.nextBoolean();
        boolean b = scanner.nextBoolean();

        boolean isVerdadeiroOuFalso = (a == b) ? true : false;

        System.out.println(isVerdadeiroOuFalso);
    }
}
