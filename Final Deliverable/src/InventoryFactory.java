
public class InventoryFactory {
	private static InventoryFactory instance = new InventoryFactory();
	public static InventoryFactory getInstance(){
		return instance;
	}
	
	public IUpdateAmountListener getFuelIvetory(int fuelGradeID){
	if(fuelGradeID==87)
			return Fuel87.getInstance();
	if(fuelGradeID==89)
		return  Fuel89.getInstance();
	if(fuelGradeID==92)
		return  Fuel92.getInstance();
	return null;
	}
	
	
	
	
	
	
	
	
	
	
	
	

}
