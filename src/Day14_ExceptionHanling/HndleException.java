package Day14_ExceptionHanling;

import java.util.Scanner;

public class HndleException {

	public static void main(String[] args) {
		
		//Arithmetic Exception
		System.out.println("Program is Started");
		System.out.println("Program is inprogress");
		System.out.println("Enter a number");
		Scanner sc=new Scanner(System.in);
		int num=sc.nextInt();
		
		try
		{
		System.out.println(100/num);
		}
		catch(ArithmeticException e)
		{
			System.out.println(e.getMessage());
			System.out.println("You have entered invlaid input");
		}
		
		System.out.println("Program is Completed");
		System.out.println("Program is exited");

	}

}
