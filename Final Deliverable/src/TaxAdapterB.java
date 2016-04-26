
import java.util.*;

/**
 * 
 */
public class TaxAdapterB implements ITaxCalculatorAdapter {

    /**
     * Default constructor
     */
	 private TaxAdapterB() {
	    }
	    private static TaxAdapterB instance = new TaxAdapterB();
	    public static TaxAdapterB getInstance(){
	    	return instance;
	    }

	    /**
	     * @param total_price
	     */
	    public TaxLineItem getTaxes(SalesLineItem salesLineItem) {
	    	
	        String description=salesLineItem.getItemName();
	        Register register = Register.getInstance();
	        int zipcode = register.getStationZip();
	        
	    	double statePercentage=0.3;
	    	double federalPercentage=0.2;
	    	TaxLineItem taxItem = new TaxLineItem(description,statePercentage,federalPercentage);
	    	return taxItem;
	    }

}