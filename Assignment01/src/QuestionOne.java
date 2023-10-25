import java.util.*;
public class QuestionOne {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Scanner scn = new Scanner(System.in);
        
        System.out.println("Java Test");
        System.out.print("Enter Number : ");
        int number = scn.nextInt();
        System.out.println("Givem Number :"+number);
        System.out.println("Binary Equivlent :"+Integer.toBinaryString(number));
        System.out.println("Hex Equivlent :"+Integer.toHexString(number));
        System.out.println("Octal Equivlent :"+Integer.toOctalString(number));
            
	}

}
