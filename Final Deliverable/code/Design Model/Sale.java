
import java.util.*;

/**
 * 
 */
public class Sale {

    /**
     * Default constructor
     */
    public Sale() {
    }

    /**
     * 
     */
    private PaymentFactory payment;

    /**
     * 
     */
    public void lineItems:SalesLineItem;







    /**
     * 
     */
    public void getSalePricingStragety() {
        // TODO implement here
    }

    /**
     * 
     */
    public void endSale() {
        // TODO implement here
    }

    /**
     * @param Amount 
     * @param totalPrice
     */
    public void getTotal(double Amount, double totalPrice) {
        // TODO implement here
    }

    /**
     * @param cardNum 
     * @param expDate
     */
    public void makePayment(String cardNum, int expDate) {
        // TODO implement here
    }

    /**
     * @param zipCode
     */
    public void preAuthCreditCard(int zipCode) {
        // TODO implement here
    }

    /**
     * @param unitPrice 
     * @param fuelGradeID 
     * @param Amount
     */
    public void makeLineItem(double unitPrice, int fuelGradeID, double Amount) {
        // TODO implement here
    }

    /**
     * @param cardNum 
     * @param expDate 
     * @param totalPriceWithTax 
     * @param zipCode
     */
    public void makePayment(String cardNum, int expDate, void totalPriceWithTax, int zipCode) {
        // TODO implement here
    }

}