package labexer5a;

import java.util.InputMismatchException; // import inputmismatchexception to avoid error
import java.util.Scanner; // create an object for user input
import java.lang.Math; // not needed but i just put it here anw, it's for math.random

public class LabExer5A {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); // create an object for user input
        // Cruz, Kalfontein T.
        // BT-205
        // Ms. Vera Mae Alcantara

        int guessNum = 0; // declare int guessNum with a value of zero (0)
        int numberofTries = 1; // declare int numberofTries with a value of one (1)
        int mRandom = (int) (Math.random() * 50 + 1); // declare a math.Random to generate number between 1 to 50

        System.out.println("Guess a number from 1 to 50!"); // ask the user to guess a number
        while (true) {
            // try block
            try {
                guessNum = sc.nextInt(); // it will take the user input

                if (guessNum < 1 || guessNum > 50) { // it is the ranging random numbers between 1 to 50
                    throw new OutOfRangeException(); // it will throw an exception if there's an error to input
                }
                if (guessNum == mRandom) {
                    System.out.println("You got it in " + numberofTries + " attempt(s)!"); // it will print when you already get the right output
                } else if (guessNum < mRandom) {
                    System.out.println("Too low. Try again."); // it will print when you input an low number
                    numberofTries++;
                } else {
                    System.out.println("Too high. Try again."); // it will print when you input an high number
                    numberofTries++;
                }
                // catch block  
            } catch (OutOfRangeException ex) { // it will catch an exception if the user's guess is out of range
                System.out.println("Out of range.");
                System.out.println("Guess a number from 1 to 50!");
            } catch (InputMismatchException ex) { // it will catch an exception if the user input is not an int data type
                System.out.println("Invalid input.");
                System.out.println("Guess a number from 1 to 50!");
                sc.next();
            }
        }
    }
}
class OutOfRangeException extends Exception { // i used inheritance for the derived class outofrangeexception to attach into subclass exception
    public String getMessage() { // getmessage to determine the java's message about the exception
        return "Out of range.";
    }
}
