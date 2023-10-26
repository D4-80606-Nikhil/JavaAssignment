package com.sunbeam.Cricket;
import java.util.Scanner;

public class Cricketer extends Player implements Batter , Bowler{
    int runs;
    int wickets;
    double economy;
    double strikeRate;
    
    
    
	@Override
	public int getWickets() {
		return this.wickets;
	}
	
	@Override
	public double getEconomy() {
       return economy;
	}
	
	@Override
	public int getRuns() {
		return runs;
	}
	
	@Override
	public double getAverage() {
		return (double)runs/(double)matchesPlayed;
	}
	
	@Override
	public double getStrikeRate() {
		return strikeRate;
	}
	
	
    @Override
	public void accept(){
		Scanner scn = new Scanner(System.in);
		super.accept();
		System.out.print("\nEnter Runs : ");
		runs = scn.nextInt();
		
		System.out.print("\nEnter Wickets : ");
		wickets = scn.nextInt();
		
		System.out.print("\nEnter Economy : ");
		economy = scn.nextDouble();
		
		System.out.print("\nEnter Strike Rate : ");
		strikeRate = scn.nextDouble();
		
	}
    
    @Override
    public String toString() {
    	return "\nName : "+name+"\nAge :"+age+"\nid: "+id;
    }
	
	
  
}
