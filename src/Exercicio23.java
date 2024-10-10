import java.util.Scanner;

public class Exercicio23 {
    public static void main(String[] args) {
        // Faça um algoritmo que efetue o cálculo do salário líquido de um professor. As informações fornecidas serão: valor da hora aula, número de aulas lecionadas no mês e percentual de desconto do INSS. Imprima na tela o salário líquido final.
        Scanner scanner = new Scanner(System.in);

        System.out.print("Números de aulas lecionadas: ");
        int numAulasLecionadas = scanner.nextInt();

        System.out.print("Valor da hora aula: ");
        double valorHoraAula = scanner.nextDouble();

        System.out.print("Percentual de desconto do INSS: ");
        int percentualDesconto = scanner.nextInt();

        double salarioBruto = valorHoraAula * numAulasLecionadas;
        double descontoTotal = (percentualDesconto / 100.0) * salarioBruto;
        double salarioLiquido = salarioBruto - descontoTotal;

        System.out.printf("\nSALÁRIO BRUTO: %.2f\n", salarioBruto);
        System.out.printf("DESCONTO: %.2f\n", descontoTotal);
        System.out.printf("SALÁRIO LÍQUIDO: %.2f\n", salarioLiquido);


    }
}
