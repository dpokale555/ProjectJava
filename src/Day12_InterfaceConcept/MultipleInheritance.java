package Day12_InterfaceConcept;

public class MultipleInheritance extends Class1 implements Interface1, Interface2
{
	public void m1()
	{
		System.out.println("this is m1 from interface1..");
	}
	
	public void m2()
	{
		System.out.println("this is m2 from interface2..");
	}
	
	public static void main(String[] args) 
	{
		MultipleInheritance obj1=new MultipleInheritance();
		obj1.m1();               //this is fromInterface1
		obj1.m2();               //this is from Iterface2
		obj1.m3();               //this is from parents class

	}

}
