package javapractice;

import java.util.Scanner;

public class JavaPractice {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // radius == circle, side == square, base & height == triangle, length & width == rectangle
        double radius, side, base, height, length, width;

        System.out.println("Input must be positive number\n");

        // Circle
        while (true) {
            System.out.print("Enter the radius of Circle: ");
            radius = sc.nextDouble();
            if (radius > 0) {
                break;
            } else {
                System.out.println("Invalid input. Value must be positive.");
            }
        }

        // Square
        while (true) {
            System.out.print("Enter the value of square side: ");
            side = sc.nextDouble();
            if (side > 0) {
                break;
            } else {
                System.out.println("Invalid input. Value must be positive.");
            }
        }

        // Triangle
        while (true) {
            System.out.print("Enter the base and height of triangle separated by a space: ");
            base = sc.nextDouble();
            height = sc.nextDouble();
            
            if (base >= 0 && height >= 0) {
                break;
            } else if (base <= 0 && height <= 0) {
                System.out.println("Invalid base and height value. All value must be positive.");
            } else if (base < 0){
                System.out.println("Invalid base value. All value must be positive.");
            } else {
                System.out.println("Invalid height value. All value must be positive.");
            }
        }
        
        // Rectangle
        while (true) {
            System.out.print("Enter the length and width of rectangle separated by a space: ");
            length = sc.nextDouble();
            width = sc.nextDouble();
            
            if (length >= 0 && width >= 0) {
                break;
            } else if (length <= 0 && width <= 0) {
                System.out.println("Invalid length and width value. All value must be positive.");
            } else if (length < 0){
                System.out.println("Invalid length value. All value must be positive.");
            } else {
                System.out.println("Invalid width value. All value must be positive.");
            }
        }
        
        // spacing
        System.out.println(" ");
         
        // circleOutput
        double area = Math.PI * Math.pow(radius, 2);
        double areaofCircle = Math.round(area);
        System.out.println("The area of circle is " + areaofCircle);

        // squareOutput
        double areaofSquare = Math.pow(side, 2);
        System.out.println("The area of square is: " + areaofSquare);

        // triangleOutput
        double areaofTriangle = 0.5 * base * height;
        System.out.println("The area of triangle is: " + areaofTriangle);
        
        // rectangleOutput
        double areaofRectangle = length * width;
        System.out.println("The area of rectangle is " + areaofRectangle);
    }
}
