
public class Invoice {
	String partNumber;
	String partDescription;
	int quantityOfItem;
	double pricePerItem;
	
	public Invoice() {
		// TODO Auto-generated constructor stub
	}
	
	public Invoice(String partNumber,String partDescription,int quantityOfItem,double pricePerItem){
		this.partNumber = partNumber;
		this.partDescription = partDescription;
		this.quantityOfItem = quantityOfItem;
		this.pricePerItem = pricePerItem;
	}

	public final String getPartNumber() {
		return partNumber;
	}

	public final void setPartNumber(String partNumber) {
		this.partNumber = partNumber;
	}

	public final String getPartDescription() {
		return partDescription;
	}

	public final void setPartDescription(String partDescription) {
		this.partDescription = partDescription;
	}

	public final int getQuantityOfItem() {
		return quantityOfItem;
	}

	public final void setQuantityOfItem(int quantityOfItem) {
		this.quantityOfItem = quantityOfItem;
	}

	public final double getPricePerItem() {
		return pricePerItem;
	}

	public final void setPricePerItem(double pricePerItem) {
		this.pricePerItem = pricePerItem;
	}
	
   public double calculateInvoiceAmount(){
	   if(quantityOfItem>0)
    	return quantityOfItem*pricePerItem;
	   else {
		   return 0.0;
	   }
    }
}
