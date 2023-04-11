
package busseatreservation;

import java.util.Scanner;
public class BusSeatReservation {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        char[][] seats = new char[5][5];
        int row, seat;
          while (true) {
            System.out.println("Enter row and seat number to reserve (Enter negative number to exit): ");
            row = sc.nextInt();
            seat = sc.nextInt();

            if (row < 0 || seat < 0) {
                break;
            }

            if (seats[row][seat] != 'X') {
                seats[row][seat] = 'X';
                System.out.println("Seat reserved successfully!");
            } else {
                System.out.println("Seat already reserved!");
            }
        }
        sc.close();
    }
}