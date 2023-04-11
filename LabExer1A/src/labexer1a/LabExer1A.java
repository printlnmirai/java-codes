
package labexer1a;

import java.util.Scanner;
public class LabExer1A {

    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
        
        System.out.print("Type your favorite number: ");
        int faveNumber = sc.nextInt();
        
            System.out.print("Type your favorite cartoon or anime character: ");
            String faveCartChar = sc.nextLine();
            
                System.out.print("Type your middle initial: ");
                int mi = sc.next().charAt(0);
                
                    System.out.print("Enter your nickname: ");
                    String nickName = sc.nextLine();
                    char[] nickNameArray = nickName.toCharArray();
                   
        System.out.println(faveNumber + " is my favorite number.");
        
        System.out.println("My name is Kalfontein" + mi + "." + "Cruz" + ".");
        
        System.out.println("You can call me " + new String(nickNameArray) + ".");
                    
        }  
    
    }
    

