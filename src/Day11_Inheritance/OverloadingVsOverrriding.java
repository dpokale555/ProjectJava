package Day11_Inheritance;

class ABC
{
	void m1(int a)
	{
		System.out.println(a);
	}
	
	void m2(int b) 
	{
		System.out.println(b);
	}
}


class XYZ extends ABC
{
	void m1(int a)
	{
		System.out.println(a*a);
	}
	
	void m2(int a, int b)
	{
		System.out.println(a+b);
	}
}

public class OverloadingVsOverrriding {
		public static void main(String[] args) 
	{
		XYZ x=new XYZ();
		x.m1(20);
		x.m2(30);
		x.m2(40, 60);

	}

}
