/*

Fazer um programa para ler um vetor de N números inteiros. Em seguida, mostrar na tela a média
aritmética somente dos números pares lidos, com uma casa decimal. Se nenhum número par for
digitado, mostrar a mensagem "NENHUM NUMERO PAR"

 */

package application;

import java.util.Locale;
import java.util.Scanner;

public class main {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);

        Scanner sc = new Scanner(System.in);

        System.out.print("Quantos elementos terá o vetor? ");
        int n = sc.nextInt();

        int[] vect = new int[n];
        int cont = 0;
        double sumPair = 0;
        double averagePair = 0;

         for (int i = 0; i < vect.length; i++){
             System.out.print("Digite um numero: ");
             vect[i] = sc.nextInt();

             if (vect[i] % 2 == 0){
                 sumPair += vect[i];
                 cont++;
             }
         }

         if (cont > 0){
             averagePair = sumPair / cont;
             System.out.printf("MEDIA DOS PARES = %.1f",averagePair);
         }
         else{
             System.out.println("NENHUM NUMERO PAR");
         }

        sc.close();

    }
}
