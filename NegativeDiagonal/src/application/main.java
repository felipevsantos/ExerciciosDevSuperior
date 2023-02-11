/*
Fazer um programa para ler um número inteiro N (máximo = 10) e uma matriz quadrada de ordem N
contendo números inteiros. Em seguida, mostrar a diagonal principal e a quantidade de valores
negativos da matriz.
 */

package application;

import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Qual a ordem da matriz? ");
        int n = sc.nextInt();

        int[][] matz = new int[n][n];
        int cont = 0;

        for(int i = 0; i < matz.length; i++){
            for(int j = 0; j < matz.length; j++){
                //
                System.out.printf("Elemento [%d,%d]: ",i,j);
                matz[i][j] = sc.nextInt();

                if (matz[i][j] < 0){
                    cont++;
                }

            }
        }
        System.out.println("DIAGONAL PRINCIPAL: ");
         for(int i = 0; i < matz.length; i++){
             System.out.print(" " + matz[i][i]);
         }
        System.out.println();
         System.out.print("QUANTIDADE DE NUMEROS NEGATIVOS = " + cont);


        sc.close();
    }
}
