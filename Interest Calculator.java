import java.util.Scanner; 
import java.math.RoundingMode;
import java.text.DecimalFormat;

class Main {
  // Sets decimal number format to 2 decimal places
  private static final DecimalFormat df = new DecimalFormat("0.00");    
  public static void main(String[ ] args) {

// Creates an object of Scanner class
Scanner input = new Scanner(System.in);
System.out.println("WELCOME TO INTEREST CALCULATOR!" + "\n");
    
    // Creates a loop to continue the program while true 
    boolean cont = true;
    while (cont) {
    
    // Gives user choice of which interest to calculate or to end the program.
    System.out.println("Do You Want To Calculate Simple Interest or Compound Interest?" );
    System.out.println("Type [1] For Simple, Type [2] For Compound, or Type [3] to End: "); 
        double type = input.nextDouble(); 

// Start if/else condition statement for different type input values

// Will run if user types 1 for calculation of simple interest
if (type == 1) {
    System.out.println("Calculating Simple Interest");
    
    // User inputs loan information
    System.out.print("Enter the principal: ");
    double principalS = input.nextDouble(); 

    System.out.print("Enter the rate: ");
    // User inputs interest rate percentage
    double rateS = input.nextDouble(); 

    System.out.print("Enter the time: ");
    // User inputs time duration (e.g. years)
    double timeS = input.nextDouble(); 

    // Simple interest calculation
    double interestS = (principalS * timeS * rateS) / 100; 
    
    // Method called to round up interestS to nearest cent
    df.setRoundingMode(RoundingMode.UP);
    // Outputs total simple interest in dollar amount
    System.out.println("Simple Interest: " + '$' + df.format(interestS)); 
    
    // Method called to round up total repayment amount to nearest cent
    df.setRoundingMode(RoundingMode.UP);
    // Outputs the total loan repayment amount of principal and interest combined in dollar amount
    System.out.println("Total Repayment Amount: " + '$'+ (principalS + interestS)+"\n"); 
    

// Allows user to restart calculator or end program. If (1) is typed, loop starts back at beginning    
System.out.println("Calculate Another Loan? Type (1) for Yes or (3) for No: ");
      type = input.nextDouble(); 
     
     // Add if/else condition statements for different input values for "Calculate Another Loan?"
     
     // Will end program if (3) is typed for no.
     if (type == 3) {
         System.out.println("Thank You For Using Interest Calculator! Good Bye.");
         // Use (break) to exit loop and end program
         break;
        }
        
      // If the input is not equal to 1
      else if (type != 1) { 
            System.out.println("INVAILD INPUT. Calculate Another Loan? Type (1) for Yes or (3) for No: ");
            type = input.nextDouble();
                 // Nested WHILE loop to avoid invalid inputs of any numbers not equal to 1 and 3
                 while (type != 1 && type != 3) {
                 System.out.println("INVAILD INPUT. Calculate Another Loan? Type (1) for Yes or (3) for No: ");
                 type = input.nextDouble();
               
                //Nest if/else loops for inputs of 1 and 3
                if (type == 1) {
                    // Sends user back to beginning of program
                    type = input.nextDouble();
                }
                else if (type == 3) {
                    // End program for user
                    System.out.println("Thank You For Using Interest Calculator! Good Bye.");
                }
            }
    }     
}

// Will run if user types 2 for Compound Interest
else if (type == 2) {
     System.out.println("Calculating Compound Interest" + "\n");

     // User inputs loan information
     System.out.print("Enter the principal: ");
     double principalC = input.nextDouble();

    // Allows user to input interest rate percentage
     System.out.print("Enter the rate: ");  
     double rateC = input.nextDouble();

     // Allows user to input time duration (e.g. years)
     System.out.print("Enter the time: ");
     double timeC = input.nextDouble();

     // Allows user to input # of times interest is annually compounded 
     System.out.print("Enter number of times interest is compounded annually: ");
     int number = input.nextInt();

     // Equation for Compound Interest
     double interestC = principalC * (Math.pow((1 + rateC/100), (timeC * number))) - principalC;

     // Outputs the compound interest calculation rounded to nearest cent
     df.setRoundingMode(RoundingMode.UP);
     System.out.println("Compound Interest: " + '$' +  df.format(interestC));
    
     // Outputs total repayment amount rounded to nearest cent
     df.setRoundingMode(RoundingMode.UP);
     System.out.println("Total Repayment Amount: " + '$' + df.format(principalC + interestC));

     // Allows user to input to restart calculator or end program
     System.out.println("Calculate Another Loan? Type (1) for Yes or (4) for No: ");
         type = input.nextDouble();     
    
          // Add if/else condition statememts for different input values for "Calculate Another Loan?"
          // Will end program if (4) is typed for no.
          if (type == 4) {
               System.out.println("Thank You For Using Interest Calculator! Good Bye.");
          // Use (break) to exit loop and end program
          break;
        }
        
          // If the input is not equal to 1
          else if (type != 1) { 
              System.out.println("INVAILD INPUT. Calculate Another Loan? Type (1) for Yes or (4) for No: ");
              type = input.nextDouble();
              // Nested WHILE loop to avoid invalid inputs of any numbers not equal to 1 and 4
              while (type != 1 && type != 4) {
                 System.out.println("INVAILD INPUT. Calculate Another Loan? Type (1) for Yes or (4) for No: ");
                 type = input.nextDouble();
               
                //Nested if/else loops for inputs of 1 and 4
               // Sends user back to beginning of program
                if (type == 1) {
                    type = input.nextDouble();
                }
                // End program for user 
                    else if (type == 4) {
                     System.out.println("Thank You For Using Interest Calculator! Good Bye.");
                }
            }
     }
  }
  
  // Will run if user types 3 to end program
 else if (type == 3){
     System.out.println("Thank You For Using Interest Calculator! Good Bye.");
     // Use (break) to exit loop and end program
     break;
 }
 
 // Will run if user inputs value less than 1 when deciding type of interest to calculate
 else if (type < 1) {
     System.out.println("INVAILD INPUT. Choose 1 to Start Over: ");
     type = input.nextDouble();
        // Nested WHILE loop to avoid invalid inputs of any numbers not equal to 1
        while (type !=1) {
            System.out.println("INVAILD INPUT. Choose 1 to Start Over: ");
            type = input.nextDouble();
        }
 } 
 
 // Will run if user inputs value greater than 3 when deciding type of interest to calculate
 else {
     System.out.println("INVAILD INPUT. Choose 1 to Start Over: ");
     type = input.nextDouble();
         // Nested WHILE loop to avoid invalid inputs of any numbers not equal to 1
     while (type !=1) {
            System.out.println("INVAILD INPUT. Choose 1 to Start Over: ");
            type = input.nextDouble();
        }
 }
}
}
}
