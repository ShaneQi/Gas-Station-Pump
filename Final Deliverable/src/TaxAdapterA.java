
import java.util.*;

/**
 * 
 */
public class TaxAdapterA implements ITaxCalculatorAdapter {
	
    /**
     * Default constructor
     */
    private TaxAdapterA() {
    }
    private static TaxAdapterA instance = new TaxAdapterA();
    public static TaxAdapterA getInstance(){
    	return instance;
    }

    /**
     * @param total_price
     */
    public TaxLineItem getTaxes(SalesLineItem salesLineItem) {
    	
        String description=salesLineItem.getItemName();
        Register register = Register.getInstance();
        int zipcode = register.getStationZip();
        
    	double statePercentage=0.2;
    	double federalPercentage=0.2;
    	TaxLineItem taxItem = new TaxLineItem(description,statePercentage,federalPercentage);
    	return taxItem;
    }


}