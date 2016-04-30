
import java.util.*;

/**
 * 
 */
 interface IPayment {



    public double requestPreAuthorize(String cardNum, int expDate,int ZIPcode);
 
    public void requestCharge(double amount);

}