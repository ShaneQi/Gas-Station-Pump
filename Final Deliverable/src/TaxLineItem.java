
public class TaxLineItem {
	String Taxdescription;
	double TaxStatepercentage;
	double TaxFederalpercentage;
	
	public TaxLineItem(String description,double statePercentage,double federalPercentage ){
		Taxdescription=description;
		TaxStatepercentage=statePercentage;
		TaxFederalpercentage=federalPercentage;
	}
		

}
