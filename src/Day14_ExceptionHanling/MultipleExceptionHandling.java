package Day14_ExceptionHanling;

import java.util.Scanner;

public class MultipleExceptionHandling {

	public static void main(String[] args) 
	{
		// Approach 1
		System.out.println("Program is Started");
		System.out.println("Program is inprogress");
		System.out.println("Enter a number");
		Scanner sc=new Scanner(System.in);
		int num=sc.nextInt();
		
		try
		{
		System.out.println(100/num);
		}
		catch(ArrayIndexOutOfBoundsException k)
		{
			System.out.println(k.getMessage());
			System.out.println("Exception occured in ArrayIndexOutOfBounds..");
		}
		catch(NumberFormatException n)
		{
			System.out.println(n.getMessage());
			System.out.println("Exception occured in NumberFormatException..");
		}
		catch(ArithmeticException e)
		{
			System.out.println(e.getMessage());
			System.out.println("Exception occured in ArithmeticException..");
		}
		
		System.out.println("Program is Completed");
		System.out.println("Program is exited");

	}

}
