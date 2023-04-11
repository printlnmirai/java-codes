package simplepayrollprogram;

import java.util.Scanner;

public class RunEmployee {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); // create an scanner object

        System.out.println("Enter name: "); // the user should input the name
        String name = sc.nextLine();
        System.out.println("Press F for Full Time or P for Part Time: "); // the user should input P or F
        char ch = sc.next().charAt(0);

        if (ch == 'P') {
            System.out.println("Enter rate per hour and no. of hours worked separated by space: ");
            double rpH = sc.nextDouble(); // the user should input the ratePerHour
            int hW = sc.nextInt(); // the user should input the hoursWorked

            PartTimeEmployee pt = new PartTimeEmployee(); // create a new object to call PartTimeEmployee
            pt.setName(name); // called the setName method in the Employee
            pt.setWage(rpH, hW); // called the setWage method in the PartTimeEmployee

            System.out.println("Name: " + pt.getName()); // output of name that was input by the user
            System.out.printf("Wage: %.2f", pt.getWage()); // output of wage that was input by the user
        } else if (ch == 'F') {
            System.out.println("Enter monthly salary: "); // it will display if FullTimeEmployee was chosen
            double mS = sc.nextDouble();

            FullTimeEmployee ft = new FullTimeEmployee(); // create a new object to call FullTimeEmployee
            ft.setName(name); // called the setName method in the Employee
            ft.setMonthlySalary(mS); // called the setMonthlySalary method in the FullTimeEmployee

            System.out.println("Name: " + ft.getName()); // output of name that was input by the user
            System.out.println("Monthly Salary: " + ft.getMonthlySalary()); // output of monthly salary that was input by the user
        } else {
            System.out.println("Enter only F or P."); // will display if the user used lowercase f and p
        }
    }
}
