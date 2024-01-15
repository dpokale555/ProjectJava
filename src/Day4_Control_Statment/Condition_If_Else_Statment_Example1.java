package Day4_Control_Statment;

public class Condition_If_Else_Statment_Example1 {

	public static void main(String[] args) {
		int num=18;
		
		if(num%2==0)
		{
			System.out.println("Number is Even");
		}
		else
		{
			System.out.println("Number is odd");
		} 
		
		//Example2
		//Using Ternary Operator
		
		//String res=(num%2==0)? "Number is Even":"Number is Odd";               
		//System.out.println(res);
		
		//OR
		
		//System.out.println((num%2==0)? "Number is Even":"Number is Odd");      //this is also correct Syntax   

	}

}
