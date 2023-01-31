/*
Faça um programa que leia N números inteiros e armazene-os em um vetor. Em seguida, mostre na
tela todos os números pares, e também a quantidade de números pares.
 */

import java.util.Scanner;

public class program {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n,cont,soma = 0;

        System.out.print("Quantos números voce vai digitar? ");
        n = sc.nextInt();

        int[] vect = new int[n];

        for(int i = 0; i < vect.length; i++){

            System.out.print("Digite um numero: ");
            vect[i] = sc.nextInt();

        }
        System.out.println("Numeros pares: ");
        for (int i = 0; i < vect.length; i++){
            if (vect[i] % 2 == 0){
                System.out.print(" " + vect[i]);
                soma += 1;
            }

        }
        System.out.println();
        System.out.println("Quantidade de numeros pares: " + soma);

        sc.close();

    }
}
