
import java.util.*;

/**
 * 
 */
public class CreditCardpayment implements IPayment {

	CreditCardAuthenticationCenter authCenter;
    /**
     * Default constructor
     */
    public CreditCardpayment() {
    	authCenter=new CreditCardAuthenticationCenter();
    	
    }




    /**
     * 
     */
    public void requestCharge() {
        // TODO implement here
    }

    
	public double requestPreAuthorize(String cardNum, int expDate, int ZIPcode) {
		// TODO Auto-generated method stub
		return authCenter.requestPreAuthorize(cardNum, expDate, ZIPcode);	
	}

}