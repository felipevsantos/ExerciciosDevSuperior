/*

Fazer um programa para ler um conjunto de nomes de pessoas e suas respectivas idades. Os nomes
devem ser armazenados em um vetor, e as idades em um outro vetor. Depois, mostrar na tela o nome
da pessoa mais velha.

 */

package application;

import entities.Person;

import java.util.Scanner;

public class main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Quantas pessoas voce vai cadastrar? ");
        int n = sc.nextInt();
        int auxAge;
        String auxName;
        
        String name;
        int age;
        Person[] vect = new Person[n];
        
        for(int i = 0; i < vect.length; i++){

            System.out.println("Dados da " + (i+1) +"a pessoa: ");
            sc.nextLine();
            System.out.print("Nome:");
            name = sc.nextLine();

            System.out.print("Idade:");
            age = sc.nextInt();

            vect[i] = new Person(name,age);

        }
        auxAge = vect[0].getAge();
        auxName = vect[0].getName();
        //
        for (int i = 1; i < vect.length; i++){
            if (vect[i].getAge() > auxAge){
                auxAge = vect[i].getAge();
                auxName = vect[i].getName();
                
            }
            
        }
        System.out.print("PESSOA MAIS VELHA: " + auxName); 
        sc.close();
    }
    

}
