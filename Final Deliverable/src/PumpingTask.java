
public class PumpingTask implements Runnable {

	GasPump myPump;
	boolean status;

	
	public PumpingTask(GasPump pump){
		myPump=pump;

	}
	
	
	@Override
	public void run() {
		// TODO Auto-generated method stub
		if(myPump.getQuota()<=0)
			System.out.println("Gas Quota is insufficient!");
		
		while(myPump.getStatus() && myPump.getQuota()>0){
			
			myPump.pumping();
			try {
				Thread.sleep(1);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		}
		if(myPump.getQuota()<=0)
			System.out.println("Gas Quota is insufficient!");
		
	  
		
	}

	
	
	
	
}
