package labexer5b;

import java.util.*; // it import all the classes and interfaces within the java.util package

public class LabExer5B {

    public static void main(String[] args) {
        // Cruz, Kalfontein T.
        // BT-205
        // Ms. Vera Mae Alcantara
        
        Scanner scanner = new Scanner(System.in); // create an scanner object
        // arrays of ten (10) questions
        String[] tenQs = { // it contains the ten (10) mutiple choice questions
            "How many base classes can a class inherit from?",
            "Which of the following keywords indicates that a package will be used?",
            "What defines a behavior?",
            "What is the process of combining actions and data into a single item?",
            "What occurs when methods share the same name within the same class?",
            "Which of the following can be a method of the Hand class?",
            "Which of the following is NOT a java package?",
            "What is the constructor of a class named Exam?",
            "In the declaration for the default main method, which one is the parameter?",
            "Which of the following keywords is used for implementing an interface?"
        };
        // arrays of three (3) choices
        String[][] choices = { // it contains the three (3) choices for the ten (10) questions
            {"A. 1", "B. 2", "C. 3"},
            {"A. continue", "B. extends", "C. import"},
            {"A. Attribute", "B. Method", "C. Variable"},
            {"A. Encapsulation", "B. Overloading", "C. Polymorphism"},
            {"A. Overriding", "B. Polymorphism", "C. Overloading"},
            {"A. Palm", "B. Thumb ", "C. Wave"},
            {"A. java.awt ", "B. java.swing ", "C. java.io"},
            {"A. public", "B. main", "C. Exam() "},
            {"A. args", "B. main", "C. public"},
            {"A. extends", "B. implements", "C. throw"}
        };
        // arrays of answers, initializing of variables, and for loop
        String[] answers = {"A", "C", "B", "A", "C", "C", "B", "C", "A", "B"};
        int numQs = tenQs.length;
        int[] qstn = new int[numQs];
        for (int i = 0; i < numQs; i++) {
            qstn[i] = i;
        }
        int score = 0;
        // initialize boolean 
        boolean done = false;
        Random rand = new Random();
        System.out.print("Enter your name: ");
        // user should input his/her name
        String name = scanner.nextLine();
        System.out.print("Are you ready to begin the quiz? (Y/N)? ");
        // user should answer Y or N
        String begin = scanner.nextLine();

        while (!done) {
            System.out.println("\nChoose the letter of the correct answer.");
            if (!begin.equalsIgnoreCase("Y")) {
                done = true;
                break;
            }
            // execution of the code for questions and answers starts here
            score = 0;
            // syntax for shuffled questions
            List<Integer> shuffledQuestions = new ArrayList<>();
            for (int i = 0; i < numQs; i++) {
                shuffledQuestions.add(i);
            }
            // shuffled questions inside the while loop for it to be executed
            while (!shuffledQuestions.isEmpty()) {
                int randIndex = rand.nextInt(shuffledQuestions.size());
                int randQuestion = shuffledQuestions.get(randIndex);
                shuffledQuestions.remove(randIndex);
                System.out.println((numQs - shuffledQuestions.size()) + ". " + tenQs[randQuestion]);
                for (String choice : choices[randQuestion]) {
                    System.out.println(choice);
                }
                boolean validInput = false;
                while (!validInput) {
                    System.out.print("Your answer: ");
                    // user should input the output in scanner
                    String answer = scanner.nextLine();
                    // try-and-catch structure where the try will execute the syntax inside of it while the catch, will get the errors
                    try {
                        if (answer.isEmpty()) {
                            throw new IllegalArgumentException("Answer cannot be blank. Try again.");
                        }
                        char letter = answer.toUpperCase().charAt(0);
                        if (letter < 'A' || letter > 'C') {
                            throw new IllegalArgumentException("Invalid input. Try again.");
                        }
                        if (letter == answers[randQuestion].charAt(0)) {
                            System.out.println("You are correct.\n");
                            score++;
                        } else {
                            System.out.println("You are wrong.\n");
                        }
                        validInput = true;
                    } catch (IllegalArgumentException e) {
                        System.out.println("Invalid input. Input (A, B, and C) only.");
                    }
                }
            }
            // it will print the final score of the user
            System.out.println("The final score of user " + name + " is " + score + " out of " + numQs);
            // will greet the user if he/she passed or failed
            if (score >= numQs / 2) {
                System.out.println("Congratulations, you passed the quiz!");
            } else {
                System.out.println("You failed the quiz.");
            }
            // ask the user if he/she want to try again the quiz
            System.out.print("\nDo you want to try again (Y/N)? ");
            // user should answer the question if he/she wants to try again
            String answer = scanner.nextLine();
            if (!answer.equalsIgnoreCase("Y")) {

                break;
            }

        }

    }
}
