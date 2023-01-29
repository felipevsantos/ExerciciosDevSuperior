<<<<<<< HEAD
=======
/*
Faça um programa que leia N números reais e armazene-os em um vetor. Em seguida:
- Imprimir todos os elementos do vetor
- Mostrar na tela a soma e a média dos elementos do vetor
 */


>>>>>>> 905ae66a52af69f060efcb85da97a81b1c831f13
import java.util.Locale;
import java.util.Scanner;

public class main {
<<<<<<< HEAD

=======
>>>>>>> 905ae66a52af69f060efcb85da97a81b1c831f13
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);

        Scanner sc = new Scanner(System.in);

<<<<<<< HEAD
        System.out.print("Quantos números você vai digitar? ");
        int n = sc.nextInt();

        int[] vect = new int[n];

        for(int i=0; i< vect.length; i++){
            System.out.print("Digite um numero: ");
            vect[i] = sc.nextInt();

        }

        System.out.println("NUMEROS NEGATIVOS:");

        for(int i = 0; i<vect.length; i++){

            if (vect[i] < 0){
                System.out.println(vect[i]);
            }
        }

        sc.close();
=======
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

>>>>>>> 905ae66a52af69f060efcb85da97a81b1c831f13
    }
}
