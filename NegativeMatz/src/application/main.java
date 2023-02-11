/*

Ler dois números M e N (máximo = 10), e depois ler uma matriz MxN de números inteiros, conforme
exemplo. Em seguida, mostrar na tela somente os números negativos da matriz.

 */

package application;

import java.util.Scanner;

public class main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Qual a quantidade de linhas da matriz? ");
        int l = sc.nextInt();
        System.out.print("Qual a quantidade de colunas da matriz? ");
        int c = sc.nextInt();

        int[][] matz = new int[l][c];

        for (int i = 0; i < l; i++) {
            for (int j = 0; j < c; j++) {
                System.out.printf("Elemento[%d,%d]: ",i ,j );
                matz[i][j] = sc.nextInt();
            }
        }
        System.out.println();
        System.out.println("VALORES NEGATIVOS: ");
        for (int i = 0; i < l; i++){
            for(int j = 0; j < c; j++){

                if (matz[i][j] < 0 ){
                    System.out.printf("Pos.[%d,%d] = %d %n",i,j,matz[i][j]);
                }

            }
        }

    }
}
