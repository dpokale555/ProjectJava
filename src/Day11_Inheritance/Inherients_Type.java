package Day11_Inheritance;

//Type 1: Single inheritence

class A                                 //parent class
{
	int a=100;
	void dispaly()
	{
		System.out.println(a);
	}
}

class B extends A                         //child class of A
{
	int b=200;
	void show()
	{
		System.out.println(b);
	}
}

class C extends B                              //another child class of A & B
{
	int c=30;
	void print()
	{
		System.out.println(c);
	}
}



public class Inherients_Type {

	public static void main(String[] args) 
	{
		/*B B_obj=new B();
		
		System.out.println(B_obj.a);                   //access form parrent class
		B_obj.dispaly();                               //access form parrent class
		
		System.out.println(B_obj.b);                   //access form same class
		B_obj.show();*/                                //access form same class
		
		C C_obj=new C();
		
		C_obj.dispaly();                               //access form grand parrent class
		C_obj.show();                                  //access form parrent class
		C_obj.print();                                 //access form same class
	}

}
