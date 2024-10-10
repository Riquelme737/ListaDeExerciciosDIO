import java.util.Locale;
import java.util.Scanner;

public class Exercicio12 {
    public static void main(String[] args) {
        /*  Faça um algoritmo que leia o valor de um produto e determine o valor que deve ser pago, conforme a escolha da forma de pagamento
         pelo comprador e imprima na tela o valor final do produto a ser pago. Utilize os códigos da tabela de condições de pagamento para efetuar o cálculo adequado.
         Tabela de Código de Condições de Pagamento
         1 - À Vista em Dinheiro ou Pix, recebe 15% de desconto
         2 - À Vista no cartão de crédito, recebe 10% de desconto
         3 - Parcelado no cartão em duas vezes, preço normal do produto sem juros
         4 - Parcelado no cartão em três vezes ou mais, preço normal do produto mais juros de 10% */
        Locale.setDefault(Locale.US);
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o valor do produto: ");
        double valorProduto = scanner.nextDouble();

        System.out.println("\tTabela de Código de Condições de Pagamento\n" +
                "\t1 - À Vista em Dinheiro ou Pix, recebe 15% de desconto\n" +
                "\t2 - À Vista no cartão de crédito, recebe 10% de desconto\n" +
                "\t3 - Parcelado no cartão em duas vezes, preço normal do produto sem juros\n" +
                "\t4 - Parcelado no cartão em três vezes ou mais, preço normal do produto mais juros de 10%");
        int escolhaPagamento = scanner.nextInt();

        switch (escolhaPagamento) {
            case 1:
                valorProduto = valorProduto - (valorProduto * 0.15);
                System.out.print(valorProduto);
                break;
            case 2:
                valorProduto = valorProduto - (valorProduto * 0.1);
                System.out.print(valorProduto);
                break;
            case 3:
                System.out.print(valorProduto);
                break;
            case 4:
                valorProduto = valorProduto + (valorProduto * 0.1);
                System.out.print(valorProduto);
                break;
            default:
                System.out.print("A opção digitada não existe.");
        }
    }
}
