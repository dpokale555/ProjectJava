package Day9_Methods_Type;

public class ConstructorOverloading {
	
	int x,y,z;
	double d;
	
	ConstructorOverloading()                      //1st type
	{
		x=10;
		y=20;
		System.out.println(x+y);
	}
	
	ConstructorOverloading(int a, int b)         //2nd type
	{
		x=a;
		y=b;
		System.out.println(x+y);
	}
	
	ConstructorOverloading(int a, double b)       //3rd type
	{
		x=a;
		d=b;
		System.out.println(x+d);
	}
	
	ConstructorOverloading(double b, int a)       //4th type
	{
		x=a;
		d=b;
		System.out.println(x+d);
	}
	
	ConstructorOverloading(int a, int b, double dec)  //5th type
	{
		x=a;
		d=dec;
		y=b;
		System.out.println(x+y+d);
	}
	
		

	public static void main(String[] args) {
		ConstructorOverloading cd1=new ConstructorOverloading();              //1st type
		ConstructorOverloading cd2=new ConstructorOverloading(100, 200);      //2nd type
		ConstructorOverloading cd3=new ConstructorOverloading(20, 50.5);      //3rd type
		ConstructorOverloading cd4=new ConstructorOverloading(30.5, 40);      //4th type
		ConstructorOverloading cd5=new ConstructorOverloading(30, 50, 1.5);   //5th type
	}

}
