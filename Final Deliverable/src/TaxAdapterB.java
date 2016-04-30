
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
	        
	        double statePercentage;
	        double federalPercentage;
	        
	        if(zipcode==75080){
	        	 statePercentage=0.3;
	        	 federalPercentage=0.2;
	        }
	        else if(zipcode==75000){
	        	 statePercentage=0.6;
	        	 federalPercentage=0.4;
	        }
	        else{
	        	statePercentage=0.1;
	        	 federalPercentage=0.1;
	        }
	        	
	    	
	    	TaxLineItem taxItem = new TaxLineItem(description,statePercentage,federalPercentage);
	    	return taxItem;
	    }

}