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

  //loan period in years user input
  int loanPeriod;

  //interest rate
  double interestRate;

  //monthly Payment
  double monthlyPayment;

  //monthly Payment
  double totalPayment;

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
  This method computes interest in 1/8 increments
  */
  public void interestCalc() {
    for (i = 5; i <= 8; i+=0.125) {
      interestRate = i;
      return interestRate;
    }
  }


  /*
  This method computes loan amounts using user input and
    interest rate calculations
  */
  public void computeMonthly() {
    monthlyPayment = loanAmt * interestRate / (1 - 1 / Math.pow(1 + interestRate, loanPeriod * 12));
    return monthlyPayment;
  }

  /*
  This method computes loan amounts using user input and
    interest rate calculations
  */
  public void computeTotal() {
    totalPayment = monthlyPayment * loanPeriod * 12;
    return totalPayment;
  }


  /*
  Main method
  */
  public static void main(String[] args) {
    userInput();
    computeMonthly();
  }

}
