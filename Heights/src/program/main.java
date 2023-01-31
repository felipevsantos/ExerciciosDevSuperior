/*
Fazer um programa para ler nome, idade e altura de N pessoas, conforme exemplo. Depois, mostrar na
tela a altura média das pessoas, e mostrar também a porcentagem de pessoas com menos de 16 anos,
bem como os nomes dessas pessoas caso houver.
 */


package program;

import entities.pessoas;

import java.util.Locale;
import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);

        Scanner sc = new Scanner(System.in);

        int n, idade,cont = 0;
        String nome;
        double altura = 0.0, porcentagem = 0.0;
        double soma = 0.0;


        System.out.print("Quantas pessoas serão cadastradas? ");
        n = sc.nextInt();

        pessoas[] p = new pessoas[n];

        for(int i = 0; i < p.length; i++){

            System.out.println("Dados da "+ (i+1) +"a pessoa: ");
            sc.nextLine();
            System.out.print("Nome: ");
            nome = sc.nextLine();
            System.out.print("Idade: ");
            idade = sc.nextInt();
            System.out.print("Altura: ");
            altura = sc.nextDouble();
            //
            p[i] = new pessoas(nome,idade,altura);

            soma += p[i].getAltura();

            if(p[i].getIdade() < 16){
                cont += 1;
            }
        }

        System.out.printf("Altura média: %.2f%n",soma/n);

        porcentagem = (cont * 100)/n;
        //
        System.out.printf("Porcentagem com menos de 16 anos: %.1f%%\n",porcentagem);


        for (int i = 0; i < p.length; i++ ){

            if(p[i].getIdade() < 16){

                System.out.println(p[i].getNome());
            }

        }

        sc.close();

    }

}
