
import java.util.*;

/**
 * 
 */


public class SalesLineItem implements IUpdateAmountListener {
	private static double price;
	private static int grade;
	private double Amount;
	private static SalesLineItem instance = new SalesLineItem();
	
	
	public  void init(double unitPrice, int fuelGradeID){
		price=unitPrice;
		grade=fuelGradeID;	
	}

    /**
     * @param total_price
     */


    /**
     * 
     */
    public double getPrice() {
        return price;
    }
    
    public double getTotal(){
    	double sum =price*Amount;
    	return sum;
    	
    	
    }
    
    public String getItemName(){
    	return Integer.toString(grade);
    }

    /**
     * 
     */
    public double  getAmount() {
        return Amount;
    }

    /**
     * @param Amount 
     * @param unitPrice 
     * @param fuelGradeID
     */
    public void createSalesLineItem(double Amount, double unitPrice, int fuelGradeID) {
        // TODO implement here
    }

    /**
     * @param Amount
     */
    public void getSubTotal(double Amount) {
        // TODO implement here
    }

    /**
     * @param Amount
     */
    public void updateItemAmount(double Amt) {
    	Amount=Amt;
    	//System.out.println("SalesItem: The current pumped  gas total is "+Amt);
    }



}