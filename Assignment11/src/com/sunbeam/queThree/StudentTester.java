package com.sunbeam.queThree;

import java.util.Arrays;

public class StudentTester {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Students [] students = {
				new Students(1003,"Nikhil","Delhi",89),
				new Students(1007,"Vikas","Delhi",98),
				new Students(1002,"Harshita","Gujarat",94),
				new Students(1011,"Mrunali","Chandrapur",96),
				new Students(1001,"Snehal","Chandrapur",86),
				new Students(1004,"Mannu","Delhi",87)
		};
		
		Arrays.sort(students);
		
		for(Students ele:students) {
			System.out.println(ele);
		}

	}

}
