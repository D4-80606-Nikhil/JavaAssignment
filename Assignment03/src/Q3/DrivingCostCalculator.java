package Q3;
import java.util.Scanner;

public class DrivingCostCalculator {
	double milesPerDay;
	double costPerGallon;
	double milesPerGallon;
	double parkingFee;
	double tollsPerDay;
	public double getMilesPerDay() {
		return milesPerDay;
	}
	public void setMilesPerDay(double milesPerDay) {
		this.milesPerDay = milesPerDay;
	}
	public double getCostPerGallon() {
		return costPerGallon;
	}
	public void setCostPerGallon(double costPerGallon) {
		this.costPerGallon = costPerGallon;
	}
	public double getMilesPerGallon() {
		return milesPerGallon;
	}
	public void setMilesPerGallon(double milesPerGallon) {
		this.milesPerGallon = milesPerGallon;
	}
	public double getParkingFee() {
		return parkingFee;
	}
	public void setParkingFee(double parkingFee) {
		this.parkingFee = parkingFee;
	}
	public double getTollsPerDay() {
		return tollsPerDay;
	}
	public void setTollsPerDay(double tollsPerDay) {
		this.tollsPerDay = tollsPerDay;
	}
	public DrivingCostCalculator(double milesPerDay, double costPerGallon, double milesPerGallon, double parkingFee,
			int tollsPerDay) {
		this.milesPerDay = milesPerDay;
		this.costPerGallon = costPerGallon;
		this.milesPerGallon = milesPerGallon;
		this.parkingFee = parkingFee;
		this.tollsPerDay = tollsPerDay;
	}
	
	public DrivingCostCalculator() {
		this(0,0,0,0,0);
	}
	
	public void calculate() {
		System.out.println("------------------------------------");
		double finalsum=(this.milesPerDay/this.milesPerGallon)*this.costPerGallon + this.parkingFee +this.tollsPerDay*2;
		System.out.println("Your Daily driving cost is : "+finalsum);
		
	}
	
	public void accept() {
		double x;
		System.out.println("------------------------------------");
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Total miles driven per day : ");
		x=sc.nextDouble();
		this.milesPerDay=x;
		
		
		System.out.println("Enter Cost per gallon of gasoline: ");
		x=sc.nextDouble();
		this.costPerGallon=x;
		
		System.out.println("Enter Average miles per gallon : ");
		x=sc.nextDouble();
		this.milesPerGallon=x;
		
		System.out.println("Enter Parking fees per day: ");
		x=sc.nextDouble();
		this.parkingFee=x;
		
		
		int y;
		System.out.println("Enter Tolls per day: ");
		y=sc.nextInt();
		this.tollsPerDay=y;
		
		
		
	}
	
	public void display() {
		System.out.println("-----------------------------------");
		System.out.println("-Miles Per Day : "+this.milesPerDay);
		System.out.println("-Cost Per Gallon : "+this.costPerGallon);
		System.out.println("-Miles Per Gallon : "+this.milesPerGallon);
		System.out.println("-Parking Fee : "+this.parkingFee);
		System.out.println("-Tolls Per Day : "+this.tollsPerDay);
		
	}
	
}
