
public class demo {
	
	 public static void main(String[] args) throws InterruptedException{
	    
		 Register myregister = Register.getInstance();
		 String cardNum="1234567890";
		 int expDate=20180808;
		 myregister.swipeCard(cardNum, expDate);
	     myregister.selectCardType("Credit");	
	     myregister.enterZipCode(123456);
	     myregister.testquota();
	     myregister.selectFuelGrade(92);
	     myregister.startPumping();
	     Thread.sleep(900);
	     myregister.stopPumping();
	     myregister.returnNozzle();
	     
	     //myregister.clear();
	     
	     Thread.sleep(2000);
	     myregister.swipeCard(cardNum, expDate);
	     myregister.selectCardType("Credit");	
	     myregister.enterZipCode(123456);
	     myregister.testquota();
	     myregister.selectFuelGrade(92);
	     myregister.startPumping();
	     Thread.sleep(1000);
	     myregister.stopPumping();
	     myregister.returnNozzle();
	     
	
	    }

}
