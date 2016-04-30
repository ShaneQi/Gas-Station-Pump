
import java.util.*;

/**
 * 
 */
public class DebitCardpayment implements IPayment {
	CreditCardAuthenticationCenter authCenter;
    /**
     * Default constructor
     */
    public DebitCardpayment() {
    	authCenter=new CreditCardAuthenticationCenter();
    }


    /**
     * 
     */
    public void requestPreAuthorize() {
        // TODO implement here
    }

    /**
     * 
     */



	@Override
	public double requestPreAuthorize(String cardNum, int expDate, int ZIPcode) {
		// TODO Auto-generated method stub
		return authCenter.requestPreAuthorize(cardNum, expDate, ZIPcode);	
	}


	@Override
	public void requestCharge(double amount) {
		// TODO Auto-generated method stub
		authCenter.requestCharge(amount);
	}




}