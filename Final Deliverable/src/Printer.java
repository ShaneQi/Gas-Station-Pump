
public class Printer {
	
	private static Printer instance;
	private Printer(){
		
	}
	
	public static Printer getInstance(){
		if(instance==null){
			instance = new Printer();
		}
		return instance;
	}
	
	public void printReceipt(Sale mysale){
		
		System.out.println("*********Gas Station Receipt*********");
		System.out.println("Gas grade: "+mysale.getSalesLineItem().getItemName());
		System.out.printf("Gas unit price: %.3f%n",mysale.getSalesLineItem().getPrice());
		System.out.printf("Gas amount: %.3f%n",mysale.getSalesLineItem().getAmount());
		System.out.printf("Gas State Tax per Gallon: %.3f%n",mysale.getTaxLineItem().TaxStatepercentage);
		System.out.printf("Gas State Tax :%.3f%n ",mysale.getTaxLineItem().TaxStatepercentage*mysale.getSalesLineItem().getAmount());
		System.out.printf("Gas Federal Tax per Gallon: %.3f%n ",mysale.getTaxLineItem().TaxFederalpercentage);
		System.out.printf("Gas Federal Tax: %.3f%n ",mysale.getTaxLineItem().TaxFederalpercentage*mysale.getSalesLineItem().getAmount());
		System.out.printf("Gas total price(withTax): %.3f%n",mysale.getTotal());
		System.out.println("*************************************");
	}
	

}
