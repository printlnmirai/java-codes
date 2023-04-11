
package performancetaskstrings;

import java.util.Scanner;
public class PerformancetaskStrings {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); // To create an object of scanner and take the user input
            
            // CRUZ, KALFONTEIN T.
            // BSIT - BT105
            
            // Ask the user to enter name
            System.out.print("Enter name: ");
            String yourName = sc.nextLine();
            
            // Display all the String Methods
            System.out.println(yourName.charAt(6));
            System.out.println(yourName.compareTo("Kalfontein T. Cruz"));
            System.out.println(yourName.concat(" BSIT - BT105 "));
            System.out.println(yourName.equals("Cruz, Kalfontein T."));
            System.out.println(yourName.equalsIgnoreCase("cruz, kalfontein t."));
            System.out.println(yourName.indexOf('a'));
            System.out.println(yourName.lastIndexOf('e'));
            System.out.println(yourName.length());
            System.out.println(yourName.toLowerCase());
            System.out.println(yourName.toUpperCase());
            System.out.println(yourName.replace('n', 'l'));
            System.out.println(yourName.substring(5));
            System.out.println(yourName.substring(5, 10));
            System.out.println(yourName.trim());     
    }    
}
