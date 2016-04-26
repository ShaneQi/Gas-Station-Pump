
import java.util.*;

/**
 * 
 */
public class Register {

	
	 private Sale newSale;
	 private Display mydisplay;
	 private FuelOptionFactory fuelFactory;
	 private double quota;
	 private GasPump mypump;
	 private GasStation mystation;
	 private Printer myprinter;
	 
	 private static Register instance = new Register();
	 
	 public static Register getInstance(){
		 return instance;
	 }
    /**
     * Default constructor
     */
    private Register() {
    	
    	//initial external device which is singleton
    	mydisplay = Display.getInstance();
    	mypump = new GasPump();
    	myprinter =Printer.getInstance();

    }

    /**
     * 
     */
   

    public void stopPumping() {
    	mypump.disArm();
    }

    /**
     * 
     */
    public void startPumping() {
        //use thread here
    	mypump.arm();
    	
    }
    
    public int getStationZip(){
    	return mystation.zip;
    }

    /**
     * @param fuelGradeID
     */
    public void selectFuelGrade(int fuelGradeID) {
        mydisplay.displaySelectGrade(fuelGradeID);
        //get fulegrade price
        fuelFactory=FuelOptionFactory.getInstance();
        IFuelGradePrice myFuel = fuelFactory.getFuelOption(fuelGradeID);
        double unitPrice= myFuel.getUnitPrice(fuelGradeID);
         	
        SalesLineItem newLineItem=newSale.makeLineItem();
    	newLineItem.init(unitPrice, fuelGradeID);
    	mypump=new GasPump();
    	mypump.init(quota);
    	mypump.addAmountListener(newLineItem);
    	mypump.addAmountListener(mydisplay);
    	
    	//pump add listener
    	
    }

    /**
     * @param cardNum 
     * @param expDate
     */
    public void swipeCard(String cardNum, int expDate) {
        // create the sale object
  
    	newSale = new Sale(cardNum,expDate);
    	mydisplay.selectCardType();
    	
    }

    /**
     * @param cardType
     */
    public void selectCardType(String cardType) {
        newSale.makePayment(cardType);
        mydisplay.promptsEnterZipcode();
        
    }

    /**
     * 
     */
    public void returnNozzle() {
    	
        double total=newSale.getTotal();
        double Amount=newSale.getAmount();
        mydisplay.displayTotal(Amount, total);
        newSale.endSale();
        myprinter.printReceipt(newSale);
        
        //clear sales instance
        
        
    }
    
    
    
    public void clear(){

    	newSale=null;
    	mypump=null;
    	
    }

    /**
     * @param zipCode
     */
    public void enterZipCode(int zipCode) {
        quota=newSale.preAuthCreditCard(zipCode);
        mydisplay.promptsSelectGrade();
        
        
    }
    
    public void testquota(){
    	System.out.println(quota);
    }
    
   

}