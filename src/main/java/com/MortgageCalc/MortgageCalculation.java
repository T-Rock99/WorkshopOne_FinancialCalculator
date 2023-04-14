package com.MortgageCalc;

import java.util.Scanner;

public class MortgageCalculation {
    public static void main(String[] args){

/** a) Accept principal, interest rate, and loan length from the user
 * b) Display the expected monthly payment and total interest paid
 *
 * Ex: A $53,000 loan at 7.625% interest for 15 years would have a $495.09/mo payment
 * with a total interest of $36,115.99*/

        Scanner myScanner = new Scanner(System.in);

        System.out.println("Welcome to Ty's financial calculator! This function is to calculate the expected monthly ");
        System.out.println("payment and the total interest you've paid so far.");

        System.out.println("");

        System.out.println("Please input the principal amount: ");
        double principalRes = myScanner.nextDouble(); // Principal answer

        System.out.println(""); // Create paragraph spacing

        System.out.println("Please input the interest rate, monthly: ");
        double interestRes = myScanner.nextDouble(); // Interest rate answer

        System.out.println(""); // Create paragraph spacing

        System.out.println("Please input the desired length of the loan, in months: "); // Length of loan answer
        double lengthRes = myScanner.nextDouble();

        System.out.println(""); // Create paragraph spacing

        double monthlyInterest = (principalRes * interestRes) / 12;

        double topEq = monthlyInterest * (Math.pow((1 + monthlyInterest), 180));
        double botEq = (Math.pow((1 + monthlyInterest), 180) - 1);

        double monthlyPayment = principalRes * (topEq / botEq);

        double interestPaid = monthlyPayment - monthlyInterest; // to figure out just interest

//        System.out.printf("Your expected monthly payment is: " + String.format("%.2f" , monthlyPayment) + ". Your total interest paid is: " + String.format("%.2f", interestPaid) + ".");
//        System.out.println("Your expected monthly payment is: " + monthlyPayment + "." + " Your total interest paid is: " + interestPaid + ".");

        System.out.println(topEq / botEq);



    }
}
