package Day3;



public class OperatorDemo1 {

	public static void main(String[] args) {
		int a=10, b=20;
		
		//Arithmetic operator + - * / %
		
		System.out.println("Concatation of a and b is:"+a+b);      // here + adding as a concanitation 
		System.out.println("Sum of a and b is:"+(a+b));
		System.out.println("Subtraction of a and b is:"+(b-a));
		System.out.println("Multiplication of a and b is:"+(a*b));
		System.out.println("Division of a and b is:"+(b/a));
		System.out.println("Module of a and b is:"+(b%a));
		
		//Relational or Comparison operator > >= < <= != ==
		// Relational operator always returns a boolean value (True/False)
		
		a=100;
		b=200;
		
		System.out.println(a>b);
		System.out.println(a<b);
		System.out.println(a>=b);
		System.out.println(a<=b);
		System.out.println(a!=b);
		System.out.println(a==b);
		//System.out.println(a=b);     this is not correct syntax
		
		System.out.println(" ");
		
		//Logical operator && (and) || (or)  !(not)
     	//Logical operator always returns a boolean value (True/False)
		//Logical operator always return between two boolean value
		
		boolean x=true;
		boolean y=false;
		
		System.out.println(x && y);
		System.out.println(x || y);
		System.out.println(!x);
		System.out.println(!y);
		
		boolean b1=10>20;
		boolean b2=10<20;
		
		System.out.println(b1);
		System.out.println(b2);
		
		
		
		
	}	
	
}
