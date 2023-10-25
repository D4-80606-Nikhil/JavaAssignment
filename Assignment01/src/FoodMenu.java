import java.util.*;
public class FoodMenu {
	
	public static int menu() {
		Scanner scn = new Scanner(System.in);
		System.out.println("Enter your Choice :");
		System.out.println("0. Exit");
		System.out.println("1. Dosa");
		System.out.println("2. Poha");
		System.out.println("3. Samosa");
		System.out.println("4. Idli");
		System.out.println("5. Gulab Jamun");
		System.out.println("6. Noodles");
		System.out.println("7. Dabeli");
		System.out.println("8. Biryani");
		System.out.println("9. Pizza");
		System.out.println("10. Milk-Shake");
		System.out.println("11. Generate Bill");
		int menu = scn.nextInt();
		return menu;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int choice;
		double totalCost = 0;
		
		while((choice = menu())!=0) {
			switch(choice) {
			case 1:
				totalCost += 70;
				break;
			case 2:
				totalCost += 20;
				break;
			case 3:
				totalCost += 15;
				break;
			case 4:
				totalCost += 30;
				break;
			case 5:
				totalCost +=20;
				break;
			case 6:
				totalCost += 50;
				break;
			case 7:
				totalCost +=20;
				break;
			case 8:
				totalCost += 120;
				break;
			case 9:
				totalCost += 150;
				break;
			case 10:
				totalCost += 80;
				break;
			case 11:
				System.out.println("Total Cost of Order : "+totalCost);
				break;
			default :
				System.out.println("Wrong Choice ");
				break;

		   }
		}
		System.out.println("Thank you for visiting us:)");
		
	}

}
