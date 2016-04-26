
import java.util.*;

/**
 * 
 */
public class Fuel87 implements IFuelGradePrice,IUpdateAmountListener {

	  private double inventory=Configuration.inventoryFuel87price;
	 private static  double unitPrice;
	 private static Fuel87 instance = new Fuel87();
	 public static Fuel87 getInstance(){
		 unitPrice=Configuration.Fuel87price;
		 return instance;
	 }
	 
    /**
     * @param fuelGradeID
     */
    public double getUnitPrice(int fuelGradeID){
    	return unitPrice;
    }
    /**
     * @param gasAmount
     */
    public void updateAmount(double gasAmount) {
        // TODO implement here
    }
	@Override
	public void updateItemAmount(double Amount) {
		
		//System.out.println("Inventory: The current pumped pumped out is "+Amount);
		inventory-=Amount;
	}


}