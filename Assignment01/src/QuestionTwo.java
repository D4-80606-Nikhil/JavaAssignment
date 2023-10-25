import java.util.*;
import java.lang.*;
public class QuestionTwo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Scanner scn = new Scanner(System.in);
        double numberOne ,numberTwo;
        
        if(scn.hasNextDouble()) {
        	numberOne = scn.nextDouble();
        	if(scn.hasNextDouble()) {
            	numberTwo = scn.nextDouble();
            }else {
            	System.out.println("You Entered the wrong Value.");
            }
        }else {
        	System.out.println("You Entered the wrong Value.");
        }
        
        
}
}
