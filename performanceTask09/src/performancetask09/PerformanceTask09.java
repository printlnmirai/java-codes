
package performancetask09;

import java.util.Scanner;
public class PerformanceTask09 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); // To create an object of scanner and take the user input
            
            // CRUZ, KALFONTEIN T.
            // BSIT - BT105
        
            // Ask the user to enter three first names
            System.out.println("Enter three first names: ");  
                String firstName = sc.nextLine();
                String secondName = sc.nextLine();
                String thirdName = sc.nextLine();             
            // Display all the possible two-name combinations 
            System.out.println("Possible names are: ");
                System.out.println("1 - " + firstName + " " + secondName);
                System.out.println("2 - " + firstName + " " + thirdName);
                System.out.println("3 - " + secondName + " " + firstName);
                System.out.println("4 - " + secondName + " " + thirdName);
                System.out.println("5 - " + thirdName + " " + firstName);
                System.out.println("6 - " + thirdName + " " + secondName);
           
            // Ask the user to select a name by entering number 1 to 6
            System.out.print("Enter 1-6 to select a name: ");
                int numberChoice = sc.nextInt();
                String chosenName = "";          
            // Set the chosenName variable to the selected name
            switch (numberChoice) {
                    case 1:
                        chosenName = firstName + " " + secondName;
                        break;
                    case 2:
                        chosenName = firstName + " " + thirdName;
                        break;
                    case 3:
                        chosenName = secondName + " " + firstName;
                        break;
                    case 4:
                        chosenName = secondName + " " + firstName;
                        break;
                    case 5:
                        chosenName = thirdName + " " + firstName;
                        break;
                    case 6:
                        chosenName = thirdName + " " + secondName;
                        break;
                    default:
                        System.out.println("Invalid input. Please try again.");
                        break;
                    }          
            // Display the initials of the chosen combined name
            if (numberChoice == 1) {
                System.out.println("The initials for "+chosenName +" is " +firstName.charAt(0)+secondName.charAt(0)+".");
            } else if (numberChoice == 2) {
                System.out.println("The initials for "+chosenName +" is " +firstName.charAt(0)+thirdName.charAt(0)+".");
            } else if (numberChoice == 3) {
                System.out.println("The initials for "+chosenName +" is " +secondName.charAt(0)+firstName.charAt(0)+".");
            } else if (numberChoice == 4) {
                System.out.println("The initials for "+chosenName +" is " +secondName.charAt(0)+firstName.charAt(0)+".");
            } else if (numberChoice == 5) {
                System.out.println("The initials for "+chosenName +" is " +thirdName.charAt(0)+firstName.charAt(0)+".");
            } else if (numberChoice == 6) {
                System.out.println("The initials for "+chosenName +" is " +thirdName.charAt(0)+secondName.charAt(0)+".");
            }
            // Display the suggested username based on the combined name
            String userName = chosenName.toLowerCase().replace(" ", "_");
            System.out.println("Suggested username: "+userName);
    } 
}
