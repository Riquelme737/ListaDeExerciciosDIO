import java.util.Scanner;

public class Exercicio14 {
    public static void main(String[] args) {
        // Faça um algoritmo que receba um valor A e B, e troque o valor de A por B e o valor de B por A e imprima na tela os valores.

        Scanner scanner = new Scanner(System.in);

        int a = scanner.nextInt();
        int b = scanner.nextInt();

        int c = a;
        int AB = a = b;
        int BA = b = c;

        // 7 (a), 8 (b) = 8 (a), 7 (b)

        System.out.println(AB);
        System.out.println(BA);

        scanner.close();
    }
}
