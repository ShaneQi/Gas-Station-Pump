
import java.util.*;

/**
 * 
 */
public class Fuel92 implements IFuelGradePrice,IUpdateAmountListener {

    /**
     * Default constructor
     */
   
    private double inventory=Configuration.inventoryFuel92price;
	 private static Fuel92 instance = new Fuel92();
	 public static Fuel92 getInstance(){
		 return instance;
	 }
    
	 private static  double unitPrice;


    /**
     * @param fuelGradeID
     */
    public double getUnitPrice(int fuelGradeID) {
    	unitPrice=Configuration.Fuel92price;
        return unitPrice;
    }

    /**
     * @param gasAmount
     */
    public void updateAmount(int gasAmount) {
        // TODO implement here
    }

	@Override
	public void updateItemAmount(double Amount) {
		// TODO Auto-generated method stub
		
	}

}