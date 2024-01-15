package Day14_ExceptionHanling;

import java.util.Scanner;

/* 
case1: Exception occured, catch block handled ---> finally block will executed
case2: Exception occured, catch block NOT handled ---> finally block will executed
case3: Exception does NOT occured, catch block ignored ---> finally block will executed
finally block in optional
after multiple catch block we can add finally block.
there is only one finally block.
*/

public class FinallyBlock1 {

	public static void main(String[] args) {
		int a[]=new int[5];        //position is 0 to 4 avalible
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number");
		int num=sc.nextInt();
		System.out.println("Enter the position");
		int pos=sc.nextInt();
		
		try
		{
		a[pos]=num;
		System.out.println(a[pos]);
		}
		catch(Exception e)
		{
			System.out.println("Ecxeption occured and handled");
		}
		finally
		{
			System.out.println("Entered into finally block");
		}
		System.out.println("Program is Completed");
		System.out.println("Program is exited");
	}

}
