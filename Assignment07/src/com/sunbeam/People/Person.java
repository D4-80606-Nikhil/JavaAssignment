package com.sunbeam.People;

public class Person implements Cloneable{
    private String name;
    private double height;
    private Date bithday;
    
	public Person(String name, double height, Date bithday) {
		super();
		this.name = name;
		this.height = height;
		this.bithday = bithday;
	}
    
    public void displayDetails(){
    	System.out.print("Name : "+name);
    	System.out.print("\nHeight : "+height);
    	bithday.displayDate();
    }
    
    
    
    public final String getName() {
		return name;
	}

	public final void setName(String name) {
		this.name = name;
	}

	public final double getHeight() {
		return height;
	}

	public final void setHeight(double height) {
		this.height = height;
	}

	public final Date getBithday() {
		return bithday;
	}

	public final void setBithday(Date bithday) {
		this.bithday = bithday;
	}

	@Override
    public Person clone() throws CloneNotSupportedException {
    	Person obj = (Person)super.clone();
    	obj.bithday = this.bithday.clone();
    	return obj;
    }
    
    
}
