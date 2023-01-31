/*
Faça um programa que leia N números reais e armazene-os em um vetor. Em seguida, mostrar na tela
o maior número do vetor (supor não haver empates). Mostrar também a posição do maior elemento,
considerando a primeira posição como 0 (zero).
 */

package program;

import java.util.Arrays;
import java.util.Locale;
import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        int n;
        System.out.print("Quantos numeros voce vai digitar? ");
        n = sc.nextInt();

        double[] vect = new double[n];

        for(int i = 0; i < vect.length; i++){

            System.out.print("Digite um numero: ");
            vect[i] = sc.nextDouble();
        }

        double maior = vect[0];
        int posicao = 0;

        for(int i = 0; i < vect.length; i++){
            if (vect[i] > maior){
                maior = vect[i];
                posicao = i;
            }

        }

        System.out.printf("MAIOR VALOR = %.1f\n",maior);
        System.out.printf("POSICAO DO MAIOR VALOR = " + posicao);

        sc.close();
    }
}
