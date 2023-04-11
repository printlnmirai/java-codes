
package cruz_kalfonteint.p;

import java.util.Scanner;
public class Cruz_KalfonteinTP {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); // to create an scanner object to take user input
        
        // initialize empty seats
	String[][] seats = new String[10][4];
	for(int i=0; i<10; i++) {
            for(int j=0; j<4; j++) {
		seats[i][j] =  "|" + "*"; 
            }    
	}
        while(true) { 
            System.out.println("Bus Seat Reservation:");
            System.out.println("\tCol 1\tCol 2\tCol 3\tCol 4");
	for(int i=0; i<10; i++) {
            System.out.print("Row " + (i+1)); // print rows 1-10
		for(int j=0; j<4; j++) {
                    System.out.print("\t" + seats[i][j]);
                }
                    System.out.print("\n");
	}
	System.out.print("Enter row and column number to reserve separated by space (Enter a negative answer to exit): ");
        int seat2 = sc.nextInt(); // user should input the number
	if(seat2 >= 0) {
            int seat3 = sc.nextInt();
                    seats[seat2-1][seat3-1] = "X";
                    continue;
	}else{
            System.out.println("Program Exit!"); // the code will end the process
            break;
        }
      }
   }
}
