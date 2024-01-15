package Day11_Inheritance;

class Parent
{
	void display(int a)
	{
		System.out.println(a);
	}
}

class Child1 extends Parent
{
	void show(int b)
	{
		System.out.println(b);
	}
}

class Child2 extends Parent
{
	void print(int c)
	{
		System.out.println(c);
	}
}


public class HeirarchyInheritance {

	public static void main(String[] args) {
		
		Parent P=new Parent();
		P.display(20);
		
		Child1 Ch1=new Child1();
		Ch1.display(200);
		Ch1.show(300);
		
		Child2 Ch2=new Child2();
		Ch2.display(400);
		Ch2.print(500);

	}

}
