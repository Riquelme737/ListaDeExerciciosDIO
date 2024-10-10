

public class Exercicio18 {
    public static void main(String[] args) {
        // Francisco tem 1,50m e cresce 2 centímetros por ano, enquanto Sara tem 1,10m e cresce 3 centímetros por ano. Faça um algoritmo que calcule e imprima na tela em quantos anos serão necessários para que Francisco seja maior que Sara.

        double alturaFrancisco = 1.50;
        double alturaSara = 1.10;

        int ano = 0;

        while (alturaSara < alturaFrancisco) {
            alturaFrancisco += 0.02;
            alturaSara += 0.03;
            ano++;
        }

        System.out.printf("Será necéssarios %d anos para Francisco ser maior que Sara.", ano);
        System.out.printf("\nAltura de Francisco em %d anos será %.2fm", ano, alturaFrancisco);
        System.out.printf("\nAltura de Sara em %d anos será %.2fm", ano, alturaSara);


    }
}
