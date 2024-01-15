package Day14_ExceptionHanling;

import java.util.Scanner;

public class MultipleExecptionHandling2 {

	public static void main(String[] args) {

		//Approach 2
				System.out.println("Program is Started");
				System.out.println("Program is inprogress");
				System.out.println("Enter a number");
				Scanner sc=new Scanner(System.in);
				int num=sc.nextInt();
				
				try
				{
				System.out.println(100/num);
				}
				catch(Exception c)                                        //'Exception' is a parrent class of all exceptions
				{
					System.out.println(c.getMessage());
					System.out.println("You have entered invlaid input");
				}
				
				System.out.println("Program is Completed");
				System.out.println("Program is exited");

	}

}
