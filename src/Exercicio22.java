import java.util.Scanner;

public class Exercicio22 {
    public static void main(String[] args) {
        // Faça um algoritmo que leia dois valores inteiros A e B, imprima na tela o quociente e o resto da divisão inteira entre eles.

        Scanner scanner = new Scanner(System.in);

        int a = scanner.nextInt();
        int b = scanner.nextInt();

        int quociente = a / b;
        int restoDivisao = a % b;

        System.out.println("Quociente: " + quociente);
        System.out.println("Resto da divisão: " + restoDivisao);
    }
}
