/*
Fazer um programa para ler um número inteiro N e depois um vetor de N números reais. Em seguida,
mostrar na tela a média aritmética de todos elementos com três casas decimais. Depois mostrar todos
os elementos do vetor que estejam abaixo da média, com uma casa decimal cada.
 */


import java.util.Locale;
import java.util.Scanner;

public class main {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);

        Scanner sc = new Scanner(System.in);

        System.out.print("Quantos elementos vai ter o vetor?");
        int n = sc.nextInt();

        double[] vect = new double[n];
        double sum = 0;
        double mediaVect = 0;

        for(int i = 0; i < vect.length; i++ ){
            System.out.print("Digite um numero: ");
            vect[i] = sc.nextDouble();
            sum += vect[i];
        }

        mediaVect = sum / vect.length;

        System.out.printf("MEDIA DO VETOR %.3f %n",mediaVect);

        System.out.println("ELEMENTOS ABAIXO DA MEDIA: ");
        for(int i = 0; i < vect.length; i++){

            if (vect[i] < mediaVect){
                System.out.println(vect[i]);
            }

        }

        sc.close();

    }


}

