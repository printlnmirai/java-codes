package tryandtry;

import java.util.*;

public class tryAndtry {

   public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] questions = {
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
        String[][] choices = {
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
        String[] answers = {"A", "C", "B", "A", "C", "C", "B", "C", "A", "B"};
        int numQuestions = questions.length;
        int[] question = new int[numQuestions];
        for (int i = 0; i < numQuestions; i++) {
            question[i] = i;
        }
        int score = 0;
        boolean finished = false;
        Random rand = new Random();
        System.out.print("Enter your name: ");
        String name = scanner.nextLine();
        System.out.print("Are you ready to begin the quiz? (Y/N)? ");
        String ready = scanner.nextLine();
        
        while (!finished) {
            System.out.println("\nChoose the letter of the correct answer."); 
            if (!ready.equalsIgnoreCase("Y")) {
                finished = true;
                break;
            }
            score = 0;
            List<Integer> remainingQuestions = new ArrayList<>();
            for (int i = 0; i < numQuestions; i++) {
                remainingQuestions.add(i);
            }
            while (!remainingQuestions.isEmpty()) {
                int randIndex = rand.nextInt(remainingQuestions.size());
                int randQuestion = remainingQuestions.get(randIndex);
                remainingQuestions.remove(randIndex);
                System.out.println((numQuestions - remainingQuestions.size()) + ". " + questions[randQuestion]);
                for (String choice : choices[randQuestion]) {
                    System.out.println(choice);
                }
                boolean validAnswer = false;
                while (!validAnswer) {
                    System.out.print("Your answer: ");
                    String answer = scanner.nextLine();
                    try {
                        if (answer.isEmpty()) {
                            throw new IllegalArgumentException("Answer cannot be blank. Try again.");
                        }
                        char letter = answer.toUpperCase().charAt(0);
                        if (letter < 'A' || letter > 'C' ) {
                            throw new IllegalArgumentException("Invalid input. Try again.");
                        }
                        if (letter == answers[randQuestion].charAt(0)) {
                            System.out.println("You are correct.\n");
                            score++;
                        } else {
                            System.out.println("You are wrong.\n");
                        }
                        validAnswer = true;
                    } catch (IllegalArgumentException e) {
                        System.out.println("Invalid input. Input (A, B, and C) only.");
                    }
                }
            }
            System.out.println("The final score of user " + name + " is " + score + " out of " + numQuestions);
            if (score >= numQuestions / 2) {
                System.out.println("Congratulations, you passed the quiz!");
            } else {
                System.out.println("You failed the quiz.");
            }
            System.out.print("Do you want to try again (Y/N)? ");
            String answer = scanner.nextLine();
            if (!answer.equalsIgnoreCase("Y")) {
             
             break;
            }
               
        }
        
    }
}