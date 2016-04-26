
import java.util.*;

/**
 * 
 */
public class FuelOptionFactory {

    /**
     * Default constructor
     */
	private static FuelOptionFactory instance = new FuelOptionFactory();
    
	public static FuelOptionFactory getInstance(){
		return instance;
	}
	private FuelOptionFactory() {
    	
    }
	
	
	
	public IFuelGradePrice getFuelOption(int fuelGradeID){
		if(fuelGradeID==87)
				return Fuel87.getInstance();
		if(fuelGradeID==89)
			return  Fuel89.getInstance();
		if(fuelGradeID==92)
			return  Fuel92.getInstance();
		return null;
	}
	
	
	

    /**
     * 
     */







    /**
     * @param fuelGradeID
     */
    public void getUnitPrice(int fuelGradeID) {
        // TODO implement here
    }

}