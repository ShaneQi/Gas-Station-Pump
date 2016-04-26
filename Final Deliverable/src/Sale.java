
import java.util.*;

/**
 * 
 */
public class Sale {
	 private String cardNumber;
	 private int expireDate;
	 IPayment myPayment;
	 private TaxLineItem taxItem;
	

    /**
     * Default constructor
     */
    public Sale(String cardNum,int expDate) {
      	cardNumber=cardNum;
    	expireDate=expDate;
    }

    /**
     * 
     */
    private PaymentFactory paymentFactory;

    /**
     * 
     */
    private  SalesLineItem lineItems;







    /**
     * 
     */
    public void getSalePricingStragety() {
        // TODO implement here
    }
    
    public SalesLineItem getSalesLineItem(){
    	return lineItems;
    }
    
    public TaxLineItem getTaxLineItem(){
    	return taxItem;
    }
    
    public void getTaxes() {
        
   	 TaxAdapterFactory factory=TaxAdapterFactory.getInstance();
   	 ITaxCalculatorAdapter adapter = factory.getAdapter("TaxAdapterA");
   	 taxItem=adapter.getTaxes(lineItems);

   	
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
    public double getTotal(){
    
    	double total=lineItems.getTotal();
    	this.getTaxes();
    	double stateTax=lineItems.getAmount()*taxItem.TaxStatepercentage;
    	double federalTax=lineItems.getAmount()*taxItem.TaxFederalpercentage;
    			
    	double sum=total+stateTax+federalTax;
        return sum;
        
        
    }
    
    public double getAmount(){
        return lineItems.getAmount();
    }

    /**
     * @param cardNum 
     * @param expDate
     */
    public void makePayment(String cardType) {
    	paymentFactory=new PaymentFactory();
    	myPayment= paymentFactory.getPaymentInstance(cardType);
    	
    	
    }

    /**
     * @param zipCode
     */
    public double preAuthCreditCard(int zipCode) {
    	//return quota;
        return myPayment.requestPreAuthorize(cardNumber, expireDate,zipCode);
   
    }

    /**
     * @param unitPrice 
     * @param fuelGradeID 
     * @param Amount
     */
    public SalesLineItem makeLineItem() {
    	lineItems=new SalesLineItem();
    	return lineItems;
    	
    	
    }
    
    public  void init(double unitPrice, int fuelGradeID){
    	
    }

    /**
     * @param cardNum 
     * @param expDate 
     * @param totalPriceWithTax 
     * @param zipCode
     */
    public void makePayment(String cardNum, int expDate, double totalPriceWithTax, int zipCode) {
        // TODO implement here
    }

}