
package cruz_kalfontein;

import java.util.Scanner;
public class FactorialCalculator {

    public static void main(String[] args) {
        
        // CRUZ, KALFONTEIN T.
        // BSIT - BT105
        
        Scanner scan = new Scanner(System.in); // It create a scanner object that can read the user input
        
        int numberOne, factorialOne = 1, elementOne = 1;// Initialization of datatype, variables, and their value
		System.out.println("<------- Factorial Calculator -------> "); // Title output
		
		while (elementOne <= 5 ) { 
                    // The line of code that will execute 
		System.out.print("Enter a positive integer: "); // The output of that the user input 
		numberOne = scan.nextInt(); // It reads the user input to detect outputS
		factorialOne = 1; 
		  if (numberOne < 0) { // It will execute if the condition is true
			 System.out.print("Invalid input! Program Stopped!");
			 break; // Used to get out of the looping session
		 }else { // It will execute if the condition is false
                      
			 System.out.print(numberOne +"!= ");
                             for (long c = 1;c <= numberOne; c++) { // It will carry out the statements 
				 System.out.print(c); 
				 factorialOne*=c; 
				 if (c < numberOne) {
					 System.out.print(" x ");
				   }	 
				}
			 System.out.println("\nThe factorial of "+ numberOne +" is: "+ factorialOne);// The final output of the factorial positive integer
			 elementOne ++; // It is used to increment either negative or positive integer
			 }
		 }	
        } 
    } 

