package Day9_Methods_Type;

public class ConstructorDemo {
	
	int x,y;
	String s;
	
	/*//1) Cosntructor
	
	ConstructorDemo()
	{
		System.out.println("This is default constructor");
	}*/
	
	//2) Constructor
	
	ConstructorDemo(int a, int b, String str)
	{
		x=a;
		y=b;
		s=str;
	}
	void dispaly()
	{
		System.out.println(x+"  "+y+"    "+s);
	}


	public static void main(String[] args) 
	{
		//ConstructorDemo cd=new ConstructorDemo();            //1st
		
		ConstructorDemo cd=new ConstructorDemo(10,30,"Welcome");       //2nd
		cd.dispaly();
		
	}

}
