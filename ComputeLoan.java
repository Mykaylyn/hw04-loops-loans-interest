//import java scanner package
import java.util.Scanner;

public class ComputeLoan {

  //initialize Scanner
  Scanner.scan = new Scanner(System.in);

  /*
  Main method
  */
  public static void main(String[] args) {
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
    for(i = 5; i <=8; i+=0.125) {
      double interestRate = i;
      double monthlyPayment = loanAmt * interestRate / (1 - 1 / Math.pow(1 + interestRate, loanPeriod * 12));
      double totalPayment = monthlyPayment * loanPeriod * 12;

      System.out.printf("%-1s%20s%20s\n", Double.toString(interestRate, monthlyPayment, totalPayment);
    }
  }
}
