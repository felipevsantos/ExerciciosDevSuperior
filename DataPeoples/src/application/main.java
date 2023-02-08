/*
Tem-se um conjunto de dados contendo a altura e o gênero (M, F) de N pessoas. Fazer um programa
que calcule e escreva a maior e a menor altura do grupo, a média de altura das mulheres, e o número
de homens.
 */

package application;

import entities.DataPeoples;

import java.util.Locale;
import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);

        Scanner sc = new Scanner(System.in);

        System.out.print("Quantas pessoas serao digitadas?");
        int n = sc.nextInt();
        //
        DataPeoples[] vect = new DataPeoples[n];

        int cont = 0;
        int contWoman = 0;
        double womanAverage = 0.0;
        double sumWomanHeight = 0.0;
        double greaterHeight = 0.0;
        double shorterHeight = 0.0;
        double height;
        char gender;

        for (int i = 0; i < vect.length; i++) {
            System.out.print("Altura da " + (i + 1) + "a pessoa: ");
            height = sc.nextDouble();
            System.out.print("Genero da " + (i + 1) + "a pessoa: ");
            gender = sc.next().charAt(0);

            vect[i] = new DataPeoples(height, gender);

        }

        for (int i = 0; i < vect.length; i++) {
            if (vect[i].getGender() == 'M') {
                cont++;
            } else {
                sumWomanHeight += vect[i].getHeight();
                contWoman++;
            }
        }

        womanAverage = sumWomanHeight / contWoman;

        greaterHeight = vect[0].getHeight();
        shorterHeight = vect[0].getHeight();

        for (int i = 1; i < vect.length; i++) {
            if (greaterHeight < vect[i].getHeight()) {
                greaterHeight = vect[i].getHeight();
            }
            if (shorterHeight > vect[i].getHeight()) {
                shorterHeight = vect[i].getHeight();
            }
        }

            System.out.printf("Menor altura = %.2f %n", shorterHeight);
            System.out.printf("Maior altura = %.2f %n", greaterHeight);
            System.out.printf("Media das alturas das mulheres = %.2f %n", womanAverage);
            System.out.print("Numero de homens = " + cont);

            sc.close();

        }
    }