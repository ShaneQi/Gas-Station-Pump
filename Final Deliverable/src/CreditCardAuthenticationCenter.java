
import java.util.*;

/**
 * 
 */
public class CreditCardAuthenticationCenter {
	Configuration myconfig=Configuration.getInstance();
    /**
     * Default constructor
     */
    public CreditCardAuthenticationCenter() {
    }


    /**
     * 
     */
    public double requestPreAuthorize(String cardNum, int expDate,int ZIPcode) {
       //hard code passwd 
    	
    	return myconfig.quota;
    }

    /**
     * 
     */
    public void requestCharge() {
        // TODO implement here
    }

}