package edu.frontrange.csc160.a4;

import java.util.Scanner;

public class Exercise05_21 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		//interest rate
	    double interestRate = 5.0;

	    //ask user for loan amount
	    System.out.println("Enter Loan Amount: ");
	    double loanAmt = input.nextDouble();

	    //ask user for number of years
	    System.out.println("Enter Number of Years: ");
	    int numYears = input.nextInt();

	    //table header
	    System.out.printf("%-1s%20s%20s\n", "Interest Rate", "Monthly Payment","Total Payment");

	    //loop to populate table
	    for(interestRate = 5; interestRate <=8; interestRate+=0.125) {
	    	  double monthlyInterestRate = interestRate/1200;
	      double monthlyPayment = loanAmt * monthlyInterestRate / (1 - 1 / Math.pow(1 + monthlyInterestRate, loanAmt * 12));
	      double totalPayment = monthlyPayment * numYears * 12;

	      System.out.printf("%-1s%20s%20s\n", interestRate, monthlyPayment, totalPayment);
	    }

	}

}
