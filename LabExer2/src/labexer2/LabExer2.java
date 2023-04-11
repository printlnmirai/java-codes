package labexer2;
import java.util.*;
public class LabExer2 {
        // instance variables
	private String itemName;
	private double itemPrice;
	private int itemQuantity; 
	private double amountDue;
 
    	public void setItemName(String newItemName){
		this.itemName = newItemName; // the "this" keyword is used to avoid confusion between class attributes and parameters
	}     
            public void setTotalCost(int quantity, double price){
                itemQuantity = quantity;
                itemPrice = price;
                    // it will multiply the itemQuantity and itemPrice based on the user input
                    amountDue = itemQuantity * itemPrice; 
            }           
		public String getItemName(){ // this method is used to retrieve the values
                    // it will return the value from the method itemName that was set in the instance variables
                    return itemName; 
		}      
                    public double getTotalCost(){ // this method is used to retrieve the values
                        // it will return the value from the method amountDue that was set in the setTotalCost
                        return amountDue;  
                    }               
                        public void readInput(){ 
                        Scanner s = new Scanner (System.in); // create an scanner object for user input
                        
                        // the output should be what's inside the double quotation
                        System.out.println("Enter the name of the item you are purchasing. ");
                            // it will get the user input 
                            itemName = s.nextLine();
                            
                        // the output should be what's inside the double quotation
                        System.out.println("Enter the quantity and price separated by a space. ");                       
                            // the user should input the item quantity
                            itemQuantity = s.nextInt(); 
                             // the user should input the item price
                            itemPrice = s.nextDouble(); 
                                // it is used to set the itemName instance variables on the user input
                                setItemName(itemName); 
                                // used to set the itemQuantity and itemPrice instance variables based on the user input 
                                setTotalCost(itemQuantity, itemPrice);                                                                                      
                            }          
                            public void writeOutput(){
                                // it will output the user input from itemQuantity to itemName to itemPrice
                                // i used format specifier which means %d = decimal integer, %s = string, and %.2f = floating-point number
                                System.out.printf("You are purchasing %d %s(s) at %.2f each. ", itemQuantity, itemName, itemPrice);                        
                            }   
                                public static void main(String[] args) {
                                    // used to input the methods in the instance variables
                                    LabExer2 item = new LabExer2(); 
                                        // it will read the codes inside the readInput to print 
                                        item.readInput(); 
                                        // it will read the codes inside the writeOutput to print 
                                        item.writeOutput();
                                    System.out.printf("\nAmount due is %.2f", item.getTotalCost()); // the total amount due of the item(s) purchased
                                }   
}