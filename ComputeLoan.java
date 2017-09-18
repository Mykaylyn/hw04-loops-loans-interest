/*
Compute Loan

User enters loan amount and loan period in number of years.

Display monthly and total payments for each interest rate
  starting from 5% to 8%, with an increment of 1/8
*/

//import java scanner package
import java.util.Scanner;

/*
Compute Loan class
*/
public class ComputeLoan {

  //loan amount user input
  double loanAmt;

  //loan period user input
  int loanPeriod;

  //initialize Scanner
  Scanner.scan = new Scanner(System.in);

  /*
  This method gathers user input and stores them in variables
  */
  public void userInput() {
    //ask user for loan amount
    System.out.println("Enter Loan Amount: ");

    //loan amount user input
    loanAmt = scan.nextDouble();

    //ask user for loan period
    System.out.println("Enter Loan Period: ");

    //loan period user input
    loanPeriod = scan.nextInt();
  }


  /*
  This method computes loan amounts using user input and
    interest rates starting 5% to 8% in 1/8 increments
  */
  public void computeMonthly() {
    double monthlyPayment = loanAmt * monthlyInterest / (1 - 1 / Math.pow(1 + monthlyInterest, numYears * 12));
  }


  /*
  Main method
  */
  public static void main(String[] args) {
    userInput();
    computeMonthly();
  }

}
