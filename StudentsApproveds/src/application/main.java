/*
Fazer um programa para ler um conjunto de N nomes de alunos, bem como as notas que eles tiraram
no 1º e 2º semestres. Cada uma dessas informações deve ser armazenada em um vetor. Depois, imprimir
os nomes dos alunos aprovados, considerando aprovados aqueles cuja média das notas seja maior ou
igual a 6.0 (seis).
 */
package application;

import entities.Students;

import java.util.Locale;
import java.util.Scanner;

public class main {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);

        Scanner sc = new Scanner(System.in);

        System.out.print("Quantos alunos serão digitados? ");
        int n = sc.nextInt();

        Students[] vect = new Students[n];

        String name;
        double grade1 = 0;
        double grade2 = 0;
        double average = 0;

        for (int i = 0; i < vect.length; i++){
            sc.nextLine();
            System.out.println("Digite o nome, primeira e segunda nota do " +(i+1) +" aluno:");
            name = sc.nextLine();
            grade1 = sc.nextDouble();
            grade2 = sc.nextDouble();

            average = (grade1 + grade2)/2;

            vect[i] = new Students(name,grade1,grade2,average);

        }

        System.out.println("Alunos aprovados: ");

        for (int i = 0; i < vect.length; i++){

            if (vect[i].getAverage() >= 6.0){
                System.out.println(vect[i].getName());
            }

        }


        sc.close();

    }

}
