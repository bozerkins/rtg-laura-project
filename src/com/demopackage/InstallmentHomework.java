package com.demopackage;

import java.util.Scanner;

public class InstallmentHomework {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        // read user data
        System.out.println("Please enter loan amount:");
        double amount = scanner.nextDouble();
        System.out.println("Please enter number of installments:");
        int numberOfInstallments = scanner.nextInt();

        // validate user data
        if (amount < 100.00 || amount > 10_000.00) {
            System.out.println("Amount not in 100 - 10,000 range. Setting to 5,000");
            amount = 5_000.00;
        }
        if (numberOfInstallments < 6 || numberOfInstallments > 48) {
            System.out.println("Number of installment not in 6 to 48 range. Setting to 36");
            numberOfInstallments = 36;
        }

        // define interest
        double interest = 0;
        // 6 - 12       interest: 2.5%
        if (numberOfInstallments <= 12) {
            interest = 2.50;
        }
        // 13 - 24      interest: 5.0%
        if (numberOfInstallments >= 13 && numberOfInstallments <= 24) {
            interest = 5.00;
        }
        // 25 - 48      interest: 10.0%
        if (numberOfInstallments >= 25) {
            interest = 10.00;
        }

        // output interest
        System.out.println("Interest calculated " + interest);

        // calculate return amount
        double returnAmount = amount + (amount * interest/100);
        System.out.println("Returned amount should be " + returnAmount);
    }
}
