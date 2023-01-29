/*
Fazer um programa para ler um número inteiro N e os dados (nome e preço) de N Produtos.
Armazene os N Produtos em um vetor. Em seguida, mostrar o preço médio dos produtos.
 */


import java.util.Locale;
import java.util.Scanner;

public class examplevectorclass {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        double avg = 0.0;

        Product[] vect = new Product[n];

        for(int i = 0; i< vect.length; i++){
            sc.nextLine();
            String name = sc.nextLine();
            double price = sc.nextDouble();

            vect[i] = new Product(name,price);
            avg += vect[i].getPrice();
        }

        System.out.printf("AVERAGE PRICE OF PRODUCTS: %.2f%n",avg/ vect.length);
    }
}
