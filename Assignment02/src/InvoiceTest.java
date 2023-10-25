
public class InvoiceTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Invoice invoice = new Invoice();        
        invoice.setPartNumber("ABC543");
        invoice.setPartDescription("It is black in Color.");
        invoice.setPricePerItem(400.25);
        invoice.setQuantityOfItem(70);
        System.out.println("Invoice Details: \n Part Number : "+invoice.getPartNumber());
        System.out.println("Part Description : "+invoice.getPartDescription());
        System.out.println("Quantity Item : "+invoice.getQuantityOfItem());
        System.out.println("Item Price : "+invoice.getPricePerItem());
        System.out.println(" Total Price : "+ invoice.calculateInvoiceAmount());
        
        System.out.println("______________________________");
        
        Invoice invoice2 = new Invoice("MNOPX987","It has dual Camera",23,9000);
        System.out.println("Invoice Details: \n Part Number : "+invoice2.getPartNumber());
        System.out.println("Part Description : "+invoice2.getPartDescription());
        System.out.println("Quantity Item : "+invoice2.getQuantityOfItem());
        System.out.println("Item Price : "+invoice2.getPricePerItem());
        System.out.println(" Total Price : "+ invoice2.calculateInvoiceAmount());
        
        
	}

}
