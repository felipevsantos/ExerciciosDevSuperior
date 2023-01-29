/*
Faça um programa que leia N números reais e armazene-os em um vetor. Em seguida:
- Imprimir todos os elementos do vetor
- Mostrar na tela a soma e a média dos elementos do vetor
 */


import java.util.Locale;
import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);

        Scanner sc = new Scanner(System.in);

        System.out.print("Quantos numeros voce vai digitar: ");
        int n = sc.nextInt();

        double sum = 0.0;

        double[] vect = new double[n]; //declaracao da variavel vect que é do tipo vetor

        for(int i = 0; i < vect.length; i++){
            System.out.print("Digite um número: ");
            vect[i] = sc.nextDouble();

            sum += vect[i];
        }

        System.out.print("VALORES = ");

        for(int i = 0; i < vect.length; i++){

            System.out.printf("   %.1f" ,vect[i]);

        }

        System.out.println();
        //
        System.out.printf("SOMA = %.2f%n" ,sum);
        System.out.printf("MEDIA = %.2f%n",sum/ vect.length);

        sc.close();

    }
}
