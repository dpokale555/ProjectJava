package Day12_InterfaceConcept;

interface shape
{
	int Length=20;                          //by default variables are final & statics
	int width=10;
	
	void circle();                         //by default it is abstract method
	
	default void square()
	{
		System.out.println("this is square..");
	}
	
	static void rectangel()
	{
		System.out.println("this is rectangel..");
	}
	
}

public class InterfaceDemo implements shape
{
	public void circle()
	{
		System.out.println("This is circle..");
	}
	
	
		public static void main(String[] args) 
		{
		//shape s=new shape();          //this is incorrect, bcoz we cannot instatiate interface
		shape s=new InterfaceDemo();    //correct
		//InterfaceDemo id=new InterfaceDemo();   //correct
		
		s.circle();              //abstarcts method need object to call the method
		s.square();              //defaults method need object to call the method
		
		shape.rectangel();      //static method can directly without object
		
		

	}

}
