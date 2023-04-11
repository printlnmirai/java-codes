
package taskperformance06;

    import java.util.Scanner;

public class TaskPerformance06 {

    public static void main(String[] args) {
       
         Scanner sc = new Scanner(System.in);
        
         // declaration of variables
         double numMales, numFemales, numofStud;
         
         // user input
         System.out.print("Enter the number of males: ");
         double male = sc.nextDouble();
         System.out.print("Enther the number of females: ");
         double female = sc.nextDouble();
         
         // computation and output for numofStud
         numofStud = male + female;
         System.out.println("Number of students = " +(int) numofStud);
         
         // computation and output for numMales and numFemales
         numMales = (male / numofStud) * 100;
         numFemales = (female / numofStud) * 100;
         System.out.printf("Male = %.2f%% \n", numMales);
         System.out.printf("Female =  %.2f%% \n", numFemales);  
    }
}
