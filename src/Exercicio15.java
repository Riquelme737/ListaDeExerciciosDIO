import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.util.Locale;
import java.util.Scanner;

public class Exercicio15 {
    public static void main(String[] args) {
        /* Faça um algoritmo que leia o ano em que uma pessoa nasceu, imprima na tela quantos anos, meses e dias essa pessoa ja viveu. Leve em
        consideração o ano com 365 dias e o mês com 30 dias. */

        Scanner scanner = new Scanner(System.in);

        /*System.out.print("Digite seu ano de nascimento: ");
        int anoNascimento = scanner.nextInt();

        int anoAtual = 2024;
        int anoVivido = anoAtual - anoNascimento;
        int mesesVividos = anoVivido * 12;
        int diasVividos = anoVivido * 365;

        System.out.printf("Você tem %d anos, %d meses e %d dias", anoVivido, mesesVividos, diasVividos);*/


        System.out.print("Digite o dia do seu nascimento (dd): ");
        int dia = scanner.nextInt();
        System.out.print("Digite o mês do seu nascimento (mm): ");
        int mes = scanner.nextInt();
        System.out.print("Digite o ano do seu nascimento (aaaa): ");
        int ano = scanner.nextInt();

        LocalDate dataNascimento = LocalDate.of(ano,mes,dia);
        LocalDate dataAtual = LocalDate.now();

        Period periodo = Period.between(dataNascimento, dataAtual);
        int anosVivido = periodo.getYears();
        int mesesVivido = periodo.getMonths();
        int diasVividos = periodo.getDays();

        System.out.printf("Você tem %d anos, %d meses e %d dias", anosVivido, mesesVivido, diasVividos);
        scanner.close();

    }
}
