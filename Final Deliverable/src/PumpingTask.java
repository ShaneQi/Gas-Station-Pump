
public class PumpingTask implements Runnable {

	GasPump myPump;
	boolean status;
	int interval;

	
	public PumpingTask(GasPump pump,int timeInterval){
		myPump=pump;
		interval=timeInterval;
	}
	
	
	@Override
	public void run() {
		
	while(myPump.getStatus() && myPump.getQuota()>0 && interval>0){
			
			myPump.pumping();
			try {
				Thread.sleep(1);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			interval--;
		}
		
		if(myPump.getQuota()<=0){
			myPump.reachQuota();
		}


	}

	
	
	
	
}
