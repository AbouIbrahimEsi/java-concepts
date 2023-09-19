package dz.learnjava;

import java.text.NumberFormat;
import java.util.Locale;
import java.util.Scanner;

public class MortgageCalculator {
    public static void main(String[] args) {

        final byte MONTHS_IN_YEARS =12;
        final byte PERCENT = 100;

        Scanner scanner = new Scanner(System.in);

        int amount;
        while(true){
            System.out.print("Loan amount($1K - $1M): ");
            amount = scanner.nextInt();
            if(amount >= 1_000 && amount <= 1_000_000)
                break;
            System.out.println("Enter a number between 1,000 and 1,000,000.");
        }

        float annualInterestRate;
        while(true){
            System.out.print("Annual Interest Rate: ");
            annualInterestRate = scanner.nextFloat();
            if(annualInterestRate > 0 && annualInterestRate <= 30)
                break;
            System.out.println("Enter a value between 0 and 30.");
        }

        byte years;
        while(true){
            System.out.print("Years: ");
            years = scanner.nextByte();
            if(years > 0 && years <= 30)
                break;
            System.out.println("Enter a value between 1 and 30.");
        }

        int months = years * MONTHS_IN_YEARS;
        float rate = annualInterestRate / (PERCENT * MONTHS_IN_YEARS);
        double mortgage = amount *
                (rate * Math.pow(1 + rate, months))
                / (Math.pow( 1+ rate, months) - 1);
        System.out.print("The Mortgage is: " +
                NumberFormat.getCurrencyInstance(Locale.getDefault()).format(mortgage));
    }
}
