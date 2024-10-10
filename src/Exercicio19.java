public class Exercicio19 {
    public static void main(String[] args) {
        // Faça um algoritmo que imprima na tela a tabuada de 1 até 10


        for (int i = 1; i <= 10 ; i++) {
            for (int j = 1; j <= 10; j++) {
                System.out.printf("%d x %d = %d\n", i, j, i*j);
                if (j == 10) {
                    System.out.println();
                }
            }
        }
    }
}
