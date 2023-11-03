package com.sunbeam.quethree;

import java.util.Comparator;

public class IDComparator implements Comparator<EmployeeList>{

	@Override
	public int compare(EmployeeList arg0, EmployeeList arg1) {
		// TODO Auto-generated method stub
		return Double.compare(arg0.getId(), arg1.getId());
	}
  
}
