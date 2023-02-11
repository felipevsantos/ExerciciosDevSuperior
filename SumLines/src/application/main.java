/*
Fazer um programa para ler dois números inteiros M e N (máximo = 10). Em seguida, ler uma matriz
de M linhas e N colunas contendo números reais. Gerar um vetor de modo que cada elemento do vetor
seja a soma dos elementos da linha correspondente da matriz. Mostrar o vetor gerado.
*/
package application;

import java.util.Locale;
import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);

        Scanner sc = new Scanner(System.in);

        System.out.print("Qual a quantidade de linhas da matriz? ");
        int l = sc.nextInt();
        System.out.print("Qual a quantidade de colunas da matriz? ");
        int c = sc.nextInt();

        double[][] matz = new double[l][c];

        double[] somaLinha = new double[l];

        for (int i = 0; i < l; i++) {
            System.out.println("Digite os elementos da " + (i + 1) + "a. linha: ");
            for (int j = 0; j < c ; j++) {
                matz[i][j] = sc.nextDouble();

                somaLinha[i] += matz[i][j];

            }
        }
        System.out.println("Vetor gerado: ");
        for(int i = 0; i < somaLinha.length; i++){

            System.out.println(somaLinha[i]);


        }




    }
}
