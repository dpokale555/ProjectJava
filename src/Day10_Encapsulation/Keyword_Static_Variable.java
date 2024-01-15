package Day10_Encapsulation;

public class Keyword_Static_Variable {
	
	static int a=10;            //static variable
	int b=20;                   // non static 
	
	static void m1()
	{
		System.out.println("m1 is a static method");
	}
	
	void m2()
	{
		System.out.println("this is m2 non-static method");
	}
	
	void m3()
	{
		System.out.println(a);
		System.out.println(b);
		m1();
		m2();
	}
	

	public static void main(String[] args) 
	{
	
		System.out.println(a);
		//System.out.println(b);          //incorrect, b is a non-static variable, cannot access directly by main method
		
		  m1();
		//m2();                           //incorrect, m2 is non static method, cannot access directly by main method

		  //non-static variable or method can only acces by creating object
		  Keyword_Static_Variable sd1=new Keyword_Static_Variable();
		  System.out.println(sd1.b);
		  sd1.m2();
		  
		  Keyword_Static_Variable sd2=new Keyword_Static_Variable();
		  sd2.m3();
	
	}
	
	
	

}
