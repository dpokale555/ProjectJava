package Day14_ExceptionHanling;

import java.util.Scanner;

public class ExceptionsDemo {

	public static void main(String[] args) {
		
		//Arithmetic Exception
		System.out.println("Program is Started");
		System.out.println("Program is inprogress");
		System.out.println("Enter a number");
		Scanner sc=new Scanner(System.in);
		int num=sc.nextInt();
		System.out.println(100/num);
		
		//ArrayIndexOutOfBounds Exception
		/*int a[]=new int[5];        //position is 0 to 4 avalible
		System.out.println("Enter the number");
		Scanner sc=new Scanner(System.in);
		int num=sc.nextInt();
		System.out.println("Enter the position");
		int pos=sc.nextInt();
		a[pos]=num;
		System.out.println(a[pos]);*/
		
		//NumberFormatException
		/*Scanner sc=new Scanner(System.in);
		System.out.println("Enter a String value");
		String str=sc.next();
		
		int num=Integer.parseInt(str);
		
		System.out.println(num);*/
		
		System.out.println("Program is Completed");
		System.out.println("Program is exited");

	}

}
