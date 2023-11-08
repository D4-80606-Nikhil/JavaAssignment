package Q1;

public class CreditLimitCalculator {
	
	public static void main(String[] args) {
		Customer[] a=new Customer[2];
		
		for(int i=0;i<2;i++) {
			a[i] = new Customer();
			a[i].acceptData();
			a[i].checkLimit();
		}
		
		
	}
	
	
}
