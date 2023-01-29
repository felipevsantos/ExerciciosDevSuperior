package program;

import entities.AccountBank;

import java.util.Locale;
import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);

        Scanner sc = new Scanner(System.in);

        AccountBank account;

        System.out.print("Enter account number: ");
        int number = sc.nextInt();
        System.out.println();
        System.out.print("Enter account holder: ");
        sc.nextLine();
        String holder = sc.nextLine();
        System.out.print("Is there an initial deposit (y/n)?");
        char deposit = sc.next().charAt(0);
        System.out.println();

        if (deposit == 'y'){
            System.out.print("Enter initial deposit value: ");
            double value = sc.nextDouble();

               account = new AccountBank(number,holder,value);

        }
        else {
                  account = new AccountBank(number, holder);
        }

        System.out.println("Account data: ");
        System.out.println(account);

        System.out.print("Enter a deposit value: ");
        double value = sc.nextDouble();
        account.deposit(value);

        System.out.println("Updated account value: ");
        System.out.println(account);

        System.out.print("Enter a withdraw value: ");
        value = sc.nextDouble();
        account.withdraw(value);

        System.out.println("Updated account data: ");
        System.out.println(account);



        sc.close();
    }

}
