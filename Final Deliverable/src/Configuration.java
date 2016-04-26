
public class Configuration {
	
	
	public static double quota=20;
	public static double Fuel87price=2;
	public static double Fuel89price=2.5;
	public static double Fuel92price=3;
	
	public static double inventoryFuel87price=2000;
	public static double inventoryFuel89price=2000;
	public static double inventoryFuel92price=2000;
	
	
	private static Configuration instance;
	
	public static Configuration getInstance(){
		if(instance==null){
			instance= new Configuration();
		}
		return instance;
			
	}
	

}
