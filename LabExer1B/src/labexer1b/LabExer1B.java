
package labexer1b;

import java.util.Scanner;
public class LabExer1B {

    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
        // Cruz, Kalfontein T.
        // BT - 205
        // Ms. Vera Mae Alcantara
        System.out.print("Enter an integer: ");
        int num = sc.nextInt();
        
        showNumberPlus10(num);
        showNumberPlus100(num);
        showNumberPlus1000(num);
    }
    public static void showNumberPlus10(int num){
    System.out.println(num +" plus 10 is " + (num + 10) +".");
    }
        public static void showNumberPlus100(int num){
        System.out.println(num +" plus 100 is " + (num + 100)+".");
        }
            public static void showNumberPlus1000(int num){
            System.out.println(num +" plus 1000 is " + (num + 1000)+".");
            }
}
