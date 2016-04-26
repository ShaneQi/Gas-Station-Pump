
import java.util.*;

/**
 * 
 */
public class Fuel89 implements IFuelGradePrice,IUpdateAmountListener {
	  private double inventory=Configuration.inventoryFuel89price;
	 private static  double unitPrice;
	 private static Fuel89 instance = new Fuel89();
	 public static Fuel89 getInstance(){
		 unitPrice=Configuration.Fuel89price;
		 return instance;
	 }
	 
    public double getUnitPrice(int fuelGradeID) {
		return unitPrice;
        // TODO implement here
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