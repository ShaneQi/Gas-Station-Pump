
import java.util.*;

/**
 * 
 */
public class PaymentFactory {

    /**
     * Default constructor
     */
    public PaymentFactory() {
    }


    public IPayment getPaymentInstance(String CardType) {
        
        if(CardType.equalsIgnoreCase("credit"))
        	return new CreditCardpayment();
        if(CardType.equalsIgnoreCase("debit"))
        	return new DebitCardpayment();
        return null;
        
    	
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
    public void requestCharge() {
        // TODO implement here
    }

}