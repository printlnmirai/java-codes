
package factorialcalculator;

import java.util.Scanner;
public class Cruz_Kalfontein_T {

    public static void main(String[] args) {
        // Cruz, Kalfontein T.                 12/5/22 
        // BSIT - BT105                        Mr. Alfred Bautista
        
        Scanner scan = new Scanner(System.in);
        
        int fc; 
        long element = 1;
        while (true){
            System.out.print("\n<----- Factorial Calculator ----- >\n");
            System.out.print("Enter a positive integer: ");
            int numInt = scan.nextInt();
        System.out.print(numInt + "! = ");
        
            if (numInt >= 0) {
                for (fc = 1; fc <= numInt; fc++){
                element = element * fc;
                System.out.print(fc +" x ");
                }
                System.out.printf("\nThe factorial of %d = %d", numInt, element);
            }else {
                System.out.println("\nInvalid input! Program stopped!\n");
                break;
            }      
        }  
    }   
}
