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

  //initialize Scanner
  Scanner.scan = new Scanner(System.in);

  /*
  This method gathers user input and stores them in variables
  */
  public void userInput() {
    //ask user for loan amount
    System.out.println("Enter Loan Amount: ");

    //loan amount user input
    int loanAmt;
    loanAmt = scan.nextInt();

    //ask user for loan period
    System.out.println("Enter Loan Period: ");

    //loan period user input
    int loanPeriod;
    loanPeriod = scan.nextInt();
  }


  /*Computing Methods*/


  /*
  Main method
  */
  public static void main(String[] args) {
    userInput();
  }

}
