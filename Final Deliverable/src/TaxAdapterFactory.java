
public class TaxAdapterFactory {
	
	
	private static TaxAdapterFactory instance = new TaxAdapterFactory();
	public static TaxAdapterFactory getInstance(){
		return instance;
	}
	
	public ITaxCalculatorAdapter getAdapter(String AdapterName){
		if(AdapterName.equalsIgnoreCase("TaxAdapterA"))
			return TaxAdapterA.getInstance();
		if(AdapterName.equalsIgnoreCase("TaxAdapterB"))
			return TaxAdapterB.getInstance();
	return null;
	}
	
	
	

}
