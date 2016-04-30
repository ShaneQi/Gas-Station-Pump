
import java.util.*;

/**
 * 
 */
public class DebitCardAuthenticationCenter {
	Configuration myconfig=Configuration.getInstance();
    /**
     * Default constructor
     */
    public DebitCardAuthenticationCenter() {
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
    public void requestCharge(double amount) {
        // TODO implement here
    	//process
    }

}