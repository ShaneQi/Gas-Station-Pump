
import java.util.*;

/**
 * 
 */
public class GasPump   {

	private List<IUpdateAmountListener> observers = new ArrayList<IUpdateAmountListener>();
	private double totalAmount=0;
	private boolean status=false;// true means pumping, false means stopping
	private double quota;

    public void disArm() {
    	//change status
    	status=false;
    }
    
    public boolean getStatus(){
    	return status;
    }

    
    
    public void pumping(){
 
    		double addedAmount=0.001;
        	this.setTotal(addedAmount);
        	quota-=0.001;
    	
    	
    }
    
    public void arm(int timeInterval) {
    	
    	status=true;
    	//initial thread
    	PumpingTask task = new PumpingTask(this, timeInterval);	
    	Thread thread = new Thread(task);
    	thread.start();
    	
    }
    
    public void init(double Quota){
    	quota=Quota;
    }
    

    /**
     * @param addedAmount
     */
    public void setTotal(double addedAmount) {
    	totalAmount+=addedAmount;
        this.publishAmountEvent(this.totalAmount);
        	
    }

    /**
     * @param fuelGradeID
     */
    public void selectFuelGrade(int fuelGradeID) {
    	//add the object of fuel into listener, triggered when gas pumpped in
         InventoryFactory inventoryFactory=InventoryFactory.getInstance();
         IUpdateAmountListener inventoryListener = inventoryFactory.getFuelIvetory(fuelGradeID);
         this.addAmountListener(inventoryListener);
         
    }

    /**
     * @param AmountListener
     */
    public void addAmountListener(IUpdateAmountListener AmountListener) {
        observers.add(AmountListener);
    }

    /**
     * @param name 
     * @param value
     */
    public void publishAmountEvent( double value) {
       
    	for(IUpdateAmountListener observer:observers)
    		observer.updateItemAmount(value);
    	
    }


	public double getQuota() {
		// TODO Auto-generated method stub
		return quota;
	}
	
	public void reachQuota(){
		Register.getInstance().reachQuota();
		
	}


}