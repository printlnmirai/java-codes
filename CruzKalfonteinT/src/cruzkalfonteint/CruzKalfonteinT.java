
package cruzkalfonteint;

import java.util.Scanner;
public class CruzKalfonteinT {

    public static void main(String[] args) {
        // create an object of scanner and take the user input
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter 3 names");
        
        // declare an array to store the user input names
        String[] names = new String[3];  
        
        // use a for loop to prompt the user to enter 3 names 
        for (int k = 0; k < names.length; k++) {  
            System.out.print("Enter a name: ");
            names[k] = sc.nextLine();  
        }  
        // print out the user input in the output
            System.out.println("You have entered:" + " " +names[0]);  
            System.out.println("You have entered:" + " " +names[1]); 
            System.out.println("You have entered:" + " " +names[2]); 
    }      
}
