package com.sunbeam.queeight;

public class Labor implements Employee{
  int hour;
  double rate;
  
  
  
  
public Labor(int hour, double rate) {
	super();
	this.hour = hour;
	this.rate = rate;
}


@Override
public double getsal() {
	// TODO Auto-generated method stub
	return hour*rate;
}


@Override
public double calcIncentive() {
	if(hour>300)
	return 0.5*(getsal());
	
	return 0;
}

}
