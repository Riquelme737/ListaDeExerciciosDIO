import java.util.Scanner;

public class Exercicio01 {
    public static void main(String[] args) {
        // Faça um algoritmo que leia os valores de A, B, C e em seguida imprima na tela a soma entre A e B é mostre se a soma é menor que C.
        Scanner scanner = new Scanner(System.in);

        System.out.print("a: ");
        int a = scanner.nextInt();

        System.out.print("b: ");
        int b = scanner.nextInt();

        System.out.print("c: ");
        int c = scanner.nextInt();

        int somaAB = a + b;
        System.out.println("A + B = " + somaAB);
        System.out.println("C = " + c);
        System.out.println("A soma de A + B é menor que C? " +(somaAB < c ? "Verdadeiro" : "Falso"));
    }
}
