import java.util.Scanner;

public class Exercicio16 {
    public static void main(String[] args) {
        /*Faça um algoritmo que leia três valores que representam os três lados de um triângulo e verifique se são válidos, determine se o triângulo é
        equilátero, isósceles ou escaleno.*/

        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite 3 (três) lados de um triângulo: ");
        int ladoA = scanner.nextInt();
        int ladoB = scanner.nextInt();
        int ladoC = scanner.nextInt();

        System.out.print("Seu triângulo é: ");
        if (ladoA == ladoB && ladoB == ladoC) {
            System.out.println("Equilátero");
        } else if (ladoA != ladoB && ladoA != ladoC && ladoB != ladoC ) {
            System.out.println("Escaleno");
        } else {
            System.out.println("Isósceles");
        }
    }
}
