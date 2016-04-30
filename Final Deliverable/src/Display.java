
import java.util.*;

/**
 * 
 */
public class Display {

	private static Display instance = new Display();
	
    /**
     * Default constructor
     */
    private Display() {
    }
    
    public static Display getInstance(){
    	return instance;
    }


    /**
     * 
     */
    public void selectCardType() {
       
    	System.out.println("Please select the card type:");
    }

    /**
     * 
     */
    public void promptsEnterZipcode() {
   
    	System.out.println("Please enter the ZIP code:");
    }
    
    

    /**
     * 
     */
    public void promptsSelectGrade() {
     
    	System.out.println("Please select the Grade Type:");
    }

    public void reachQuota(double quota) {
        
    	  System.out.println("Gas Quota is insufficient");
    }
  
    
    
    /**
     * @param fuelGradeID
     */
    public void displaySelectGrade(int fuelGradeID) {
    	
    	System.out.println("The current selected Grade Type is"+fuelGradeID);
    }

    /**
     * @param Amount 
     * @param totalPrice
     */
    public void displayTotal(double Amount, double totalPrice) {
    	System.out.printf("The total pumped gas is :%.3f%n",Amount,"Galon");
    	System.out.printf("The total price include tax is :%.3f%n",totalPrice,"dollar");
    }

    /**
     * @param Amount 
     * @param totalPrice
     */
    public void display(double Amount, double totalPrice) {
        // TODO implement here
    }

    /**
     * @param Amount
     */


}